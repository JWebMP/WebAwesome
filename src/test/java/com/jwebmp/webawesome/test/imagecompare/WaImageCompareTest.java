package com.jwebmp.webawesome.test.imagecompare;

import com.jwebmp.core.base.html.Image;
import com.jwebmp.webawesome.components.imagecompare.WaImageCompare;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaImageCompareTest
{
    @Test
    public void rendersBasicImageCompare()
    {
        var before = new Image("before.jpg");
        var after = new Image("after.jpg");
        var html = new WaImageCompare<>()
                .setBefore(before)
                .setAfter(after)
                .toString(true);
        System.out.println(html);

        assertTrue(html.startsWith("<wa-image-compare"));
        assertTrue(html.contains("slot=\"before\""));
        assertTrue(html.contains("slot=\"after\""));
    }

    @Test
    public void supportsPropsAndHandleSlotAndBindings()
    {
        var handle = new WaIcon<>("grip-lines");
        var html = new WaImageCompare<>()
                .setPosition("35")
                .setDisabled(true)
                .setHandle(handle)
                .bindPosition("pos")
                .bindDisabled("isDisabled")
                .toString(true);
        System.out.println(html);

        assertTrue(html.contains("position=\"35\""));
        assertTrue(html.contains("disabled"));
        assertTrue(html.contains("slot=\"handle\""));
        assertTrue(html.contains("[position]=\"pos\""));
        assertTrue(html.contains("[disabled]=\"isDisabled\""));
    }
}
