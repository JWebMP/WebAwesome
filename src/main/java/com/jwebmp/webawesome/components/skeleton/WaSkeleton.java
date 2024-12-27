package com.jwebmp.webawesome.components.skeleton;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaSkeleton extends DivSimple<WaSkeleton>
{
    private String colour;
    private String sheenColour;
    private String borderRadius;

    public WaSkeleton()
    {
        setTag("wa-skeleton");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(colour))
            {
                addStyle("--color", colour);
            }
            if (!Strings.isNullOrEmpty(sheenColour))
            {
                addStyle("--sheen-color", sheenColour);
            }
            if (!Strings.isNullOrEmpty(borderRadius))
            {
                addStyle("--border-radius", borderRadius);
            }
        }
        super.init();
    }
}
