package com.jwebmp.webawesome.test.zoom;

import com.jwebmp.webawesome.components.zoom.WaZoomableFrame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaZoomableFrameTest
{
    @Test
    public void rendersBasicZoomableFrameWithProps()
    {
        var html = new WaZoomableFrame<>()
                .setZoom("1.5")
                .setMinZoom("1")
                .setMaxZoom("3")
                .setPanX("120")
                .setPanY("-40")
                .setWidth("600px")
                .setHeight("400px")
                .toString(true);
        System.out.println(html);

        assertTrue(html.startsWith("<wa-zoomable-frame"));
        assertTrue(html.contains("zoom=\"1.5\""));
        assertTrue(html.contains("min-zoom=\"1\""));
        assertTrue(html.contains("max-zoom=\"3\""));
        assertTrue(html.contains("pan-x=\"120\""));
        assertTrue(html.contains("pan-y=\"-40\""));
        assertTrue(html.contains("style=\""));
        assertTrue(html.contains("width:600px"));
        assertTrue(html.contains("height:400px"));
    }

    @Test
    public void rendersBindings()
    {
        var html = new WaZoomableFrame<>()
                .bindZoom("zoom")
                .bindMinZoom("minZ")
                .bindMaxZoom("maxZ")
                .bindPanX("x")
                .bindPanY("y")
                .bindDisabled("dis")
                .bindWidth("w")
                .bindHeight("h")
                .toString(true);
        System.out.println(html);

        assertTrue(html.startsWith("<wa-zoomable-frame"));
        assertTrue(html.contains("[zoom]=\"zoom\""));
        assertTrue(html.contains("[minZoom]=\"minZ\""));
        assertTrue(html.contains("[maxZoom]=\"maxZ\""));
        assertTrue(html.contains("[panX]=\"x\""));
        assertTrue(html.contains("[panY]=\"y\""));
        assertTrue(html.contains("[disabled]=\"dis\""));
        assertTrue(html.contains("[style.width]=\"w\""));
        assertTrue(html.contains("[style.height]=\"h\""));
    }
}
