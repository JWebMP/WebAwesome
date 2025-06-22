package com.jwebmp.webawesome.components.tabgroup;

/**
 * Defines the possible placement options for tabs in a WaTabGroup component.
 */
public enum TabPlacement
{
    /**
     * Display tabs on top of the content (default)
     */
    Top,

    /**
     * Display tabs on the left side of the content
     */
    Start,

    /**
     * Display tabs on the right side of the content
     */
    End,

    /**
     * Display tabs below the content
     */
    Bottom;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
