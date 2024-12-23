package com.jwebmp.webawesome.components.include;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaInclude extends DivSimple<WaInclude>
{
    private String source;
    private CorsMode corsMode;
    private Boolean allowScripts;

    public WaInclude()
    {
        setTag("wa-include");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            addAttribute("src", source);
            if (corsMode != null)
            {
                addAttribute("mode", corsMode.toString().toLowerCase());
            }
            if (allowScripts != null && allowScripts)
            {
                addAttribute("allow-scripts", allowScripts.toString());
            }
        }
        super.init();
    }
}
