package com.jwebmp.webawesome.test.icon;

import com.jwebmp.webawesome.components.icon.IconVariant;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaIconTest
{
    @Test
    public void testRenderBasicIconHtml()
    {
        var s = new WaIcon<>()
                .setName("star")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon name=\"star\"></wa-icon>", s);
    }

    @Test
    public void testRenderIconWithFamilyHtml()
    {
        var s = new WaIcon<>()
                .setName("github")
                .setFamily("brands")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon family=\"brands\" name=\"github\"></wa-icon>", s);
    }

    @Test
    public void testRenderIconWithVariantHtml()
    {
        var s = new WaIcon<>()
                .setName("star")
                .setVariant(IconVariant.Regular)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon name=\"star\" variant=\"regular\"></wa-icon>", s);
    }

    @Test
    public void testRenderIconWithLibraryHtml()
    {
        var s = new WaIcon<>()
                .setName("smile")
                .setLibrary("my-icons")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon library=\"my-icons\" name=\"smile\"></wa-icon>", s);
    }

    @Test
    public void testRenderIconWithSrcHtml()
    {
        var s = new WaIcon<>()
                .setSrc("/assets/icons/custom-icon.svg")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon src=\"/assets/icons/custom-icon.svg\"></wa-icon>", s);
    }

    @Test
    public void testRenderIconWithLabelHtml()
    {
        var s = new WaIcon<>()
                .setName("star")
                .setLabel("Favorite")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon label=\"Favorite\" name=\"star\"></wa-icon>", s);
    }

    @Test
    public void testRenderIconWithFixedWidthHtml()
    {
        var s = new WaIcon<>()
                .setName("home")
                .setFixedWidth(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon fixed-width name=\"home\"></wa-icon>", s);
    }

    @Test
    public void testRenderIconWithColorHtml()
    {
        var s = new WaIcon<>()
                .setName("heart")
                .setColor("#ff0000")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon name=\"heart\" style=\"color:#ff0000;\"></wa-icon>", s);
    }

    @Test
    public void testRenderIconWithBackgroundColorHtml()
    {
        var s = new WaIcon<>()
                .setName("info")
                .setBackgroundColor("#f0f0f0")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon name=\"info\" style=\"background-color:#f0f0f0;\"></wa-icon>", s);
    }

    @Test
    public void testRenderIconWithFontSizeHtml()
    {
        var s = new WaIcon<>()
                .setName("bell")
                .setFontSize("2rem")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon name=\"bell\" style=\"font-size:2rem;\"></wa-icon>", s);
    }

    @Test
    public void testRenderDuotoneIconWithCustomPropertiesHtml()
    {
        var s = new WaIcon<>()
                .setName("circle")
                .setVariant(IconVariant.DuoTone)
                .setPrimaryColor("#0066cc")
                .setPrimaryOpacity(0.8)
                .setSecondaryColor("#99ccff")
                .setSecondaryOpacity(0.5)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon name=\"circle\" style=\"--primary-color:#0066cc;--primary-opacity:0.8;--secondary-color:#99ccff;--secondary-opacity:0.5;\" variant=\"duotone\"></wa-icon>", s);
    }

    @Test
    public void testRenderIconWithMultiplePropertiesHtml()
    {
        var s = new WaIcon<>()
                .setName("star")
                .setVariant(IconVariant.Solid)
                .setColor("#ffd700")
                .setFontSize("3rem")
                .setLabel("Gold Star")
                .setFixedWidth(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon fixed-width label=\"Gold Star\" name=\"star\" style=\"color:#ffd700;font-size:3rem;\" variant=\"solid\"></wa-icon>", s);
    }
}