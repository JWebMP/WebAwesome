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

    private TooltipPlacement placement;
    private Boolean noArrow;

    private String maxWidth;
    private Boolean hoist;

    private Integer distance;
    private Boolean open;
    private Integer skidding;

    private Integer showDelay;
    private Integer hideDelay;

    public WaTooltip()
    {
        setTag("wa-tooltip");
    }

    public WaTooltip(IComponentHierarchyBase<?, ?> component)
    {
        setTag("wa-tooltip");
        setForId(component.asBase().getID());
    }


    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (forId != null)
            {
                addAttribute("for", forId);
            }
            if (placement != null)
            {
                addAttribute("placement", placement.toString());
            }
            if (noArrow != null && noArrow)
            {
                addStyle("--wa-tooltip-arrow-size", "0");
            }
            if (maxWidth != null)
            {
                addStyle("--max-width", maxWidth);
            }
            if (hoist != null && hoist)
            {
                addAttribute("hoist", "");
            }

            if (distance != null)
            {
                addAttribute("distance", distance.toString());
            }
            if (open != null && open)
            {
                addAttribute("open", "");
            }
            if (skidding != null)
            {
                addAttribute("skidding", skidding.toString());
            }
            if (showDelay != null)
            {
                addAttribute("show-delay", showDelay.toString());
            }
            if (hideDelay != null)
            {
                addAttribute("hide-delay", hideDelay.toString());
            }
        }
        super.init();
    }
}
