package com.jwebmp.webawesome.components.relativetime;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaRelativeTime extends DivSimple<WaRelativeTime>
{
    private Boolean sync;
    private String date;

    public WaRelativeTime()
    {
        setTag("wa-relative-time");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (sync != null && sync)
            {
                addAttribute("sync", "");
            }
            if (!Strings.isNullOrEmpty(date))
            {
                addAttribute("date", date);
            }
        }
        super.init();
    }

    @Override
    public WaRelativeTime bind(String variableName)
    {
        addAttribute("[attrs.date]", variableName);
        return this;
    }
    
}
