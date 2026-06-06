package com.jwebmp.webawesome.test.accordion;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.accordion.AccordionAppearance;
import com.jwebmp.webawesome.components.accordion.AccordionIconPlacement;
import com.jwebmp.webawesome.components.accordion.AccordionMode;
import com.jwebmp.webawesome.components.accordion.WaAccordion;
import com.jwebmp.webawesome.components.accordion.WaAccordionItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaAccordionTest
{
    @Test
    void rendersAccordionWithAttributes()
    {
        Page<?> p = new Page<>();
        WaAccordion<?> accordion = new WaAccordion<>()
                .setMode(AccordionMode.SingleCollapsible)
                .setIconPlacement(AccordionIconPlacement.Start)
                .setHeadingLevel(2)
                .setAppearance(AccordionAppearance.FilledOutlined)
                .setExpandEvent("onExpand($event)")
                .setAfterCollapseEvent("onAfterCollapse()");
        p.getBody().add(accordion);
        String html = p.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-accordion"));
        assertTrue(html.contains("mode=\"single-collapsible\""));
        assertTrue(html.contains("icon-placement=\"start\""));
        assertTrue(html.contains("heading-level=\"2\""));
        assertTrue(html.contains("appearance=\"filled-outlined\""));
        assertTrue(html.contains("wa-expand=\"onExpand($event)\""));
        assertTrue(html.contains("wa-after-collapse=\"onAfterCollapse()\""));
    }

    @Test
    void rendersAccordionItemsWithBooleansAndSlots()
    {
        Page<?> p = new Page<>();
        WaAccordionItem<?> item = new WaAccordionItem<>("Section 1")
                .setExpanded(true)
                .setDisabled(false)
                .setSpacing("1rem")
                .setDividerColor("var(--wa-color-neutral-fill-quiet)");
        WaAccordion<?> accordion = new WaAccordion<>().add(item);
        p.getBody().add(accordion);
        String html = p.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-accordion-item"));
        assertTrue(html.contains("label=\"Section 1\""));
        assertTrue(hasAttr(html, "expanded"));
        assertFalse(hasAttr(html, "disabled"));
        assertTrue(html.contains("--spacing:1rem"));
        assertTrue(html.contains("--wa-accordion-divider-color:var(--wa-color-neutral-fill-quiet)"));
    }

    /**
     * Checks for the presence of a boolean attribute regardless of whether the engine renders it
     * bare ({@code expanded}) or with an empty value ({@code expanded=""}).
     */
    private static boolean hasAttr(String html, String name)
    {
        return html.matches("(?s).*\\s" + java.util.regex.Pattern.quote(name) + "(\\s|>|=).*");
    }

    @Test
    void supportsStringAppearanceAndIconPlacement()
    {
        String html = new WaAccordion<>()
                .setAppearance("filled outlined")
                .setIconPlacement("end")
                .toString(true);
        System.out.println(html);

        assertTrue(html.contains("appearance=\"filled outlined\""));
        assertTrue(html.contains("icon-placement=\"end\""));
    }
}


