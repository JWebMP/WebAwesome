package com.jwebmp.webawesome.components.avatar;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Style;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;

public class WaAvatarGroup extends Div<WaAvatar, NoAttributes, GlobalFeatures, GlobalEvents, WaAvatarGroup>
{
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
                .avatar-group wa-avatar:not(:first-of-type) {
                    margin-left: calc(-1 * var(--wa-space-m));
                  }
                
                  .avatar-group wa-avatar::part(base) {
                    border: solid 2px var(--wa-color-surface-default);
                  }""").toString(true));
        return sp;
    }
}
