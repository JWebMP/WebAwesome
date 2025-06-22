package com.jwebmp.webawesome.test.range;

import com.jwebmp.webawesome.components.range.RangeTooltipPosition;
import com.jwebmp.webawesome.components.range.WaRange;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaRangeTest
{
    @Test
    public void testRenderBasicRangeHtml()
    {
        var s = new WaRange<>()
                .setLabel("Basic Slider")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-slider"));
        assertTrue(s.contains("label=\"Basic Slider\""));
        assertTrue(s.contains("</wa-slider>"));
    }

    @Test
    public void testRenderRangeWithMinMaxStepHtml()
    {
        var s = new WaRange<>()
                .setLabel("Custom Range")
                .setMin(0)
                .setMax(100)
                .setStep(5)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Custom Range\""));
        assertTrue(s.contains("min=\"0\""));
        assertTrue(s.contains("max=\"100\""));
        assertTrue(s.contains("step=\"5\""));
    }

    @Test
    public void testRenderRangeWithTooltipHtml()
    {
        var s = new WaRange<>()
                .setLabel("Tooltip on Bottom")
                .setTooltipPosition(RangeTooltipPosition.Bottom)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-slider"));
        assertTrue(s.contains("label=\"Tooltip on Bottom\""));
        assertTrue(s.contains("tooltip=\"bottom\""));
        assertTrue(s.contains("</wa-slider>"));
    }

    @Test
    public void testRenderRangeWithHintHtml()
    {
        var s = new WaRange<>()
                .setLabel("Volume")
                .setHint("Adjust the volume level")
                .setMin(0)
                .setMax(100)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Volume\""));
        assertTrue(s.contains("hint=\"Adjust the volume level\""));
        assertTrue(s.contains("min=\"0\""));
        assertTrue(s.contains("max=\"100\""));
    }

    @Test
    public void testRenderRangeWithDisabledHtml()
    {
        var s = new WaRange<>()
                .setLabel("Disabled Slider")
                .setDisabled(true)
                .setMin(0)
                .setMax(100)
                .setValue(50)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Disabled Slider\""));
        assertTrue(s.contains("value=\"50\""));
        assertTrue(s.contains("disabled"));
        assertTrue(s.contains("min=\"0\""));
        assertTrue(s.contains("max=\"100\""));
    }

    @Test
    public void testRenderRangeWithCustomStylingHtml()
    {
        var s = new WaRange<>()
                .setLabel("Custom Styling")
                .setTrackColourActive("#4caf50")
                .setTrackColourInactive("#e0e0e0")
                .setTrackHeight("6px")
                .setThumbColor("#2196f3")
                .setThumbSize("20px")
                .setThumbShadow("0 0 5px rgba(33, 150, 243, 0.5)")
                .setThumbGap("2px")
                .setTooltipOffset("10px")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Custom Styling\""));
        assertTrue(s.contains("style="));
        assertTrue(s.contains("--track-color-active:#4caf50"));
        assertTrue(s.contains("--track-color-inactive:#e0e0e0"));
        assertTrue(s.contains("--track-height:6px"));
        assertTrue(s.contains("--thumb-color:#2196f3"));
        assertTrue(s.contains("--thumb-size:20px"));
        assertTrue(s.contains("--thumb-shadow:0 0 5px rgba(33, 150, 243, 0.5)"));
        assertTrue(s.contains("--thumb-gap:2px"));
        assertTrue(s.contains("--tooltip-offset:10px"));
    }

    @Test
    public void testRenderRangeWithTooltipFormatterHtml()
    {
        var s = new WaRange<>()
                .setLabel("With Tooltip Formatter")
                .setTooltipFormatter("$${value}")
                .setID("rangeWithFormatter")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"With Tooltip Formatter\""));
        assertTrue(s.contains("id=\"rangeWithFormatter\""));
        assertTrue(s.contains("const range = document.querySelector('#rangeWithFormatter');"));
        assertTrue(s.contains("range.tooltipFormatter = value => `$${value}`;"));
    }
}
