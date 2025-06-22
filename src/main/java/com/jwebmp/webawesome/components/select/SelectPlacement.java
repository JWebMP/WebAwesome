package com.jwebmp.webawesome.components.select;

/**
 * Defines the possible dropdown placement positions for the WaSelect component.
 */
public enum SelectPlacement
{
    /**
     * Display the dropdown above the select element
     */
    Top,

    /**
     * Display the dropdown below the select element
     */
    Bottom;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
