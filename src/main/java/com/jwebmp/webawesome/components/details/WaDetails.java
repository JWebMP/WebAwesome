package com.jwebmp.webawesome.components.details;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

/**
 * A Web Awesome-specific extension of {@link DivSimple}, representing a Web Awesome details container.
 * This class is used to manage collapsible/expandable details sections, including optional icons
 * for expand/collapse functionality, and supports customizable summaries.
 * <p>
 * Attributes:
 * - `summary`: Text to display in the summary. Use the summary slot for HTML content.
 * - `disabled`: Prevents the details from expanding when true.
 * - `appearance`: The visual appearance of the details element (filled, outlined, plain).
 * - `open`: Whether the details is expanded.
 * - `iconPosition`: Position of the expand/collapse icon (start, end). Default is 'end'.
 * - `name`: Groups related details elements. When one opens, others with the same name close.
 * <p>
 * Events:
 * - `waShow`: Emits when the details starts to open.
 * - `waAfterShow`: Emits after the details has opened.
 * - `waHide`: Emits when the details starts to close.
 * - `waAfterHide`: Emits after the details has closed.
 * <p>
 * Slots:
 * - default: The content to show when expanded.
 * - summary: For HTML content in the summary.
 * - expand-icon: Optional expand icon to use instead of the default.
 * - collapse-icon: Optional collapse icon to use instead of the default.
 * <p>
 * CSS Custom Properties:
 * - `iconColor`: Sets the --icon-color CSS property.
 * - `spacing`: Sets the --spacing CSS property.
 * - `showDuration`: Sets the --show-duration CSS property.
 * - `hideDuration`: Sets the --hide-duration CSS property.
 * - `display`: Sets the --display CSS property.
 */
@Getter
@Setter
@NgImportReference(value = "WaDetailsDirective", reference = "angular-awesome")
@NgImportModule("WaDetailsDirective")
public class WaDetails<J extends WaDetails<J>> extends DivSimple<J>
{
    /**
     * The summary text displayed on the details container header.
     * If set, this becomes the attribute 'summary' on the container.
     */
    private String summary;

    /**
     * HTML content for the summary slot.
     */
    private IComponentHierarchyBase<?, ?> summarySlot;

    /**
     * Indicates whether the details container is disabled.
     * If true, the container will have the 'disabled' attribute applied.
     */
    private Boolean disabled;

    /**
     * Controls the open state of the details section.
     */
    private Boolean open;

    /**
     * Visual style for the component (filled, outlined, plain).
     */
    @Getter
    private DetailsAppearance appearance;

    /**
     * Raw appearance string to allow multiple or custom values (e.g., "filled outlined").
     * If set via setAppearance(String), this value takes precedence when rendering.
     */
    private String appearanceRaw;

    /**
     * An icon displayed when the container is in a collapsed state.
     * Used to visually indicate that the container can be expanded.
     */
    private WaIcon<?> expandIcon;

    /**
     * An icon displayed when the container is in an expanded state.
     * Used to visually indicate that the container can be collapsed.
     */
    private WaIcon<?> collapseIcon;

    /**
     * Color of the expand/collapse icon.
     */
    private String iconColor;

    /**
     * Spacing between summary and content.
     */
    private String spacing;

    /**
     * Expand animation duration.
     */
    private String showDuration;

    /**
     * Collapse animation duration.
     */
    private String hideDuration;

    /**
     * Sets the display behavior.
     */
    private String display;

    /**
     * Position of the expand/collapse icon.
     * Options: 'start' or 'end'. Default is 'end'.
     */
    private IconPosition iconPosition;

    /**
     * Event handler for when the details starts to open.
     */
    private String showEvent;

    /**
     * Event handler for after the details has opened.
     */
    private String afterShowEvent;

    /**
     * Event handler for when the details starts to close.
     */
    private String hideEvent;

    /**
     * Event handler for after the details has closed.
     */
    private String afterHideEvent;

    /**
     * Default constructor for the WaDetails component.
     * Initializes this component with a default HTML tag name of 'wa-details'.
     */
    public WaDetails()
    {
        setTag("wa-details");
    }

    /**
     * Constructor with summary text.
     *
     * @param summary The summary text to display
     */
    public WaDetails(String summary)
    {
        this();
        this.summary = summary;
    }

    /**
     * Shows the details programmatically.
     *
     * @return This object for method chaining
     */
    public J show()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return (J) this;
    }

    /**
     * Hides the details programmatically.
     *
     * @return This object for method chaining
     */
    public J hide()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return (J) this;
    }

    /**
     * Sets the summary text (renders as the <code>summary</code> attribute on the wa-details element).
     * This is useful when you want a simple text summary instead of HTML content.
     *
     * @param summary The summary text value
     * @return This component for chaining
     */
    public J summary(String summary)
    {
        this.summary = summary;
        return (J) this;
    }

    /**
     * Sets the summary slot content using any component. The component will be added to this details
     * instance and a <code>slot="summary"</code> attribute will be applied to that component during initialization.
     *
     * <p>Note: You can also manually add any component to this instance yourself and set
     * <code>addAttribute("slot", "summary")</code> on that component; this method is a convenience.</p>
     *
     * @param summarySlot The component to render inside the summary slot
     * @return This component for chaining
     */
    public J summary(IComponentHierarchyBase<?, ?> summarySlot)
    {
        this.summarySlot = summarySlot;
        return (J) this;
    }

    /**
     * Convenience setter accepting a string value for appearance; preserves raw input (supports multiple values).
     */
    public @org.jspecify.annotations.NonNull J setAppearance(String appearance)
    {
        this.appearanceRaw = appearance;
        return (J) this;
    }

    /**
     * Convenience setter accepting a string value for icon position.
     */
    public @org.jspecify.annotations.NonNull J setIconPosition(String iconPosition)
    {
        if (iconPosition == null)
        {
            this.iconPosition = null;
        }
        else
        {
            var normalized = iconPosition.trim()
                                         .toLowerCase();
            this.iconPosition = "start".equals(normalized) ? IconPosition.Start : IconPosition.End;
        }
        return (J) this;
    }

    /**
     * Initializes the WaDetails component by applying configured
     * attributes, icons, and other properties.
     * Ensures all attributes and child components are properly set before rendering.
     */
    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(summary))
            {
                addAttribute("summary", summary);
            }
            if (summarySlot != null)
            {
                summarySlot.asAttributeBase()
                           .addAttribute("slot", "summary");
                add(summarySlot);
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (open != null && open)
            {
                addAttribute("open", "");
            }
            if (!Strings.isNullOrEmpty(appearanceRaw))
            {
                addAttribute("appearance", appearanceRaw);
            }
            else if (appearance != null)
            {
                addAttribute("appearance", appearance.toString());
            }
            if (expandIcon != null)
            {
                expandIcon.asAttributeBase()
                          .addAttribute("slot", "expand-icon");
                add(expandIcon);
            }
            if (collapseIcon != null)
            {
                collapseIcon.asAttributeBase()
                            .addAttribute("slot", "collapse-icon");
                add(collapseIcon);
            }

            // Apply CSS custom properties
            if (!Strings.isNullOrEmpty(iconColor))
            {
                addStyle("--icon-color", iconColor);
            }
            if (!Strings.isNullOrEmpty(spacing))
            {
                addStyle("--spacing", spacing);
            }
            if (!Strings.isNullOrEmpty(showDuration))
            {
                addStyle("--show-duration", showDuration);
            }
            if (!Strings.isNullOrEmpty(hideDuration))
            {
                addStyle("--hide-duration", hideDuration);
            }
            if (!Strings.isNullOrEmpty(display))
            {
                addStyle("--display", display);
            }

            // Apply new attributes
            if (iconPosition != null)
            {
                addAttribute("icon-position", iconPosition.toString());
            }
            // Add event handlers
            if (!Strings.isNullOrEmpty(showEvent))
            {
                addAttribute("wa-show", showEvent);
            }
            if (!Strings.isNullOrEmpty(afterShowEvent))
            {
                addAttribute("wa-after-show", afterShowEvent);
            }
            if (!Strings.isNullOrEmpty(hideEvent))
            {
                addAttribute("wa-hide", hideEvent);
            }
            if (!Strings.isNullOrEmpty(afterHideEvent))
            {
                addAttribute("wa-after-hide", afterHideEvent);
            }
        }
        super.init();
    }
}
