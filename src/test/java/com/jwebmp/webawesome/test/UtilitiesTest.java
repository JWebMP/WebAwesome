package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.PageSize;
import com.jwebmp.webawesome.components.WaCluster;
import com.jwebmp.webawesome.components.badge.WaBadge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilitiesTest
{

    @Test
    void rendersAlignmentAndGapUtilities()
    {
        Page<?> p = new Page<>();
        WaCluster cluster = new WaCluster<>()
                .setGap(PageSize.ExtraLarge); // wa-gap-xl
        // Apply alignment utility directly per docs
        cluster.addClass("wa-align-items-center");

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
}
