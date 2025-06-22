package com.jwebmp.webawesome.test.spinner;

import com.jwebmp.webawesome.components.spinner.WaSpinner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaSpinnerTest
{
    @Test
    public void testRenderBasicSpinnerHtml()
    {
        var s = new WaSpinner<>()
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-spinner></wa-spinner>", s);
    }

    @Test
    public void testRenderSpinnerWithFontSizeHtml()
    {
        var s = new WaSpinner<>()
                .setFontSize("24px")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("style="));
        assertTrue(s.contains("font-size:24px"));
    }

    @Test
    public void testRenderSpinnerWithTrackWidthHtml()
    {
        var s = new WaSpinner<>()
                .setTrackWidth("4px")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("style="));
        assertTrue(s.contains("--track-width:4px"));
    }

    @Test
    public void testRenderSpinnerWithColorsHtml()
    {
        // Custom track color
        var s1 = new WaSpinner<>()
                .setTrackColor("#e0e0e0")
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("--track-color:#e0e0e0"));

        // Custom indicator color
        var s2 = new WaSpinner<>()
                .setIndicatorColor("#2196f3")
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("--indicator-color:#2196f3"));
    }

    @Test
    public void testRenderSpinnerWithSpeedHtml()
    {
        var s = new WaSpinner<>()
                .setSpeed("1.5s")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("--speed:1.5s"));
    }

    @Test
    public void testRenderSpinnerWithCombinedCustomStylingHtml()
    {
        var s = new WaSpinner<>()
                .setFontSize("32px")
                .setTrackWidth("4px")
                .setTrackColor("#f0f0f0")
                .setIndicatorColor("#ff4081")
                .setSpeed("1.5s")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("font-size:32px"));
        assertTrue(s.contains("--track-width:4px"));
        assertTrue(s.contains("--track-color:#f0f0f0"));
        assertTrue(s.contains("--indicator-color:#ff4081"));
        assertTrue(s.contains("--speed:1.5s"));
    }

    @Test
    public void testRenderSpinnerWithBindingsHtml()
    {
        var s = new WaSpinner<>()
                .bindFontSize("spinnerSize + 'px'")
                .bindTrackWidth("trackWidthValue + 'px'")
                .bindTrackColor("trackColorValue")
                .bindIndicatorColor("indicatorColorValue")
                .bindSpeed("speedValue + 's'")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("[style.font-size]=\"spinnerSize + 'px'\""));
        assertTrue(s.contains("[style.--track-width]=\"trackWidthValue + 'px'\""));
        assertTrue(s.contains("[style.--track-color]=\"trackColorValue\""));
        assertTrue(s.contains("[style.--indicator-color]=\"indicatorColorValue\""));
        assertTrue(s.contains("[style.--speed]=\"speedValue + 's'\""));
    }
}