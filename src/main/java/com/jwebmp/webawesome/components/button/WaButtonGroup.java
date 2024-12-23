package com.jwebmp.webawesome.components.button;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.servlets.enumarations.Orientation;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaButtonGroup extends DivSimple<WaButtonGroup>
{
    private Size size;
    private String label;
    private Orientation orientation;

    public WaButtonGroup()
    {
        setTag("wa-button-group");
    }

    @Override
    protected void init()
    {
        if (isInitialized())
        {
            if (size != null)
            {
                addAttribute("size", size.toString().toLowerCase());
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (orientation != null)
            {
                addAttribute("orientation", orientation.toString().toLowerCase());
            }

        }
        super.init();
    }


}
