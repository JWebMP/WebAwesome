package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.DivSimple;

/**
 * Layout primitive wrapper for a responsive grid using Web Awesome utilities.
 * <p>
 * Adds the "wa-grid" class and exposes helpers to configure common options in a
 * JWebMP-friendly way while keeping to the docs' guidance (CSS custom properties and utility classes).
 */
public class WaGrid<J extends WaGrid<J>> extends DivSimple<J> implements GapCapable<J>, SplitCapable<J>
{
    /**
     * Creates a grid container with the wa-grid class.
     */
    public WaGrid()
    {
        addClass("wa-grid");
    }

    /**
     * Sets the CSS custom property --min-column-size used by wa-grid examples to control
     * the minimum column size before wrapping (e.g., "15rem", "200px").
     *
     * @param size The size token or CSS length value
     * @return this
     */
    public @org.jspecify.annotations.NonNull J setMinColumnSize(String size)
    {
        addStyle("--min-column-size", size);
        return (J) this;
    }

    /**
     * Adds the wa-span-grid utility class to make the element span the full row in the grid.
     *
     * @return this
     */
    public J spanFullRow()
    {
        addClass("wa-span-grid");
        return (J) this;
    }
}
