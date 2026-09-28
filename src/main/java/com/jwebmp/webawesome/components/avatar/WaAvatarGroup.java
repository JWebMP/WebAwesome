package com.jwebmp.webawesome.components.avatar;


import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Style;

/**
 * The WaAvatarGroup component is used to display a group of avatars with overlapping effect.
 * It automatically applies styling to create a stacked appearance with proper spacing and borders.
 * <p>
 * This component is a container for WaAvatar components and renders as a div with the "wa-avatar-group" class.
 */
public class WaAvatarGroup<J extends WaAvatarGroup<J>> extends DivSimple<J> implements SpaceTokenCapable<J>
{
    /**
     * Creates a new WaAvatarGroup with the "wa-avatar-group" class
     */
    public WaAvatarGroup()
    {
        addClass("wa-avatar-group");
    }

    @Override
    protected StringBuilder renderAfterTag()
    {
        var sp = super.renderAfterTag();
        if (sp == null)
        {
            sp = new StringBuilder();
        }
        sp.append(new Style<>().setText("""
                                       .wa-avatar-group wa-avatar:not(:first-of-type) {
                                           margin-left: calc(-1 * var(--wa-space-m));
                                         }
                                       
                                         .wa-avatar-group wa-avatar::part(base) {
                                           border: solid 2px var(--wa-color-surface-default);
                                         }""")
                               .toString(true));
        return sp;
    }
}
