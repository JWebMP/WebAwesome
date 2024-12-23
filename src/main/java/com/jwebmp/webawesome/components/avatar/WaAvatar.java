package com.jwebmp.webawesome.components.avatar;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Shapes;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaAvatar extends DivSimple<WaAvatar>
{
    /**
     * The label to show
     */
    private String label;
    /**
     * The URL of the image
     */
    private String image;
    /**
     * If the avatar is lazy loaded
     */
    private Boolean lazy;
    /**
     * If initials must be shown
     */
    private String initials;
    /**
     * An icon to show instead
     */
    private WaIcon icon;
    /**
     * Change the shape of the avatar
     */
    private Shapes shape;

    public WaAvatar()
    {
        setTag("wa-avatar");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (label != null)
                addAttribute("label", label);
            if (image != null)
                addAttribute("image", image);
            if (lazy != null && lazy)
            {
                addAttribute("loading", "lazy");
            }
            if (initials != null)
            {
                addAttribute("initials", initials);
            }
            if (icon != null)
            {
                add(icon);
            }
            if (shape != null)
            {
                addAttribute("shape", shape.toString().toLowerCase());
            }
        }
        super.init();
    }

}
