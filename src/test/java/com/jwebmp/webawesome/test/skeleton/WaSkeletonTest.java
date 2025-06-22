package com.jwebmp.webawesome.test.skeleton;

import com.jwebmp.webawesome.components.skeleton.SkeletonEffect;
import com.jwebmp.webawesome.components.skeleton.WaSkeleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaSkeletonTest
{
    @Test
    public void testRenderBasicSkeletonHtml()
    {
        var s = new WaSkeleton<>()
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-skeleton></wa-skeleton>", s);
    }

    @Test
    public void testRenderSkeletonWithEffectHtml()
    {
        // None effect
        var s1 = new WaSkeleton<>()
                .setEffect(SkeletonEffect.None)
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("effect=\"none\""));

        // Sheen effect
        var s2 = new WaSkeleton<>()
                .setEffect(SkeletonEffect.Sheen)
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("effect=\"sheen\""));

        // Pulse effect
        var s3 = new WaSkeleton<>()
                .setEffect(SkeletonEffect.Pulse)
                .toString(true);
        System.out.println(s3);

        assertTrue(s3.contains("effect=\"pulse\""));
    }

    @Test
    public void testRenderSkeletonWithCustomStylingHtml()
    {
        var s = new WaSkeleton<>()
                .setColour("#e0e0e0")
                .setSheenColour("rgba(255, 255, 255, 0.5)")
                .setBorderRadius("8px")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("style="));
        assertTrue(s.contains("--color:#e0e0e0"));
        assertTrue(s.contains("--sheen-color:rgba(255, 255, 255, 0.5)"));
        assertTrue(s.contains("--border-radius:8px"));
    }

    @Test
    public void testRenderSkeletonWithBindingsHtml()
    {
        var s = new WaSkeleton<>()
                .bindEffect("selectedEffect")
                .bindColour("skeletonColor")
                .bindSheenColour("sheenColor")
                .bindBorderRadius("borderRadiusValue + 'px'")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("[attrs.effect]=\"selectedEffect\""));
        assertTrue(s.contains("[style.--color]=\"skeletonColor\""));
        assertTrue(s.contains("[style.--sheen-color]=\"sheenColor\""));
        assertTrue(s.contains("[style.--border-radius]=\"borderRadiusValue + 'px'\""));
    }

    @Test
    public void testRenderSkeletonWithCombinedPropertiesHtml()
    {
        var s = new WaSkeleton<>()
                .setEffect(SkeletonEffect.Sheen)
                .setColour("#f0f0f0")
                .setSheenColour("rgba(255, 255, 255, 0.7)")
                .setBorderRadius("16px")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("effect=\"sheen\""));
        assertTrue(s.contains("--color:#f0f0f0"));
        assertTrue(s.contains("--sheen-color:rgba(255, 255, 255, 0.7)"));
        assertTrue(s.contains("--border-radius:16px"));
    }
}