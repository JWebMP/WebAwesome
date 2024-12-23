package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.tooltip.WaTooltip;

public interface TooltipCapable<J extends TooltipCapable<J>> extends WaComponent<J>
{
    default J withTooltip(String text)
    {
        WaTooltip tooltip = new WaTooltip((IComponentHierarchyBase<?, ?>) this);
        tooltip.setText(text);
        add(tooltip);
        return (J) this;
    }
    
}
