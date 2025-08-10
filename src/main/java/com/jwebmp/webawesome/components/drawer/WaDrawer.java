package com.jwebmp.webawesome.components.drawer;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.Placement;
import com.jwebmp.webawesome.components.button.WaButton;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NgImportReference(value = "WaDrawerDirective", reference = "angular-awesome")
@NgImportModule("WaDrawerDirective")
public class WaDrawer<J extends WaDrawer<J>> extends DivSimple<J>
{
    /**
     * Accessible label shown in the header.
     */
    private String label;

    /**
     * Whether the drawer is open.
     */
    private Boolean open;

    /**
     * Hides the header and close button.
     */
    private Boolean withoutHeader;

    /**
     * Allows clicking the overlay to close.
     */
    private Boolean lightDismiss;

    /**
     * Enables scrolling for the drawer content.
     */
    private Boolean scrolling;

    /**
     * Slide direction. Default is 'end'.
     */
    private Placement placement;

    /**
     * Prevents the drawer from being closed by the header close button.
     */
    private Boolean dialogHeaderDenyClose;

    /**
     * Drawer background color.
     */
    private String backgroundColor;

    /**
     * Shadow styling around drawer.
     */
    private String boxShadow;

    /**
     * Space around/within drawer content.
     */
    private String spacing;

    /**
     * Width/height depending on placement.
     */
    private String size;

    /**
     * Opening animation duration.
     */
    private String showDuration;

    /**
     * Closing animation duration.
     */
    private String hideDuration;

    public WaDrawer()
    {
        setTag("wa-drawer");
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
            if (withoutHeader != null && withoutHeader)
            {
                addAttribute("without-header", "");
            }
            if (scrolling != null && scrolling)
            {
                addAttribute("scrolling", "");
                addClass("drawer-scrolling");
            }
            if (lightDismiss != null && lightDismiss)
            {
                addAttribute("light-dismiss", "");
            }
            if (dialogHeaderDenyClose != null && dialogHeaderDenyClose)
            {
                addAttribute("drawer-deny-close", "");
            }
            if (placement != null)
            {
                addAttribute("placement", placement.toString()
                                                   .toLowerCase());
            }

            // Apply CSS custom properties
            if (!Strings.isNullOrEmpty(backgroundColor))
            {
                addStyle("--background-color", backgroundColor);
            }
            if (!Strings.isNullOrEmpty(boxShadow))
            {
                addStyle("--box-shadow", boxShadow);
            }
            if (!Strings.isNullOrEmpty(spacing))
            {
                addStyle("--spacing", spacing);
            }
            if (!Strings.isNullOrEmpty(size))
            {
                addStyle("--size", size);
            }
            if (!Strings.isNullOrEmpty(showDuration))
            {
                addStyle("--show-duration", showDuration);
            }
            if (!Strings.isNullOrEmpty(hideDuration))
            {
                addStyle("--hide-duration", hideDuration);
            }
        }
        super.init();
    }

    public J withHeader(DivSimple<?> header)
    {
        header.addAttribute("slot", "header");
        addAttribute("with-header", "");
        addClass("drawer-header");
        add(header);
        return (J) this;
    }

    /**
     * Adds header action buttons to the drawer.
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
            addClass("drawer-header-actions");
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
        addAttribute("with-header", "");
        addClass("drawer-header-actions");
        add(button);
        return button;
    }

    public J withFooter(DivSimple<?> footer)
    {
        footer.addAttribute("slot", "footer");
        addAttribute("with-footer", "");
        addClass("drawer-footer");
        add(footer);
        return (J) this;
    }

    /**
     * Creates a close button and adds it to the specified container.
     * The button will have the data-drawer="close" attribute to close the drawer when clicked.
     *
     * @param addTo The container to add the button to
     * @return The created button
     */
    public WaButton withCloseButton(DivSimple<?> addTo)
    {
        WaButton closeButton = new WaButton("Close");
        closeButton.addAttribute("data-drawer", "close");
        addTo.add(closeButton);
        return closeButton;
    }


    /**
     * Sets the specified component to receive focus when the drawer opens.
     * Adds the autofocus attribute to the component.
     *
     * @param component The component to receive focus
     * @return This object for method chaining
     */
    public WaDrawer withInitialFocusOn(IComponentHierarchyBase<?, ?> component)
    {
        component.asAttributeBase()
                 .addAttribute("autofocus", "");
        return this;
    }

    /**
     * Opens the drawer programmatically.
     *
     * @return This object for method chaining
     */
    public WaDrawer show()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
    }

    /**
     * Closes the drawer programmatically.
     *
     * @return This object for method chaining
     */
    public WaDrawer hide()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
    }
}
