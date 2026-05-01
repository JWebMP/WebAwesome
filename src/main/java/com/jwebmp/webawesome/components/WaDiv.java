package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.DivSimple;

/**
 * A general-purpose styled div that implements all Web Awesome token-capable interfaces.
 * Use this instead of plain {@link DivSimple} when you want fluent access to design token methods
 * for spacing, typography, borders, shadows, colours, and transitions.
 */
public class WaDiv<J extends WaDiv<J>> extends DivSimple<J>
        implements SpaceTokenCapable<J>, TypographyTokenCapable<J>, BorderTokenCapable<J>,
        ShadowTokenCapable<J>, ColourCapable<J>, TransitionTokenCapable<J>
{
    public WaDiv()
    {
    }

    public WaDiv(String tag)
    {
        setTag(tag);
    }
}

