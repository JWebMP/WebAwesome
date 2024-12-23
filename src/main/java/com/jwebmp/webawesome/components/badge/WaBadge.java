package com.jwebmp.webawesome.components.badge;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Variant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaBadge extends DivSimple<WaBadge>
{
    private Variant variant;

    private Boolean asPill;
    private Boolean pulsating;

    public WaBadge()
    {
        setTag("wa-badge");
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
            if (asPill != null && asPill)
            {
                addAttribute("pill", "");
            }
            if (pulsating != null && pulsating)
            {
                addAttribute("pulse", "");
            }
        }
        super.init();
    }


}
