package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.DivSimple;

public class WaFlank extends DivSimple<WaFlank> implements GapCapable<WaFlank>, BorderRadiusCapable<WaFlank>, AlignVerticalCapable<WaFlank>
{
    public WaFlank()
    {
        addClass("wa-flank");
    }

    public WaFlank(boolean start)
    {
        addClass("wa-flank:" + (start ? "start" : "end"));
    }

    public WaFlank setDisplayAsLink()
    {
        setTag("a");
        addAttribute("href", "#");

        return this;
    }

}
