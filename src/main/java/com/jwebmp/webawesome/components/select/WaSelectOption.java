package com.jwebmp.webawesome.components.select;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaSelectOption extends DivSimple<WaSelectOption>
{
    private String value;
    private Boolean disabled;

    private IComponentHierarchyBase<?, ?> prefix;
    private IComponentHierarchyBase<?, ?> suffix;
    private String text;

    private String backgroundColourCurrent;
    private String backgroundColourHover;
    private String textColourCurrent;
    private String textColourHover;

    public WaSelectOption()
    {
        setTag("wa-select-option");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(value))
            {
                addAttribute("value", value);
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "disabled");
            }
            if (prefix != null)
            {
                prefix.asAttributeBase().addAttribute("slot", "prefix");
                add(0, prefix);
            }
            if (!Strings.isNullOrEmpty(text))
            {
                add(new Paragraph<>(text).setTextOnly(true));
            }
            if (suffix != null)
            {
                suffix.asAttributeBase().addAttribute("slot", "suffix");
                add(suffix);
            }

            if (!Strings.isNullOrEmpty(backgroundColourHover))
            {
                addStyle("--background-color-current", backgroundColourCurrent);
            }
            if (!Strings.isNullOrEmpty(backgroundColourHover))
            {
                addStyle("--background-color-hover", backgroundColourHover);
            }
            if (!Strings.isNullOrEmpty(textColourCurrent))
            {
                addStyle("--text-color-current", textColourCurrent);
            }
            if (!Strings.isNullOrEmpty(textColourHover))
            {
                addStyle("--text-color-hover", textColourHover);
            }
        }
        super.init();
    }


}
