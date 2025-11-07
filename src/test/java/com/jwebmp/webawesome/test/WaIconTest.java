package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.icon.IconVariant;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaIconTest {

    @Test
    void rendersWaIconWithAttributesAndBoolean() {
        Page<?> p = new Page<>();
        WaIcon<?> icon = new WaIcon<>("star", "classic", IconVariant.Solid)
                .setFixedWidth(true)
                .setColor("#222")
                .setLabel("Favorite");
        p.getBody().add(icon);
        String html = p.toString(true);
        System.out.println(html);

        Assertions.assertTrue(html.contains("<wa-icon"), "Should render wa-icon tag");
        Assertions.assertTrue(html.contains("name=\"star\""), "Should include name attribute");
        Assertions.assertTrue(html.contains("family=\"classic\""), "Should include family attribute");
        Assertions.assertTrue(html.toLowerCase().contains("variant=\"solid\""), "Should include variant attribute");
        // boolean attributes may serialize as bare or empty-string
        Assertions.assertTrue(html.contains(" withFixedWidth"), "withFixedWidth boolean attribute should be present");
        Assertions.assertTrue(html.contains("color: #222") || html.contains("color:#222"), "Inline color style should be applied");
        Assertions.assertTrue(html.contains("label=\"Favorite\""), "Accessible label should be present");
    }

    @Test
    void omitsBooleanWhenFalse() {
        Page<?> p = new Page<>();
        WaIcon<?> icon = new WaIcon<>("star").setFixedWidth(false);
        p.getBody().add(icon);
        String html = p.toString(true);
        Assertions.assertFalse(html.contains(" withFixedWidth=\"\""), "withFixedWidth should not render when false");
    }
}
