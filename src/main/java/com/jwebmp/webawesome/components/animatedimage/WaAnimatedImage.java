package com.jwebmp.webawesome.components.animatedimage;

import com.jwebmp.core.base.html.Image;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaAnimatedImage extends Image<WaAnimatedImage> {

    /**
     * Plays the animation. When this attribute is remove, the animation will pause.
     */
    private boolean play;

    public WaAnimatedImage() {
        setTag("wa-animated-image");
    }

    public WaAnimatedImage(String image) {
        super(image);
        setTag("wa-animated-image");
    }
}
