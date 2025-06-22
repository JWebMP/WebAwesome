package com.jwebmp.webawesome.test.card;

import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.button.Appearance;
import com.jwebmp.webawesome.components.card.WaCard;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Image;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaCardTest
{
    @Test
    public void testRenderBasicCardHtml()
    {
        var s = new WaCard<>()
                .withText("This is a basic card with default styling.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-card>"));
        assertTrue(s.contains("This is a basic card with default styling."));
    }

    @Test
    public void testRenderCardWithAppearanceHtml()
    {
        var s = new WaCard<>()
                .setAppearance(Appearance.Outlined)
                .withText("This card has an outlined appearance.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-card appearance=\"outlined\">"));
        assertTrue(s.contains("This card has an outlined appearance."));
    }

    @Test
    public void testRenderCardWithSizeHtml()
    {
        var s = new WaCard<>()
                .setSize(Size.Medium)
                .withText("This is a medium card.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-card size=\"medium\">"));
        assertTrue(s.contains("This is a medium card."));
    }

    @Test
    public void testRenderCardWithHeaderHtml()
    {
        var s = new WaCard<>()
                .withHeader("Card Header")
                .withText("This is the main content of the card.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-card with-header>"));
        assertTrue(s.contains("<div slot=\"header\">Card Header</div>"));
        assertTrue(s.contains("This is the main content of the card."));
    }

    @Test
    public void testRenderCardWithFooterHtml()
    {
        var footer = new DivSimple<>();
        footer.setText("Card Footer");

        var s = new WaCard<>()
                .withText("This is the main content of the card.")
                .withFooter(footer)
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-card with-footer>"));
        assertTrue(s.contains("<div slot=\"footer\">Card Footer</div>"));
        assertTrue(s.contains("This is the main content of the card."));
    }

    @Test
    public void testRenderCardWithImageHtml()
    {
        var image = new Image<>();
        image.addAttribute("src", "https://example.com/image.jpg");
        image.addAttribute("alt", "Example Image");

        var s = new WaCard<>()
                .withImage(image)
                .withText("This is the main content of the card.")
                .toString(true);

        System.out.println(s);

        // Check individual components instead of the exact string
        assertTrue(s.contains("<wa-card"));
        assertTrue(s.contains("with-image"));
        assertTrue(s.contains("<img"));
        assertTrue(s.contains("alt=\"Example Image\""));
        assertTrue(s.contains("slot=\"image\""));
        assertTrue(s.contains("src=\"https://example.com/image.jpg\""));
        assertTrue(s.contains("This is the main content of the card."));
    }

    @Test
    public void testRenderCardWithAllSlotsHtml()
    {
        var image = new Image<>();
        image.addAttribute("src", "https://example.com/cat.jpg");
        image.addAttribute("alt", "Cat image");

        var header = new DivSimple<>();
        header.setText("Cute Cat");

        var footer = new DivSimple<>();
        footer.setText("Card Footer");

        var s = new WaCard<>()
                .setAppearance(Appearance.Outlined)
                .setSize(Size.Medium)
                .withImage(image)
                .withHeader(header)
                .withText("This is a very adorable kitten that likes being inside cards.")
                .withFooter(footer)
                .toString(true);

        System.out.println(s);

        // Check individual components instead of the exact string
        assertTrue(s.contains("<wa-card"));
        assertTrue(s.contains("appearance=\"outlined\""));
        assertTrue(s.contains("size=\"medium\""));
        assertTrue(s.contains("with-footer"));
        assertTrue(s.contains("with-header"));
        assertTrue(s.contains("with-image"));
        assertTrue(s.contains("<img"));
        assertTrue(s.contains("alt=\"Cat image\""));
        assertTrue(s.contains("slot=\"image\""));
        assertTrue(s.contains("src=\"https://example.com/cat.jpg\""));
        assertTrue(s.contains("<div slot=\"header\">Cute Cat</div>"));
        assertTrue(s.contains("This is a very adorable kitten that likes being inside cards."));
        assertTrue(s.contains("<div slot=\"footer\">Card Footer</div>"));
    }

    @Test
    public void testRenderCardWithStylingHtml()
    {
        var s = new WaCard<>()
                .setColor("#333333")
                .setBackgroundColor("#f8f9fa")
                .setFontSize("1rem")
                .setBorderRadius("12px")
                .setBorderColor("#6200ee")
                .setInnerBorderColor("#e0e0e0")
                .setBorderWidth("2px")
                .setSpacing("16px")
                .withText("This card has custom styling applied.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("style=\"--border-color:#6200ee;--border-radius:12px;--border-width:2px;--inner-border-color:#e0e0e0;--spacing:16px;background-color:#f8f9fa;color:#333333;font-size:1rem;\""));
        assertTrue(s.contains("This card has custom styling applied."));
    }
}
