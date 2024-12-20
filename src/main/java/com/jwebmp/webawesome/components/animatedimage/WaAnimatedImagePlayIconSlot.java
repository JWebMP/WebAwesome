package com.jwebmp.webawesome.components.animatedimage;

import com.jwebmp.core.base.html.DivSimple;

/**
 * Optional play icon to use instead of the default. Works best with <pre><wa-icon></pre>.
 */
public class WaAnimatedImagePlayIconSlot extends DivSimple<WaAnimatedImagePlayIconSlot>
{
    public WaAnimatedImagePlayIconSlot()
    {
        addAttribute("slot", "play-icon");
    }
}
