package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.Variant;
import com.jwebmp.webawesome.components.button.Appearance;
import com.jwebmp.webawesome.components.button.WaButton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaButtonTest {

    @Test
    void rendersWaButtonWithAttributesAndBooleans() {
        Page<?> p = new Page<>();
        WaButton<?> button = new WaButton<>("Click")
                .setVariant(Variant.Brand)
                .setAppearance(Appearance.Filled)
                .setSize(Size.Small)
                .setPill(true)
                .setDisabled(true)
                .setLoading(true)
                .setAsLink("/go", "_blank", null);

        p.getBody().add(button);
        String html = p.toString(true);
        System.out.println(html);

        Assertions.assertTrue(html.contains("<wa-button"), "Should render wa-button tag");
        Assertions.assertTrue(html.contains("variant=\"brand\""), "Variant brand expected");
        Assertions.assertTrue(html.contains("appearance=\"filled\""), "Appearance filled expected");
        Assertions.assertTrue(html.contains("size=\"small\""), "Size small expected");
        // boolean attributes may serialize as bare or empty string
        Assertions.assertTrue(html.contains(" pill"), "Pill boolean attribute should be present");
        Assertions.assertTrue(html.contains(" disabled"), "Disabled boolean attribute should be present");
        Assertions.assertTrue(html.contains(" loading"), "Loading boolean attribute should be present");
        Assertions.assertTrue(html.contains(" href=\"/go\""), "Should render href when used as link");
        Assertions.assertTrue(html.contains(" target=\"_blank\""), "Should render target when provided");
    }

    @Test
    void omitsFalseBooleans() {
        Page<?> p = new Page<>();
        WaButton<?> button = new WaButton<>("Click")
                .setPill(false)
                .setDisabled(false)
                .setLoading(false);
        p.getBody().add(button);
        String html = p.toString(true);
        Assertions.assertFalse(html.contains(" pill=\"\""), "Pill should not render when false");
        Assertions.assertFalse(html.contains(" disabled=\"\""), "Disabled should not render when false");
        Assertions.assertFalse(html.contains(" loading=\"\""), "Loading should not render when false");
    }
}
