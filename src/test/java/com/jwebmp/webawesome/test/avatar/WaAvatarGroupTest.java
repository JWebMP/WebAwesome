package com.jwebmp.webawesome.test.avatar;

import com.jwebmp.webawesome.components.avatar.WaAvatar;
import com.jwebmp.webawesome.components.avatar.WaAvatarGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaAvatarGroupTest
{

    @Test
    void renderAfterTag()
    {
        var s = new WaAvatarGroup().add(new WaAvatar().setLabel("Avatar 1")).toString(true);
        System.out.println(s);
    }
}