package com.jwebmp.webawesome.components.divider;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaDivider extends DivSimple<WaDivider>
{
    private String colour;
    private String width;
    private String spacing;

    private Boolean vertical;

    public WaDivider()
    {
        setTag("wa-divider");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(colour))
                addStyle("--colour", colour);
            if (!Strings.isNullOrEmpty(width))
                addStyle("--width", width);
            if (!Strings.isNullOrEmpty(spacing))
                addStyle("--spacing", spacing);
            if (vertical != null)
                addAttribute("vertical", "");
        }
        super.init();
    }
}
