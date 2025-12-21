package com.jwebmp.webawesome.components.dialog;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.button.WaButton;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * The WaDialog component provides a modal dialog box.
 * It supports features like light dismissal, accessibility labels, autofocus management, and lifecycle events.
 */
@Getter
@Setter
@NgImportReference(value = "WaDialogDirective", reference = "angular-awesome")
@NgImportModule("WaDialogDirective")
public class WaDialog<J extends WaDialog<J>> extends DivSimple<J>
{
    /**
     * ARIA-accessible label. Required for accessibility.
     */
    private String label;

    /**
     * Controls the visibility of the dialog.
     */
    private Boolean open;

    /**
     * If true, clicking the overlay closes the dialog.
     */
    private Boolean lightDismiss;

    /**
     * If true, hides the header section.
     */
    private Boolean withoutHeader;

    /**
     * If true, enables scrolling for the dialog content.
     */
    private Boolean scrolling;

    /**
     * If true, prevents the dialog from being closed by the header close button.
     */
    private Boolean dialogHeaderDenyClose;

    /**
     * Background color of the dialog.
     */
    private String backgroundColor;

    /**
     * Border radius of the dialog.
     */
    private String borderRadius;

    /**
     * Box shadow of the dialog.
     */
    private String boxShadow;

    /**
     * Spacing inside the dialog.
     */
    private String spacing;

    /**
     * Width of the dialog.
     */
    private String width;

    /**
     * Duration of the show animation.
     */
    private String showDuration;

    /**
     * Duration of the hide animation.
     */
    private String hideDuration;

    WaDialog()
    {
        setTag("wa-dialog");
    }


    public WaDialog(String id)
    {
        this();
        setID(id);
    }

    /**
     * Opens the dialog programmatically.
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
     * Closes the dialog programmatically.
     *
     * @return This object for method chaining
     */
    public J hide()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return (J) this;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (open != null && open)
            {
                addAttribute("open", "");
            }
            if (lightDismiss != null && lightDismiss)
            {
                addAttribute("light-dismiss", "");
            }
            if (withoutHeader != null && withoutHeader)
            {
                addAttribute("[attr.without-header]", "''");
            }
            if (scrolling != null && scrolling)
            {
                addAttribute("scrolling", "");
                addClass("dialog-scrolling");
            }
            if (dialogHeaderDenyClose != null && dialogHeaderDenyClose)
            {
                addAttribute("dialog-deny-close", "");
            }

            // Apply CSS custom properties
            // Maintain style property order to match docs/tests expectations
            if (!Strings.isNullOrEmpty(backgroundColor))
            {
                addStyle("--background-color", backgroundColor);
            }
            if (!Strings.isNullOrEmpty(borderRadius))
            {
                addStyle("--border-radius", borderRadius);
            }
            if (!Strings.isNullOrEmpty(boxShadow))
            {
                addStyle("--box-shadow", boxShadow);
            }
            if (!Strings.isNullOrEmpty(hideDuration))
            {
                addStyle("--hide-duration", hideDuration);
            }
            if (!Strings.isNullOrEmpty(showDuration))
            {
                addStyle("--show-duration", showDuration);
            }
            if (!Strings.isNullOrEmpty(spacing))
            {
                addStyle("--spacing", spacing);
            }
            if (!Strings.isNullOrEmpty(width))
            {
                addStyle("--width", width);
            }
        }
        super.init();
    }

    /**
     * Adds a header to the dialog.
     *
     * @param header The header content
     * @return This object for method chaining
     */
    public J withHeader(DivSimple<?> header)
    {
        header.addAttribute("slot", "label");
        addClass("dialog-header");
        add(header);
        return (J) this;
    }

    /**
     * Adds header action buttons to the dialog.
     * These buttons appear beside the close button in the header.
     *
     * @param buttons The list of buttons to add
     * @return This object for method chaining
     */
    public J withHeaderActions(List<WaButton<?>> buttons)
    {
        for (WaButton<?> button : buttons)
        {
            button.addAttribute("slot", "header-actions");
            addAttribute("with-header", "");
            addClass("header-actions");
            add(button);
        }

        return (J) this;
    }

    /**
     * Creates a button with an icon and adds it to the header actions.
     * This is a replacement for the deprecated WaIconButton.
     *
     * @param iconName The name of the icon
     * @return The created button
     */
    public WaButton<?> withHeaderActionIcon(String iconName)
    {
        WaButton<?> button = new WaButton();
        WaIcon<?> icon = new WaIcon<>(iconName);
        button.setPrefix(icon);
        button.addAttribute("slot", "header-actions");
        addClass("header-actions");
        add(button);
        return button;
    }

    /**
     * Adds a footer to the dialog.
     * The footer typically contains action buttons.
     *
     * @param footer The footer content
     * @return This object for method chaining
     */
    public J withFooter(DivSimple<?> footer)
    {
        footer.addAttribute("slot", "footer");
        addAttribute("with-footer", "");
        addClass("dialog-footer");
        add(footer);
        return (J) this;
    }

    /**
     * Creates a close button and adds it to the specified container.
     * The button will have the data-dialog="close" attribute to close the dialog when clicked.
     *
     * @param addTo The container to add the button to
     * @return The created button
     */
    public WaButton withCloseButton(DivSimple<?> addTo)
    {
        WaButton closeButton = new WaButton("Close");
        closeButton.addAttribute("[attr.data-dialog]", "'close'");
        addTo.add(closeButton);
        return closeButton;
    }

    /**
     * Sets the specified component to receive focus when the dialog opens.
     * Adds the autofocus attribute to the component.
     *
     * @param component The component to receive focus
     * @return This object for method chaining
     */
    public J withInitialFocusOn(IComponentHierarchyBase<?, ?> component)
    {
        component.asAttributeBase()
                 .addAttribute("[attr.autofocus]", "");
        return (J) this;
    }

    public J withOpener(IComponentHierarchyBase<?, ?> component)
    {
        component.asAttributeBase()
                 .addAttribute("[attr.data-dialog]", "'open " + getID() + "'");
        return (J) this;
    }
}
