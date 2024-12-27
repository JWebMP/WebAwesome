package com.jwebmp.webawesome.components.radio;

import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaRadioButton extends WaRadio
{
    private Boolean asPill;
    private IComponentHierarchyBase<?, ?> prefix;
    private IComponentHierarchyBase<?, ?> suffix;
    private String text;

    private Boolean disabled;
    private String value;


    public WaRadioButton()
    {
        setTag("wa-radio-button");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (asPill != null && asPill)
            {
                addAttribute("as-pill", "");
            }
            if (prefix != null)
            {
                add(prefix);
            }
            if (text != null)
            {
                add(new Paragraph<>(text));
            }
            if (suffix != null)
            {
                add(suffix);
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (value != null)
            {
                addAttribute("value", value);
            }
        }
        super.init();
    }

    @Override
    public WaRadioButton setText(String text)
    {
        this.text = text;
        return this;
    }
}
