package com.jwebmp.webawesome.test.randomcontent;

import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.webawesome.components.randomcontent.RandomContentAnimation;
import com.jwebmp.webawesome.components.randomcontent.RandomContentMode;
import com.jwebmp.webawesome.components.randomcontent.WaRandomContent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaRandomContentTest
{
    @Test
    public void testRenderBasicRandomContentHtml()
    {
        var s = new WaRandomContent<>()
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-random-content></wa-random-content>", s);
    }

    @Test
    public void testRenderWithItemsHtml()
    {
        var s = new WaRandomContent<>()
                .setItems(3)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-random-content items=\"3\"></wa-random-content>", s);
    }

    @Test
    public void testRenderWithModeHtml()
    {
        var s = new WaRandomContent<>()
                .setMode(RandomContentMode.SEQUENCE)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-random-content mode=\"sequence\"></wa-random-content>", s);
    }

    @Test
    public void testRenderAllModeValues()
    {
        assertEquals("random", RandomContentMode.RANDOM.toString());
        assertEquals("unique", RandomContentMode.UNIQUE.toString());
        assertEquals("sequence", RandomContentMode.SEQUENCE.toString());
    }

    @Test
    public void testRenderWithAutoplayHtml()
    {
        var s = new WaRandomContent<>()
                .setAutoplay(true)
                .setAutoplayInterval(5000)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-random-content autoplay autoplay-interval=\"5000\"></wa-random-content>", s);
    }

    @Test
    public void testAutoplayFalseOmitted()
    {
        var s = new WaRandomContent<>()
                .setAutoplay(false)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-random-content></wa-random-content>", s);
        assertFalse(s.contains("autoplay"));
    }

    @Test
    public void testRenderWithAnimationHtml()
    {
        var s = new WaRandomContent<>()
                .setAnimation(RandomContentAnimation.FADE_UP)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-random-content animation=\"fade-up\"></wa-random-content>", s);
    }

    @Test
    public void testRenderAllAnimationValues()
    {
        assertEquals("none", RandomContentAnimation.NONE.toString());
        assertEquals("fade", RandomContentAnimation.FADE.toString());
        assertEquals("fade-up", RandomContentAnimation.FADE_UP.toString());
        assertEquals("fade-down", RandomContentAnimation.FADE_DOWN.toString());
        assertEquals("fade-left", RandomContentAnimation.FADE_LEFT.toString());
        assertEquals("fade-right", RandomContentAnimation.FADE_RIGHT.toString());
    }

    @Test
    public void testRenderWithCssVariablesHtml()
    {
        var s = new WaRandomContent<>()
                .setAnimationDuration("300ms")
                .setAnimationEasing("ease")
                .setAnimationTranslate("0.5em")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-random-content style=\"--animation-duration:300ms;--animation-easing:ease;--animation-translate:0.5em;\"></wa-random-content>", s);
    }

    @Test
    public void testRenderWithContentChangeEventHtml()
    {
        var s = new WaRandomContent<>()
                .setContentChangeEvent("onContentChange()")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-random-content wa-content-change=\"onContentChange()\"></wa-random-content>", s);
        assertEquals("wa-content-change", WaRandomContent.EVENT_CONTENT_CHANGE);
    }

    @Test
    public void testRandomizeReturnsSelf()
    {
        var component = new WaRandomContent<>();
        assertSame(component, component.randomize());
    }

    @Test
    public void testRenderWithChildrenHtml()
    {
        var random = new WaRandomContent<>()
                .setItems(1)
                .setMode(RandomContentMode.UNIQUE);
        random.add(new Paragraph<>("First"));
        random.add(new Paragraph<>("Second"));

        var s = random.toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-random-content items=\"1\" mode=\"unique\">"));
        assertTrue(s.contains("First"));
        assertTrue(s.contains("Second"));
    }

    @Test
    public void testRenderAllAttributesHtml()
    {
        var s = new WaRandomContent<>()
                .setItems(2)
                .setMode(RandomContentMode.RANDOM)
                .setAutoplay(true)
                .setAutoplayInterval(4000)
                .setAnimation(RandomContentAnimation.FADE)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-random-content animation=\"fade\" autoplay autoplay-interval=\"4000\" items=\"2\" mode=\"random\"></wa-random-content>", s);
    }
}
