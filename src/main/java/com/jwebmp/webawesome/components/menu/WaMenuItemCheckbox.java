package com.jwebmp.webawesome.components.menu;

import lombok.Getter;
import lombok.Setter;

/**
 * The WaMenuItemCheckbox component represents a checkbox item in a menu.
 * It extends WaMenuItem and sets the type to 'checkbox'.
 */
@Getter
@Setter
public class WaMenuItemCheckbox<J extends WaMenuItemCheckbox<J>> extends WaMenuItem<J>
{
    public WaMenuItemCheckbox()
    {
        setType("checkbox");
    }
}
