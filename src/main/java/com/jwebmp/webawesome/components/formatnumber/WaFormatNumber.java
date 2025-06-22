package com.jwebmp.webawesome.components.formatnumber;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaFormatNumber component formats a number according to various formatting options.
 * It supports different types (decimal, currency, percent), currency options, and localization.
 */
@Getter
@Setter
@NgImportReference(value = "WaFormatNumberDirective", reference = "angular-awesome")
@NgImportModule("WaFormatNumberDirective")
public class WaFormatNumber<J extends WaFormatNumber<J>> extends DivSimple<J>
{
    /**
     * The number to format.
     */
    private Number value;

    /**
     * The number formatting style. Valid values: 'currency', 'decimal', 'percent'.
     * Default is 'decimal'.
     */
    private String type;

    /**
     * ISO 4217 code (e.g. USD, EUR). Only used when type="currency".
     */
    private String currency;

    /**
     * How currency should be displayed. Valid values: 'symbol', 'narrowSymbol', 'code', 'name'.
     */
    private String currencyDisplay;

    /**
     * Locale string (e.g. en, de, ru).
     */
    private String lang;

    /**
     * Disables thousands separators.
     */
    private Boolean noGrouping;

    /**
     * Minimum integer digits (1-21).
     */
    private Integer minimumIntegerDigits;

    /**
     * Minimum fraction digits (0-100).
     */
    private Integer minimumFractionDigits;

    /**
     * Maximum fraction digits (0-100).
     */
    private Integer maximumFractionDigits;

    /**
     * Minimum significant digits (1-21).
     */
    private Integer minimumSignificantDigits;

    /**
     * Maximum significant digits (1-21).
     */
    private Integer maximumSignificantDigits;

    /**
     * Text color of the formatted number.
     */
    private String color;

    /**
     * Font size of the formatted number.
     */
    private String fontSize;

    /**
     * Font weight of the formatted number.
     */
    private String fontWeight;

    /**
     * Display property of the formatted number.
     */
    private String display;

    /**
     * Text alignment of the formatted number.
     */
    private String textAlign;

    /**
     * Padding around the formatted number.
     */
    private String padding;

    public WaFormatNumber()
    {
        setTag("wa-format-number");
    }

    /**
     * Creates a new WaFormatNumber component with the specified value.
     *
     * @param value The number to format
     */
    public WaFormatNumber(Number value)
    {
        this();
        this.value = value;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (value != null)
            {
                addAttribute("value", value.toString());
            }
            if (!Strings.isNullOrEmpty(type))
            {
                addAttribute("type", type);
            }
            if (!Strings.isNullOrEmpty(currency))
            {
                addAttribute("currency", currency);
            }
            if (!Strings.isNullOrEmpty(currencyDisplay))
            {
                addAttribute("currency-display", currencyDisplay);
            }
            if (!Strings.isNullOrEmpty(lang))
            {
                addAttribute("lang", lang);
            }
            if (noGrouping != null && noGrouping)
            {
                addAttribute("no-grouping", "");
            }
            if (minimumIntegerDigits != null)
            {
                addAttribute("minimum-integer-digits", minimumIntegerDigits.toString());
            }
            if (minimumFractionDigits != null)
            {
                addAttribute("minimum-fraction-digits", minimumFractionDigits.toString());
            }
            if (maximumFractionDigits != null)
            {
                addAttribute("maximum-fraction-digits", maximumFractionDigits.toString());
            }
            if (minimumSignificantDigits != null)
            {
                addAttribute("minimum-significant-digits", minimumSignificantDigits.toString());
            }
            if (maximumSignificantDigits != null)
            {
                addAttribute("maximum-significant-digits", maximumSignificantDigits.toString());
            }

            // Apply styling
            if (!Strings.isNullOrEmpty(color))
            {
                addStyle("color", color);
            }
            if (!Strings.isNullOrEmpty(fontSize))
            {
                addStyle("font-size", fontSize);
            }
            if (!Strings.isNullOrEmpty(fontWeight))
            {
                addStyle("font-weight", fontWeight);
            }
            if (!Strings.isNullOrEmpty(display))
            {
                addStyle("display", display);
            }
            if (!Strings.isNullOrEmpty(textAlign))
            {
                addStyle("text-align", textAlign);
            }
            if (!Strings.isNullOrEmpty(padding))
            {
                addStyle("padding", padding);
            }
        }
        super.init();
    }
}