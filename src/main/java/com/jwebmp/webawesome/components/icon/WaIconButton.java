package com.jwebmp.webawesome.components.icon;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NgImportReference(value = "WaIconButtonDirective", reference = "angular-awesome")
@NgImportModule("WaIconButtonDirective")
public class WaIconButton<J extends WaIconButton<J>> extends WaIcon<J>
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
