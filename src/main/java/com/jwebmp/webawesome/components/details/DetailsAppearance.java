package com.jwebmp.webawesome.components.details;

/**
 * Appearance options for WaDetails component.
 * Matches Web Awesome details appearance values.
 */
public enum DetailsAppearance
{
    Filled,
    Outlined,
    Plain;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
