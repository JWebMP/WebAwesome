package com.jwebmp.webawesome.test.splitpanel;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.icon.WaIcon;
import com.jwebmp.webawesome.components.splitpanel.SplitPanelPrimary;
import com.jwebmp.webawesome.components.splitpanel.WaSplitPanel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaSplitPanelTest
{
    @Test
    public void testRenderBasicSplitPanelHtml()
    {
        var s = new WaSplitPanel<>()
                .setStart(new DivSimple<>().setText("Left Panel Content"))
                .setEnd(new DivSimple<>().setText("Right Panel Content"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("<div slot=\"start\">Left Panel Content</div>"));
        assertTrue(s.contains("<div slot=\"end\">Right Panel Content</div>"));
    }

    @Test
    public void testRenderVerticalSplitPanelHtml()
    {
        var s = new WaSplitPanel<>()
                .setVertical(true)
                .setStart(new DivSimple<>().setText("Top Panel Content"))
                .setEnd(new DivSimple<>().setText("Bottom Panel Content"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("vertical"));
        assertTrue(s.contains("orientation=\"vertical\""));
        assertTrue(s.contains("<div slot=\"start\">Top Panel Content</div>"));
        assertTrue(s.contains("<div slot=\"end\">Bottom Panel Content</div>"));
    }
    
    @Test
    public void testRenderOrientationSplitPanelHtml()
    {
        var s = new WaSplitPanel<>()
                .setOrientation("vertical")
                .setStart(new DivSimple<>().setText("Top Panel Content"))
                .setEnd(new DivSimple<>().setText("Bottom Panel Content"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("orientation=\"vertical\""));
        assertTrue(s.contains("<div slot=\"start\">Top Panel Content</div>"));
        assertTrue(s.contains("<div slot=\"end\">Bottom Panel Content</div>"));
    }

    @Test
    public void testRenderSplitPanelWithPositionHtml()
    {
        // Position as percentage
        var s1 = new WaSplitPanel<>()
                .setPosition(30)
                .setStart(new DivSimple<>().setText("Left Panel (30%)"))
                .setEnd(new DivSimple<>().setText("Right Panel (70%)"))
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("position=\"30\""));

        // Position in pixels
        var s2 = new WaSplitPanel<>()
                .setPositionInPixels(300)
                .setStart(new DivSimple<>().setText("Left Panel (300px)"))
                .setEnd(new DivSimple<>().setText("Right Panel (Remaining Space)"))
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("position-in-pixels=\"300\""));
    }

    @Test
    public void testRenderSplitPanelWithPrimaryHtml()
    {
        // Start panel is primary
        var s1 = new WaSplitPanel<>()
                .setPrimary(SplitPanelPrimary.Start)
                .setStart(new DivSimple<>().setText("Primary Panel"))
                .setEnd(new DivSimple<>().setText("Secondary Panel"))
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("primary=\"start\""));

        // End panel is primary
        var s2 = new WaSplitPanel<>()
                .setPrimary(SplitPanelPrimary.End)
                .setStart(new DivSimple<>().setText("Secondary Panel"))
                .setEnd(new DivSimple<>().setText("Primary Panel"))
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("primary=\"end\""));
    }

    @Test
    public void testRenderDisabledSplitPanelHtml()
    {
        var s = new WaSplitPanel<>()
                .setDisabled(true)
                .setPosition(40)
                .setStart(new DivSimple<>().setText("Left Panel (40%)"))
                .setEnd(new DivSimple<>().setText("Right Panel (60%)"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("disabled"));
        assertTrue(s.contains("position=\"40\""));
    }

    @Test
    public void testRenderSplitPanelWithSnapHtml()
    {
        var s = new WaSplitPanel<>()
                .setSnap("0,25,50,75,100")
                .setSnapThreshold(20)
                .setStart(new DivSimple<>().setText("Left Panel"))
                .setEnd(new DivSimple<>().setText("Right Panel"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("snap=\"0,25,50,75,100\""));
        assertTrue(s.contains("snap-threshold=\"20\""));
    }

    @Test
    public void testRenderSplitPanelWithCustomStylingHtml()
    {
        var s = new WaSplitPanel<>()
                .setDividerColor("#2196f3")
                .setDividerWidth("8px")
                .setDividerHitArea("20px")
                .setMin("200px")
                .setMax("70%")
                .setStart(new DivSimple<>().setText("Left Panel"))
                .setEnd(new DivSimple<>().setText("Right Panel"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("style="));
        assertTrue(s.contains("--divider-color:#2196f3"));
        assertTrue(s.contains("--divider-width:8px"));
        assertTrue(s.contains("--divider-hit-area:20px"));
        assertTrue(s.contains("--min:200px"));
        assertTrue(s.contains("--max:70%"));
    }

    @Test
    public void testRenderSplitPanelWithCustomDividerHtml()
    {
        var s = new WaSplitPanel<>()
                .setDividerIcon(new WaIcon<>().setName("grip-vertical"))
                .setStart(new DivSimple<>().setText("Left Panel"))
                .setEnd(new DivSimple<>().setText("Right Panel"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("wa-icon") && s.contains("slot=\"divider\"") && s.contains("name=\"grip-vertical\""));
    }

    @Test
    public void testRenderSplitPanelWithBindingsHtml()
    {
        var s = new WaSplitPanel<>()
                .bindPosition("panelPosition")
                .bindOrientation("panelOrientation")
                .bindVertical("isVertical")
                .bindPrimary("primaryPanel")
                .bindSnap("snapPositions")
                .bindSnapThreshold("threshold")
                .bindDisabled("isPanelDisabled")
                .bindDividerColor("dividerColorValue")
                .bindDividerWidth("dividerWidthValue")
                .bindMin("minSizeValue")
                .bindMax("maxSizeValue")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("[position]=\"panelPosition\""));
        assertTrue(s.contains("[orientation]=\"panelOrientation\""));
        assertTrue(s.contains("[vertical]=\"isVertical\""));
        assertTrue(s.contains("[primary]=\"primaryPanel\""));
        assertTrue(s.contains("[snap]=\"snapPositions\""));
        assertTrue(s.contains("[snap-threshold]=\"threshold\""));
        assertTrue(s.contains("[disabled]=\"isPanelDisabled\""));
        assertTrue(s.contains("[style.--divider-color]=\"dividerColorValue\""));
        assertTrue(s.contains("[style.--divider-width]=\"dividerWidthValue\""));
        assertTrue(s.contains("[style.--min]=\"minSizeValue\""));
        assertTrue(s.contains("[style.--max]=\"maxSizeValue\""));
    }
}
