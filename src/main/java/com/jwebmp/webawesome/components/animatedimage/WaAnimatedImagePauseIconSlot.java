package com.jwebmp.webawesome.components.animatedimage;

import com.jwebmp.core.base.html.DivSimple;

/**
 * Optional pause icon to use instead of the default. Works best with <wa-icon>.
 */
public class WaAnimatedImagePauseIconSlot<J extends WaAnimatedImagePauseIconSlot<J>> extends DivSimple<J>
{
    public WaAnimatedImagePauseIconSlot()
    {
        addAttribute("slot", "pause-icon");
    }
}
