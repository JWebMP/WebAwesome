package com.jwebmp.webawesome.test.button;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.webawesome.components.PlacementExtended;
import com.jwebmp.webawesome.components.button.WaButton;
import com.jwebmp.webawesome.components.button.WaDropDown;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaDropDownTest
{
    @Test
    public void testRenderBasicDropDownHtml()
    {
        WaButton button = new WaButton("Dropdown");
        DivSimple<?> content = new DivSimple<>();
        content.add(new Paragraph<>("Item 1"));
        content.add(new Paragraph<>("Item 2"));
        content.add(new Paragraph<>("Item 3"));

        var s = new WaDropDown()
                .setButton(button)
                .setContent(content)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Dropdown"));
        assertTrue(s.contains("<div"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
        assertTrue(s.contains("Item 3"));
    }

    @Test
    public void testRenderDropDownWithPlacementHtml()
    {
        WaButton button = new WaButton("Placement");
        DivSimple<?> content = new DivSimple<>();
        content.add(new Paragraph<>("Item 1"));
        content.add(new Paragraph<>("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setContent(content)
                .setPlacement(PlacementExtended.Bottom_Start)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("placement=\"bottom-start\""));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Placement"));
        assertTrue(s.contains("<div"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }

    @Test
    public void testRenderDropDownWithDistanceAndSkiddingHtml()
    {
        WaButton button = new WaButton("Offset");
        DivSimple<?> content = new DivSimple<>();
        content.add(new Paragraph<>("Item 1"));
        content.add(new Paragraph<>("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setContent(content)
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
        assertTrue(s.contains("<div"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }

    @Test
    public void testRenderDisabledDropDownHtml()
    {
        WaButton button = new WaButton("Disabled");
        DivSimple<?> content = new DivSimple<>();
        content.add(new Paragraph<>("Item 1"));
        content.add(new Paragraph<>("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setContent(content)
                .setDisabled(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("disabled"));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Disabled"));
        assertTrue(s.contains("<div"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }

    @Test
    public void testRenderStayOpenOnSelectDropDownHtml()
    {
        WaButton button = new WaButton("Stay Open");
        DivSimple<?> content = new DivSimple<>();
        content.add(new Paragraph<>("Item 1"));
        content.add(new Paragraph<>("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setContent(content)
                .setStayOpenOnSelect(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("stay-open-on-select"));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Stay Open"));
        assertTrue(s.contains("<div"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }

    @Test
    public void testRenderSyncDropDownHtml()
    {
        WaButton button = new WaButton("Sync Width");
        DivSimple<?> content = new DivSimple<>();
        content.add(new Paragraph<>("Item 1"));
        content.add(new Paragraph<>("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setContent(content)
                .setSync("width")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("sync=\"width\""));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Sync Width"));
        assertTrue(s.contains("<div"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }

    @Test
    public void testRenderCustomStyledDropDownHtml()
    {
        WaButton button = new WaButton("Custom Style");
        DivSimple<?> content = new DivSimple<>();
        content.add(new Paragraph<>("Item 1"));
        content.add(new Paragraph<>("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setContent(content)
                .setBoxShadow("0 4px 8px rgba(0,0,0,0.2)")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("style=\"--box-shadow:0 4px 8px rgba(0,0,0,0.2);\""));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Custom Style"));
        assertTrue(s.contains("<div"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }

    @Test
    public void testRenderValueDropDownHtml()
    {
        WaButton button = new WaButton("Select Item");
        DivSimple<?> content = new DivSimple<>();
        Paragraph<?> item1 = new Paragraph<>("Item 1");
        item1.addAttribute("value", "item1");
        Paragraph<?> item2 = new Paragraph<>("Item 2");
        item2.addAttribute("value", "item2");
        Paragraph<?> item3 = new Paragraph<>("Item 3");
        item3.addAttribute("value", "item3");
        content.add(item1);
        content.add(item2);
        content.add(item3);

        var s = new WaDropDown()
                .setButton(button)
                .setContent(content)
                .setValue("item2")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("value=\"item2\""));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Select Item"));
        assertTrue(s.contains("<div"));
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
        DivSimple<?> content = new DivSimple<>();
        content.add(new Paragraph<>("Item 1"));
        content.add(new Paragraph<>("Item 2"));

        var s = WaDropDown.create("Static Create", content)
                          .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Static Create"));
        assertTrue(s.contains("<div"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }
    
    @Test
    public void testRenderDropDownWithEventHandlersHtml()
    {
        WaButton button = new WaButton("Events");
        DivSimple<?> content = new DivSimple<>();
        content.add(new Paragraph<>("Item 1"));
        content.add(new Paragraph<>("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setContent(content)
                .setShowEvent("onShow()")
                .setAfterShowEvent("onAfterShow()")
                .setHideEvent("onHide()")
                .setAfterHideEvent("onAfterHide()")
                .setSelectEvent("onSelect($event)")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("wa-show=\"onShow()\""));
        assertTrue(s.contains("wa-after-show=\"onAfterShow()\""));
        assertTrue(s.contains("wa-hide=\"onHide()\""));
        assertTrue(s.contains("wa-after-hide=\"onAfterHide()\""));
        assertTrue(s.contains("wa-select=\"onSelect($event)\""));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Events"));
        assertTrue(s.contains("<div"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }
    
    @Test
    public void testRenderDropDownWithNgModelBindingHtml()
    {
        WaButton button = new WaButton("Binding");
        DivSimple<?> content = new DivSimple<>();
        content.add(new Paragraph<>("Item 1"));
        content.add(new Paragraph<>("Item 2"));

        var s = new WaDropDown()
                .setButton(button)
                .setContent(content)
                .bind("selectedValue")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dropdown"));
        assertTrue(s.contains("[(ngModel)]=\"selectedValue\""));
        assertTrue(s.contains("caret"));
        assertTrue(s.contains("slot=\"trigger\""));
        assertTrue(s.contains("Binding"));
        assertTrue(s.contains("<div"));
        assertTrue(s.contains("Item 1"));
        assertTrue(s.contains("Item 2"));
    }
}