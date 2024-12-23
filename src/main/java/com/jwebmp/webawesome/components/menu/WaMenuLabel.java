package com.jwebmp.webawesome.components.menu;

import com.jwebmp.core.base.html.DivSimple;

public class WaMenuLabel extends DivSimple<WaMenuLabel>
{
    public WaMenuLabel()
    {
        setTag("wa-menu-label");
    }

    public WaMenuLabel(String text)
    {
        this();
        setText(text);
    }
    
}
