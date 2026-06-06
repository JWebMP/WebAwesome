package com.jwebmp.webawesome.test.knowndate;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.knowndate.KnownDateAppearance;
import com.jwebmp.webawesome.components.knowndate.KnownDateSize;
import com.jwebmp.webawesome.components.knowndate.WaKnownDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaKnownDateTest
{
    @Test
    void rendersKnownDateWithAttributes()
    {
        Page<?> p = new Page<>();
        WaKnownDate<?> kd = new WaKnownDate<>("Date of birth")
                .setValue("1990-04-12")
                .setSize(KnownDateSize.M)
                .setAppearance(KnownDateAppearance.Outlined)
                .setAutocomplete("bday")
                .setMin("1900-01-01")
                .setMax("2026-12-31")
                .setLocale("en-GB");
        p.getBody().add(kd);
        String html = p.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-known-date"));
        assertTrue(html.contains("label=\"Date of birth\""));
        assertTrue(html.contains("value=\"1990-04-12\""));
        assertTrue(html.contains("size=\"m\""));
        assertTrue(html.contains("appearance=\"outlined\""));
        assertTrue(html.contains("autocomplete=\"bday\""));
        assertTrue(html.contains("min=\"1900-01-01\""));
        assertTrue(html.contains("max=\"2026-12-31\""));
        assertTrue(html.contains("locale=\"en-GB\""));
    }

    @Test
    void longFormSizeStaysValid()
    {
        String html = new WaKnownDate<>().setSize(KnownDateSize.Large).toString(true);
        assertTrue(html.contains("size=\"large\""));
    }

    @Test
    void rendersBooleanAttributesAndEvents()
    {
        Page<?> p = new Page<>();
        WaKnownDate<?> kd = new WaKnownDate<>()
                .setDisabled(true)
                .setRequired(true)
                .setReadonly(false)
                .setPill(true)
                .setChangeEvent("onChange($event)")
                .setInvalidEvent("onInvalid($event)");
        p.getBody().add(kd);
        String html = p.toString(true);
        System.out.println(html);

        assertTrue(hasAttr(html, "disabled"));
        assertTrue(hasAttr(html, "required"));
        assertFalse(hasAttr(html, "readonly"));
        assertTrue(hasAttr(html, "pill"));
        assertTrue(html.contains("change=\"onChange($event)\""));
        assertTrue(html.contains("wa-invalid=\"onInvalid($event)\""));
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
    void supportsNgModelBinding()
    {
        String html = new WaKnownDate<>().bind("birthDate").toString(true);
        assertTrue(html.contains("[(ngModel)]=\"birthDate\""));
    }
}



