package com.jwebmp.webawesome.components.accordion;

/**
 * Placement of the expand/collapse icon for {@code <wa-accordion>} items.
 */
public enum AccordionIconPlacement
{
    Start,
    End;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

