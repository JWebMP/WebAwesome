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
    Large;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
