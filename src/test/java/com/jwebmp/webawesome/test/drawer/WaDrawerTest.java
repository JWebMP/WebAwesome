package com.jwebmp.webawesome.test.drawer;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Placement;
import com.jwebmp.webawesome.components.button.WaButton;
import com.jwebmp.webawesome.components.drawer.WaDrawer;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WaDrawerTest
{
    @Test
    public void testRenderBasicDrawerHtml()
    {
        var s = new WaDrawer<>()
                .setLabel("Basic Drawer")
                .setText("This is a basic drawer with default styling.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-drawer label=\"Basic Drawer\">"));
        assertTrue(s.contains("This is a basic drawer with default styling."));
    }

    @Test
    public void testRenderDrawerWithOpenStateHtml()
    {
        var s = new WaDrawer<>()
                .setLabel("Open Drawer")
                .setOpen(true)
                .setText("This drawer is open by default.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-drawer label=\"Open Drawer\" open>"));
        assertTrue(s.contains("This drawer is open by default."));
    }

    @Test
    public void testRenderDrawerWithPlacementHtml()
    {
        var s = new WaDrawer<>()
                .setLabel("Placement Drawer")
                .setPlacement(Placement.Start)
                .setText("This drawer slides in from the left (start).")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-drawer label=\"Placement Drawer\" placement=\"start\">"));
        assertTrue(s.contains("This drawer slides in from the left (start)."));
    }

    @Test
    public void testRenderDrawerWithoutHeaderHtml()
    {
        var s = new WaDrawer<>()
                .setLabel("No Header Drawer")
                .setWithoutHeader(true)
                .setText("This drawer has no header.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-drawer label=\"No Header Drawer\" without-header>"));
        assertTrue(s.contains("This drawer has no header."));
    }

    @Test
    public void testRenderDrawerWithLightDismissHtml()
    {
        var s = new WaDrawer<>()
                .setLabel("Light Dismiss Drawer")
                .setLightDismiss(true)
                .setText("This drawer can be closed by clicking outside.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-drawer label=\"Light Dismiss Drawer\" light-dismiss>"));
        assertTrue(s.contains("This drawer can be closed by clicking outside."));
    }

    @Test
    public void testRenderDrawerWithHeaderHtml()
    {
        var header = new DivSimple<>();
        header.setText("Drawer Header");

        var s = new WaDrawer<>()
                .setLabel("With Header Drawer")
                .withHeader(header)
                .setText("This drawer has a custom header.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-drawer class=\"drawer-header\" label=\"With Header Drawer\" with-header>"));
        assertTrue(s.contains("<div slot=\"header\">Drawer Header</div>"));
        assertTrue(s.contains("This drawer has a custom header."));
    }

    @Test
    public void testRenderDrawerWithHeaderActionsHtml()
    {
        var button = new WaButton<>();
        var icon = new WaIcon<>("settings");
        button.setPrefix(icon);

        List<WaButton<?>> buttons = new ArrayList<>();
        buttons.add(button);

        var s = new WaDrawer<>()
                .setLabel("With Header Actions Drawer")
                .withHeaderActions(buttons)
                .setText("This drawer has header actions.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-drawer class=\"drawer-header-actions\" label=\"With Header Actions Drawer\" with-header>"));
        assertTrue(s.contains("<wa-button slot=\"header-actions\">"));
        assertTrue(s.contains("<wa-icon name=\"settings\" slot=\"prefix\"></wa-icon>"));
        assertTrue(s.contains("This drawer has header actions."));
    }

    @Test
    public void testRenderDrawerWithFooterHtml()
    {
        var footer = new DivSimple<>();
        footer.setText("Drawer Footer");

        var s = new WaDrawer<>()
                .setLabel("With Footer Drawer")
                .withFooter(footer)
                .setText("This drawer has a footer.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-drawer class=\"drawer-footer\" label=\"With Footer Drawer\" with-footer>"));
        assertTrue(s.contains("<div slot=\"footer\">Drawer Footer</div>"));
        assertTrue(s.contains("This drawer has a footer."));
    }

    @Test
    public void testRenderDrawerWithCloseButtonHtml()
    {
        var footer = new DivSimple<>();

        var drawer = new WaDrawer<>()
                .setLabel("With Close Button Drawer")
                .withFooter(footer)
                .setText("This drawer has a close button in the footer.");

        drawer.withCloseButton(footer);

        var s = drawer.toString(true);

        System.out.println("[DEBUG_LOG] Rendered HTML: " + s);

        boolean containsDrawerTag = s.contains("<wa-drawer class=\"drawer-footer\"");
        boolean containsLabel = s.contains("label=\"With Close Button Drawer\"");
        boolean containsWithFooter = s.contains("with-footer");
        System.out.println("[DEBUG_LOG] Contains drawer tag: " + containsDrawerTag);
        System.out.println("[DEBUG_LOG] Contains label: " + containsLabel);
        System.out.println("[DEBUG_LOG] Contains with-footer: " + containsWithFooter);

        boolean containsFooterSlot = s.contains("<div slot=\"footer\"");
        boolean containsButtonTag = s.contains("<wa-button data-drawer=\"close\"");
        boolean containsCloseText = s.contains("Close") && s.contains("</wa-button>");
        System.out.println("[DEBUG_LOG] Contains footer slot: " + containsFooterSlot);
        System.out.println("[DEBUG_LOG] Contains button tag: " + containsButtonTag);
        System.out.println("[DEBUG_LOG] Contains close text: " + containsCloseText);

        assertTrue(containsDrawerTag && containsLabel && containsWithFooter);
        assertTrue(containsFooterSlot && containsButtonTag && containsCloseText);
        assertTrue(s.contains("This drawer has a close button in the footer."));
    }

    @Test
    public void testRenderDrawerWithCustomStylingHtml()
    {
        var s = new WaDrawer<>()
                .setLabel("Styled Drawer")
                .setBackgroundColor("#f8f9fa")
                .setBoxShadow("0 0 20px rgba(0,0,0,0.15)")
                .setSpacing("24px")
                .setSize("400px")
                .setShowDuration("500ms")
                .setHideDuration("300ms")
                .setText("This drawer has custom styling.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-drawer label=\"Styled Drawer\" style=\"--background-color:#f8f9fa;--box-shadow:0 0 20px rgba(0,0,0,0.15);--hide-duration:300ms;--show-duration:500ms;--size:400px;--spacing:24px;\">"));
        assertTrue(s.contains("This drawer has custom styling."));
    }
}
