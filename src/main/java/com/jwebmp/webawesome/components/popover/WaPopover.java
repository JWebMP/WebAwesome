package com.jwebmp.webawesome.components.popover;

import com.google.common.base.Strings;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

/**
 * Popovers display contextual content and interactive elements in a floating panel.
 * <p>
 * Popovers display interactive content when their anchor element is clicked. Unlike tooltips, popovers can contain links, buttons, and form controls.
 * They appear without an overlay and will close when you click outside or press Escape. Only one popover can be open at a time.
 *
 * <p>Make sure the anchor element exists in the DOM before the popover connects. If it doesn't exist, the popover won't attach and you'll see a console warning.</p>
 *
 * <p>Popovers show when you click their anchor element. You can also control them programmatically by setting the open property to true or false.</p>
 *
 * <p>Use data-popover="close" on any button inside a popover to close it automatically.</p>
 *
 * <p>Use the autofocus global attribute to move focus to a specific form control when the popover opens.</p>
 *
 * <h3>CSS Custom Properties</h3>
 * <ul>
 *   <li>--arrow-size: The size of the tiny arrow that points to the popover (set to zero to remove). Default: 0.375rem</li>
 *   <li>--max-width: The maximum width of the popover's body content. Default: 25rem</li>
 *   <li>--show-duration: The speed of the show animation. Default: 100ms</li>
 *   <li>--hide-duration: The speed of the hide animation. Default: 100ms</li>
 * </ul>
 */
@Getter
@Setter
@NgImportReference(value = "WaPopoverDirective", reference = "angular-awesome")
@NgImportModule("WaPopoverDirective")


public class WaPopover<J extends WaPopover<J>> extends DivSimple<J> implements INgComponent<J>
{
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * The ID of the popover's anchor element. This must be an interactive/focusable element such as a button.
     */
    private String forElement;

    /**
     * Shows or hides the popover. Default is false.
     */
    private Boolean open;

    /**
     * The preferred placement of the popover. Note that the actual placement may vary as needed to keep the popover inside of the viewport.
     * Default is 'top'.
     */
    private WaPopoverPlacements placement;

    /**
     * The distance in pixels from which to offset the popover away from its target. Default is 8.
     */
    private Integer distance;

    /**
     * The distance in pixels from which to offset the popover along its target. Default is 0.
     */
    private Integer skidding;

    /**
     * Removes the arrow from the popover. Default is false.
     */
    private Boolean withoutArrow;

    /**
     * Default constructor
     */
    public WaPopover()
    {
        setTag("wa-popover");
    }

    /**
     * Constructor with anchor element
     *
     * @param anchor The element to anchor the popover to
     */
    public WaPopover(IComponentHierarchyBase<?, ?> anchor)
    {
        this();
        setForElement((ComponentHierarchyBase) anchor);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(forElement))
            {
                addAttribute("for", forElement);
            }

            if (open != null && open)
            {
                addAttribute("open", "");
            }

            if (placement != null)
            {
                addAttribute("placement", placement.toString());
            }

            if (distance != null)
            {
                addAttribute("distance", distance + "");
            }

            if (skidding != null)
            {
                addAttribute("skidding", skidding + "");
            }

            if (withoutArrow != null && withoutArrow)
            {
                addAttribute("without-arrow", "");
            }
        }
        super.init();
    }

    /**
     * Sets the anchor element for this popover
     *
     * @param anchor The element to anchor the popover to
     * @return This object
     */
    public @org.jspecify.annotations.NonNull J setForElement(ComponentHierarchyBase anchor)
    {
        if (anchor != null)
        {
            this.forElement = anchor.asBase()
                                    .getID();
            anchor.setRenderIDAttribute(true);
            setRenderIDAttribute(true);
        }
        else
        {
            this.forElement = null;
        }
        return (J) this;
    }

    /**
     * Shows the popover
     *
     * @return This object
     */
    public J show()
    {
        this.open = true;
        return (J) this;
    }

    /**
     * Hides the popover
     *
     * @return This object
     */
    public J hide()
    {
        this.open = false;
        return (J) this;
    }

    /**
     * Adds a handler for the wa-show event
     *
     * @param handlerScript The JavaScript to execute when the event occurs
     * @return This object
     */
    public J onShow(String handlerScript)
    {
        addAttribute("(wa-show)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the wa-after-show event
     *
     * @param handlerScript The JavaScript to execute when the event occurs
     * @return This object
     */
    public J onAfterShow(String handlerScript)
    {
        addAttribute("(wa-after-show)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the wa-hide event
     *
     * @param handlerScript The JavaScript to execute when the event occurs
     * @return This object
     */
    public J onHide(String handlerScript)
    {
        addAttribute("(wa-hide)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the wa-after-hide event
     *
     * @param handlerScript The JavaScript to execute when the event occurs
     * @return This object
     */
    public J onAfterHide(String handlerScript)
    {
        addAttribute("(wa-after-hide)", handlerScript);
        return (J) this;
    }

    /**
     * Sets the arrow size CSS custom property
     *
     * @param size The size value (e.g., "8px" or "0")
     * @return This object
     */
    public @org.jspecify.annotations.NonNull J setArrowSize(String size)
    {
        addStyle("--arrow-size", size);
        return (J) this;
    }

    /**
     * Sets the maximum width CSS custom property
     *
     * @param width The width value (e.g., "160px")
     * @return This object
     */
    public @org.jspecify.annotations.NonNull J setMaxWidth(String width)
    {
        addStyle("--max-width", width);
        return (J) this;
    }

    /**
     * Sets the show animation duration CSS custom property
     *
     * @param duration The duration value (e.g., "200ms")
     * @return This object
     */
    public @org.jspecify.annotations.NonNull J setShowDuration(String duration)
    {
        addStyle("--show-duration", duration);
        return (J) this;
    }

    /**
     * Sets the hide animation duration CSS custom property
     *
     * @param duration The duration value (e.g., "200ms")
     * @return This object
     */
    public @org.jspecify.annotations.NonNull J setHideDuration(String duration)
    {
        addStyle("--hide-duration", duration);
        return (J) this;
    }

    /**
     * Removes the arrow from the popover
     *
     * @param withoutArrow True to remove the arrow, false to show it
     * @return This object
     */
    public @org.jspecify.annotations.NonNull J setWithoutArrow(Boolean withoutArrow)
    {
        this.withoutArrow = withoutArrow;
        return (J) this;
    }

    /**
     * Adds the data-popover="close" attribute to a component inside the popover
     * to make it automatically close the popover when clicked
     *
     * @param component The component to add the close attribute to
     * @return The component with the close attribute added
     */
    public static IComponentHierarchyBase<?, ?> addCloseAttribute(IComponentHierarchyBase<?, ?> component)
    {
        if (component != null)
        {
            component.asAttributeBase()
                     .addAttribute("data-popover", "close");
        }
        return component;
    }

    /**
     * Adds the autofocus attribute to a form control inside the popover
     * to move focus to it when the popover opens
     *
     * @param component The component to add the autofocus attribute to
     * @return The component with the autofocus attribute added
     */
    public static IComponentHierarchyBase<?, ?> addAutofocusAttribute(IComponentHierarchyBase<?, ?> component)
    {
        if (component != null)
        {
            component.asAttributeBase()
                     .addAttribute("autofocus", "");
        }
        return component;
    }
}