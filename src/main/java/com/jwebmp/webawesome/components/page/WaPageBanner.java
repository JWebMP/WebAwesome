package com.jwebmp.webawesome.components.page;


import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.TypographyTokenCapable;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.PageSize;

public class WaPageBanner<J extends WaPageBanner<J>> extends DivSimple<J> implements BorderTokenCapable<J>, SpaceTokenCapable<J>, TypographyTokenCapable<J>
{
    public WaPageBanner()
    {
        addAttribute("slot", "banner");
    }

    public @org.jspecify.annotations.NonNull J setShowWhenPageSize(PageSize pageSize)
    {
        addClass("wa-body-" + pageSize.getSize());
        return (J) this;
    }

}
