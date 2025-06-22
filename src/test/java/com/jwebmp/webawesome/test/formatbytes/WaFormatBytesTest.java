package com.jwebmp.webawesome.test.formatbytes;

import com.jwebmp.webawesome.components.formatbytes.WaFormatBytes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaFormatBytesTest
{
    @Test
    public void testRenderBasicFormatBytesHtml()
    {
        var s = new WaFormatBytes()
                .setValue(1024)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-bytes value=\"1024\"></wa-format-bytes>", s);
    }

    @Test
    public void testRenderFormatBytesWithConstructorHtml()
    {
        var s = new WaFormatBytes(1024)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-bytes value=\"1024\"></wa-format-bytes>", s);
    }

    @Test
    public void testRenderFormatBytesWithUnitHtml()
    {
        var s = new WaFormatBytes()
                .setValue(1024)
                .setUnit("bit")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-bytes unit=\"bit\" value=\"1024\"></wa-format-bytes>", s);
    }

    @Test
    public void testRenderFormatBytesWithDisplayHtml()
    {
        var s = new WaFormatBytes()
                .setValue(1024)
                .setDisplay("long")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-bytes display=\"long\" value=\"1024\"></wa-format-bytes>", s);
    }

    @Test
    public void testRenderFormatBytesWithLangHtml()
    {
        var s = new WaFormatBytes()
                .setValue(1024)
                .setLang("de")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-bytes lang=\"de\" value=\"1024\"></wa-format-bytes>", s);
    }

    @Test
    public void testRenderFormatBytesWithAllOptionsHtml()
    {
        var s = new WaFormatBytes()
                .setValue(1024)
                .setUnit("bit")
                .setDisplay("long")
                .setLang("de")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-bytes display=\"long\" lang=\"de\" unit=\"bit\" value=\"1024\"></wa-format-bytes>", s);
    }

    @Test
    public void testRenderFormatBytesWithLargeValueHtml()
    {
        var s = new WaFormatBytes()
                .setValue(1024 * 1024 * 1024 * 2.5) // 2.5 GB
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-bytes value=\"2.68435456E9\"></wa-format-bytes>", s);
    }

    @Test
    public void testRenderFormatBytesWithZeroValueHtml()
    {
        var s = new WaFormatBytes()
                .setValue(0)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-bytes value=\"0\"></wa-format-bytes>", s);
    }
}