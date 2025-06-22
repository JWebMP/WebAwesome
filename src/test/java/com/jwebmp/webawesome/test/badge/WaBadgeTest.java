package com.jwebmp.webawesome.test.badge;

import com.jwebmp.webawesome.components.badge.WaBadge;
import com.jwebmp.webawesome.components.Variant;
import com.jwebmp.webawesome.components.button.Appearance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaBadgeTest
{
    @Test
    public void testRenderBasicBadgeHtml()
    {
        var s = new WaBadge<>()
                .setText("Basic Badge")
                .toString(true);

        System.out.println(s);

        assertEquals("<wa-badge>Basic Badge</wa-badge>", s);
    }

    @Test
    public void testRenderBadgeWithVariantAndAppearanceHtml()
    {
        var s = new WaBadge<>()
                .setText("Warning Badge")
                .setVariant(Variant.Warning)
                .setAppearance(Appearance.Outlined)
                .toString(true);

        System.out.println(s);

        assertEquals("<wa-badge appearance=\"outlined\" variant=\"warning\">Warning Badge</wa-badge>", s);
    }

    @Test
    public void testRenderPillBadgeHtml()
    {
        var s = new WaBadge<>()
                .setText("Pill Badge")
                .setVariant(Variant.Brand)
                .setAsPill(true)
                .toString(true);

        System.out.println(s);

        assertEquals("<wa-badge pill variant=\"brand\">Pill Badge</wa-badge>", s);
    }

    @Test
    public void testRenderPulsatingBadgeHtml()
    {
        var s = new WaBadge<>()
                .setText("Pulsating Badge")
                .setVariant(Variant.Danger)
                .setPulsating(true)
                .toString(true);

        System.out.println(s);

        assertEquals("<wa-badge pulse variant=\"danger\">Pulsating Badge</wa-badge>", s);
    }

    @Test
    public void testRenderComplexBadgeHtml()
    {
        var s = new WaBadge<>()
                .setText("Complex Badge")
                .setVariant(Variant.Success)
                .setAppearance(Appearance.Filled)
                .setAsPill(true)
                .setPulsating(true)
                .toString(true);

        System.out.println(s);

        assertEquals("<wa-badge appearance=\"filled\" pill pulse variant=\"success\">Complex Badge</wa-badge>", s);
    }
}