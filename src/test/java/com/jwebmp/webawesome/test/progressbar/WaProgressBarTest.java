package com.jwebmp.webawesome.test.progressbar;

import com.jwebmp.webawesome.components.icon.WaIcon;
import com.jwebmp.webawesome.components.progressbar.WaProgressBar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaProgressBarTest
{
    @Test
    public void testRenderBasicProgressBarHtml()
    {
        var progressBar = new WaProgressBar<>()
                .setValue(50);

        var html = progressBar.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-bar"));
        assertTrue(html.contains("value=\"50\""));
    }

    @Test
    public void testRenderProgressBarWithLabelHtml()
    {
        var progressBar = new WaProgressBar<>()
                .setValue(75)
                .setLabel("Loading...");

        var html = progressBar.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-bar"));
        assertTrue(html.contains("value=\"75\""));
        assertTrue(html.contains("label=\"Loading...\""));
    }

    @Test
    public void testRenderIndeterminateProgressBarHtml()
    {
        var progressBar = new WaProgressBar<>()
                .setIndeterminate(true)
                .setLabel("Processing...");

        var html = progressBar.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-bar"));
        assertTrue(html.contains("indeterminate"));
        assertTrue(html.contains("label=\"Processing...\""));
    }

    @Test
    public void testRenderProgressBarWithCustomStylingHtml()
    {
        var progressBar = new WaProgressBar<>()
                .setValue(60)
                .setIndicatorColor("#4caf50")
                .setDisplay("inline-block");

        var html = progressBar.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-bar"));
        assertTrue(html.contains("value=\"60\""));
        assertTrue(html.contains("--indicator-color:#4caf50"));
        assertTrue(html.contains("--display:inline-block"));
    }

    @Test
    public void testRenderProgressBarWithPrefixSlotHtml()
    {
        var icon = new WaIcon<>().setName("download");

        var progressBar = new WaProgressBar<>()
                .setValue(65)
                .setPrefix(icon)
                .add("Downloading 65%");

        var html = progressBar.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-bar"));
        assertTrue(html.contains("value=\"65\""));
        assertTrue(html.contains("<wa-icon name=\"download\" slot=\"prefix\"></wa-icon>"));
        assertTrue(html.contains("Downloading 65%"));
    }

    @Test
    public void testRenderProgressBarWithEventsHtml()
    {
        var progressBar = new WaProgressBar<>()
                .setValue(80)
                .setFocusEvent("onFocus()")
                .setBlurEvent("onBlur()");

        var html = progressBar.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-bar"));
        assertTrue(html.contains("value=\"80\""));
        assertTrue(html.contains("focus=\"onFocus()\""));
        assertTrue(html.contains("blur=\"onBlur()\""));
    }

    @Test
    public void testRenderProgressBarWithBindingHtml()
    {
        var progressBar = new WaProgressBar<>()
                .bind("progressValue");

        var html = progressBar.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-bar"));
        assertTrue(html.contains("[value]=\"progressValue\""));
    }

    @Test
    public void testRenderProgressBarWithTwoWayBindingHtml()
    {
        var progressBar = new WaProgressBar<>()
                .bind("progressValue");

        var html = progressBar.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-progress-bar"));
        assertTrue(html.contains("[value]=\"progressValue\""));
        assertTrue(html.contains("(valueChange)=\"progressValue = $event\""));
    }
}
