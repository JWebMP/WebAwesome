package com.jwebmp.webawesome.test.rating;

import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.icon.IconVariant;
import com.jwebmp.webawesome.components.icon.WaIcon;
import com.jwebmp.webawesome.components.rating.WaRating;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaRatingTest
{
    @Test
    public void testRenderBasicRatingHtml()
    {
        var s = new WaRating<>()
                .setLabel("Rate this item")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-rating label=\"Rate this item\"></wa-rating>", s);
    }

    @Test
    public void testRenderRatingWithDifferentValuesHtml()
    {
        // Default rating (value 3)
        var s1 = new WaRating<>()
                .setLabel("Default Rating")
                .setValue("3")
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("label=\"Default Rating\""));
        assertTrue(s1.contains("value=\"3\""));

        // Half star rating (value 3.5)
        var s2 = new WaRating<>()
                .setLabel("Half Star Rating")
                .setValue("3.5")
                .setPrecision(0.5)
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("label=\"Half Star Rating\""));
        assertTrue(s2.contains("value=\"3.5\""));
        assertTrue(s2.contains("precision=\"0.5\""));
    }

    @Test
    public void testRenderRatingWithDifferentSizesHtml()
    {
        // Small rating
        var s1 = new WaRating<>()
                .setLabel("Small Rating")
                .setSize(Size.Small)
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("size=\"small\""));

        // Medium rating
        var s2 = new WaRating<>()
                .setLabel("Medium Rating")
                .setSize(Size.Medium)
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("size=\"medium\""));

        // Large rating
        var s3 = new WaRating<>()
                .setLabel("Large Rating")
                .setSize(Size.Large)
                .toString(true);
        System.out.println(s3);

        assertTrue(s3.contains("size=\"large\""));
    }

    @Test
    public void testRenderReadonlyAndDisabledRatingHtml()
    {
        // Readonly rating
        var s1 = new WaRating<>()
                .setLabel("Readonly Rating")
                .setValue("4")
                .setReadonly(true)
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("readonly"));
        assertTrue(s1.contains("value=\"4\""));

        // Disabled rating
        var s2 = new WaRating<>()
                .setLabel("Disabled Rating")
                .setValue("3")
                .setDisabled(true)
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("disabled"));
        assertTrue(s2.contains("value=\"3\""));
    }

    @Test
    public void testRenderRatingWithCustomMaxValueHtml()
    {
        var s = new WaRating<>()
                .setLabel("Rate out of 10")
                .setMax(10)
                .setValue("7")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("max=\"10\""));
        assertTrue(s.contains("value=\"7\""));
    }

    @Test
    public void testRenderRatingWithCustomPrecisionHtml()
    {
        // Quarter-star precision
        var s1 = new WaRating<>()
                .setLabel("Quarter-star Rating")
                .setPrecision(0.25)
                .setValue("3.75")
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("precision=\"0.25\""));
        assertTrue(s1.contains("value=\"3.75\""));

        // Half-star precision
        var s2 = new WaRating<>()
                .setLabel("Half-star Rating")
                .setPrecision(0.5)
                .setValue("3.5")
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("precision=\"0.5\""));
        assertTrue(s2.contains("value=\"3.5\""));

        // Whole-star precision
        var s3 = new WaRating<>()
                .setLabel("Whole-star Rating")
                .setPrecision(1)
                .setValue("3")
                .toString(true);
        System.out.println(s3);

        assertTrue(s3.contains("precision=\"1\""));
        assertTrue(s3.contains("value=\"3\""));
    }

    @Test
    public void testRenderRatingWithCustomStylingHtml()
    {
        var s = new WaRating<>()
                .setLabel("Custom Styled Rating")
                .setSymbolColour("#d1d1d1")
                .setSymbolColourActive("#ffb400")
                .setSymbolSpacing("0.5rem")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("style="));
        assertTrue(s.contains("--symbol-color:#d1d1d1"));
        assertTrue(s.contains("--symbol-color-active:#ffb400"));
        assertTrue(s.contains("--symbol-spacing:0.5rem"));

        // Using direct styling inputs
        var s2 = new WaRating<>()
                .setLabel("Directly Styled Rating")
                .setColor("#ff6b6b")
                .setFontSize("24px")
                .setBackgroundColor("#f8f9fa")
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("color=\"#ff6b6b\""));
        assertTrue(s2.contains("style="));
        assertTrue(s2.contains("font-size:24px"));
        assertTrue(s2.contains("background-color:#f8f9fa"));
    }

    @Test
    public void testRenderRatingWithCustomSymbolHtml()
    {
        var s = new WaRating<>()
                .setLabel("Heart Rating")
                .setSymbol(new WaIcon<>().setName("heart")
                                         .setVariant(IconVariant.Solid))
                .setID("heartRating")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("id=\"heartRating\""));
        assertTrue(s.contains("const rating = document.querySelector('#heartRating');"));
        assertTrue(s.contains("rating.getSymbol = () =>'<wa-icon name=\"heart\""));
    }
}
