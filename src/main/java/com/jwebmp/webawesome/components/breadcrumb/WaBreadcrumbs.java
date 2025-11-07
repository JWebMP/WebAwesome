package com.jwebmp.webawesome.components.breadcrumb;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

/**
 * Wrapper for the <wa-breadcrumbs> component as referenced in the 3.0.0 docs.
 * This class mirrors WaBreadcrumb but uses the plural tag name expected by the docs
 * and supports an accessible label. For advanced usage such as custom separators,
 * use WaBreadcrumb + WaBreadcrumbItem directly.
 */
@Getter
@Setter
public class WaBreadcrumbs<J extends WaBreadcrumbs<J>> extends DivSimple<J>
{
    /**
     * Optional global separator projected before items
     */
    private IComponentHierarchyBase<?, ?> separator;

    /**
     * Screen-reader label for accessibility
     */
    private String label;

    public WaBreadcrumbs()
    {
        setTag("wa-breadcrumbs");
    }

    public WaBreadcrumbs(String label)
    {
        this();
        this.label = label;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (separator != null)
            {
                separator.asAttributeBase().addAttribute("slot", "separator");
                // Ensure the separator appears before any items
                add(0, separator);
            }
            if (label != null)
            {
                addAttribute("label", label);
            }
        }
        super.init();
    }
}
