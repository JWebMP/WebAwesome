package com.jwebmp.webawesome.components.menu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaMenuItemCheckbox extends WaMenuItem
{
    private Boolean checked;

    public WaMenuItemCheckbox()
    {
        addAttribute("type", "checkbox");
    }

}
