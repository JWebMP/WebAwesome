package com.jwebmp.webawesome.components.text;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormatBytes extends DivSimple<FormatBytes>
{
    private Long value;
    private FormatTypes unit;
    /**
     * 2-digits
     */
    private String language;

    public FormatBytes()
    {
        setTag("wa-format-bytes");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (value != null)
            {
                addAttribute("value", value + "");
            }
            if (unit != null)
            {
                addAttribute("unit", unit.toString().toLowerCase());
            }
            if (!Strings.isNullOrEmpty(language))
            {
                addAttribute("lang", language);
            }
        }
        super.init();
    }

}
