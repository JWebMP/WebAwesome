package com.jwebmp.webawesome.components.breadcrumb;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaBreadcrumb extends DivSimple<WaBreadcrumb>
{
    private IComponentHierarchyBase<?, ?> separator;

    public WaBreadcrumb()
    {
        setTag("wa-breadcrumb");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (separator != null)
            {
                separator.asAttributeBase().addAttribute("slot", "separator");
                add(0, separator);
            }
        }
        super.init();
    }
}
