package com.jwebmp.webawesome.components.breadcrumb;

import com.jwebmp.core.base.html.DivSimple;

/**
 * A simple helper element that renders as a breadcrumb separator.
 * When added to breadcrumbs, it will be projected via slot="separator".
 */
public class BreadcrumbSeparator<J extends BreadcrumbSeparator<J>> extends DivSimple<J>
{
    public BreadcrumbSeparator()
    {
        // neutral tag by default; consumers can set text or add children
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            asAttributeBase().addAttribute("slot", "separator");
        }
        super.init();
    }
}
