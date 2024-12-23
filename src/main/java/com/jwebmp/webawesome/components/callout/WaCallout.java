package com.jwebmp.webawesome.components.callout;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaCallout extends DivSimple<WaCallout>
{
    private WaIcon icon;

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
        }
        super.init();
    }
}
