package com.jwebmp.webawesome.components.tooltip;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaTooltip extends DivSimple<WaTooltip>
{
    private String forId;

    public WaTooltip()
    {
        setTag("wa-tooltip");
    }

    public WaTooltip(IComponentHierarchyBase<?, ?> component)
    {
        setTag("wa-tooltip");
        setForId(component.asBase().getID());
    }


}
