package com.jwebmp.webawesome.components.icon;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaIconButton extends WaIcon<WaIconButton>
{
    private String href;
    private String target;

    private String download;

    public WaIconButton()
    {
        setTag("wa-icon-button");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (href != null)
            {
                addAttribute("href", href);
            }
            if (target != null)
            {
                addAttribute("target", target);
            }
            if (download != null)
            {
                addAttribute("download", download);
            }
        }
        super.init();
    }


}
