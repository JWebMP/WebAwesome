package com.jwebmp.webawesome.components.button;


import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.FocusTokenCapable;
public class WaSplitButton<J extends WaSplitButton<J>> extends WaDropDown<J> implements BorderTokenCapable<J>, FocusTokenCapable<J>
{
    public WaSplitButton()
    {
        addAttribute("placement", "bottom-start");
    }

}
