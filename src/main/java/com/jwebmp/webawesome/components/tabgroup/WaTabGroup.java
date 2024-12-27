package com.jwebmp.webawesome.components.tabgroup;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaTabGroup extends DivSimple<WaTabGroup>
{
    private String active;
    private TabPlacement placement;
    private Boolean noScrollControls;

    private String indicatorColour;
    private String trackColour;
    private String trackWidth;

    public WaTabGroup()
    {
        setTag("wa-tab-group");
    }

    public WaTabGroup addPanel(WaTabPanel panel, boolean active)
    {
        WaTab tab = new WaTab();
        add(tab);
        add(panel);
        return this;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(active))
            {
                addAttribute("active", active);
            }
            if (placement != null)
            {
                addAttribute("placement", placement.toString().toLowerCase());
            }
            if (noScrollControls != null && noScrollControls)
            {
                addAttribute("no-scroll-controls", "");
            }
            if (!Strings.isNullOrEmpty(indicatorColour))
            {
                addStyle("--indicator-color", indicatorColour);
            }
            if (!Strings.isNullOrEmpty(trackColour))
            {
                addStyle("--track-color", trackColour);
            }
            if (!Strings.isNullOrEmpty(trackWidth))
            {
                addStyle("--track-width", trackWidth);
            }
        }
        super.init();
    }
}
