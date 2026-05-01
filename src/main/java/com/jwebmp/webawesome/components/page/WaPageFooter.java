package com.jwebmp.webawesome.components.page;


import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.core.base.html.DivSimple;

public class WaPageFooter<J extends WaPageFooter<J>> extends DivSimple<J> implements BorderTokenCapable<J>, SpaceTokenCapable<J>
{
    public WaPageFooter()
    {
        addAttribute("slot", "footer");
    }
}
