package com.jwebmp.webawesome.components.tree;

/**
 * Represents the selection mode options for the WaTree component.
 * Possible values are: 'single', 'multiple', 'leaf', 'leaf-multiple'.
 */
public enum TreeSelectionMode
{
    /**
     * Single selection mode - only one item can be selected at a time
     */
    Single("single"),
    /**
     * Multiple selection mode - multiple items can be selected at once
     */
    Multiple("multiple"),
    /**
     * Leaf selection mode - only leaf nodes (items without children) can be selected
     */
    Leaf("leaf"),
    /**
     * Leaf-multiple selection mode - multiple leaf nodes can be selected while parent
     * nodes only expand and collapse. Treated like {@link #Multiple} for any
     * array/multi-select cardinality logic.
     */
    LeafMultiple("leaf-multiple");

    /**
     * The exact attribute string rendered for this selection mode.
     */
    private final String value;

    TreeSelectionMode(String value)
    {
        this.value = value;
    }

    /**
     * Returns the Web Awesome attribute string representation of this enum value
     * for use in HTML attributes (e.g. {@code leaf-multiple}).
     *
     * @return The attribute string representation
     */
    @Override
    public String toString()
    {
        return value;
    }
}
