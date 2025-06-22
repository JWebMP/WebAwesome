package com.jwebmp.webawesome.components.menu;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaMenuLabel component represents a label in a menu.
 * It is used to group menu items and provide context.
 */
@Getter
@Setter
@NgImportReference(value = "WaMenuLabelDirective", reference = "angular-awesome")
@NgImportModule("WaMenuLabelDirective")
public class WaMenuLabel<J extends WaMenuLabel<J>> extends DivSimple<J>
{
    /**
     * Custom padding for the menu label.
     */
    private String padding;

    /**
     * Custom font size for the menu label.
     */
    private String fontSize;

    /**
     * Custom color for the menu label.
     */
    private String color;

    /**
     * Custom margin for the menu label.
     */
    private String margin;

    /**
     * Creates a new WaMenuLabel component.
     */
    public WaMenuLabel()
    {
        setTag("wa-menu-label");
    }

    /**
     * Creates a new WaMenuLabel component with the specified text.
     *
     * @param text The text content of the menu label
     */
    public WaMenuLabel(String text)
    {
        this();
        setText(text);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            // Add CSS custom properties if specified
            if (!Strings.isNullOrEmpty(padding))
            {
                addStyle("--padding", padding);
            }
            if (!Strings.isNullOrEmpty(fontSize))
            {
                addStyle("--font-size", fontSize);
            }
            if (!Strings.isNullOrEmpty(color))
            {
                addStyle("--color", color);
            }
            if (!Strings.isNullOrEmpty(margin))
            {
                addStyle("--margin", margin);
            }
        }
        super.init();
    }
}
