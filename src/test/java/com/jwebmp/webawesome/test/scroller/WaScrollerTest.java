package com.jwebmp.webawesome.test.scroller;

import com.jwebmp.webawesome.components.scroller.WaScroller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaScrollerTest
{
    @Test
    public void rendersBasicScrollerWithProps()
    {
        var html = new WaScroller<>()
                .setOrientation("vertical")
                .setWithoutScrollbar(true)
                .setWithoutShadow(true)
                .setHeight("200px")
                .setWidth("100%")
                .toString(true);
        System.out.println(html);

        assertTrue(html.startsWith("<wa-scroller"));
        assertTrue(html.contains("orientation=\"vertical\""));
        assertTrue(html.contains("without-scrollbar"));
        assertTrue(html.contains("without-shadow"));
        assertTrue(html.contains("style=\""));
        assertTrue(html.contains("height:200px"));
        assertTrue(html.contains("width:100%"));
    }

    @Test
    public void rendersBindings()
    {
        var html = new WaScroller<>()
                .bindOrientation("dir")
                .bindWithoutScrollbar("noBar")
                .bindWithoutShadow("noShadow")
                .bindHeight("h")
                .bindWidth("w")
                .toString(true);
        System.out.println(html);

        assertTrue(html.startsWith("<wa-scroller"));
        assertTrue(html.contains("[orientation]=\"dir\""));
        assertTrue(html.contains("[withoutScrollbar]=\"noBar\""));
        assertTrue(html.contains("[withoutShadow]=\"noShadow\""));
        assertTrue(html.contains("[style.height]=\"h\""));
        assertTrue(html.contains("[style.width]=\"w\""));
    }
}
