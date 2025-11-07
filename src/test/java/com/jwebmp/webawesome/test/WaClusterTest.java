package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.PageSize;
import com.jwebmp.webawesome.components.WaCluster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaClusterTest
{

    @Test
    void rendersWaClusterWithGapAndNoWrap()
    {
        Page<?> p = new Page<>();

        WaCluster cluster = new WaCluster<>()
                .setGap(PageSize.Small)
                .setNoWrap();

        p.getBody()
         .add(cluster);

        String html = p.toString(true);
        System.out.println(html);

        Assertions.assertTrue(html.contains("wa-cluster"), "Cluster should have wa-cluster class");
        Assertions.assertTrue(html.contains("wa-gap-s"), "Cluster should have wa-gap-s class for Small gap");
        Assertions.assertTrue(
                html.contains("flex-wrap: nowrap") || html.contains("flex-wrap:nowrap"),
                "Cluster should set flex-wrap: nowrap when setNoWrap() is used");
    }
}
