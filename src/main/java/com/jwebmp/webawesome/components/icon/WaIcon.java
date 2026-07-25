package com.jwebmp.webawesome.components.icon;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.interfaces.IIcon;
import com.jwebmp.plugins.fontawesome5.options.IconFamily;
import com.jwebmp.plugins.fontawesome5.options.IconVariant;
import lombok.Getter;
/**
 * The WaIcon component renders visual symbols from various libraries.
 * It supports different families, variants, custom sources, styling, and accessibility.
 * <p>
 * Attributes:
 * - `name`: The name of the icon.
 * - `family`: Font Awesome family (e.g., classic, brands).
 * - `variant`: Variant within a family (e.g., regular, solid).
 * - `library`: Name of a registered icon library.
 * - `src`: URL to an SVG resource for custom icons.
 * - `label`: Accessible label for assistive technologies.
 * - `withFixedWidth`: If true, forces a fixed 1em width.
 * <p>
 * Styling Properties:
 * - `color`: Sets the icon's text color directly.
 * - `backgroundColor`: Sets the icon's background color.
 * - `fontSize`: Adjusts the icon's font size.
 * - `primaryColor`: Sets a duotone icon's primary color.
 * - `primaryOpacity`: Sets a duotone icon's primary opacity.
 * - `secondaryColor`: Sets a duotone icon's secondary color.
 * - `secondaryOpacity`: Sets a duotone icon's secondary opacity.
 * <p>
 * Layout (Web Awesome 3.10):
 * - `canvas`: The rendering canvas around the glyph ({@link IconCanvas}). When unset the icon renders
 *   as {@code fixed} (1.25em &times; 1em). {@code auto} hugs the icon width, {@code square} is
 *   1.25em &times; 1.25em, and {@code roomy} is 1.5em &times; 1.5em. Mirrors Font Awesome's
 *   {@code fa-fixed-width}, {@code fa-width-auto}, {@code fa-canvas-square}, {@code fa-canvas-roomy}.
 * <p>
 * Animation CSS custom properties (Web Awesome 3.10) — set via {@code addStyle(name, value)}:
 * {@code --flip-angle}, {@code --flip-x}, {@code --flip-y}, {@code --flip-z},
 * {@code --flip-anticipation-scale}, {@code --flip-overshoot}, {@code --beat-scale}
 * (multiplies the animation's 1.25&times; base pulse), {@code --bounce-anticipation},
 * {@code --buzz-distance}, {@code --wag-angle}, {@code --swing-angle}, {@code --jello-scale-x},
 * {@code --jello-scale-y}, {@code --float-height}, {@code --float-drift}, {@code --float-tilt},
 * {@code --float-squash-x}, {@code --float-squash-y}, {@code --float-stretch-x},
 * {@code --float-stretch-y}. The {@code flip} animation additionally supports a {@code flip-360}
 * variant (pass {@code "flip-360"} to {@link #setAnimation(String)}).
 * <p>
 * Usage examples:
 * <pre>
 * // Basic icon
 * WaIcon icon = new WaIcon("star");
 *
 * // Icon with family and variant
 * WaIcon brandIcon = new WaIcon("github", "brands");
 * WaIcon solidIcon = new WaIcon("star", "classic", IconVariant.Solid);
 *
 * // Icon with custom styling
 * WaIcon customIcon = new WaIcon("heart");
 * customIcon.setColor("#ff0000");
 * customIcon.setFontSize("24px");
 * customIcon.setWithFixedWidth(true);
 * </pre>
 */
@Getter
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

    /**
     * Whether to use auto-width sizing.
     */
    private Boolean autoWidth;

    /**
     * Whether to swap duotone icon opacity.
     */
    private Boolean swapOpacity;

    /**
     * Rotation in degrees.
     */
    private Integer rotate;

    /**
     * Flip direction (x, y, both).
     */
    private IconFlip flip;

    /**
     * Animation name to apply to the icon.
     */
    private String animation;

    /**
     * The rendering canvas around the glyph (Web Awesome 3.10).
     */
    private IconCanvas canvas;

    @SuppressWarnings("unchecked")
    public J setFamily(String family)
    {
        this.family = family;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setLibrary(String library)
    {
        this.library = library;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSrc(String src)
    {
        this.src = src;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setColor(String color)
    {
        this.color = color;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBackgroundColor(String backgroundColor)
    {
        this.backgroundColor = backgroundColor;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setPrimaryColor(String primaryColor)
    {
        this.primaryColor = primaryColor;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setPrimaryOpacity(Double primaryOpacity)
    {
        this.primaryOpacity = primaryOpacity;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSecondaryColor(String secondaryColor)
    {
        this.secondaryColor = secondaryColor;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSecondaryOpacity(Double secondaryOpacity)
    {
        this.secondaryOpacity = secondaryOpacity;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFontSize(String fontSize)
    {
        this.fontSize = fontSize;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFixedWidth(Boolean fixedWidth)
    {
        this.fixedWidth = fixedWidth;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setVariant(IconVariant variant)
    {
        this.variant = variant;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAutoWidth(Boolean autoWidth)
    {
        this.autoWidth = autoWidth;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSwapOpacity(Boolean swapOpacity)
    {
        this.swapOpacity = swapOpacity;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setRotate(Integer rotate)
    {
        this.rotate = rotate;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFlip(IconFlip flip)
    {
        this.flip = flip;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAnimation(String animation)
    {
        this.animation = animation;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setCanvas(IconCanvas canvas)
    {
        this.canvas = canvas;
        return (J) this;
    }

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

    public WaIcon(String iconName, IconFamily family)
    {
        this();
        setName(iconName);
        setFamily(family.toString());
    }

    public WaIcon(String iconName, String family, IconVariant variant)
    {
        this();
        setName(iconName);
        setFamily(family);
        setVariant(variant);
    }

    public WaIcon(String iconName, IconFamily family, IconVariant variant)
    {
        this();
        setName(iconName);
        setFamily(family.toString());
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
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (variant != null)
            {
                addAttribute("variant", variant.toString());
            }
            if (autoWidth != null && autoWidth)
            {
                addAttribute("auto-width", "");
            }
            if (swapOpacity != null && swapOpacity)
            {
                addAttribute("swap-opacity", "");
            }
            if (rotate != null)
            {
                addAttribute("rotate", rotate.toString());
            }
            if (flip != null)
            {
                addAttribute("flip", flip.toString());
            }
            if (!Strings.isNullOrEmpty(animation))
            {
                addAttribute("animation", animation);
            }
            if (canvas != null)
            {
                addAttribute("canvas", canvas.toString());
            }
            else if (fixedWidth != null && fixedWidth)
            {
                // Web Awesome 3.10 replaced the `fixed-width` attribute with the `canvas`
                // property; the legacy fixed-width behaviour maps to the default `fixed` canvas.
                addAttribute("canvas", "fixed");
            }
        }
        super.init();
    }
}
