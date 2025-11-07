package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.PageSize;
import com.jwebmp.webawesome.components.WaSplit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaSplitTest
{

    @Test
    void rendersWaSplitWithDirectionGapAndAlignment()
    {
        Page<?> p = new Page<>();

        WaSplit split = new WaSplit()
                .row()
                .setGap(PageSize.Small)
                .alignItems("center");

        p.getBody()
         .add(split);

        String html = p.toString(true);
        System.out.println(html);

        Assertions.assertTrue(html.contains("wa-split"), "Split should have wa-split class");
        Assertions.assertTrue(html.contains("wa-split:row"), "Split should have row directional class");
        Assertions.assertTrue(html.contains("wa-gap-s"), "Split should have wa-gap-s class for Small gap");
        Assertions.assertTrue(html.contains("wa-align-items-center"), "Split should include alignment class");
    }

    @Test
    void rendersWaSplitColumnDirection()
    {
        Page<?> p = new Page<>();
        WaSplit split = new WaSplit().column();
        p.getBody()
         .add(split);
        String html = p.toString(true);
        Assertions.assertTrue(html.contains("wa-split:column"), "Split should have column directional class");
    }
}
