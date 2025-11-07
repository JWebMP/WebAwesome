package com.jwebmp.webawesome.test.popover;

import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.webawesome.components.popover.WaPopover;
import com.jwebmp.webawesome.components.popover.WaPopoverPlacements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WaPopoverTest
{
    @Test
    public void testBasicPopover()
    {
        Button anchor = new Button("Show Popover");
        anchor.setID("popover-anchor");

        WaPopover<?> popover = new WaPopover<>();
        popover.setForElement(anchor);
        popover.add(new Div<>().setText("Popover Content"));

        System.out.println(popover.toString(true));

        assertTrue(popover.toString(true)
                          .contains("wa-popover"));
        assertTrue(popover.toString(true)
                          .contains("for=\"popover-anchor\""));
    }

    @Test
    public void testPopoverWithPlacement()
    {
        Button anchor = new Button("Show Popover");
        anchor.setID("popover-placement");

        WaPopover<?> popover = new WaPopover<>();
        popover.setForElement(anchor);
        popover.setPlacement(WaPopoverPlacements.Bottom);
        popover.add(new Div<>().setText("Popover Content"));

        System.out.println(popover.toString(true));

        assertTrue(popover.toString(true)
                          .contains("placement=\"bottom\""));
    }

    @Test
    public void testPopoverWithDistance()
    {
        Button anchor = new Button("Show Popover");
        anchor.setID("popover-distance");

        WaPopover<?> popover = new WaPopover<>();
        popover.setForElement(anchor);
        popover.setDistance(20);
        popover.add(new Div<>().setText("Popover Content"));

        System.out.println(popover.toString(true));

        assertTrue(popover.toString(true)
                          .contains("distance=\"20\""));
    }

    @Test
    public void testPopoverWithSkidding()
    {
        Button anchor = new Button("Show Popover");
        anchor.setID("popover-skidding");

        WaPopover<?> popover = new WaPopover<>();
        popover.setForElement(anchor);
        popover.setSkidding(10);
        popover.add(new Div<>().setText("Popover Content"));

        System.out.println(popover.toString(true));

        assertTrue(popover.toString(true)
                          .contains("skidding=\"10\""));
    }

    @Test
    public void testPopoverWithOpen()
    {
        Button anchor = new Button("Show Popover");
        anchor.setID("popover-open");

        WaPopover<?> popover = new WaPopover<>();
        popover.setForElement(anchor);
        popover.setOpen(true);
        popover.add(new Div<>().setText("Popover Content"));

        System.out.println(popover.toString(true));

        assertTrue(popover.toString(true)
                          .contains("open"));
    }

    @Test
    public void testPopoverWithCustomStyles()
    {
        Button anchor = new Button("Show Popover");
        anchor.setID("popover-styles");

        WaPopover<?> popover = new WaPopover<>();
        popover.setForElement(anchor);
        popover.setArrowSize("8px");
        popover.setMaxWidth("200px");
        popover.setShowDuration("150ms");
        popover.setHideDuration("150ms");
        popover.add(new Div<>().setText("Popover Content"));

        System.out.println(popover.toString(true));

        String html = popover.toString(true);
        // Be tolerant to renderer spacing around ':' in inline styles
        assertTrue(html.contains("--arrow-size: 8px") || html.contains("--arrow-size:8px"));
        assertTrue(html.contains("--max-width: 200px") || html.contains("--max-width:200px"));
        assertTrue(html.contains("--show-duration: 150ms") || html.contains("--show-duration:150ms"));
        assertTrue(html.contains("--hide-duration: 150ms") || html.contains("--hide-duration:150ms"));
    }

    @Test
    public void testPopoverWithEvents()
    {
        Button anchor = new Button("Show Popover");
        anchor.setID("popover-events");

        WaPopover<?> popover = new WaPopover<>();
        popover.setForElement(anchor);
        popover.onShow("console.log('Popover showing')");
        popover.onAfterShow("console.log('Popover shown')");
        popover.onHide("console.log('Popover hiding')");
        popover.onAfterHide("console.log('Popover hidden')");
        popover.add(new Div<>().setText("Popover Content"));

        System.out.println(popover.toString(true));

        assertTrue(popover.toString(true)
                          .contains("(wa-show)=\"console.log('Popover showing')\""));
        assertTrue(popover.toString(true)
                          .contains("(wa-after-show)=\"console.log('Popover shown')\""));
        assertTrue(popover.toString(true)
                          .contains("(wa-hide)=\"console.log('Popover hiding')\""));
        assertTrue(popover.toString(true)
                          .contains("(wa-after-hide)=\"console.log('Popover hidden')\""));
    }
}