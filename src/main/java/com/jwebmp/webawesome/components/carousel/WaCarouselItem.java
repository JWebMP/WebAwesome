package com.jwebmp.webawesome.components.carousel;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Image;

public class WaCarouselItem extends DivSimple<WaCarouselItem>
{
    public WaCarouselItem()
    {
        setTag("wa-carousel-item");
    }

    public WaCarouselItem addImage(Image<?> image)
    {
        add(image);
        return this;
    }
}
