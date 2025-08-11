package com.jwebmp.webawesome.components.radio;

/**
 * Orientation options for WaRadioGroup component.
 * Matches Web Awesome radio group orientation values.
 */
public enum RadioOrientation
{
    Horizontal,
    Vertical;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
