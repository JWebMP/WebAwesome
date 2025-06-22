package com.jwebmp.webawesome.components.range;

/**
 * Defines the possible positions for the tooltip in a WaRange (slider) component.
 */
public enum RangeTooltipPosition
{
    /**
     * Display the tooltip above the slider thumb
     */
    Top,

    /**
     * Display the tooltip below the slider thumb
     */
    Bottom,

    /**
     * Do not display a tooltip
     */
    None;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
