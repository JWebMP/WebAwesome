package com.jwebmp.webawesome.test.tooltip;

import com.jwebmp.core.base.html.Button;
import com.jwebmp.webawesome.components.tooltip.TooltipPlacement;
import com.jwebmp.webawesome.components.tooltip.WaTooltip;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaTooltipTest
{
    @Test
    public void testRenderBasicTooltipHtml()
    {
        var button = new Button<>().setID("tooltip-target").setText("Hover me");
        var tooltip = new WaTooltip<>(button).setText("This is a tooltip");

        var s = tooltip.toString(true);
        System.out.println(s);

        assertEquals("<wa-tooltip for=\"tooltip-target\">This is a tooltip</wa-tooltip>", s);
    }

    @Test
    public void testRenderTooltipWithPlacementHtml()
    {
        var button = new Button<>().setID("tooltip-bottom").setText("Bottom");
        var tooltip = new WaTooltip<>(button)
                .setText("Tooltip on bottom")
                .setPlacement(TooltipPlacement.Bottom);

        var s = tooltip.toString(true);
        System.out.println(s);

        assertEquals("<wa-tooltip for=\"tooltip-bottom\" placement=\"bottom\">Tooltip on bottom</wa-tooltip>", s);
    }

    @Test
    public void testRenderTooltipWithDistanceAndSkiddingHtml()
    {
        var button = new Button<>().setID("tooltip-combined").setText("Combined");
        var tooltip = new WaTooltip<>(button)
                .setText("Custom positioning")
                .setDistance(20)
                .setSkidding(-15);

        var s = tooltip.toString(true);
        System.out.println(s);

        assertEquals("<wa-tooltip distance=\"20\" for=\"tooltip-combined\" skidding=\"-15\">Custom positioning</wa-tooltip>", s);
    }

    @Test
    public void testRenderDisabledTooltipHtml()
    {
        var button = new Button<>().setID("tooltip-disabled").setText("No tooltip");
        var tooltip = new WaTooltip<>(button)
                .setText("This tooltip won't show")
                .setDisabled(true);

        var s = tooltip.toString(true);
        System.out.println(s);

        assertEquals("<wa-tooltip disabled for=\"tooltip-disabled\">This tooltip won't show</wa-tooltip>", s);
    }

    @Test
    public void testRenderOpenTooltipHtml()
    {
        var button = new Button<>().setID("tooltip-open").setText("Always visible");
        var tooltip = new WaTooltip<>(button)
                .setText("This tooltip is always visible")
                .setOpen(true);

        var s = tooltip.toString(true);
        System.out.println(s);

        assertEquals("<wa-tooltip for=\"tooltip-open\" open>This tooltip is always visible</wa-tooltip>", s);
    }

    @Test
    public void testRenderTooltipWithDelaysHtml()
    {
        var button = new Button<>().setID("tooltip-delays").setText("Custom delays");
        var tooltip = new WaTooltip<>(button)
                .setText("Custom show and hide delays")
                .setShowDelay(500)
                .setHideDelay(1000);

        var s = tooltip.toString(true);
        System.out.println(s);

        assertEquals("<wa-tooltip for=\"tooltip-delays\" hide-delay=\"1000\" show-delay=\"500\">Custom show and hide delays</wa-tooltip>", s);
    }

    @Test
    public void testRenderTooltipWithTriggerHtml()
    {
        var button = new Button<>().setID("tooltip-click").setText("Click me");
        var tooltip = new WaTooltip<>(button)
                .setText("Shows on click")
                .setTrigger("click");

        var s = tooltip.toString(true);
        System.out.println(s);

        assertEquals("<wa-tooltip for=\"tooltip-click\" trigger=\"click\">Shows on click</wa-tooltip>", s);
    }

    @Test
    public void testRenderTooltipWithCustomStylingHtml()
    {
        var button = new Button<>().setID("tooltip-custom").setText("Fully customized");
        var tooltip = new WaTooltip<>(button)
                .setText("A fully customized tooltip")
                .setBackgroundColor("#212121")
                .setBorderRadius("8px")
                .setMaxWidth("250px")
                .setPadding("12px");

        var s = tooltip.toString(true);
        System.out.println(s);

        assertEquals("<wa-tooltip for=\"tooltip-custom\" style=\"--background-color:#212121;--border-radius:8px;--max-width:250px;--padding:12px;\">A fully customized tooltip</wa-tooltip>", s);
    }

    @Test
    public void testRenderTooltipWithBindingsHtml()
    {
        var tooltip = new WaTooltip<>()
                .setText("Tooltip with bindings")
                .bindForId("targetId")
                .bindPlacement("tooltipPlacement")
                .bindDistance("tooltipDistance")
                .bindSkidding("tooltipSkidding")
                .bindOpen("isTooltipOpen")
                .bindShowDelay("showDelayValue")
                .bindHideDelay("hideDelayValue")
                .bindDisabled("isDisabled")
                .bindTrigger("triggerMethod")
                .bindBackgroundColor("bgColor")
                .bindBorderRadius("borderRadius")
                .bindMaxWidth("maxWidth")
                .bindPadding("padding")
                .onShow("handleShow($event)")
                .onAfterShow("handleAfterShow($event)")
                .onHide("handleHide($event)")
                .onAfterHide("handleAfterHide($event)");

        var s = tooltip.toString(true);
        System.out.println(s);

        assertEquals("<wa-tooltip (waAfterHide)=\"handleAfterHide($event)\" (waAfterShow)=\"handleAfterShow($event)\" (waHide)=\"handleHide($event)\" (waShow)=\"handleShow($event)\" [disabled]=\"isDisabled\" [distance]=\"tooltipDistance\" [for]=\"targetId\" [hide-delay]=\"hideDelayValue\" [open]=\"isTooltipOpen\" [placement]=\"tooltipPlacement\" [show-delay]=\"showDelayValue\" [skidding]=\"tooltipSkidding\" [style.--background-color]=\"bgColor\" [style.--border-radius]=\"borderRadius\" [style.--max-width]=\"maxWidth\" [style.--padding]=\"padding\" [trigger]=\"triggerMethod\">Tooltip with bindings</wa-tooltip>", s);
    }
}
