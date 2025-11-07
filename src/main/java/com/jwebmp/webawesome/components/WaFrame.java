package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.DivSimple;

/**
 * Layout primitive wrapper for a responsive frame/container that maintains a consistent proportion.
 * <p>
 * Adds the base class "wa-frame" and exposes a helper to control aspect ratio via CSS.
 */
public class WaFrame extends DivSimple<WaFrame> implements AlignVerticalCapable<WaFrame>
{
    public WaFrame()
    {
        addClass("wa-frame");
    }

    /**
     * Sets the CSS aspect-ratio of the frame, e.g., "16 / 9", "1 / 1", or "4 / 3".
     *
     * @param ratio CSS aspect-ratio expression
     * @return this
     */
    public WaFrame setAspectRatio(String ratio)
    {
        if (ratio != null && !ratio.isEmpty())
        {
            addStyle("aspect-ratio", ratio);
        }
        return this;
    }
}
