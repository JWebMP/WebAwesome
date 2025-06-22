package com.jwebmp.webawesome.components.animation;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.easingeffects.JQEasingEffects;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaAnimation component provides a way to animate elements with predefined or custom animations.
 */
@Getter
@Setter
@NgImportReference(value = "WaAnimationDirective", reference = "angular-awesome")
@NgImportModule("WaAnimationDirective")
public class WaAnimation<J extends WaAnimation<J>> extends DivSimple<J>
{
    /**
     * The easing effect to use for the animation.
     */
    private JQEasingEffects easingEffect;

    /**
     * Whether the animation should play.
     */
    private boolean play;

    /**
     * The delay before the animation starts (in milliseconds).
     */
    private int delay;

    /**
     * The direction of the animation playback.
     */
    private PlaybackDirection direction;

    /**
     * The duration of the animation (in milliseconds).
     */
    private int duration;

    /**
     * The delay after the animation ends (in milliseconds).
     */
    private int endDelay;

    /**
     * The fill mode of the animation.
     */
    private FillMode fill;

    /**
     * The number of iterations the animation should run.
     */
    private String iterations;

    /**
     * The offset into the animation iteration at which to begin (between 0 and 1).
     */
    private double iterationStart;

    /**
     * Custom keyframes for the animation.
     */
    private Object keyframes;

    /**
     * The playback rate of the animation.
     */
    private double playbackRate;

    /**
     * The current time of the animation.
     */
    private Object currentTime;

    /**
     * The size of the control icons.
     */
    private String iconSize;

    /**
     * The size of the control box.
     */
    private String controlBoxSize;

    /**
     * Creates a new WaAnimation component.
     */
    public WaAnimation()
    {
        setTag("wa-animation");
    }

    /**
     * Creates a new WaAnimation component with the specified animation name.
     *
     * @param animationName The name of the animation to use
     */
    public WaAnimation(Animation animationName)
    {
        this();
        setName(animationName.toString());
    }

    /**
     * Creates a new WaAnimation component with the specified animation name and play state.
     *
     * @param animationName The name of the animation to use
     * @param play          Whether the animation should play
     */
    public WaAnimation(Animation animationName, boolean play)
    {
        this(animationName);
        this.play = play;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (play)
            {
                addAttribute("play", "");
            }
            if (!Strings.isNullOrEmpty(getName()))
            {
                addAttribute("name", getName());
            }
            if (easingEffect != null)
            {
                addAttribute("easing", easingEffect.toString());
            }
            if (delay > 0)
            {
                addAttribute("delay", String.valueOf(delay));
            }
            if (duration > 0)
            {
                addAttribute("duration", String.valueOf(duration));
            }
            if (direction != null)
            {
                addAttribute("direction", direction.toString());
            }
            if (endDelay > 0)
            {
                addAttribute("end-delay", String.valueOf(endDelay));
            }
            if (fill != null)
            {
                addAttribute("fill", fill.toString());
            }
            if (iterations != null)
            {
                addAttribute("iterations", iterations);
            }
            if (iterationStart > 0)
            {
                addAttribute("iteration-start", String.valueOf(iterationStart));
            }
            if (playbackRate > 0)
            {
                addAttribute("playback-rate", String.valueOf(playbackRate));
            }
            if (iconSize != null)
            {
                addStyle("--icon-size", iconSize);
            }
            if (controlBoxSize != null)
            {
                addStyle("--control-box-size", controlBoxSize);
            }
        }
        super.init();
    }
}
