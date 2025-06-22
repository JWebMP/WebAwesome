package com.jwebmp.webawesome.test.copybutton;

import com.jwebmp.webawesome.components.copybutton.WaCopyButton;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaCopyButtonTest
{
    @Test
    public void testRenderBasicCopyButtonHtml()
    {
        var s = new WaCopyButton()
                .setValue("Text to copy")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-copy-button value=\"Text to copy\">"));
    }

    @Test
    public void testRenderCopyButtonWithFromHtml()
    {
        var s = new WaCopyButton()
                .setFrom("myInput")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-copy-button from=\"myInput\">"));
    }

    @Test
    public void testRenderCopyButtonWithCustomLabelsHtml()
    {
        var s = new WaCopyButton()
                .setValue("Text to copy")
                .setCopyLabel("Click to copy")
                .setSuccessLabel("Copied!")
                .setErrorLabel("Failed to copy")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-copy-button copy-label=\"Click to copy\" error-label=\"Failed to copy\" success-label=\"Copied!\" value=\"Text to copy\">"));
    }

    @Test
    public void testRenderCopyButtonWithCustomIconsHtml()
    {
        var copyIcon = new WaIcon<>().setName("copy");
        var successIcon = new WaIcon<>().setName("check");
        var errorIcon = new WaIcon<>().setName("exclamation-circle");

        var s = new WaCopyButton()
                .setValue("Text to copy")
                .setIcon(copyIcon)
                .setSuccessIcon(successIcon)
                .setErrorIcon(errorIcon)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-icon name=\"copy\" slot=\"copy-icon\"></wa-icon>"));
        assertTrue(s.contains("<wa-icon name=\"check\" slot=\"success-icon\"></wa-icon>"));
        assertTrue(s.contains("<wa-icon name=\"exclamation-circle\" slot=\"error-icon\"></wa-icon>"));
    }

    @Test
    public void testRenderCopyButtonWithTooltipPlacementHtml()
    {
        var s = new WaCopyButton()
                .setValue("Text to copy")
                .setTooltipPlacement("right")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-copy-button tooltip-placement=\"right\" value=\"Text to copy\">"));
    }

    @Test
    public void testRenderCopyButtonWithFeedbackDurationHtml()
    {
        var s = new WaCopyButton()
                .setValue("Text to copy")
                .setFeedbackDuration(5000)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-copy-button feedback-duration=\"5000\" value=\"Text to copy\">"));
    }

    @Test
    public void testRenderCopyButtonWithDisabledHtml()
    {
        var s = new WaCopyButton()
                .setValue("Text to copy")
                .setDisabled(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-copy-button disabled value=\"Text to copy\">"));
    }

    @Test
    public void testRenderCopyButtonWithAllAttributesHtml()
    {
        var copyIcon = new WaIcon<>().setName("copy");
        var successIcon = new WaIcon<>().setName("check");
        var errorIcon = new WaIcon<>().setName("exclamation-circle");

        var s = new WaCopyButton()
                .setValue("Text to copy")
                .setCopyLabel("Click to copy")
                .setSuccessLabel("Copied!")
                .setErrorLabel("Failed to copy")
                .setIcon(copyIcon)
                .setSuccessIcon(successIcon)
                .setErrorIcon(errorIcon)
                .setTooltipPlacement("bottom")
                .setFeedbackDuration(3000)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("copy-label=\"Click to copy\""));
        assertTrue(s.contains("error-label=\"Failed to copy\""));
        assertTrue(s.contains("success-label=\"Copied!\""));
        assertTrue(s.contains("tooltip-placement=\"bottom\""));
        assertTrue(s.contains("feedback-duration=\"3000\""));
        assertTrue(s.contains("value=\"Text to copy\""));
        assertTrue(s.contains("<wa-icon name=\"copy\" slot=\"copy-icon\"></wa-icon>"));
        assertTrue(s.contains("<wa-icon name=\"check\" slot=\"success-icon\"></wa-icon>"));
        assertTrue(s.contains("<wa-icon name=\"exclamation-circle\" slot=\"error-icon\"></wa-icon>"));
    }
}