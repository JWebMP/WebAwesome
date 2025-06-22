package com.jwebmp.webawesome.test.avatar;

import com.jwebmp.webawesome.components.avatar.WaAvatar;
import com.jwebmp.webawesome.components.avatar.WaAvatarGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaAvatarGroupTest
{

    @Test
    public void testRenderAvatarGroupHtml()
    {
        var s = new WaAvatarGroup<>().add(new WaAvatar<>().setLabel("Avatar 1"))
                                   .toString(true);
        System.out.println(s);

        assertEquals("""
                <div class="wa-avatar-group">
                	<wa-avatar label="Avatar 1"></wa-avatar>
                </div><style type="text/css">.wa-avatar-group wa-avatar:not(:first-of-type) {
                    margin-left: calc(-1 * var(--wa-space-m));
                  }

                  .wa-avatar-group wa-avatar::part(base) {
                    border: solid 2px var(--wa-color-surface-default);
                  }</style>""", s);
    }
}
