package com.jwebmp.webawesome.components.input;

/**
 * Enum for input appearances
 */
public enum InputAppearance
{
    /**
     * Filled input appearance
     */
    FILLED,
    
    /**
     * Outlined input appearance
     */
    OUTLINED;
    
    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}