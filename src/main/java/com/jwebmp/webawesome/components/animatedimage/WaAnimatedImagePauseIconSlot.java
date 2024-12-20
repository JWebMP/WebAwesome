package com.jwebmp.webawesome.components.animatedimage;

import com.jwebmp.core.base.html.DivSimple;

/**
 * Optional pause icon to use instead of the default. Works best with <wa-icon>.
 */
public class WaAnimatedImagePauseIconSlot extends DivSimple<WaAnimatedImagePauseIconSlot>
{
    public WaAnimatedImagePauseIconSlot()
    {
        addAttribute("slot", "pause-icon");
    }
}
