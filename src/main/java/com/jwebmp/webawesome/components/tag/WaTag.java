package com.jwebmp.webawesome.components.tag;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.Variant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaTag extends DivSimple<WaTag>
{
    private Variant variant;
    private Size size;
    private Boolean pill;
    private Boolean removable;

    public WaTag()
    {
        setTag("wa-tag");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (variant != null)
            {
                addAttribute("variant", variant.toString().toLowerCase());
            }
            if (size != null)
            {
                addAttribute("size", size.toString().toLowerCase());
            }
            if (pill != null && pill)
            {
                addAttribute("pill", "");
            }
            if (removable != null && removable)
            {
                addAttribute("removable", "");
            }
        }
        super.init();
    }
}
