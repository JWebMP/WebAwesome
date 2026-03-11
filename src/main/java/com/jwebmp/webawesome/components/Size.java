package com.jwebmp.webawesome.components;

/**
 * Defines the possible sizes for components.
 */
public enum Size
{
    /**
     * Small size
     */
    Small,

    /**
     * Medium size
     */
    Medium,

    /**
     * Large size
     */
    Large,

    /**
     * Inherit size from parent
     */
    Inherit;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
