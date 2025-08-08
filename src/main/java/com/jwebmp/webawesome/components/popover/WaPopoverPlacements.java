package com.jwebmp.webawesome.components.popover;

/**
 * Enum for the placement options of the WaPopover component
 * 
 * <p>The preferred placement of the popover. Note that the actual placement may vary as needed to keep the popover inside of the viewport.</p>
 * <p>Available options: 'top', 'top-start', 'top-end', 'right', 'right-start', 'right-end', 'bottom', 'bottom-start', 'bottom-end', 'left', 'left-start', 'left-end'</p>
 * <p>Default is 'top'.</p>
 */
public enum WaPopoverPlacements
{
    Top,
    TopStart,
    TopEnd,
    Right,
    RightStart,
    RightEnd,
    Bottom,
    BottomStart,
    BottomEnd,
    Left,
    LeftStart,
    LeftEnd;

    @Override
    public String toString()
    {
        return name()
                .replaceAll("([a-z])([A-Z])", "$1-$2") // Add a hyphen before uppercase letters
                .toLowerCase(); // Convert the entire string to lowercase
    }
}