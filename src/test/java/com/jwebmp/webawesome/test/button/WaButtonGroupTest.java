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
    public void rendersBasicGroup()
    {
        var html = new WaButtonGroup<>()
                .add(new WaButton("One"))
                .add(new WaButton("Two"))
                .toString(true);
        System.out.println(html);

        assertTrue(html.startsWith("<wa-button-group"));
        assertTrue(html.contains("One"));
        assertTrue(html.contains("Two"));
    }

    @Test
    public void rendersProps()
    {
        var html = new WaButtonGroup<>()
                .setSize(Size.Medium)
                .setLabel("Actions")
                .setOrientation(Orientation.VERTICAL)
                .setVariant(Variant.Brand)
                .add(new WaButton("A"))
                .add(new WaButton("B"))
                .toString(true);
        System.out.println(html);

        assertTrue(html.startsWith("<wa-button-group"));
        assertTrue(html.contains("size=\"medium\""));
        assertTrue(html.contains("label=\"Actions\""));
        assertTrue(html.contains("orientation=\"vertical\""));
        assertTrue(html.contains("variant=\"brand\""));
    }
}
