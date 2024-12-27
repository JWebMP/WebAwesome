package com.jwebmp.webawesome.components.tree;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaTreeItem extends DivSimple<WaTreeItem>
{
    private Boolean selected;
    private Boolean expanded;
    private Boolean disabled;
    private Boolean lazyLoading;

    private WaIcon<?> expandIcon;
    private WaIcon<?> collapseIcon;

    public WaTreeItem()
    {
        setTag("wa-tree-item");
        setRenderTextBeforeChildren(true);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (selected != null && selected)
            {
                addAttribute("selected", "");
            }
            if (expanded != null && expanded)
            {
                addAttribute("expanded", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (lazyLoading != null && lazyLoading)
            {
                addAttribute("lazy", "");
            }
            if (expandIcon != null)
            {
                expandIcon.addAttribute("slot", "expand-icon");
                add(expandIcon);
            }
            if (collapseIcon != null)
            {
                collapseIcon.addAttribute("slot", "collapse-icon");
                add(collapseIcon);
            }
        }
        super.init();
    }

    public WaTreeItem bindSelected(String variableName)
    {
        addAttribute("[attrs.selected]", variableName);
        return this;
    }

    public WaTreeItem bindExpanded(String variableName)
    {
        addAttribute("[attrs.expanded]", variableName);
        return this;
    }

    public WaTreeItem bindDisabled(String variableName)
    {
        addAttribute("[attrs.disabled]", variableName);
        return this;
    }

    public WaTreeItem bindLazyLoading(String variableName)
    {
        addAttribute("[attrs.lazy]", variableName);
        return this;
    }

    
}
