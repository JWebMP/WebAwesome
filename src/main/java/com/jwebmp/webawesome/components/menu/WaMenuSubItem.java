package com.jwebmp.webawesome.components.menu;

import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaMenuSubItem extends WaMenu
{
    public WaMenuSubItem()
    {
        addAttribute("slot", "submenu");
    }

}
