package com.jwebmp.webawesome.test.animation;

import com.jwebmp.webawesome.components.animation.Animation;
import com.jwebmp.webawesome.components.animation.FillMode;
import com.jwebmp.webawesome.components.animation.PlaybackDirection;
import com.jwebmp.webawesome.components.animation.WaAnimation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaAnimationTest
{
    @Test
    public void testRenderAnimationHtml()
    {
        var s = new WaAnimation(Animation.bounce, true)
                .setDuration(1000)
                .setIterations("3")
                .setFill(FillMode.forwards)
                .setDirection(PlaybackDirection.alternate)
                .toString(true);

        System.out.println(s);

        assertEquals("""
                <wa-animation direction="alternate" duration="1000" fill="forwards" iterations="3" name="bounce" play></wa-animation>""", s);
    }

    @Test
    public void testRenderAnimationWithChildHtml()
    {
        var s = new WaAnimation(Animation.rubberBand)
                .setDuration(2000)
                .add(new com.jwebmp.core.base.html.Div<>().addClass("box"))
                .toString(true);

        System.out.println(s);

        assertEquals("""
                <wa-animation duration="2000" name="rubberBand">
                	<div class="box"></div>
                </wa-animation>""", s);
    }

    @Test
    public void testRenderAnimationWithStylesHtml()
    {
        var s = new WaAnimation(Animation.fadeIn)
                .setIconSize("1.5rem")
                .setControlBoxSize("2.5rem")
                .toString(true);

        System.out.println(s);

        assertEquals("""
                <wa-animation name="fadeIn" style="--control-box-size:2.5rem;--icon-size:1.5rem;"></wa-animation>""", s);
    }
}
