package com.jwebmp.webawesome.test.progressring;

import com.jwebmp.webawesome.components.icon.WaIcon;
import com.jwebmp.webawesome.components.progressring.WaProgressRing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaProgressRingTest
{
    @Test
    public void testRenderBasicProgressRingHtml()
    {
        var progressRing = new WaProgressRing<>()
                .setValue(50);

        var html = progressRing.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-ring"));
        assertTrue(html.contains("value=\"50\""));
    }

    @Test
    public void testRenderProgressRingWithLabelHtml()
    {
        var progressRing = new WaProgressRing<>()
                .setValue(75)
                .setLabel("Loading...");

        var html = progressRing.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-ring"));
        assertTrue(html.contains("value=\"75\""));
        assertTrue(html.contains("label=\"Loading...\""));
    }

    @Test
    public void testRenderProgressRingWithCustomStylingHtml()
    {
        var progressRing = new WaProgressRing<>()
                .setValue(60)
                .setSize("150px")
                .setTrackWidth("4px")
                .setIndicatorWidth("8px")
                .setTrackColor("#eee")
                .setIndicatorColor("#2196f3")
                .setIndicatorTransitionDuration("300ms");

        var html = progressRing.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-ring"));
        assertTrue(html.contains("value=\"60\""));
        assertTrue(html.contains("--size:150px"));
        assertTrue(html.contains("--track-width:4px"));
        assertTrue(html.contains("--indicator-width:8px"));
        assertTrue(html.contains("--track-color:#eee"));
        assertTrue(html.contains("--indicator-color:#2196f3"));
        assertTrue(html.contains("--indicator-transition-duration:300ms"));
    }

    @Test
    public void testRenderProgressRingWithPrefixSlotHtml()
    {
        var icon = new WaIcon<>().setName("circle-notch");

        var progressRing = new WaProgressRing<>()
                .setValue(65)
                .setPrefix(icon)
                .add("65%");

        var html = progressRing.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-ring"));
        assertTrue(html.contains("value=\"65\""));
        assertTrue(html.contains("<wa-icon name=\"circle-notch\" slot=\"prefix\"></wa-icon>"));
        assertTrue(html.contains("65%"));
    }

    @Test
    public void testRenderProgressRingWithEventsHtml()
    {
        var progressRing = new WaProgressRing<>()
                .setValue(80)
                .setFocusEvent("onFocus()")
                .setBlurEvent("onBlur()");

        var html = progressRing.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-ring"));
        assertTrue(html.contains("value=\"80\""));
        assertTrue(html.contains("focus=\"onFocus()\""));
        assertTrue(html.contains("blur=\"onBlur()\""));
    }

    @Test
    public void testRenderProgressRingWithBindingHtml()
    {
        var progressRing = new WaProgressRing<>()
                .bind("progressValue");

        var html = progressRing.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-ring"));
        assertTrue(html.contains("[value]=\"progressValue\""));
    }

    @Test
    public void testRenderProgressRingWithTwoWayBindingHtml()
    {
        var progressRing = new WaProgressRing<>()
                .bind("progressValue");

        var html = progressRing.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-ring"));
        assertTrue(html.contains("[value]=\"progressValue\""));
        assertTrue(html.contains("(valueChange)=\"progressValue = $event\""));
    }
}
