package com.jwebmp.webawesome.test.qrcode;

import com.jwebmp.webawesome.components.icon.WaIcon;
import com.jwebmp.webawesome.components.qrcode.WaQRCode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaQRCodeTest
{
    @Test
    public void testRenderBasicQRCodeHtml()
    {
        var qrCode = new WaQRCode<>()
                .setValue("https://example.com");

        var html = qrCode.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-qr-code"));
        assertTrue(html.contains("value=\"https://example.com\""));
    }

    @Test
    public void testRenderQRCodeWithCustomStylingHtml()
    {
        var qrCode = new WaQRCode<>()
                .setValue("https://example.com")
                .setSize("200")
                .setFill("#000000")
                .setBackground("#FFFFFF")
                .setRadius(0.2);

        var html = qrCode.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-qr-code"));
        assertTrue(html.contains("value=\"https://example.com\""));
        assertTrue(html.contains("size=\"200\""));
        assertTrue(html.contains("fill=\"#000000\""));
        assertTrue(html.contains("background=\"#FFFFFF\""));
        assertTrue(html.contains("radius=\"0.2\""));
    }

    @Test
    public void testRenderQRCodeWithErrorCorrectionHtml()
    {
        var qrCode = new WaQRCode<>()
                .setValue("https://example.com")
                .setErrorCorrection("H");

        var html = qrCode.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-qr-code"));
        assertTrue(html.contains("value=\"https://example.com\""));
        assertTrue(html.contains("error-correction=\"H\""));
    }

    @Test
    public void testRenderQRCodeWithLabelHtml()
    {
        var qrCode = new WaQRCode<>()
                .setValue("https://example.com")
                .setLabel("Scan to visit our website");

        var html = qrCode.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-qr-code"));
        assertTrue(html.contains("value=\"https://example.com\""));
        assertTrue(html.contains("label=\"Scan to visit our website\""));
    }

    @Test
    public void testRenderQRCodeWithEventsHtml()
    {
        var qrCode = new WaQRCode<>()
                .setValue("https://example.com")
                .setFocusEvent("onFocus()")
                .setBlurEvent("onBlur()");

        var html = qrCode.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-qr-code"));
        assertTrue(html.contains("value=\"https://example.com\""));
        assertTrue(html.contains("focus=\"onFocus()\""));
        assertTrue(html.contains("blur=\"onBlur()\""));
    }

    @Test
    public void testRenderQRCodeWithPrefixSlotHtml()
    {
        var icon = new WaIcon<>().setName("qrcode");

        var qrCode = new WaQRCode<>()
                .setValue("https://example.com")
                .setPrefix(icon);

        var html = qrCode.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-qr-code"));
        assertTrue(html.contains("value=\"https://example.com\""));
        assertTrue(html.contains("<wa-icon name=\"qrcode\" slot=\"prefix\"></wa-icon>"));
    }

    @Test
    public void testRenderQRCodeWithBindingHtml()
    {
        var qrCode = new WaQRCode<>()
                .bind("qrCodeValue");

        var html = qrCode.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-qr-code"));
        assertTrue(html.contains("[value]=\"qrCodeValue\""));
    }

    @Test
    public void testRenderQRCodeWithTwoWayBindingHtml()
    {
        var qrCode = new WaQRCode<>()
                .bind("qrCodeValue");

        var html = qrCode.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-qr-code"));
        assertTrue(html.contains("[value]=\"qrCodeValue\""));
        assertTrue(html.contains("(valueChange)=\"qrCodeValue = $event\""));
    }
}
