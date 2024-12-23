package com.jwebmp.webawesome.components.animation;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.easingeffects.JQEasingEffects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaAnimation extends DivSimple<WaAnimation>
{
    private Animation animation;
    private JQEasingEffects easingEffect;
    private boolean play;
    private int delay;
    private PlaybackDirection direction;
    private int duration;
    private int endDelay;
    private FillMode fill;
    private String iterations;
    private int iterationStart;
    //private KeyFrame[] keyFrames;
    private int playbackRate;

    public WaAnimation()
    {
        setTag("wa-animation");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (play)
                addAttribute("play", "");
            if (animation != null)
            {
                addAttribute("animation", animation.toString());
            }
            if (easingEffect != null)
                addAttribute("easing", easingEffect.toString());
            if (delay > 0)
                addAttribute("delay", delay + "");
            if (duration > 0)
                addAttribute("duration", duration + "");
            if (direction != null)
                addAttribute("direction", direction.toString());
            if (endDelay > 0)
                addAttribute("endDelay", endDelay + "");
            if (fill != null)
                addAttribute("fill", fill.toString());
            if (iterations != null)
                addAttribute("iterations", iterations);
            if (iterationStart > 0)
                addAttribute("iterationStart", iterationStart + "");
            if (playbackRate > 0)
                addAttribute("playbackRate", playbackRate + "");
        }
        super.init();
    }

}
