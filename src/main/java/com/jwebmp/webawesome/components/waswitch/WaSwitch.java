package com.jwebmp.webawesome.components.waswitch;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Size;

public class WaSwitch extends DivSimple<WaSwitch>
{
    private Boolean checked;
    private Boolean disabled;
    private Size size;
    private String hint;

    private String width;
    private String height;
    private String thumbsize;

    public WaSwitch()
    {
        setTag("wa-switch");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (checked != null)
            {
                addAttribute("checked", "");
            }
            if (disabled != null)
            {
                addAttribute("disabled", "");
            }
            if (size != null)
            {
                addAttribute("size", size.toString().toLowerCase());
            }
            if (hint != null)
            {
                addAttribute("hint", hint);
            }
            if (width != null)
            {
                addStyle("--width", width);
            }
            if (height != null)
            {
                addStyle("--height", height);
            }
            if (thumbsize != null)
            {
                addStyle("--thumb-size", thumbsize);
            }
        }
        super.init();
    }
}
