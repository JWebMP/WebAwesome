package com.jwebmp.webawesome.test.relativetime;

import com.jwebmp.webawesome.components.relativetime.WaRelativeTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaRelativeTimeTest
{
    @Test
    public void testRenderBasicRelativeTimeHtml()
    {
        var s = new WaRelativeTime<>()
                .setDate("2023-01-01T12:00:00Z")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-relative-time date=\"2023-01-01T12:00:00Z\"></wa-relative-time>", s);
    }

    @Test
    public void testRenderRelativeTimeWithFormatHtml()
    {
        // Long format
        var s1 = new WaRelativeTime<>()
                .setDate("2023-01-01T12:00:00Z")
                .setFormat("long")
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("format=\"long\""));

        // Short format
        var s2 = new WaRelativeTime<>()
                .setDate("2023-01-01T12:00:00Z")
                .setFormat("short")
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("format=\"short\""));

        // Narrow format
        var s3 = new WaRelativeTime<>()
                .setDate("2023-01-01T12:00:00Z")
                .setFormat("narrow")
                .toString(true);
        System.out.println(s3);

        assertTrue(s3.contains("format=\"narrow\""));
    }

    @Test
    public void testRenderRelativeTimeWithNumericHtml()
    {
        // Auto numeric
        var s1 = new WaRelativeTime<>()
                .setDate("2023-01-01T12:00:00Z")
                .setNumeric("auto")
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("numeric=\"auto\""));

        // Always numeric
        var s2 = new WaRelativeTime<>()
                .setDate("2023-01-01T12:00:00Z")
                .setNumeric("always")
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("numeric=\"always\""));
    }

    @Test
    public void testRenderRelativeTimeWithLangHtml()
    {
        var s = new WaRelativeTime<>()
                .setDate("2023-01-01T12:00:00Z")
                .setLang("fr")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("lang=\"fr\""));
    }

    @Test
    public void testRenderRelativeTimeWithSyncHtml()
    {
        var s = new WaRelativeTime<>()
                .setDate("2023-01-01T12:00:00Z")
                .setSync(true)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("sync"));
    }

    @Test
    public void testRenderRelativeTimeWithDisplayHtml()
    {
        var s = new WaRelativeTime<>()
                .setDate("2023-01-01T12:00:00Z")
                .setDisplay("inline-block")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("style="));
        assertTrue(s.contains("--display:inline-block"));
    }

    @Test
    public void testRenderRelativeTimeWithBindingsHtml()
    {
        var s = new WaRelativeTime<>()
                .bind("myDate")
                .bindFormat("myFormat")
                .bindNumeric("myNumeric")
                .bindLang("myLang")
                .bindSync("mySync")
                .bindDisplay("myDisplay")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("[attrs.date]=\"myDate\""));
        assertTrue(s.contains("[attrs.format]=\"myFormat\""));
        assertTrue(s.contains("[attrs.numeric]=\"myNumeric\""));
        assertTrue(s.contains("[attrs.lang]=\"myLang\""));
        assertTrue(s.contains("[attrs.sync]=\"mySync\""));
        assertTrue(s.contains("[display]=\"myDisplay\""));
    }
}
