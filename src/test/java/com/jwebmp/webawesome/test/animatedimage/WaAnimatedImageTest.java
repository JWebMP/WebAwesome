package com.jwebmp.webawesome.test.animatedimage;

import com.jwebmp.webawesome.components.animatedimage.WaAnimatedImage;
import com.jwebmp.webawesome.components.animatedimage.WaAnimatedImagePlayIconSlot;
import com.jwebmp.webawesome.components.animatedimage.WaAnimatedImagePauseIconSlot;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaAnimatedImageTest
{
    @Test
    public void testRenderAnimatedImageHtml()
    {
        var playIcon = new WaAnimatedImagePlayIconSlot().add(new WaIcon<>().setName("play"));
        var pauseIcon = new WaAnimatedImagePauseIconSlot().add(new WaIcon<>().setName("pause"));

        var s = new WaAnimatedImage("test-image.gif")
                .add(playIcon)
                .add(pauseIcon)
                .toString(true);

        System.out.println(s);

        assertEquals("""
                <wa-animated-image src="test-image.gif">
                	<div slot="play-icon">
                		<wa-icon name="play"></wa-icon>
                	</div>
                	<div slot="pause-icon">
                		<wa-icon name="pause"></wa-icon>
                	</div>
                </wa-animated-image>""", s);
    }
}