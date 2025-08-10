package com.jwebmp.webawesome.test.details;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.details.WaDetails;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaDetailsTest
{
    @Test
    public void testRenderBasicDetailsHtml()
    {
        var s = new WaDetails<>()
                .setText("This is the content of the details element.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-details>"));
        assertTrue(s.contains("This is the content of the details element."));
    }

    @Test
    public void testRenderDetailsWithSummaryHtml()
    {
        var s = new WaDetails<>("Summary Text")
                .setText("This is the content of the details element.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-details summary=\"Summary Text\">"));
        assertTrue(s.contains("This is the content of the details element."));
    }

    @Test
    public void testRenderDetailsWithSummarySlotHtml()
    {
        var summaryDiv = new DivSimple<>();
        summaryDiv.setText("Custom Summary Content");

        var s = new WaDetails<>()
                .setSummarySlot(summaryDiv)
                .setText("This is the content of the details element.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<div slot=\"summary\">Custom Summary Content</div>"));
        assertTrue(s.contains("This is the content of the details element."));
    }

    @Test
    public void testRenderDetailsWithOpenStateHtml()
    {
        var s = new WaDetails<>("Summary Text")
                .setOpen(true)
                .setText("This is the content of the details element.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-details open summary=\"Summary Text\">"));
        assertTrue(s.contains("This is the content of the details element."));
    }

    @Test
    public void testRenderDetailsWithDisabledStateHtml()
    {
        var s = new WaDetails<>("Summary Text")
                .setDisabled(true)
                .setText("This is the content of the details element.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-details disabled summary=\"Summary Text\">"));
        assertTrue(s.contains("This is the content of the details element."));
    }

    @Test
    public void testRenderDetailsWithAppearanceHtml()
    {
        var s = new WaDetails<>("Summary Text")
                .setAppearance("filled outlined")
                .setText("This is the content of the details element.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-details appearance=\"filled outlined\" summary=\"Summary Text\">"));
        assertTrue(s.contains("This is the content of the details element."));
    }

    @Test
    public void testRenderDetailsWithIconsHtml()
    {
        var expandIcon = new WaIcon<>().setName("chevron-right");
        var collapseIcon = new WaIcon<>().setName("chevron-down");

        var s = new WaDetails<>("Summary Text")
                .setExpandIcon(expandIcon)
                .setCollapseIcon(collapseIcon)
                .setText("This is the content of the details element.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-icon name=\"chevron-right\" slot=\"expand-icon\"></wa-icon>"));
        assertTrue(s.contains("<wa-icon name=\"chevron-down\" slot=\"collapse-icon\"></wa-icon>"));
        assertTrue(s.contains("<wa-details summary=\"Summary Text\">"));
        assertTrue(s.contains("This is the content of the details element."));
    }

    @Test
    public void testRenderDetailsWithStylingPropertiesHtml()
    {
        var s = new WaDetails<>("Summary Text")
                .setIconColor("#ff0000")
                .setSpacing("16px")
                .setShowDuration("300ms")
                .setHideDuration("200ms")
                .setDisplay("block")
                .setText("This is the content of the details element.")
                .toString(true);

        System.out.println(s);

        // Check for each style property individually
        assertTrue(s.contains("summary=\"Summary Text\""));
        assertTrue(s.contains("style="));
        assertTrue(s.contains("--display:block"));
        assertTrue(s.contains("--hide-duration:200ms"));
        assertTrue(s.contains("--icon-color:#ff0000"));
        assertTrue(s.contains("--show-duration:300ms"));
        assertTrue(s.contains("--spacing:16px"));
        assertTrue(s.contains("This is the content of the details element."));
    }

    @Test
    public void testRenderDetailsWithAllFeaturesHtml()
    {
        var summaryDiv = new DivSimple<>();
        summaryDiv.setText("Custom Summary with HTML");

        var expandIcon = new WaIcon<>().setName("chevron-right");
        var collapseIcon = new WaIcon<>().setName("chevron-down");

        var s = new WaDetails<>()
                .setSummarySlot(summaryDiv)
                .setOpen(true)
                .setAppearance("filled")
                .setExpandIcon(expandIcon)
                .setCollapseIcon(collapseIcon)
                .setIconColor("#0000ff")
                .setSpacing("12px")
                .setText("This is the content of the details element.")
                .toString(true);

        System.out.println(s);

        // Check for each attribute and style property individually
        assertTrue(s.contains("<wa-details"));
        assertTrue(s.contains("appearance=\"filled\""));
        assertTrue(s.contains("open"));
        assertTrue(s.contains("style="));
        assertTrue(s.contains("--icon-color:#0000ff"));
        assertTrue(s.contains("--spacing:12px"));
        assertTrue(s.contains("<div slot=\"summary\">Custom Summary with HTML</div>"));
        assertTrue(s.contains("<wa-icon name=\"chevron-right\" slot=\"expand-icon\"></wa-icon>"));
        assertTrue(s.contains("<wa-icon name=\"chevron-down\" slot=\"collapse-icon\"></wa-icon>"));
        assertTrue(s.contains("This is the content of the details element."));
    }
    
    @Test
    public void testRenderDetailsWithIconPositionHtml()
    {
        var s = new WaDetails<>("Summary Text")
                .setIconPosition("start")
                .setText("This is the content of the details element.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-details icon-position=\"start\" summary=\"Summary Text\">"));
        assertTrue(s.contains("This is the content of the details element."));
    }
    
    @Test
    public void testRenderDetailsWithNameHtml()
    {
        var s = new WaDetails<>("Summary Text")
                .setName("group-1")
                .setText("This is the content of the details element.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-details name=\"group-1\" summary=\"Summary Text\">"));
        assertTrue(s.contains("This is the content of the details element."));
    }
    
    @Test
    public void testRenderDetailsWithEventHandlersHtml()
    {
        var s = new WaDetails<>("Summary Text")
                .setShowEvent("onShow()")
                .setAfterShowEvent("onAfterShow()")
                .setHideEvent("onHide()")
                .setAfterHideEvent("onAfterHide()")
                .setText("This is the content of the details element.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-details"));
        assertTrue(s.contains("summary=\"Summary Text\""));
        assertTrue(s.contains("wa-show=\"onShow()\""));
        assertTrue(s.contains("wa-after-show=\"onAfterShow()\""));
        assertTrue(s.contains("wa-hide=\"onHide()\""));
        assertTrue(s.contains("wa-after-hide=\"onAfterHide()\""));
        assertTrue(s.contains("This is the content of the details element."));
    }
    
    @Test
    public void testRenderDetailsWithCompleteConfigurationHtml()
    {
        var summaryDiv = new DivSimple<>();
        summaryDiv.setText("Custom Summary with HTML");

        var expandIcon = new WaIcon<>().setName("chevron-right");
        var collapseIcon = new WaIcon<>().setName("chevron-down");

        var s = new WaDetails<>()
                .setSummarySlot(summaryDiv)
                .setOpen(true)
                .setDisabled(false)
                .setAppearance("filled")
                .setIconPosition("start")
                .setName("group-1")
                .setExpandIcon(expandIcon)
                .setCollapseIcon(collapseIcon)
                .setIconColor("#0000ff")
                .setSpacing("12px")
                .setShowDuration("300ms")
                .setHideDuration("200ms")
                .setDisplay("block")
                .setShowEvent("onShow()")
                .setAfterShowEvent("onAfterShow()")
                .setHideEvent("onHide()")
                .setAfterHideEvent("onAfterHide()")
                .setText("This is the content of the details element.")
                .toString(true);

        System.out.println(s);

        // Check for each attribute and style property individually
        assertTrue(s.contains("<wa-details"));
        assertTrue(s.contains("appearance=\"filled\""));
        assertTrue(s.contains("open"));
        assertTrue(s.contains("icon-position=\"start\""));
        assertTrue(s.contains("name=\"group-1\""));
        assertTrue(s.contains("wa-show=\"onShow()\""));
        assertTrue(s.contains("wa-after-show=\"onAfterShow()\""));
        assertTrue(s.contains("wa-hide=\"onHide()\""));
        assertTrue(s.contains("wa-after-hide=\"onAfterHide()\""));
        assertTrue(s.contains("style="));
        assertTrue(s.contains("--display:block"));
        assertTrue(s.contains("--hide-duration:200ms"));
        assertTrue(s.contains("--icon-color:#0000ff"));
        assertTrue(s.contains("--show-duration:300ms"));
        assertTrue(s.contains("--spacing:12px"));
        assertTrue(s.contains("<div slot=\"summary\">Custom Summary with HTML</div>"));
        assertTrue(s.contains("<wa-icon name=\"chevron-right\" slot=\"expand-icon\"></wa-icon>"));
        assertTrue(s.contains("<wa-icon name=\"chevron-down\" slot=\"collapse-icon\"></wa-icon>"));
        assertTrue(s.contains("This is the content of the details element."));
    }
}
