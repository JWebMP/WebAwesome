package com.jwebmp.webawesome.test.text;

import com.jwebmp.webawesome.components.text.WaText;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaTextTest {

    @Test
    public void rendersParagraphWithBodySize() {
        WaText<?> t = new WaText<>()
                .setTag("p")
                .setWaBody("s")
                .setText("Five boxing wizards");
        String html = t.toString(true);
        System.out.println(html);
        assertTrue(html.contains("<p"));
        assertTrue(html.contains("waText"));
        assertTrue(html.contains("waBody=\"s\""));
        assertTrue(html.contains(">Five boxing wizards</p>"));
    }

    @Test
    public void rendersHeadingWithHeadingSize() {
        WaText<?> t = new WaText<>()
                .setTag("h3")
                .setWaHeading("m")
                .setText("Five boxing wizards");
        String html = t.toString(true);
        System.out.println(html);
        assertTrue(html.contains("<h3"));
        assertTrue(html.contains("waHeading=\"m\""));
    }

    @Test
    public void rendersCaptionAsDiv() {
        WaText<?> t = new WaText<>()
                .setTag("div")
                .setWaCaption("l")
                .setText("Five boxing wizards");
        String html = t.toString(true);
        System.out.println(html);
        assertTrue(html.contains("<div"));
        assertTrue(html.contains("waCaption=\"l\""));
    }

    @Test
    public void rendersLinkStyles() {
        WaText<?> linkPlain = new WaText<>()
                .setTag("a")
                .setWaLink("plain")
                .addAttribute("href", "#")
                .setText("Five boxing wizards");
        String html = linkPlain.toString(true);
        System.out.println(html);
        assertTrue(html.contains("<a href=\"#\""));
        assertTrue(html.contains("waLink=\"plain\""));

        WaText<?> linkBoolean = new WaText<>()
                .setTag("a")
                .setWaLinkFlag(true)
                .addAttribute("href", "#")
                .setText("Five boxing wizards");
        String html2 = linkBoolean.toString(true);
        System.out.println(html2);
        assertTrue(html2.contains("<a href=\"#\""));
        assertTrue(html2.contains(" waLink") || html2.contains(" waLink="));
    }

    @Test
    public void rendersUtilitiesAndTruncate() {
        WaText<?> t = new WaText<>()
                .setTag("p")
                .setWaFontSize("xs")
                .setWaFontWeight("light")
                .setWaColorText("quiet")
                .setWaTextTruncate(true)
                .setText("Five boxing wizards jump quickly over the lazy dog");
        String html = t.toString(true);
        System.out.println(html);
        assertTrue(html.contains("waFontSize=\"xs\""));
        assertTrue(html.contains("waFontWeight=\"light\""));
        assertTrue(html.contains("waColorText=\"quiet\""));
        assertTrue(html.contains(" waTextTruncate") || html.contains(" waTextTruncate="));
    }

    @Test
    public void rendersListPlainAndFormControlText() {
        WaText<?> list = new WaText<>()
                .setTag("ul")
                .setWaListPlain(true);
        String html1 = list.toString(true);
        System.out.println(html1);
        assertTrue(html1.contains("<ul"));
        assertTrue(html1.contains(" waListPlain") || html1.contains(" waListPlain="));

        WaText<?> label = new WaText<>()
                .setTag("div")
                .setWaFormControlText("label")
                .setText("Email");
        String html2 = label.toString(true);
        System.out.println(html2);
        assertTrue(html2.contains("waFormControlText=\"label\""));
    }
}
