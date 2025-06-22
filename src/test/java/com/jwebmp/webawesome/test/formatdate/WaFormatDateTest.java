package com.jwebmp.webawesome.test.formatdate;

import com.jwebmp.webawesome.components.formatdate.WaFormatDate;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class WaFormatDateTest
{
    // Use a fixed date for consistent testing
    private static final String ISO_DATE = "2023-06-15T14:30:45.000Z";
    private static final Date TEST_DATE = Date.from(Instant.parse(ISO_DATE));

    @Test
    public void testRenderBasicFormatDateHtml()
    {
        var s = new WaFormatDate()
                .setDate(TEST_DATE)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-date date=\"2023-06-15T14:30:45Z\"></wa-format-date>", s);
    }

    @Test
    public void testRenderFormatDateWithConstructorHtml()
    {
        var s = new WaFormatDate(TEST_DATE)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-date date=\"2023-06-15T14:30:45Z\"></wa-format-date>", s);
    }

    @Test
    public void testRenderFormatDateWithStringConstructorHtml()
    {
        var s = new WaFormatDate(ISO_DATE)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-date date=\"2023-06-15T14:30:45.000Z\"></wa-format-date>", s);
    }

    @Test
    public void testRenderFormatDateWithYearMonthDayHtml()
    {
        var s = new WaFormatDate()
                .setDate(TEST_DATE)
                .setYear("numeric")
                .setMonth("long")
                .setDay("numeric")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-date date=\"2023-06-15T14:30:45Z\" day=\"numeric\" month=\"long\" year=\"numeric\"></wa-format-date>", s);
    }

    @Test
    public void testRenderFormatDateWithTimeHtml()
    {
        var s = new WaFormatDate()
                .setDate(TEST_DATE)
                .setHour("numeric")
                .setMinute("numeric")
                .setSecond("numeric")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-date date=\"2023-06-15T14:30:45Z\" hour=\"numeric\" minute=\"numeric\" second=\"numeric\"></wa-format-date>", s);
    }

    @Test
    public void testRenderFormatDateWithHourFormatHtml()
    {
        var s = new WaFormatDate()
                .setDate(TEST_DATE)
                .setHour("numeric")
                .setMinute("numeric")
                .setHourFormat("24")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-date date=\"2023-06-15T14:30:45Z\" hour=\"numeric\" hour-format=\"24\" minute=\"numeric\"></wa-format-date>", s);
    }

    @Test
    public void testRenderFormatDateWithWeekdayAndEraHtml()
    {
        var s = new WaFormatDate()
                .setDate(TEST_DATE)
                .setWeekday("long")
                .setEra("short")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-date date=\"2023-06-15T14:30:45Z\" era=\"short\" weekday=\"long\"></wa-format-date>", s);
    }

    @Test
    public void testRenderFormatDateWithTimeZoneHtml()
    {
        var s = new WaFormatDate()
                .setDate(TEST_DATE)
                .setTimeZone("America/New_York")
                .setTimeZoneName("long")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-date date=\"2023-06-15T14:30:45Z\" time-zone=\"America/New_York\" time-zone-name=\"long\"></wa-format-date>", s);
    }

    @Test
    public void testRenderFormatDateWithLangHtml()
    {
        var s = new WaFormatDate()
                .setDate(TEST_DATE)
                .setYear("numeric")
                .setMonth("long")
                .setDay("numeric")
                .setLang("fr")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-date date=\"2023-06-15T14:30:45Z\" day=\"numeric\" lang=\"fr\" month=\"long\" year=\"numeric\"></wa-format-date>", s);
    }

    @Test
    public void testRenderFormatDateWithStylingHtml()
    {
        var s = new WaFormatDate()
                .setDate(TEST_DATE)
                .setColor("#3f51b5")
                .setFontSize("1.5rem")
                .setFontWeight("bold")
                .setBackgroundColor("#f0f0f0")
                .setPadding("0.5rem")
                .setMargin("1rem")
                .setDisplay("inline")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-date date=\"2023-06-15T14:30:45Z\" style=\"background-color:#f0f0f0;color:#3f51b5;display:inline;font-size:1.5rem;font-weight:bold;margin:1rem;padding:0.5rem;\"></wa-format-date>", s);
    }

    @Test
    public void testRenderFormatDateWithAllOptionsHtml()
    {
        var s = new WaFormatDate()
                .setDate(TEST_DATE)
                .setWeekday("long")
                .setEra("short")
                .setYear("numeric")
                .setMonth("long")
                .setDay("numeric")
                .setHour("numeric")
                .setMinute("numeric")
                .setSecond("numeric")
                .setTimeZoneName("short")
                .setTimeZone("Europe/London")
                .setHourFormat("24")
                .setLang("de")
                .setColor("#3f51b5")
                .setFontSize("1.2rem")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-date date=\"2023-06-15T14:30:45Z\" day=\"numeric\" era=\"short\" hour=\"numeric\" hour-format=\"24\" lang=\"de\" minute=\"numeric\" month=\"long\" second=\"numeric\" style=\"color:#3f51b5;font-size:1.2rem;\" time-zone=\"Europe/London\" time-zone-name=\"short\" weekday=\"long\" year=\"numeric\"></wa-format-date>", s);
    }
}