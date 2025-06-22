package com.jwebmp.webawesome.test.text;

import com.jwebmp.webawesome.components.text.FormatNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FormatNumberTest
{
    @Test
    public void testRenderBasicFormatNumberHtml()
    {
        var s = new FormatNumber()
                .setValue(1234.56)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-number value=\"1234.56\"></wa-format-number>", s);
    }

    @Test
    public void testRenderFormatNumberWithConstructorHtml()
    {
        var s = new FormatNumber(1234.56)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-number value=\"1234.56\"></wa-format-number>", s);
    }

    @Test
    public void testRenderFormatNumberWithTypeDecimalHtml()
    {
        var s = new FormatNumber()
                .setValue(1234.56)
                .setType(FormatNumber.NumberType.DECIMAL)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-number type=\"decimal\" value=\"1234.56\"></wa-format-number>", s);
    }

    @Test
    public void testRenderFormatNumberWithTypeCurrencyHtml()
    {
        var s = new FormatNumber()
                .setValue(1234.56)
                .setType(FormatNumber.NumberType.CURRENCY)
                .setCurrency("USD")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-number currency=\"USD\" type=\"currency\" value=\"1234.56\"></wa-format-number>", s);
    }

    @Test
    public void testRenderFormatNumberWithTypePercentHtml()
    {
        var s = new FormatNumber()
                .setValue(0.75)
                .setType(FormatNumber.NumberType.PERCENT)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-number type=\"percent\" value=\"0.75\"></wa-format-number>", s);
    }

    @Test
    public void testRenderFormatNumberWithCurrencyDisplayHtml()
    {
        var s = new FormatNumber()
                .setValue(1234.56)
                .setType(FormatNumber.NumberType.CURRENCY)
                .setCurrency("USD")
                .setCurrencyDisplay(FormatNumber.CurrencyDisplay.CODE)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-number currency=\"USD\" currency-display=\"code\" type=\"currency\" value=\"1234.56\"></wa-format-number>", s);
    }

    @Test
    public void testRenderFormatNumberWithFractionDigitsHtml()
    {
        var s = new FormatNumber()
                .setValue(1234.56)
                .setMinFractionDigits(2)
                .setMaxFractionDigits(4)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-number maximum-fraction-digits=\"4\" minimum-fraction-digits=\"2\" value=\"1234.56\"></wa-format-number>", s);
    }

    @Test
    public void testRenderFormatNumberWithIntegerDigitsHtml()
    {
        var s = new FormatNumber()
                .setValue(1234.56)
                .setMinIntegerDigits(5)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-number minimum-integer-digits=\"5\" value=\"1234.56\"></wa-format-number>", s);
    }

    @Test
    public void testRenderFormatNumberWithNoGroupingHtml()
    {
        var s = new FormatNumber()
                .setValue(1234567.89)
                .setNoGrouping(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-number no-grouping value=\"1234567.89\"></wa-format-number>", s);
    }

    @Test
    public void testRenderFormatNumberWithLangHtml()
    {
        var s = new FormatNumber()
                .setValue(1234.56)
                .setType(FormatNumber.NumberType.CURRENCY)
                .setCurrency("EUR")
                .setLanguage("de")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-number currency=\"EUR\" lang=\"de\" type=\"currency\" value=\"1234.56\"></wa-format-number>", s);
    }

    @Test
    public void testRenderFormatNumberWithStylingHtml()
    {
        var s = new FormatNumber()
                .setValue(1234.56)
                .setColor("#3f51b5")
                .setFontSize("1.5rem")
                .setFontWeight("bold")
                .setDisplay("inline")
                .setTextAlign("right")
                .setPadding("0.5rem")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-number style=\"color:#3f51b5;display:inline;font-size:1.5rem;font-weight:bold;padding:0.5rem;text-align:right;\" value=\"1234.56\"></wa-format-number>", s);
    }

    @Test
    public void testRenderFormatNumberWithAllOptionsHtml()
    {
        var s = new FormatNumber()
                .setValue(1234.56)
                .setType(FormatNumber.NumberType.CURRENCY)
                .setCurrency("EUR")
                .setCurrencyDisplay(FormatNumber.CurrencyDisplay.NAME)
                .setLanguage("fr")
                .setMinIntegerDigits(1)
                .setMinFractionDigits(2)
                .setMaxFractionDigits(2)
                .setNoGrouping(true)
                .setColor("#3f51b5")
                .setFontSize("1.2rem")
                .setFontWeight("bold")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-format-number currency=\"EUR\" currency-display=\"name\" lang=\"fr\" maximum-fraction-digits=\"2\" minimum-fraction-digits=\"2\" minimum-integer-digits=\"1\" no-grouping style=\"color:#3f51b5;font-size:1.2rem;font-weight:bold;\" type=\"currency\" value=\"1234.56\"></wa-format-number>", s);
    }
}