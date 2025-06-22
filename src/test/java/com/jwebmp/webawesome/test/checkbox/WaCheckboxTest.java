package com.jwebmp.webawesome.test.checkbox;

import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.checkbox.WaCheckbox;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaCheckboxTest
{
    @Test
    public void testRenderBasicCheckboxHtml()
    {
        var s = new WaCheckbox("Accept terms and conditions")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-checkbox>"));
        assertTrue(s.contains("Accept terms and conditions"));
    }

    @Test
    public void testRenderCheckboxWithCheckedStateHtml()
    {
        var s = new WaCheckbox("I agree to the terms")
                .setChecked(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-checkbox checked>"));
        assertTrue(s.contains("I agree to the terms"));
    }

    @Test
    public void testRenderCheckboxWithDisabledStateHtml()
    {
        var s = new WaCheckbox("Disabled option")
                .setDisabled(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-checkbox disabled>"));
        assertTrue(s.contains("Disabled option"));
    }

    @Test
    public void testRenderCheckboxWithRequiredStateHtml()
    {
        var s = new WaCheckbox("Required field")
                .setRequired(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-checkbox required>"));
        assertTrue(s.contains("Required field"));
    }

    @Test
    public void testRenderCheckboxWithIndeterminateStateHtml()
    {
        var s = new WaCheckbox("Select all items")
                .setIndeterminate(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-checkbox indeterminate>"));
        assertTrue(s.contains("Select all items"));
    }

    @Test
    public void testRenderCheckboxWithSizeHtml()
    {
        var s = new WaCheckbox("Medium checkbox")
                .setSize(Size.Medium)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-checkbox size=\"medium\">"));
        assertTrue(s.contains("Medium checkbox"));
    }

    @Test
    public void testRenderCheckboxWithHintHtml()
    {
        var s = new WaCheckbox("Checkbox with hint")
                .setHint("This is additional information")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-checkbox hint=\"This is additional information\">"));
        assertTrue(s.contains("Checkbox with hint"));
    }

    @Test
    public void testRenderCheckboxWithFormAttributesHtml()
    {
        var s = new WaCheckbox<>("Accept terms")
                .setName("terms")
                .setValue("accepted")
                .setForm("myForm")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-checkbox form=\"myForm\" name=\"terms\" value=\"accepted\">"));
        assertTrue(s.contains("Accept terms"));
    }

    @Test
    public void testRenderCheckboxWithCustomStylingHtml()
    {
        var s = new WaCheckbox<>("Custom styled checkbox")
                .setBackgroundColor("#f0f0f0")
                .setBackgroundColorChecked("#4a90e2")
                .setBorderColor("#cccccc")
                .setBorderColorChecked("#2a70c2")
                .setBorderRadius("4px")
                .setBorderStyle("solid")
                .setBorderWidth("2px")
                .setBoxShadow("0 0 5px rgba(0,0,0,0.2)")
                .setCheckedIconColor("white")
                .setToggleSize("24px")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-checkbox style=\"--background-color:#f0f0f0;--background-color-checked:#4a90e2;--border-color:#cccccc;--border-color-checked:#2a70c2;--border-radius:4px;--border-style:solid;--border-width:2px;--box-shadow:0 0 5px rgba(0,0,0,0.2);--checked-icon-color:white;--toggle-size:24px;\">"));
        assertTrue(s.contains("Custom styled checkbox"));
    }

    @Test
    public void testRenderCheckboxWithMultipleAttributesHtml()
    {
        var s = new WaCheckbox<>("Complete checkbox")
                .setChecked(true)
                .setRequired(true)
                .setSize(Size.Small)
                .setName("complete")
                .setValue("yes")
                .setHint("This is a complete checkbox example")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-checkbox checked hint=\"This is a complete checkbox example\" name=\"complete\" required size=\"small\" value=\"yes\">"));
        assertTrue(s.contains("Complete checkbox"));
    }
}