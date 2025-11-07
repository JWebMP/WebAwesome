package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.WaFrame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaFrameTest {

    @Test
    void rendersWaFrameWithAspectRatio() {
        Page<?> p = new Page<>();
        WaFrame frame = new WaFrame().setAspectRatio("16 / 9");
        p.getBody().add(frame);
        String html = p.toString(true);
        System.out.println(html);
        Assertions.assertTrue(html.contains("wa-frame"), "Frame should have wa-frame class");
        Assertions.assertTrue(
                html.contains("aspect-ratio: 16 / 9") || html.contains("aspect-ratio:16/9") || html.contains("aspect-ratio:16 / 9") || html.contains("aspect-ratio: 16/9"),
                "Frame should set aspect-ratio to 16 / 9");
    }
}
