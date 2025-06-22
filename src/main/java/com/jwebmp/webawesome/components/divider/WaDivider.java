package com.jwebmp.webawesome.components.divider;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NgImportReference(value = "WaDividerDirective", reference = "angular-awesome")
@NgImportModule("WaDividerDirective")
public class WaDivider<J extends WaDivider<J>> extends DivSimple<J>
{
    private String color;
    private String width;
    private String spacing;

    private Boolean vertical;

    public WaDivider()
    {
        setTag("wa-divider");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(color))
            {
                addStyle("--color", color);
            }
            if (!Strings.isNullOrEmpty(width))
            {
                addStyle("--width", width);
            }
            if (!Strings.isNullOrEmpty(spacing))
            {
                addStyle("--spacing", spacing);
            }
            if (vertical != null)
            {
                addAttribute("vertical", "");
            }
        }
        super.init();
    }
}
