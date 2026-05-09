package com.jwebmp.webawesome.components.avatar;


import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.ShadowTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.TypographyTokenCapable;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Shapes;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
@Getter
@NgImportReference(value = "WaAvatarDirective", reference = "angular-awesome")
@NgImportModule("WaAvatarDirective")
public class WaAvatar<J extends WaAvatar<J>> extends DivSimple<J> implements BorderTokenCapable<J>, ShadowTokenCapable<J>, SpaceTokenCapable<J>, TypographyTokenCapable<J>
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
    @SuppressWarnings("unchecked")
    public J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setImage(String image)
    {
        this.image = image;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setLazy(Boolean lazy)
    {
        this.lazy = lazy;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setInitials(String initials)
    {
        this.initials = initials;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setIcon(WaIcon icon)
    {
        this.icon = icon;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setShape(Shapes shape)
    {
        this.shape = shape;
        return (J) this;
    }
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
            {
                addAttribute("label", label);
            }
            if (image != null)
            {
                addAttribute("image", image);
            }
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
                addAttribute("shape", shape.toString());
            }
        }
        super.init();
    }

}
