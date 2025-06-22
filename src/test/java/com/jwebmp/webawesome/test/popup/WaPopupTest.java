package com.jwebmp.webawesome.test.popup;

import com.jwebmp.webawesome.components.popup.WaPopup;
import com.jwebmp.webawesome.components.popup.WaPopupPlacements;
import com.jwebmp.webawesome.components.popup.WaPopupArrowPlacements;
import com.jwebmp.webawesome.components.popup.WaPopupAutoSize;
import com.jwebmp.core.base.html.Div;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaPopupTest
{
    @Test
    public void testRenderPopupHtml()
    {
        var anchor = new Div<>().setID("testAnchor");
        var s = new WaPopup(anchor)
                .setPlacement(WaPopupPlacements.Bottom)
                .setArrow(true)
                .setArrowPlacement(WaPopupArrowPlacements.Center)
                .setDistance(10)
                .add(new Div<>().setText("Popup Content"))
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("anchor=\"testAnchor\""));
        assertTrue(s.contains("arrow"));
        assertTrue(s.contains("arrow-placement=\"center\""));
        assertTrue(s.contains("distance=\"10\""));
        assertTrue(s.contains("placement=\"bottom\""));
        assertTrue(s.contains("[attr.active]=\"popuptestAnchor() ? '' : null\""));
        assertTrue(s.contains("<div>Popup Content</div>"));
    }

    @Test
    public void testRenderPopupWithAutoSizeHtml()
    {
        var anchor = new Div<>().setID("testAnchor2");
        var s = new WaPopup(anchor)
                .setPlacement(WaPopupPlacements.Top)
                .setAutoSize(WaPopupAutoSize.Both)
                .setAutoSizePadding(5)
                .setFlip(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("anchor=\"testAnchor2\""));
        assertTrue(s.contains("auto-size=\"both\""));
        assertTrue(s.contains("auto-size-padding=\"5\""));
        assertTrue(s.contains("flip"));
        assertTrue(s.contains("placement=\"top\""));
        assertTrue(s.contains("[attr.active]=\"popuptestAnchor2() ? '' : null\""));
    }

    @Test
    public void testRenderPopupWithShiftHtml()
    {
        var anchor = new Div<>().setID("testAnchor3");
        var s = new WaPopup(anchor)
                .setPlacement(WaPopupPlacements.Right)
                .setShift(true)
                .setShiftPadding(8)
                .setHoverBridge(true)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("anchor=\"testAnchor3\""));
        assertTrue(s.contains("hover-bridge"));
        assertTrue(s.contains("placement=\"right\""));
        assertTrue(s.contains("shift"));
        assertTrue(s.contains("shift-padding=\"8\""));
        assertTrue(s.contains("[attr.active]=\"popuptestAnchor3() ? '' : null\""));
    }
}
