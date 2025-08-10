package com.jwebmp.webawesome.test.button;

import com.jwebmp.webawesome.components.button.WaButton;
import com.jwebmp.webawesome.components.button.WaDropDown;
import com.jwebmp.webawesome.components.button.WaDropdownItem;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaDropdownItemTest
{
    @Test
    public void testRenderBasicDropdownItemHtml()
    {
        WaDropdownItem<?> item = new WaDropdownItem<>("Item 1");
        
        var s = item.toString(true);
        
        System.out.println(s);
        
        assertTrue(s.contains("<wa-dropdown-item"));
        assertTrue(s.contains("Item 1"));
    }
    
    @Test
    public void testRenderDropdownItemWithValueHtml()
    {
        WaDropdownItem<?> item = new WaDropdownItem<>("Item 1")
                .setValue("item1");
        
        var s = item.toString(true);
        
        System.out.println(s);
        
        assertTrue(s.contains("<wa-dropdown-item"));
        assertTrue(s.contains("value=\"item1\""));
        assertTrue(s.contains("Item 1"));
    }
    
    @Test
    public void testRenderDisabledDropdownItemHtml()
    {
        WaDropdownItem<?> item = new WaDropdownItem<>("Item 1")
                .setDisabled(true);
        
        var s = item.toString(true);
        
        System.out.println(s);
        
        assertTrue(s.contains("<wa-dropdown-item"));
        assertTrue(s.contains("disabled"));
        assertTrue(s.contains("Item 1"));
    }
    
    @Test
    public void testRenderCheckedDropdownItemHtml()
    {
        WaDropdownItem<?> item = new WaDropdownItem<>("Item 1")
                .setChecked(true);
        
        var s = item.toString(true);
        
        System.out.println(s);
        
        assertTrue(s.contains("<wa-dropdown-item"));
        assertTrue(s.contains("checked"));
        assertTrue(s.contains("Item 1"));
    }
    
    @Test
    public void testRenderDropdownWithItemsHtml()
    {
        WaButton button = new WaButton("Dropdown");
        
        WaDropDown<?> dropdown = new WaDropDown<>()
                .setButton(button)
                .addItem("Item 1", "item1")
                .addItem("Item 2", "item2")
                .addItem("Item 3", "item3");
        
        var s = dropdown.toString(true);
        
        System.out.println(s);
        
        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("<wa-dropdown-item"));
        assertTrue(s.contains("value=\"item1\""));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("value=\"item2\""));
        assertTrue(s.contains("Item 2"));
        assertTrue(s.contains("value=\"item3\""));
        assertTrue(s.contains("Item 3"));
    }
    
    @Test
    public void testRenderDropdownItemWithIconHtml()
    {
        WaIcon<?> icon = new WaIcon<>().setName("heart");
        
        WaDropdownItem<?> item = new WaDropdownItem<>("Favorite")
                .setStartContent(icon);
        
        var s = item.toString(true);
        
        System.out.println(s);
        
        assertTrue(s.contains("<wa-dropdown-item"));
        assertTrue(s.contains("<div slot=\"start\""));
        assertTrue(s.contains("<wa-icon"));
        assertTrue(s.contains("name=\"heart\""));
        assertTrue(s.contains("Favorite"));
    }
    
    @Test
    public void testRenderDropdownWithSubmenuHtml()
    {
        WaButton button = new WaButton("Main Dropdown");
        
        WaDropDown<?> submenu = new WaDropDown<>()
                .addItem("Submenu Item 1")
                .addItem("Submenu Item 2");
        
        WaDropdownItem<?> itemWithSubmenu = new WaDropdownItem<>("More Options")
                .setSubmenu(submenu);
        
        WaDropDown<?> dropdown = new WaDropDown<>()
                .setButton(button)
                .addItem("Item 1")
                .addItem(itemWithSubmenu)
                .addItem("Item 3");
        
        var s = dropdown.toString(true);
        
        System.out.println(s);
        
        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("<wa-dropdown-item"));
        assertTrue(s.contains("More Options"));
        assertTrue(s.contains("slot=\"submenu\""));
        assertTrue(s.contains("Submenu Item 1"));
        assertTrue(s.contains("Submenu Item 2"));
    }
}