package com.jwebmp.webawesome.components.text;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
/**
 * The FormatBytes component formats a number into a human-readable byte or bit representation.
 * It supports different units, display formats, and localization.
 */
@Getter
@NgImportReference(value = "WaFormatBytes", reference = "angular-awesome")
@NgImportModule("WaFormatBytes")
public class FormatBytes<J extends FormatBytes<J>> extends DivSimple<J>
{
    /**
     * The number to format.
     */
    private Number value;

    /**
     * The unit to use for formatting. Defaults to 'byte'.
     * Valid values: 'byte', 'bit'
     */
    private FormatTypes unit;

    /**
     * Controls verbosity of the output. Defaults to 'short'.
     * Valid values: 'long', 'short', 'narrow'
     */
    private String display;

    /**
     * Optional locale string for localization (e.g., 'de', 'en-US').
     */
    private String lang;

    /**
     * Creates a new FormatBytes component with default settings.
     */
    @SuppressWarnings("unchecked")
    public J setValue(Number value)
    {
        this.value = value;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setUnit(FormatTypes unit)
    {
        this.unit = unit;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDisplay(String display)
    {
        this.display = display;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setLang(String lang)
    {
        this.lang = lang;
        return (J) this;
    }    public FormatBytes()
    {
        setTag("wa-format-bytes");
    }

    /**
     * Creates a new FormatBytes component with the specified value.
     *
     * @param value The number to format
     */
    public FormatBytes(Number value)
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
            if (unit != null)
            {
                addAttribute("unit", unit.toString()
                                         .toLowerCase());
            }
            if (!Strings.isNullOrEmpty(display))
            {
                addAttribute("display", display);
            }
            if (!Strings.isNullOrEmpty(lang))
            {
                addAttribute("lang", lang);
            }
        }
        super.init();
    }
}
