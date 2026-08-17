package com.jwebmp.webawesome.components.pagination;

/**
 * Defines the visual appearance of a {@code <wa-pagination>} element.
 * <p>
 * Introduced with Web Awesome 3.11.0.
 */
public enum PaginationAppearance
{
    /**
     * Outlined buttons
     */
    Outlined,

    /**
     * Filled buttons
     */
    Filled,

    /**
     * Plain (text only) buttons
     */
    Plain;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

