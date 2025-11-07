package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.badge.WaBadge;
import com.jwebmp.webawesome.components.Variant;
import com.jwebmp.webawesome.components.button.Appearance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaBadgeTest {

    @Test
    void rendersWaBadgeWithVariantAppearanceAndBooleans() {
        Page<?> p = new Page<>();

        WaBadge<?> badge = new WaBadge<>()
                .setVariant(Variant.Brand)
                .setAppearance(Appearance.Outlined)
                .setPill(true)
                .setPulse(true)
                .setTextColor("#333");

        p.getBody().add(badge);

        String html = p.toString(true);
        System.out.println(html);

        Assertions.assertTrue(html.contains("<wa-badge"), "Should render wa-badge tag");
        Assertions.assertTrue(html.contains("variant=\"brand\""), "Variant should be brand");
        Assertions.assertTrue(html.contains("appearance=\"outlined\""), "Appearance outlined expected");
        // boolean attributes may serialize as bare (pill) or as pill=""
        Assertions.assertTrue(html.contains(" pill"), "Pill boolean attribute should be present");
        Assertions.assertTrue(html.contains(" pulse"), "Pulse boolean attribute should be present");
        Assertions.assertTrue(html.contains("--text-color: #333") || html.contains("--text-color:#333"), "Custom style should be applied");
    }

    @Test
    void omitsFalseBooleans() {
        Page<?> p = new Page<>();
        WaBadge<?> badge = new WaBadge<>()
                .setPill(false)
                .setPulse(false);
        p.getBody().add(badge);
        String html = p.toString(true);
        Assertions.assertFalse(html.contains(" pill=\"\""), "Pill should not render when false");
        Assertions.assertFalse(html.contains(" pulse=\"\""), "Pulse should not render when false");
    }
}
