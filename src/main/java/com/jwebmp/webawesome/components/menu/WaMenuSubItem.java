package com.jwebmp.webawesome.components.menu;

import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaMenuSubItem component represents a submenu in a menu.
 * It extends WaMenu and sets the slot to 'submenu'.
 * This class is a convenience wrapper for creating submenus.
 * 
 * Example usage:
 * ```java
 * WaMenuItem menuItem = new WaMenuItem().setWithSubmenu(true);
 * WaMenuSubItem submenu = new WaMenuSubItem();
 * submenu.add(new WaMenuItem().setMenuText("Submenu Item 1"));
 * submenu.add(new WaMenuItem().setMenuText("Submenu Item 2"));
 * menuItem.add(submenu);
 * ```
 */
@Getter
@Setter
public class WaMenuSubItem<J extends WaMenuSubItem<J>> extends WaMenu<J>
{
    /**
     * Creates a new WaMenuSubItem component.
     * Sets the slot attribute to 'submenu'.
     */
    public WaMenuSubItem()
    {
        addAttribute("slot", "submenu");
    }
}
