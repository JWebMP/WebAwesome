package com.jwebmp.webawesome.components.breadcrumb;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaBreadcrumbItem extends DivSimple<WaBreadcrumbItem>
{
    private IComponentHierarchyBase<?, ?> prefix;
    private IComponentHierarchyBase<?, ?> suffix;
    private String text;

    public WaBreadcrumbItem()
    {
        setTag("wa-breadcrumb-item");
    }

    public WaBreadcrumbItem(String text)
    {
        this();
        setText(text);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (prefix != null)
            {
                prefix.asAttributeBase().addAttribute("slot", "prefix");
                add(prefix);
            }
            if (!Strings.isNullOrEmpty(text))
            {
                add(new Paragraph<>(text).setTextOnly(true));
            }
            if (suffix != null)
            {
                suffix.asAttributeBase().addAttribute("slot", "suffix");
                add(suffix);
            }
        }
        super.init();
    }
}
