package com.jwebmp.webawesome.components.checkbox;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaCheckbox extends DivSimple<WaCheckbox>
{
    private Boolean checked;
    private Boolean disabled;
    private Boolean indeterminate;

    private Size size;
    private String hint;

    public WaCheckbox()
    {
        setTag("wa-checkbox");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (checked != null && checked)
            {
                addAttribute("checked", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (indeterminate != null && indeterminate)
            {
                addAttribute("indeterminate", "");
            }
            if (size != null)
            {
                addAttribute("size", size.toString().toLowerCase());
            }
            if (!Strings.isNullOrEmpty(hint))
            {
                addAttribute("hint", hint);
            }
        }
        super.init();
    }
}
