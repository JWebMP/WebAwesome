package com.jwebmp.webawesome.components.radio;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaRadioGroup extends DivSimple<WaRadioGroup>
{
    private String initialValue;
    private String name;
    private String hint;

    public WaRadioGroup()
    {
        setTag("wa-radio-group");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(initialValue))
            {
                addAttribute("value", initialValue);
            }
            if (!Strings.isNullOrEmpty(name))
            {
                addAttribute("name", name);
            }
            if (!Strings.isNullOrEmpty(hint))
            {
                addAttribute("hint", hint);
            }
        }
        super.init();
    }

}
