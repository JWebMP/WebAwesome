package com.jwebmp.webawesome.components.formatbytes;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaFormatBytes component formats a number into a human-readable byte or bit representation.
 * It supports different units, display formats, and localization.
 */
@Getter
@Setter
@NgImportReference(value = "WaFormatBytesDirective", reference = "angular-awesome")
@NgImportModule("WaFormatBytesDirective")
public class WaFormatBytes<J extends WaFormatBytes<J>> extends DivSimple<J>
{
    /**
     * The number to format.
     */
    private Number value;

    /**
     * The unit to use for formatting. Defaults to 'byte'.
     * Valid values: 'byte', 'bit'
     */
    private String unit;

    /**
     * Controls verbosity of the output. Defaults to 'short'.
     * Valid values: 'long', 'short', 'narrow'
     */
    private String display;

    /**
     * Optional locale string for localization (e.g., 'de', 'en-US').
     */
    private String lang;

    public WaFormatBytes()
    {
        setTag("wa-format-bytes");
    }

    /**
     * Creates a new WaFormatBytes component with the specified value.
     *
     * @param value The number to format
     */
    public WaFormatBytes(Number value)
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
            if (!Strings.isNullOrEmpty(unit))
            {
                addAttribute("unit", unit);
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