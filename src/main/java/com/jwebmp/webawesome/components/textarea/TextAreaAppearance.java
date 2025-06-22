package com.jwebmp.webawesome.components.textarea;

/**
 * Represents the appearance options for the WaTextArea component.
 * Possible values are: 'filled', 'outlined'.
 */
public enum TextAreaAppearance
{
    Filled,
    Outlined;
    
    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}