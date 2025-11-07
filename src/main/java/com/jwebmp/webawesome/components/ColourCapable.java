package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

/**
 * ColourCapable provides helpers to apply Web Awesome color design tokens
 * to common CSS properties (fill/background and on/text) using CSS custom properties.
 *
 * It follows the pattern of VariantCapable and is designed for fluent use on components.
 */
@SuppressWarnings("unchecked")
public interface ColourCapable<J extends IComponentHierarchyBase<?, J> & ColourCapable<J>>
{
    /**
     * Sets the background/fill color using Web Awesome color tokens.
     * Example produces: background-color: var(--wa-color-brand-fill-normal)
     */
    default J setFillColour(Variant variant, ColourIntensity intensity)
    {
        J me = (J) this;
        String v = variant.name().toLowerCase();
        String i = intensity.toToken();
        me.addStyle("background-color", "var(--wa-color-" + v + "-fill-" + i + ")");
        return me;
    }

    /**
     * Sets the text color using Web Awesome color tokens for the foreground (on-*)
     * Example produces: color: var(--wa-color-brand-on-normal)
     */
    default J setOnColour(Variant variant, ColourIntensity intensity)
    {
        J me = (J) this;
        String v = variant.name().toLowerCase();
        String i = intensity.toToken();
        me.addStyle("color", "var(--wa-color-" + v + "-on-" + i + ")");
        return me;
    }

    // Convenience helpers defaulting to Normal intensity
    default J setFillColour(Variant variant)
    {
        return setFillColour(variant, ColourIntensity.Normal);
    }

    default J setOnColour(Variant variant)
    {
        return setOnColour(variant, ColourIntensity.Normal);
    }
}
