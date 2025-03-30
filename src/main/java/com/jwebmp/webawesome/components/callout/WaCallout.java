package com.jwebmp.webawesome.components.callout;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Variant;
import com.jwebmp.webawesome.components.button.Appearance;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaCallout extends DivSimple<WaCallout>
{
    private WaIcon<?> icon;
    private Variant variant;
    private Appearance appearance;

    public WaCallout()
    {
        setTag("wa-callout");
        setRenderTextBeforeChildren(false);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            add(icon);
            if (variant != null)
            {
                addAttribute("variant", variant.toString().toLowerCase());
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString().toLowerCase());
            }
        }
        super.init();
    }
}
