package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.DivSimple;

/**
 * Layout primitive wrapper for split layouts using Web Awesome utilities.
 *
 * Adds the base class "wa-split" and supports directional variants and
 * alignment/gap utilities as described in the docs (wa-split:row, wa-split:column,
 * wa-align-items-*, wa-gap-*).
 */
public class WaSplit<J extends WaSplit<J>> extends DivSimple<J>
        implements GapCapable<J>, SpaceTokenCapable<J>,AlignVerticalCapable<J>,JustifyContentCapable<J>
{
    public WaSplit()
    {
        addClass("wa-split");
    }

    /**
     * Sets the split to arrange children in a row.
     * @return this
     */
    @SuppressWarnings("unchecked")
    public J row()
    {
        addClass("wa-split:row");
        return (J) this;
    }

    /**
     * Sets the split to arrange children in a column.
     * @return this
     */
    @SuppressWarnings("unchecked")
    public J column()
    {
        addClass("wa-split:column");
        return (J)this;
    }

}