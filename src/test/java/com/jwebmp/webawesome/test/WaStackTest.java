package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.PageSize;
import com.jwebmp.webawesome.components.WaStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaStackTest
{

    @Test
    void rendersWaStackWithGap()
    {
        Page<?> p = new Page<>();

        WaStack stack = new WaStack()
                .setGap(PageSize.Small);

        p.getBody()
         .add(stack);

        String html = p.toString(true);
        System.out.println(html);

        Assertions.assertTrue(html.contains("wa-stack"), "Stack should have wa-stack class");
        Assertions.assertTrue(html.contains("wa-gap-s"), "Stack should have wa-gap-s class for Small gap");
    }
}
