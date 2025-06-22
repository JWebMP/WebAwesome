package com.jwebmp.webawesome.components.input;

/**
 * Enum for input sizes
 */
public enum InputSize
{
    /**
     * Small input size
     */
    SMALL,
    
    /**
     * Medium input size
     */
    MEDIUM,
    
    /**
     * Large input size
     */
    LARGE,
    
    /**
     * Inherit input size
     */
    INHERIT;
    
    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}