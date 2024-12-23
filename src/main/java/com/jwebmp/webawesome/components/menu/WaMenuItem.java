package com.jwebmp.webawesome.components.menu;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaMenuItem extends DivSimple<WaMenuItem>
{
    private IComponentHierarchyBase<?, ?> prefix;
    private IComponentHierarchyBase<?, ?> suffix;
    private String text;

    private Boolean disabled;
    private Boolean loading;

    private String value;

    public WaMenuItem()
    {
        setTag("wa-menu-item");
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
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (loading != null && loading)
            {
                addAttribute("loading", "");
            }
            if (!Strings.isNullOrEmpty(value))
            {
                addAttribute("value", value);
            }
        }
        super.init();
    }

    @Override
    public WaMenuItem bind(String variableName)
    {
        addAttribute("[attrs.value]", variableName);
        return this;
    }
}
