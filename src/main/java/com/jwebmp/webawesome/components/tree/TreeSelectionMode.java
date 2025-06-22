package com.jwebmp.webawesome.components.tree;

/**
 * Represents the selection mode options for the WaTree component.
 * Possible values are: 'single', 'multiple', 'leaf'.
 */
public enum TreeSelectionMode
{
    /**
     * Single selection mode - only one item can be selected at a time
     */
    Single,
    /**
     * Multiple selection mode - multiple items can be selected at once
     */
    Multiple,
    /**
     * Leaf selection mode - only leaf nodes (items without children) can be selected
     */
    Leaf;

    /**
     * Returns the lowercase string representation of this enum value
     * for use in HTML attributes
     * 
     * @return The lowercase string representation
     */
    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
