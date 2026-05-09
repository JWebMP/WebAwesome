package com.jwebmp.webawesome.components.animatedimage;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
/**
 * The WaAnimatedImage component provides a way to display animated images (GIF or WEBP)
 * with play/pause controls.
 */
@Getter
@NgImportReference(value = "WaAnimatedImageDirective", reference = "angular-awesome")
@NgImportModule("WaAnimatedImageDirective")
public class WaAnimatedImage<J extends WaAnimatedImage<J>> extends DivSimple<J>
{
    /**
     * Plays the animation. When this attribute is removed, the animation will pause.
     */
    private boolean play;

    /**
     * The URL of the image (GIF or WEBP)
     */
    private String src;

    /**
     * Alternative text for accessibility
     */
    private String alt;

    /**
     * Size of the control icons
     */
    private String iconSize;

    /**
     * Size of the control box
     */
    private String controlBoxSize;

    /**
     * Creates a new WaAnimatedImage component
     */
    @SuppressWarnings("unchecked")
    public J setPlay(boolean play)
    {
        this.play = play;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSrc(String src)
    {
        this.src = src;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAlt(String alt)
    {
        this.alt = alt;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setIconSize(String iconSize)
    {
        this.iconSize = iconSize;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setControlBoxSize(String controlBoxSize)
    {
        this.controlBoxSize = controlBoxSize;
        return (J) this;
    }    public WaAnimatedImage()
    {
        setTag("wa-animated-image");
    }

    /**
     * Creates a new WaAnimatedImage component with the specified image source
     *
     * @param src The URL of the image (GIF or WEBP)
     */
    public WaAnimatedImage(String src)
    {
        this();
        this.src = src;
    }

    /**
     * Creates a new WaAnimatedImage component with the specified image source and alt text
     *
     * @param src The URL of the image (GIF or WEBP)
     * @param alt Alternative text for accessibility
     */
    public WaAnimatedImage(String src, String alt)
    {
        this(src);
        this.alt = alt;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (src != null)
            {
                addAttribute("src", src);
            }
            if (alt != null)
            {
                addAttribute("alt", alt);
            }
            if (play)
            {
                addAttribute("play", "");
            }
            if (iconSize != null)
            {
                addStyle("--icon-size", iconSize);
            }
            if (controlBoxSize != null)
            {
                addStyle("--control-box-size", controlBoxSize);
            }
        }
        super.init();
    }
}
