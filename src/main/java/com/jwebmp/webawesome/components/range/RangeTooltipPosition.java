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
     * Display the tooltip to the right of the slider thumb
     */
    Right,

    /**
     * Display the tooltip below the slider thumb
     */
    Bottom,

    /**
     * Display the tooltip to the left of the slider thumb
     */
    Left,

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
