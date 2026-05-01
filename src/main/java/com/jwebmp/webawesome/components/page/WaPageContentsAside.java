package com.jwebmp.webawesome.components.page;


import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.core.base.html.DivSimple;

public class WaPageContentsAside<J extends WaPageContentsAside<J>> extends DivSimple<J> implements SpaceTokenCapable<J>
{

    public WaPageContentsAside()
    {
        addAttribute("slot", "aside");
    }


}
