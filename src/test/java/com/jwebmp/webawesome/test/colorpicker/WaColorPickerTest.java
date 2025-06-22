package com.jwebmp.webawesome.test.colorpicker;

import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.colorpicker.WaColorPicker;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class WaColorPickerTest
{
    @Test
    public void testRenderBasicColorPickerHtml()
    {
        var s = new WaColorPicker<>()
                .setLabel("Choose a color")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-color-picker label=\"Choose a color\">"));
    }

    @Test
    public void testRenderColorPickerWithFormatHtml()
    {
        var s = new WaColorPicker<>()
                .setLabel("HEX Color")
                .setFormat("hex")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-color-picker format=\"hex\" label=\"HEX Color\">"));
    }

    @Test
    public void testRenderColorPickerWithOpacityHtml()
    {
        var s = new WaColorPicker<>()
                .setLabel("Color with Opacity")
                .setOpacity(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-color-picker label=\"Color with Opacity\" opacity>"));
    }

    @Test
    public void testRenderColorPickerWithInitialValueHtml()
    {
        var s = new WaColorPicker<>()
                .setLabel("Red Color")
                .setValue("#ff0000")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-color-picker label=\"Red Color\" value=\"#ff0000\">"));
    }

    @Test
    public void testRenderColorPickerWithSizeHtml()
    {
        var s = new WaColorPicker<>()
                .setLabel("Small Color Picker")
                .setSize(Size.Small)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-color-picker label=\"Small Color Picker\" size=\"small\">"));
    }

    @Test
    public void testRenderColorPickerWithSwatchesHtml()
    {
        var s = new WaColorPicker<>()
                .setLabel("With Swatches")
                .setSwatches(Arrays.asList("#ff0000", "#00ff00", "#0000ff"))
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-color-picker label=\"With Swatches\" swatches=\"#ff0000;#00ff00;#0000ff\">"));
    }

    @Test
    public void testRenderColorPickerWithHintHtml()
    {
        var s = new WaColorPicker<>()
                .setLabel("With Hint Text")
                .setHint("Select a color for your profile theme")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-color-picker hint=\"Select a color for your profile theme\" label=\"With Hint Text\">"));
    }

    @Test
    public void testRenderColorPickerWithDisabledAndRequiredStatesHtml()
    {
        var s = new WaColorPicker<>()
                .setLabel("Disabled and Required Color Picker")
                .setDisabled(true)
                .setRequired(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-color-picker disabled label=\"Disabled and Required Color Picker\" required>"));
    }

    @Test
    public void testRenderColorPickerWithNoFormatToggleHtml()
    {
        var s = new WaColorPicker<>()
                .setLabel("No Format Toggle")
                .setNoFormatToggle(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-color-picker label=\"No Format Toggle\" no-format-toggle>"));
    }

    @Test
    public void testRenderColorPickerWithUppercaseHtml()
    {
        var s = new WaColorPicker<>()
                .setLabel("Uppercase HEX")
                .setFormat("hex")
                .setUppercase(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-color-picker format=\"hex\" label=\"Uppercase HEX\" uppercase>"));
    }

    @Test
    public void testRenderColorPickerWithFormAttributesHtml()
    {
        var s = new WaColorPicker<>()
                .setLabel("Form Integration")
                .setName("themeColor")
                .setForm("colorForm")
                .setRequired(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-color-picker form=\"colorForm\" label=\"Form Integration\" name=\"themeColor\" required>"));
    }

    @Test
    public void testRenderColorPickerWithCustomStylingHtml()
    {
        var s = new WaColorPicker<>()
                .setLabel("Custom Styling")
                .setSwatchSize("24px")
                .setSwatchSpacing("8px")
                .setBorderRadius("8px")
                .setDropdownWidth("300px")
                .setDropdownHeight("250px")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-color-picker label=\"Custom Styling\" style=\"--border-radius:8px;--dropdown-height:250px;--dropdown-width:300px;--swatch-size:24px;--swatch-spacing:8px;\">"));
    }
}