package com.jwebmp.webawesome.components.page;

import com.jwebmp.core.base.html.DivSimple;

public class WaPageFooter<J extends WaPageFooter<J>> extends DivSimple<J>
{
    public WaPageFooter()
    {
        addAttribute("slot", "footer");
    }
}
