package com.jwebmp.webawesome.components.splitpanel;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WaSplitPanel extends DivSimple<WaSplitPanel>
{
    private IComponentHierarchyBase<?, ?> start;
    private IComponentHierarchyBase<?, ?> end;

    private Integer position;
    private Integer positionInPixels;

    private Boolean vertical;

    private List<String> snapAt;
    private Integer snapThreshold;

    private Boolean disabled;

    private String min;
    private String max;

    private WaIcon<?> dividerIcon;


    public WaSplitPanel()
    {
        setTag("wa-split-panel");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (dividerIcon != null)
            {
                dividerIcon.addAttribute("slot", "divider");
                add(dividerIcon);
            }
            if (start != null)
            {
                start.asAttributeBase().addAttribute("slot", "start");
                add(start);
            }
            if (end != null)
            {
                end.asAttributeBase().addAttribute("slot", "end");
                add(end);
            }

            if (positionInPixels != null)
            {
                addAttribute("position-in-pixels", String.valueOf(positionInPixels));
            }
            if (position != null)
            {
                addAttribute("position", String.valueOf(position));
            }
            if (vertical != null && vertical)
            {
                addAttribute("vertical", "");
            }
            if (snapAt != null)
            {
                addAttribute("snap-at", String.join(" ", snapAt));
            }
            if (snapThreshold != null)
            {
                addAttribute("snap-threshold", String.valueOf(snapThreshold));
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (min != null)
            {
                addStyle("--min", min);
            }
            if (max != null)
            {
                addStyle("--max", max);
            }

        }
        super.init();
    }
}
