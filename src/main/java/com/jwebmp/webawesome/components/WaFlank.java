package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.DivSimple;

public class WaFlank<J extends WaFlank<J>> extends DivSimple<J> implements GapCapable<J>, BorderRadiusCapable<J>, AlignVerticalCapable<J>, SpaceTokenCapable<J>
{
    public WaFlank()
    {
        addClass("wa-flank");
    }

    public WaFlank(boolean start)
    {
        addClass("wa-flank:" + (start ? "start" : "end"));
    }

    @SuppressWarnings("unchecked")
    public J setDisplayAsLink()
    {
        setTag("a");
        addAttribute("href", "#");

        return (J) this;
    }

}