package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.DivSimple;

/**
 * Layout primitive wrapper for split layouts using Web Awesome utilities.
 *
 * Adds the base class "wa-split" and supports directional variants and
 * alignment/gap utilities as described in the docs (wa-split:row, wa-split:column,
 * wa-align-items-*, wa-gap-*).
 */
public class WaSplit extends DivSimple<WaSplit> implements GapCapable<WaSplit>
{
    public WaSplit()
    {
        addClass("wa-split");
    }

    /**
     * Sets the split to arrange children in a row.
     * @return this
     */
    public WaSplit row()
    {
        addClass("wa-split:row");
        return this;
    }

    /**
     * Sets the split to arrange children in a column.
     * @return this
     */
    public WaSplit column()
    {
        addClass("wa-split:column");
        return this;
    }

    /**
     * Applies an alignment utility class to control cross-axis alignment.
     * Accepts values such as start, end, center, stretch, baseline.
     * @param value alignment value without prefix (e.g., "center")
     * @return this
     */
    public WaSplit alignItems(String value)
    {
        if (value != null && !value.isEmpty())
        {
            addClass("wa-align-items-" + value);
        }
        return this;
    }
}
