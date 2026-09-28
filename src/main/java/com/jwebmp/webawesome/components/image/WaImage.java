package com.jwebmp.webawesome.components.image;

import com.jwebmp.core.base.html.Image;
import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;

/**
 * An ordinary HTML image for WebAwesome-authored pages.
 * <p>
 * Web Awesome has no {@code <wa-image>} element. This wrapper keeps the
 * native {@code <img>} semantics and adds the Web Awesome design-token helpers.
 * Use {@link com.jwebmp.webawesome.components.animatedimage.WaAnimatedImage}
 * when an animated GIF or WEBP needs playback controls.
 */
public class WaImage<J extends WaImage<J>> extends Image<J>
        implements SpaceTokenCapable<J>, BorderTokenCapable<J>
{
    public WaImage()
    {
        super();
    }

    public WaImage(String src)
    {
        super(src);
    }

    public WaImage(String src, String alt)
    {
        this(src);
        setAlt(alt);
    }

    @SuppressWarnings("unchecked")
    public J setSrc(String src)
    {
        addAttribute("src", src);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setAlt(String alt)
    {
        addAttribute("alt", alt);
        return (J) this;
    }
}
