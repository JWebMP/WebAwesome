package com.jwebmp.webawesome.components.tag;

/**
 * Represents the appearance options for the WaTag component.
 * Possible values are: 'accent', 'outlined accent', 'filled', 'outlined', 'outlined filled'.
 * Default is 'outlined filled'.
 */
public enum TagAppearance
{
    Accent,
    Outlined_Accent,
    Filled,
    Outlined,
    Outlined_Filled;

    @Override
    public String toString()
    {
        return name().toLowerCase().replace('_', ' ');
    }
}