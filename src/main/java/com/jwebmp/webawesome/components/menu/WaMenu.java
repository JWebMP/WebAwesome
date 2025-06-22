package com.jwebmp.webawesome.components.menu;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaMenu component provides a menu of selectable items.
 * It supports different sizes and custom styling.
 */
@Getter
@Setter
@NgImportReference(value = "WaMenuDirective", reference = "angular-awesome")
@NgImportModule("WaMenuDirective")
public class WaMenu<J extends WaMenu<J>> extends DivSimple<J>
{
    /**
     * Event handler for when a menu item is selected.
     * The event detail contains the selected menu item.
     */
    private String onSelect;

    /**
     * The size of the menu.
     * Valid values: 'small', 'medium', 'large', 'inherit'
     */
    private String size;

    /**
     * Custom padding for the menu.
     */
    private String padding;

    /**
     * Custom margin for the menu.
     */
    private String margin;

    /**
     * Custom border radius for the menu.
     */
    private String borderRadius;

    /**
     * Custom background for the menu.
     */
    private String background;

    /**
     * Custom box shadow for the menu.
     */
    private String boxShadow;

    /**
     * Custom border for the menu.
     */
    private String border;

    /**
     * Custom font size for the menu.
     */
    private String fontSize;

    /**
     * Creates a new WaMenu component.
     */
    public WaMenu()
    {
        setTag("wa-menu");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(size))
            {
                addAttribute("size", size);
            }

            if (!Strings.isNullOrEmpty(onSelect))
            {
                addAttribute("select", onSelect);
            }

            // Add CSS custom properties if specified
            if (!Strings.isNullOrEmpty(padding))
            {
                addStyle("--padding", padding);
            }
            if (!Strings.isNullOrEmpty(margin))
            {
                addStyle("--margin", margin);
            }
            if (!Strings.isNullOrEmpty(borderRadius))
            {
                addStyle("--border-radius", borderRadius);
            }
            if (!Strings.isNullOrEmpty(background))
            {
                addStyle("--background", background);
            }
            if (!Strings.isNullOrEmpty(boxShadow))
            {
                addStyle("--box-shadow", boxShadow);
            }
            if (!Strings.isNullOrEmpty(border))
            {
                addStyle("--border", border);
            }
            if (!Strings.isNullOrEmpty(fontSize))
            {
                addStyle("--font-size", fontSize);
            }
        }
        super.init();
    }
}
