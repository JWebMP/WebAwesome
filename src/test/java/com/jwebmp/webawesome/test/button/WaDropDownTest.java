package com.jwebmp.webawesome.test.button;

import com.jwebmp.webawesome.components.PlacementExtended;
import com.jwebmp.webawesome.components.button.WaButton;
import com.jwebmp.webawesome.components.button.WaDropDown;
import com.jwebmp.webawesome.components.menu.WaMenu;
import com.jwebmp.webawesome.components.menu.WaMenuItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaDropDownTest
{
    @Test
    public void testRenderBasicDropDownHtml()
    {
        WaButton button = new WaButton("Dropdown");
        WaMenu menu = new WaMenu();
        menu.add(new WaMenuItem<>().setText("Item 1"));
        menu.add(new WaMenuItem<>().setText("Item 2"));
        menu.add(new WaMenuItem<>().setText("Item 3"));

        var s = new WaDropDown()
                .setButton(button)
                .setMenu(menu)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Dropdown"));
        assertTrue(s.contains("<wa-menu"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
        assertTrue(s.contains("Item 3"));
    }

    @Test
    public void testRenderDropDownWithPlacementHtml()
    {
        WaButton button = new WaButton("Placement");
        WaMenu menu = new WaMenu();
        menu.add(new WaMenuItem<>().setText("Item 1"));
        menu.add(new WaMenuItem<>().setText("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setMenu(menu)
                .setPlacement(PlacementExtended.Bottom_Start)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("placement=\"bottom-start\""));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Placement"));
        assertTrue(s.contains("<wa-menu"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }

    @Test
    public void testRenderDropDownWithDistanceAndSkiddingHtml()
    {
        WaButton button = new WaButton("Offset");
        WaMenu menu = new WaMenu();
        menu.add(new WaMenuItem<>().setText("Item 1"));
        menu.add(new WaMenuItem<>().setText("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setMenu(menu)
                .setDistance(10)
                .setSkidding(5)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("distance=\"10\""));
        assertTrue(s.contains("skidding=\"5\""));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Offset"));
        assertTrue(s.contains("<wa-menu"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }

    @Test
    public void testRenderDisabledDropDownHtml()
    {
        WaButton button = new WaButton("Disabled");
        WaMenu menu = new WaMenu();
        menu.add(new WaMenuItem<>().setText("Item 1"));
        menu.add(new WaMenuItem<>().setText("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setMenu(menu)
                .setDisabled(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("disabled"));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Disabled"));
        assertTrue(s.contains("<wa-menu"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }

    @Test
    public void testRenderStayOpenOnSelectDropDownHtml()
    {
        WaButton button = new WaButton("Stay Open");
        WaMenu menu = new WaMenu();
        menu.add(new WaMenuItem<>().setText("Item 1"));
        menu.add(new WaMenuItem<>().setText("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setMenu(menu)
                .setStayOpenOnSelect(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("stay-open-on-select"));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Stay Open"));
        assertTrue(s.contains("<wa-menu"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }

    @Test
    public void testRenderSyncDropDownHtml()
    {
        WaButton button = new WaButton("Sync Width");
        WaMenu menu = new WaMenu();
        menu.add(new WaMenuItem<>().setText("Item 1"));
        menu.add(new WaMenuItem<>().setText("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setMenu(menu)
                .setSync("width")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("sync=\"width\""));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Sync Width"));
        assertTrue(s.contains("<wa-menu"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }

    @Test
    public void testRenderCustomStyledDropDownHtml()
    {
        WaButton button = new WaButton("Custom Style");
        WaMenu menu = new WaMenu();
        menu.add(new WaMenuItem<>().setText("Item 1"));
        menu.add(new WaMenuItem<>().setText("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setMenu(menu)
                .setBoxShadow("0 4px 8px rgba(0,0,0,0.2)")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("style=\"--box-shadow:0 4px 8px rgba(0,0,0,0.2);\""));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Custom Style"));
        assertTrue(s.contains("<wa-menu"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }

    @Test
    public void testRenderValueDropDownHtml()
    {
        WaButton button = new WaButton("Select Item");
        WaMenu menu = new WaMenu();
        menu.add(new WaMenuItem<>().setValue("item1")
                                   .setText("Item 1"));
        menu.add(new WaMenuItem<>().setValue("item2")
                                   .setText("Item 2"));
        menu.add(new WaMenuItem<>().setValue("item3")
                                   .setText("Item 3"));

        var s = new WaDropDown()
                .setButton(button)
                .setMenu(menu)
                .setValue("item2")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("value=\"item2\""));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Select Item"));
        assertTrue(s.contains("<wa-menu"));
        assertTrue(s.contains("value=\"item1\""));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("value=\"item2\""));
        assertTrue(s.contains("Item 2"));
        assertTrue(s.contains("value=\"item3\""));
        assertTrue(s.contains("Item 3"));
    }

    @Test
    public void testCreateStaticMethodDropDownHtml()
    {
        WaMenu menu = new WaMenu();
        menu.add(new WaMenuItem<>().setText("Item 1"));
        menu.add(new WaMenuItem<>().setText("Item 2"));

        var s = WaDropDown.create("Static Create", menu)
                          .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Static Create"));
        assertTrue(s.contains("<wa-menu"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }
}
