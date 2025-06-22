package com.jwebmp.webawesome.components.select;

/**
 * Defines the possible appearance styles for the WaSelect component.
 */
public enum SelectAppearance
{
    /**
     * Outlined appearance with a border around the select
     */
    Outlined,

    /**
     * Filled appearance with a background color
     */
    Filled;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
