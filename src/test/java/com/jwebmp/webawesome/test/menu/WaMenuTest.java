package com.jwebmp.webawesome.test.menu;

import com.jwebmp.webawesome.components.menu.WaMenu;
import com.jwebmp.webawesome.components.menu.WaMenuItem;
import com.jwebmp.webawesome.components.menu.WaMenuLabel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaMenuTest
{
    @Test
    public void testRenderBasicMenuHtml()
    {
        var menu = new WaMenu<>();
        menu.add(new WaMenuItem<>().setText("Item 1"));
        menu.add(new WaMenuItem<>().setText("Item 2"));
        menu.add(new WaMenuItem<>().setText("Item 3"));

        var html = menu.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-menu>"));
        assertTrue(html.contains("<wa-menu-item>"));
        assertTrue(html.contains("Item 1"));
        assertTrue(html.contains("Item 2"));
        assertTrue(html.contains("Item 3"));
    }

    @Test
    public void testRenderMenuWithSizeHtml()
    {
        var menu = new WaMenu<>();
        menu.setSize("small");
        menu.add(new WaMenuItem<>().setText("Small Item 1"));
        menu.add(new WaMenuItem<>().setText("Small Item 2"));

        var html = menu.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-menu size=\"small\">"));
        assertTrue(html.contains("Small Item 1"));
        assertTrue(html.contains("Small Item 2"));
    }

    @Test
    public void testRenderMenuWithLabelsHtml()
    {
        var menu = new WaMenu<>();
        menu.add(new WaMenuLabel<>("Fruits"));
        menu.add(new WaMenuItem<>().setText("Apple"));
        menu.add(new WaMenuItem<>().setText("Banana"));
        menu.add(new WaMenuItem<>().setText("Orange"));

        menu.add(new WaMenuLabel<>("Vegetables"));
        menu.add(new WaMenuItem<>().setText("Carrot"));
        menu.add(new WaMenuItem<>().setText("Broccoli"));
        menu.add(new WaMenuItem<>().setText("Spinach"));

        var html = menu.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-menu-label>"));
        assertTrue(html.contains("Fruits"));
        assertTrue(html.contains("Vegetables"));
        assertTrue(html.contains("Apple"));
        assertTrue(html.contains("Carrot"));
    }

    @Test
    public void testRenderMenuWithCheckboxItemsHtml()
    {
        var menu = new WaMenu<>();
        menu.add(new WaMenuLabel<>("Select Options"));
        menu.add(new WaMenuItem<>().setType("checkbox")
                                   .setText("Option 1"));
        menu.add(new WaMenuItem<>().setType("checkbox")
                                   .setChecked(true)
                                   .setText("Option 2"));
        menu.add(new WaMenuItem<>().setType("checkbox")
                                   .setText("Option 3"));

        var html = menu.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-menu-item type=\"checkbox\">"));
        assertTrue(html.contains("<wa-menu-item checked type=\"checkbox\">"));
        assertTrue(html.contains("Option 1"));
        assertTrue(html.contains("Option 2"));
        assertTrue(html.contains("Option 3"));
    }

    @Test
    public void testRenderMenuWithValuesHtml()
    {
        var menu = new WaMenu<>();
        menu.add(new WaMenuItem<>().setValue("item1")
                                   .setText("Item 1"));
        menu.add(new WaMenuItem<>().setValue("item2")
                                   .setText("Item 2"));
        menu.add(new WaMenuItem<>().setValue("item3")
                                   .setText("Item 3"));

        var html = menu.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-menu-item value=\"item1\">"));
        assertTrue(html.contains("<wa-menu-item value=\"item2\">"));
        assertTrue(html.contains("<wa-menu-item value=\"item3\">"));
    }

    @Test
    public void testRenderMenuWithDisabledItemsHtml()
    {
        var menu = new WaMenu<>();
        menu.add(new WaMenuItem<>().setText("Enabled Item"));
        menu.add(new WaMenuItem<>().setDisabled(true)
                                   .setText("Disabled Item"));
        menu.add(new WaMenuItem<>().setText("Enabled Item"));

        var html = menu.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-menu-item disabled>"));
        assertTrue(html.contains("Disabled Item"));
    }

    @Test
    public void testRenderMenuWithLoadingItemsHtml()
    {
        var menu = new WaMenu<>();
        menu.add(new WaMenuItem<>().setText("Normal Item"));
        menu.add(new WaMenuItem<>().setLoading(true)
                                   .setText("Loading Item"));
        menu.add(new WaMenuItem<>().setText("Normal Item"));

        var html = menu.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-menu-item loading>"));
        assertTrue(html.contains("Loading Item"));
    }

    @Test
    public void testRenderMenuWithSubmenuHtml()
    {
        var submenu = new WaMenu<>();
        submenu.add(new WaMenuItem<>().setText("Submenu Item 1"));
        submenu.add(new WaMenuItem<>().setText("Submenu Item 2"));
        submenu.add(new WaMenuItem<>().setText("Submenu Item 3"));

        var menu = new WaMenu<>();
        menu.add(new WaMenuItem<>().setText("Item 1"));
        menu.add(new WaMenuItem<>().setWithSubmenu(true)
                                   .setText("Item with Submenu")
                                   .setSubmenu(submenu));
        menu.add(new WaMenuItem<>().setText("Item 3"));

        var html = menu.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-menu-item with-submenu>"));
        assertTrue(html.contains("<wa-menu slot=\"submenu\">"));
        assertTrue(html.contains("Submenu Item 1"));
        assertTrue(html.contains("Submenu Item 2"));
        assertTrue(html.contains("Submenu Item 3"));
    }

    @Test
    public void testRenderMenuWithCustomStylingHtml()
    {
        var menu = new WaMenu<>();
        menu.setPadding("12px");
        menu.setMargin("8px");
        menu.setBorderRadius("8px");
        menu.setBackground("#f8f9fa");
        menu.setBoxShadow("0 2px 10px rgba(0,0,0,0.1)");
        menu.setBorder("1px solid #dee2e6");
        menu.setFontSize("14px");

        menu.add(new WaMenuItem<>().setText("Custom Styled Item 1"));
        menu.add(new WaMenuItem<>().setText("Custom Styled Item 2"));

        var html = menu.toString(true);
        System.out.println(html);

        assertTrue(html.contains("--padding:12px"));
        assertTrue(html.contains("--margin:8px"));
        assertTrue(html.contains("--border-radius:8px"));
        assertTrue(html.contains("--background:#f8f9fa"));
        assertTrue(html.contains("--box-shadow:0 2px 10px rgba(0,0,0,0.1)"));
        assertTrue(html.contains("--border:1px solid #dee2e6"));
        assertTrue(html.contains("--font-size:14px"));
    }

    @Test
    public void testRenderMenuItemWithCustomStylingHtml()
    {
        var menuItem = new WaMenuItem<>();
        menuItem.setBackgroundColorHover("#e9ecef");
        menuItem.setTextColorHover("#007bff");
        menuItem.setPadding("10px 16px");
        menuItem.setText("Custom Hover Item");

        var html = menuItem.toString(true);
        System.out.println(html);

        assertTrue(html.contains("--background-color-hover:#e9ecef"));
        assertTrue(html.contains("--text-color-hover:#007bff"));
        assertTrue(html.contains("--padding:10px 16px"));
    }

    @Test
    public void testRenderMenuLabelWithCustomStylingHtml()
    {
        var menuLabel = new WaMenuLabel<>();
        menuLabel.setPadding("8px 16px");
        menuLabel.setFontSize("12px");
        menuLabel.setColor("#6c757d");
        menuLabel.setMargin("4px 0");
        menuLabel.setText("Custom Label");

        var html = menuLabel.toString(true);
        System.out.println(html);

        assertTrue(html.contains("--padding:8px 16px"));
        assertTrue(html.contains("--font-size:12px"));
        assertTrue(html.contains("--color:#6c757d"));
        assertTrue(html.contains("--margin:4px 0"));
    }
}
