package com.jwebmp.webawesome.components.text;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/**
 * A component for formatting and displaying numeric values in a web application.
 * The component supports various options for grouping, currency, language, and digit constraints.
 * <p>
 * Example usage:
 * <pre>{@code
 * FormatNumber formatNumber = new FormatNumber();
 * formatNumber.setValue(1234.567);
 * formatNumber.setType(FormatNumber.NumberType.DECIMAL);
 * formatNumber.setMinFractionDigits(2);
 * formatNumber.setMaxFractionDigits(4);
 * }</pre>
 * </p>
 */
public class FormatNumber extends DivSimple<FormatNumber>
{
    /**
     * The numeric value to be formatted.
     * Example: {@code 12345.67}
     */
    private Number value;

    /**
     * The type of formatting to apply, such as DECIMAL, PERCENT, etc.
     */
    private NumberType type;

    /**
     * If true, disables grouping separators (e.g., thousands separators).
     * Default: false.
     */
    private Boolean noGrouping;

    /**
     * The currency to format the number with (e.g., USD, EUR).
     * Used only when the {@code type} field is set to CURRENCY.
     */
    private String currency;

    /**
     * Specifies how to display the currency (e.g., symbol, code, or name).
     * Example: {@code CurrencyDisplay.SYMBOL}
     */
    private CurrencyDisplay currencyDisplay;

    /**
     * The language to format the number in, specified as a language code (e.g., en-US, fr-FR).
     * Example: {@code "en-US"}
     */
    private String language;

    /**
     * The minimum number of fraction digits to display (0-20).
     * Useful for ensuring consistent decimal precision.
     * Example: {@code 2}
     */
    @Min(0)
    @Max(20)
    private Integer minFractionDigits;

    /**
     * The maximum number of fraction digits to display (0-20).
     * Example: {@code 4}
     */
    @Min(0)
    @Max(20)
    private Integer maxFractionDigits;

    /**
     * The minimum number of integer digits to display (1-21).
     * Example: {@code 1}.
     */
    @Min(1)
    @Max(21)
    private Integer minIntegerDigits;

    /**
     * The maximum number of integer digits to display (1-21).
     * Example: {@code 6}.
     */
    @Min(1)
    @Max(21)
    private Integer maxIntegerDigits;

    /**
     * Constructs a new {@link FormatNumber} instance and sets the HTML tag to "wa-format-number".
     */
    public FormatNumber()
    {
        setTag("wa-format-number");
    }

    /**
     * Initializes the format number component and sets attributes
     * based on the provided configuration properties.
     * This method is called during component rendering.
     */
    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (value != null)
            {
                addAttribute("value", value + "");
            }
            if (type != null)
            {
                addAttribute("type", type.toString().toLowerCase());
            }
            if (noGrouping != null && noGrouping)
            {
                addAttribute("noGrouping", "true");
            }
            if (!Strings.isNullOrEmpty(currency))
            {
                addAttribute("currency", currency);
            }
            if (currencyDisplay != null)
            {
                addAttribute("currencyDisplay", currencyDisplay.toString().toLowerCase());
            }
            if (!Strings.isNullOrEmpty(language))
            {
                addAttribute("lang", language);
            }
            if (minFractionDigits != null)
            {
                addAttribute("minimum-fraction-digits", minFractionDigits + "");
            }
            if (maxFractionDigits != null)
            {
                addAttribute("maximum-fraction-digits", maxFractionDigits + "");
            }
            if (minIntegerDigits != null)
            {
                addAttribute("minimum-significant-digits", minIntegerDigits + "");
            }
            if (maxIntegerDigits != null)
            {
                addAttribute("maximum-significant-digits", maxIntegerDigits + "");
            }
        }
        super.init();
    }
}
