package com.jwebmp.webawesome.test.toast;

import com.jwebmp.webawesome.components.toast.WaToastContainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaToastContainerTest
{
    @Test
    public void rendersBasicContainer()
    {
        var html = new WaToastContainer<>()
                .toString(true);
        System.out.println(html);
        assertEquals("<wa-toast-container></wa-toast-container>", html);
    }

    @Test
    public void rendersWithPropsAndBindings()
    {
        var html = new WaToastContainer<>()
                .setPosition("bottom-center")
                .setMax(3)
                .setDuration(4000)
                .setNewestOnTop(true)
                .setGap(12)
                .setZIndex(10000)
                .bindPosition("pos")
                .bindMax("max")
                .bindDuration("dur")
                .bindNewestOnTop("newTop")
                .bindGap("gapPx")
                .bindZIndex("z")
                .toString(true);
        System.out.println(html);
        assertTrue(html.startsWith("<wa-toast-container "));
        assertTrue(html.contains("position=\"bottom-center\""));
        assertTrue(html.contains("max=\"3\""));
        assertTrue(html.contains("duration=\"4000\""));
        assertTrue(html.contains("newest-on-top"));
        assertTrue(html.contains("gap=\"12\""));
        assertTrue(html.contains("z-index=\"10000\""));
        assertTrue(html.contains("[position]=\"pos\""));
        assertTrue(html.contains("[max]=\"max\""));
        assertTrue(html.contains("[duration]=\"dur\""));
        assertTrue(html.contains("[newestOnTop]=\"newTop\""));
        assertTrue(html.contains("[gap]=\"gapPx\""));
        assertTrue(html.contains("[zIndex]=\"z\""));
    }
}
