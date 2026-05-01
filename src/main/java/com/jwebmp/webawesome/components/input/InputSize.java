package com.jwebmp.webawesome.components.input;

/**
 * Enum for input sizes
 */
public enum InputSize
{
    /**
     * Small input size
     */
    Small,
    
    /**
     * Medium input size
     */
    Medium,
    
    /**
     * Large input size
     */
    Large,
    
    /**
     * Inherit input size
     */
    Inherit;
    
    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}