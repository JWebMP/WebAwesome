package com.jwebmp.webawesome.test.tag;

import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.Variant;
import com.jwebmp.webawesome.components.tag.TagAppearance;
import com.jwebmp.webawesome.components.tag.WaTag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaTagTest
{
    @Test
    public void testRenderBasicTagHtml()
    {
        var s = new WaTag<>()
                .setText("Basic Tag")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-tag>Basic Tag</wa-tag>", s);
    }

    @Test
    public void testRenderTagWithVariantHtml()
    {
        var s = new WaTag<>()
                .setText("Success Tag")
                .setVariant(Variant.Success)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-tag variant=\"success\">Success Tag</wa-tag>", s);
    }

    @Test
    public void testRenderTagWithAppearanceHtml()
    {
        var s = new WaTag<>()
                .setText("Filled Tag")
                .setAppearance(TagAppearance.Filled)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-tag appearance=\"filled\">Filled Tag</wa-tag>", s);
    }

    @Test
    public void testRenderTagWithSizeHtml()
    {
        var s = new WaTag<>()
                .setText("Large Tag")
                .setSize(Size.Large)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-tag size=\"large\">Large Tag</wa-tag>", s);
    }

    @Test
    public void testRenderPillTagHtml()
    {
        var s = new WaTag<>()
                .setText("Pill Tag")
                .setPill(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-tag pill>Pill Tag</wa-tag>", s);
    }

    @Test
    public void testRenderRemovableTagHtml()
    {
        var s = new WaTag<>()
                .setText("Removable Tag")
                .setRemovable(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-tag removable>Removable Tag</wa-tag>", s);
    }

    @Test
    public void testRenderTagWithAllPropertiesHtml()
    {
        var s = new WaTag<>()
                .setText("Complete Tag")
                .setVariant(Variant.Warning)
                .setAppearance(TagAppearance.Outlined_Accent)
                .setSize(Size.Medium)
                .setPill(true)
                .setRemovable(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-tag appearance=\"outlined accent\" pill removable size=\"medium\" variant=\"warning\">Complete Tag</wa-tag>", s);
    }

    @Test
    public void testRenderTagWithBindingsHtml()
    {
        var s = new WaTag<>()
                .setText("Binding Tag")
                .bindVariant("tagVariant")
                .bindAppearance("tagAppearance")
                .bindSize("tagSize")
                .bindPill("isPill")
                .bindRemovable("isRemovable")
                .onRemove("handleRemove($event)")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-tag (waRemove)=\"handleRemove($event)\" [appearance]=\"tagAppearance\" [pill]=\"isPill\" [removable]=\"isRemovable\" [size]=\"tagSize\" [variant]=\"tagVariant\">Binding Tag</wa-tag>", s);
    }
}
