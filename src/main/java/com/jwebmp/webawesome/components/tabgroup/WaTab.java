package com.jwebmp.webawesome.components.tabgroup;

import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaTab extends DivSimple<WaTab>
{
    private String panel;
    private Boolean disabled;

    public WaTab()
    {
        setTag("wa-tab");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (panel != null)
            {
                addAttribute("panel", panel);
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
        }
        super.init();
    }
}
