package com.jwebmp.webawesome.components.button;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.PlacementExtended;
import com.jwebmp.webawesome.components.menu.WaMenu;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaDropDown extends DivSimple<WaDropDown>
{
    private WaButton button;
    private WaMenu menu;

    private PlacementExtended placement;
    private Integer distance;
    private Integer skidding;

    private Boolean hoist;

    public WaDropDown()
    {
        setTag("wa-dropdown");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (button != null)
            {
                button.setCaret(true);
                button.addAttribute("slot", "trigger");
                add(button);
            }
            if (menu != null)
            {
                add(menu);
            }
            if (placement != null)
            {
                addAttribute("placement", placement.toString().toLowerCase());
            }
            if (distance != null)
            {
                addAttribute("distance", distance + "");
            }
            if (skidding != null)
            {
                addAttribute("skidding", skidding + "");
            }
            if (hoist != null && hoist)
            {
                addAttribute("hoist", "");
            }
        }
        super.init();
    }
}
