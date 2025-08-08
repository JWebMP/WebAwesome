package com.jwebmp.webawesome.components.icon;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.interfaces.IIcon;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaIcon component renders visual symbols from various libraries.
 * It supports different families, variants, custom sources, styling, and accessibility.
 */
@Getter
@Setter
@NgImportReference(value = "WaIconDirective", reference = "angular-awesome")
@NgImportModule("WaIconDirective")
public class WaIcon<J extends WaIcon<J>> extends DivSimple<J> implements IIcon<GlobalChildren, J>
{
    /**
     * Font Awesome family (e.g., classic, brands).
     */
    private String family;

    /**
     * Name of a registered icon library.
     */
    private String library;

    /**
     * URL to an SVG resource for custom icons.
     */
    private String src;

    /**
     * Sets the icon's text color directly.
     */
    private String color;

    /**
     * Sets the icon's background color.
     */
    private String backgroundColor;

    /**
     * Sets a duotone icon's primary color.
     */
    private String primaryColor;

    /**
     * Sets a duotone icon's primary opacity.
     */
    private Double primaryOpacity;

    /**
     * Sets a duotone icon's secondary color.
     */
    private String secondaryColor;

    /**
     * Sets a duotone icon's secondary opacity.
     */
    private Double secondaryOpacity;

    /**
     * Adjusts the icon's font size.
     */
    private String fontSize;

    /**
     * If true, forces a fixed 1em width.
     */
    private Boolean fixedWidth;

    /**
     * Accessible label for assistive technologies.
     */
    private String label;

    /**
     * Variant within a variant (e.g., regular, solid,duotone,light,sharp duotone).
     */
    private IconVariant variant;


    public WaIcon()
    {
        setTag("wa-icon");
    }

    public WaIcon(String iconName)
    {
        this();
        setName(iconName);
    }

    public WaIcon(String iconName, String family)
    {
        this();
        setName(iconName);
        setFamily(family);
    }

    public WaIcon(String iconName, String family, IconVariant variant)
    {
        this();
        setName(iconName);
        setFamily(family);
        setVariant(variant);
    }

    @Override
    public String getClassName()
    {
        return "";
    }

    @Override
    public IComponentHierarchyBase<?, ?> getIconComponent()
    {
        return new WaIcon();
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(family))
            {
                addAttribute("family", family);
            }
            if (!Strings.isNullOrEmpty(getName()) && Strings.isNullOrEmpty(src))
            {
                addAttribute("name", getName());
            }
            if (!Strings.isNullOrEmpty(library))
            {
                addAttribute("library", library);
            }
            if (!Strings.isNullOrEmpty(src))
            {
                addAttribute("src", src);
            }
            if (!Strings.isNullOrEmpty(color))
            {
                addStyle("color", color);
            }
            if (!Strings.isNullOrEmpty(backgroundColor))
            {
                addStyle("background-color", backgroundColor);
            }
            if (!Strings.isNullOrEmpty(primaryColor))
            {
                addStyle("--primary-color", primaryColor);
            }
            if (primaryOpacity != null)
            {
                addStyle("--primary-opacity", primaryOpacity + "");
            }
            if (!Strings.isNullOrEmpty(secondaryColor))
            {
                addStyle("--secondary-color", secondaryColor);
            }
            if (secondaryOpacity != null)
            {
                addStyle("--secondary-opacity", secondaryOpacity + "");
            }
            if (!Strings.isNullOrEmpty(fontSize))
            {
                addStyle("font-size", fontSize);
            }
            if (fixedWidth != null && fixedWidth)
            {
                addAttribute("fixed-width", "");
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (variant != null)
            {
                addAttribute("variant", variant.toString());
            }
        }
        super.init();
    }
}
