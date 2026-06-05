package com.jwebmp.webawesome.components.accordion;

/**
 * Controls how the items of a {@code <wa-accordion>} expand and collapse.
 */
public enum AccordionMode
{
    /**
     * Only a single item may be open at a time; opening another closes the previous one and at least one stays open.
     */
    Single("single"),

    /**
     * Only a single item may be open at a time, but the open item can also be collapsed.
     */
    SingleCollapsible("single-collapsible"),

    /**
     * Any number of items may be open at the same time. This is the default.
     */
    Multiple("multiple");

    private final String value;

    AccordionMode(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }
}

