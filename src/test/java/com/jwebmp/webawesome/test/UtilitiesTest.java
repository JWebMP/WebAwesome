package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.PageSize;
import com.jwebmp.webawesome.components.WaCluster;
import com.jwebmp.webawesome.components.WaFlank;
import com.jwebmp.webawesome.components.WaFrame;
import com.jwebmp.webawesome.components.WaStack;
import com.jwebmp.webawesome.components.badge.WaBadge;
import com.jwebmp.webawesome.components.text.WaText;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilitiesTest
{

    @Test
    void rendersAlignmentAndGapUtilities()
    {
        Page<?> p = new Page<>();
        WaCluster cluster = new WaCluster<>()
                .setGap(PageSize.ExtraLarge) // wa-gap-xl
                .alignVerticalCenter();

        p.getBody()
         .add(cluster);
        String html = p.toString(true);
        System.out.println(html);

        Assertions.assertTrue(html.contains("wa-align-items-center"), "Alignment utility class should be present");
        Assertions.assertTrue(html.contains("wa-gap-xl"), "Gap utility class for ExtraLarge should be present");
    }

    @Test
    void rendersAppearanceAndColorVariantUtilities()
    {
        Page<?> p = new Page<>();
        WaBadge<?> badge = new WaBadge<>()
                .setText("Utility Classes");
        // Apply appearance and color variant utilities per docs
        badge.addClass("wa-filled");
        badge.addClass("wa-success");

        p.getBody()
         .add(badge);
        String html = p.toString(true);
        System.out.println(html);

        Assertions.assertTrue(html.contains("wa-filled"), "Appearance utility class should be present");
        Assertions.assertTrue(html.contains("wa-success"), "Color variant utility class should be present");
        Assertions.assertTrue(html.contains("Utility Classes"), "Badge content should still render");
    }

    @Test
    void rendersJustifyContentUtilitiesOnAllAlignmentCapableLayouts()
    {
        Page<?> page = new Page<>();
        page.getBody()
            .add(new WaCluster<>().justifyContentStart())
            .add(new WaStack<>().justifyContentEnd())
            .add(new WaFlank<>().justifyContentCenter())
            .add(new WaFrame<>().justifyContentSpaceAround())
            .add(new WaText<>().justifyContentSpaceBetween())
            .add(new WaCluster<>().justifyContentSpaceEvenly());

        String html = page.toString(true);

        Assertions.assertTrue(html.contains("wa-justify-content-start"));
        Assertions.assertTrue(html.contains("wa-justify-content-end"));
        Assertions.assertTrue(html.contains("wa-justify-content-center"));
        Assertions.assertTrue(html.contains("wa-justify-content-space-around"));
        Assertions.assertTrue(html.contains("wa-justify-content-space-between"));
        Assertions.assertTrue(html.contains("wa-justify-content-space-evenly"));
    }
}
