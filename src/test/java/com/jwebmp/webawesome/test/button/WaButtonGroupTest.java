package com.jwebmp.webawesome.test.button;

import com.jwebmp.core.base.servlets.enumarations.Orientation;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.Variant;
import com.jwebmp.webawesome.components.button.WaButton;
import com.jwebmp.webawesome.components.button.WaButtonGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaButtonGroupTest
{
    @Test
    public void testRenderBasicButtonGroupHtml()
    {
        var s = new WaButtonGroup()
                .add(new WaButton("Left"))
                .add(new WaButton("Center"))
                .add(new WaButton("Right"))
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-button-group>"));
        assertTrue(s.contains("<wa-button>"));
        assertTrue(s.contains("Left"));
        assertTrue(s.contains("Center"));
        assertTrue(s.contains("Right"));
    }

    @Test
    public void testRenderButtonGroupWithLabelHtml()
    {
        var s = new WaButtonGroup()
                .setLabel("Alignment")
                .add(new WaButton("Left"))
                .add(new WaButton("Right"))
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-button-group label=\"Alignment\">"));
        assertTrue(s.contains("<wa-button>"));
        assertTrue(s.contains("Left"));
        assertTrue(s.contains("Right"));
    }

    @Test
    public void testRenderButtonGroupWithSizeHtml()
    {
        var s = new WaButtonGroup()
                .setSize(Size.Small)
                .add(new WaButton("One"))
                .add(new WaButton("Two"))
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-button-group size=\"small\">"));
        assertTrue(s.contains("<wa-button>"));
        assertTrue(s.contains("One"));
        assertTrue(s.contains("Two"));
    }

    @Test
    public void testRenderButtonGroupWithVariantHtml()
    {
        var s = new WaButtonGroup()
                .setVariant(Variant.Brand)
                .add(new WaButton("Yes"))
                .add(new WaButton("No"))
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-button-group variant=\"brand\">"));
        assertTrue(s.contains("<wa-button>"));
        assertTrue(s.contains("Yes"));
        assertTrue(s.contains("No"));
    }

    @Test
    public void testRenderButtonGroupWithOrientationHtml()
    {
        var s = new WaButtonGroup()
                .setOrientation(Orientation.VERTICAL)
                .add(new WaButton("Top"))
                .add(new WaButton("Middle"))
                .add(new WaButton("Bottom"))
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-button-group orientation=\"vertical\">"));
        assertTrue(s.contains("<wa-button>"));
        assertTrue(s.contains("Top"));
        assertTrue(s.contains("Middle"));
        assertTrue(s.contains("Bottom"));
    }

    @Test
    public void testRenderButtonGroupWithAllAttributesHtml()
    {
        var s = new WaButtonGroup()
                .setLabel("Complete Group")
                .setSize(Size.Large)
                .setVariant(Variant.Success)
                .setOrientation(Orientation.HORIZONTAL)
                .add(new WaButton("One"))
                .add(new WaButton("Two"))
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-button-group label=\"Complete Group\" orientation=\"horizontal\" size=\"large\" variant=\"success\">"));
        assertTrue(s.contains("<wa-button>"));
        assertTrue(s.contains("One"));
        assertTrue(s.contains("Two"));
    }
}