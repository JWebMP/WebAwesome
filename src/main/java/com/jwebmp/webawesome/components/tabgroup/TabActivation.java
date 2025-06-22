package com.jwebmp.webawesome.components.tabgroup;

/**
 * Defines the possible activation modes for tabs in a WaTabGroup component.
 */
public enum TabActivation
{
    /**
     * Tabs activate on click (default)
     */
    Auto,

    /**
     * Tabs need to be programmatically activated
     */
    Manual;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
