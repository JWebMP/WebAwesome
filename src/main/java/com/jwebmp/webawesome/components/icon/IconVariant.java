package com.jwebmp.webawesome.components.icon;

/**
 * Defines the possible variants for icons.
 */
public enum IconVariant
{
    /**
     * Thin variant
     */
    Thin,

    /**
     * Light variant
     */
    Light,

    /**
     * Regular variant
     */
    Regular,

    /**
     * Solid variant
     */
    Solid,

    /**
     * Sharp variant
     */
    Sharp,

    /**
     * DuoTone variant
     */
    DuoTone;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
