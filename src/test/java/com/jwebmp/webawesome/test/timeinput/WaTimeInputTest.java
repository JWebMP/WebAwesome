package com.jwebmp.webawesome.test.timeinput;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.icon.WaIcon;
import com.jwebmp.webawesome.components.timeinput.HourFormat;
import com.jwebmp.webawesome.components.timeinput.TimeInputAppearance;
import com.jwebmp.webawesome.components.timeinput.TimeInputSize;
import com.jwebmp.webawesome.components.timeinput.WaTimeInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaTimeInputTest
{
    @Test
    void rendersTimeInputWithAttributes()
    {
        Page<?> p = new Page<>();
        WaTimeInput<?> ti = new WaTimeInput<>("Start time")
                .setValue("09:30:00")
                .setSize(TimeInputSize.S)
                .setAppearance(TimeInputAppearance.Filled)
                .setMin("08:00")
                .setMax("18:00")
                .setStep(900)
                .setHourFormat(HourFormat.TwentyFour);
        p.getBody().add(ti);
        String html = p.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-time-input"));
        assertTrue(html.contains("label=\"Start time\""));
        assertTrue(html.contains("value=\"09:30:00\""));
        assertTrue(html.contains("size=\"s\""));
        assertTrue(html.contains("appearance=\"filled\""));
        assertTrue(html.contains("min=\"08:00\""));
        assertTrue(html.contains("max=\"18:00\""));
        assertTrue(html.contains("step=\"900\""));
        assertTrue(html.contains("hour-format=\"24\""));
    }

    @Test
    void longFormSizeStaysValid()
    {
        String html = new WaTimeInput<>().setSize(TimeInputSize.Small).toString(true);
        assertTrue(html.contains("size=\"small\""));
    }

    @Test
    void rendersBooleanAttributesAndCssProps()
    {
        Page<?> p = new Page<>();
        WaTimeInput<?> ti = new WaTimeInput<>()
                .setDisabled(true)
                .setReadonly(false)
                .setPill(true)
                .setWithClear(true)
                .setWithNow(true)
                .setOpen(true)
                .setStep("any")
                .setColumnWidth("4rem")
                .setColumnItemHeight("2rem");
        p.getBody().add(ti);
        String html = p.toString(true);
        System.out.println(html);

        assertTrue(hasAttr(html, "disabled"));
        assertFalse(hasAttr(html, "readonly"));
        assertTrue(hasAttr(html, "pill"));
        assertTrue(hasAttr(html, "with-clear"));
        assertTrue(hasAttr(html, "with-now"));
        assertTrue(hasAttr(html, "open"));
        assertTrue(html.contains("step=\"any\""));
        assertTrue(html.contains("--column-width:4rem"));
        assertTrue(html.contains("--column-item-height:2rem"));
    }

    /**
     * Checks for the presence of a boolean attribute regardless of whether the engine renders it
     * bare ({@code disabled}) or with an empty value ({@code disabled=""}).
     */
    private static boolean hasAttr(String html, String name)
    {
        return html.matches("(?s).*\\s" + java.util.regex.Pattern.quote(name) + "(\\s|>|=).*");
    }

    @Test
    void rendersEventsAndSlots()
    {
        String html = new WaTimeInput<>()
                .setChangeEvent("onChange($event)")
                .setClearEvent("onClear()")
                .setAfterShowEvent("onAfterShow()")
                .setInvalidEvent("onInvalid($event)")
                .setStart(new WaIcon<>().setName("clock"))
                .toString(true);
        System.out.println(html);

        assertTrue(html.contains("change=\"onChange($event)\""));
        assertTrue(html.contains("wa-clear=\"onClear()\""));
        assertTrue(html.contains("wa-after-show=\"onAfterShow()\""));
        assertTrue(html.contains("wa-invalid=\"onInvalid($event)\""));
        assertTrue(html.contains("slot=\"start\""));
    }

    @Test
    void supportsNgModelBinding()
    {
        String html = new WaTimeInput<>().bind("startTime").toString(true);
        assertTrue(html.contains("[(ngModel)]=\"startTime\""));
    }
}



