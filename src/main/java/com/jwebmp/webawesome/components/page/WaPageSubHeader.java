package com.jwebmp.webawesome.components.page;


import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.core.base.html.DivSimple;

public class WaPageSubHeader<J extends WaPageSubHeader<J>> extends DivSimple<J> implements BorderTokenCapable<J>, SpaceTokenCapable<J>
{

    public WaPageSubHeader()
    {
        setTag("nav");
        addAttribute("slot", "subheader");
    }
}
