package com.jwebmp.webawesome.test.callout;

import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.Variant;
import com.jwebmp.webawesome.components.button.Appearance;
import com.jwebmp.webawesome.components.callout.WaCallout;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaCalloutTest
{
    @Test
    public void testRenderBasicCalloutHtml()
    {
        var s = new WaCallout<>()
                .setText("This is a basic callout with default styling.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-callout>"));
        assertTrue(s.contains("This is a basic callout with default styling."));
    }

    @Test
    public void testRenderCalloutWithVariantHtml()
    {
        var s = new WaCallout<>()
                .setVariant(Variant.Success)
                .setText("This callout indicates a successful operation.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-callout variant=\"success\">"));
        assertTrue(s.contains("This callout indicates a successful operation."));
    }

    @Test
    public void testRenderCalloutWithAppearanceHtml()
    {
        var s = new WaCallout<>()
                .setAppearance(Appearance.Filled)
                .setText("This callout has a filled background.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-callout appearance=\"filled\">"));
        assertTrue(s.contains("This callout has a filled background."));
    }

    @Test
    public void testRenderCalloutWithSizeHtml()
    {
        var s = new WaCallout<>()
                .setSize(Size.Large)
                .setText("This is a large callout.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-callout size=\"large\">"));
        assertTrue(s.contains("This is a large callout."));
    }

    @Test
    public void testRenderCalloutWithIconHtml()
    {
        var icon = new WaIcon<>().setName("circle-check");
        var s = new WaCallout<>()
                .setIcon(icon)
                .setText("Your changes have been saved.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-icon name=\"circle-check\" slot=\"icon\"></wa-icon>"));
        assertTrue(s.contains("Your changes have been saved."));
    }

    @Test
    public void testRenderCalloutWithAllAttributesHtml()
    {
        var icon = new WaIcon<>().setName("lightbulb");
        var s = new WaCallout<>()
                .setVariant(Variant.Brand)
                .setAppearance(Appearance.Outlined)
                .setSize(Size.Large)
                .setIcon(icon)
                .setText("You can combine different attributes to create custom callout styles.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-callout appearance=\"outlined\" size=\"large\" variant=\"brand\">"));
        assertTrue(s.contains("<wa-icon name=\"lightbulb\" slot=\"icon\"></wa-icon>"));
        assertTrue(s.contains("You can combine different attributes to create custom callout styles."));
    }
}
