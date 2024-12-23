package com.jwebmp.webawesome.components.imagecompare;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Image;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaImageCompare extends DivSimple<WaImageCompare>
{
    private Image<?> image1;
    private Image<?> image2;

    private WaIcon<?> icon;

    private Integer position;

    public WaImageCompare()
    {
        setTag("wa-image-compare");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (image1 != null)
            {
                add(image1);
                image1.asAttributeBase().addAttribute("slot", "before");
            }
            if (image2 != null)
            {
                add(image2);
                image2.asAttributeBase().addAttribute("slot", "after");
            }

            if (position != null)
            {
                addAttribute("position", position.toString().toLowerCase());
            }

            if (icon != null)
            {
                icon.asAttributeBase().addAttribute("slot", "handle");
                add(icon);
            }
        }
        super.init();
    }
}
