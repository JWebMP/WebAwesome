package com.jwebmp.webawesome.test.icon;

import com.jwebmp.webawesome.components.icon.IconVariant;
import com.jwebmp.webawesome.components.icon.WaIconButton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaIconButtonTest
{
    @Test
    public void testRenderBasicIconButtonHtml()
    {
        var s = new WaIconButton<>()
                .setName("star")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon-button name=\"star\"></wa-icon-button>", s);
    }

    @Test
    public void testRenderIconButtonWithFamilyHtml()
    {
        var s = new WaIconButton<>()
                .setName("github")
                .setFamily("brands")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon-button family=\"brands\" name=\"github\"></wa-icon-button>", s);
    }

    @Test
    public void testRenderIconButtonWithVariantHtml()
    {
        var s = new WaIconButton<>()
                .setName("star")
                .setVariant(IconVariant.Regular)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon-button name=\"star\" variant=\"regular\"></wa-icon-button>", s);
    }

    @Test
    public void testRenderIconButtonWithLabelHtml()
    {
        var s = new WaIconButton<>()
                .setName("star")
                .setLabel("Favorite")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon-button label=\"Favorite\" name=\"star\"></wa-icon-button>", s);
    }

    @Test
    public void testRenderIconButtonWithColorHtml()
    {
        var s = new WaIconButton<>()
                .setName("heart")
                .setColor("#ff0000")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon-button name=\"heart\" style=\"color:#ff0000;\"></wa-icon-button>", s);
    }

    @Test
    public void testRenderIconButtonWithFontSizeHtml()
    {
        var s = new WaIconButton<>()
                .setName("bell")
                .setFontSize("2rem")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon-button name=\"bell\" style=\"font-size:2rem;\"></wa-icon-button>", s);
    }

    @Test
    public void testRenderIconButtonWithMultiplePropertiesHtml()
    {
        var s = new WaIconButton<>()
                .setName("star")
                .setVariant(IconVariant.Solid)
                .setColor("#ffd700")
                .setFontSize("3rem")
                .setLabel("Gold Star")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-icon-button label=\"Gold Star\" name=\"star\" style=\"color:#ffd700;font-size:3rem;\" variant=\"solid\"></wa-icon-button>", s);
    }
}