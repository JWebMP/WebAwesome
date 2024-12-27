package com.jwebmp.webawesome.components.textarea;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.select.SelectAppearance;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaTextArea extends DivSimple<WaTextArea>
{
    private String hint;
    private Integer rows;
    private String placeholder;
    private SelectAppearance appearance;
    private Boolean disabled;
    private String value;
    private Size size;

    private TextAreaResize resize;

    public WaTextArea()
    {
        setTag("wa-textarea");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(hint))
            {
                addAttribute("hint", hint);
            }
            if (rows != null)
            {
                addAttribute("rows", rows.toString());
            }
            if (!Strings.isNullOrEmpty(placeholder))
            {
                addAttribute("placeholder", placeholder);
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString().toLowerCase());
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (!Strings.isNullOrEmpty(value))
            {
                addAttribute("value", value);
            }
            if (size != null)
            {
                addAttribute("size", size.toString().toLowerCase());
            }

        }
        super.init();
    }
}
