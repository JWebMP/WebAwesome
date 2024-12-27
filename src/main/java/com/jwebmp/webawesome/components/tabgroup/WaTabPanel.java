package com.jwebmp.webawesome.components.tabgroup;

import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaTabPanel extends DivSimple<WaTabPanel>
{
    private String name;

    public WaTabPanel()
    {
        setTag("wa-tab-panel");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            setName(name);
        }
        super.init();
    }
}
