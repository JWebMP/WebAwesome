package com.jwebmp.webawesome.components.pagination;

/**
 * Defines the rendering format of a {@code <wa-pagination>} element.
 * <p>
 * Introduced with Web Awesome 3.11.0.
 */
public enum PaginationFormat
{
    /**
     * Renders the full page-number list with sibling / boundary pages.
     */
    Standard,

    /**
     * Renders a condensed "page x of y" style control.
     */
    Compact;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

