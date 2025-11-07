package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.Shapes;
import com.jwebmp.webawesome.components.avatar.WaAvatar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaAvatarTest {

    @Test
    void rendersWaAvatarWithLabelImageLazyInitialsAndShape() {
        Page<?> p = new Page<>();

        WaAvatar<?> avatar = new WaAvatar<>()
                .setLabel("Jane Doe")
                .setImage("/img/jane.png")
                .setLazy(true)
                .setInitials("JD")
                .setShape(Shapes.Circle);

        p.getBody().add(avatar);
        String html = p.toString(true);
        System.out.println(html);

        Assertions.assertTrue(html.contains("<wa-avatar"), "Should render wa-avatar tag");
        Assertions.assertTrue(html.contains("label=\"Jane Doe\""), "Label should render");
        Assertions.assertTrue(html.contains("image=\"/img/jane.png\""), "Image attribute should render");
        Assertions.assertTrue(html.contains("loading=\"lazy\""), "Lazy should render as loading=\"lazy\"");
        Assertions.assertTrue(html.contains("initials=\"JD\""), "Initials should render");
        Assertions.assertTrue(html.contains("shape=\"circle\""), "Shape should render in lowercase");
    }
}
