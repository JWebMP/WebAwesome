package com.jwebmp.webawesome.components.animation;


import com.jwebmp.webawesome.components.TransitionTokenCapable;
import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.easingeffects.JQEasingEffects;
import lombok.Getter;
/**
 * The WaAnimation component provides a way to animate elements with predefined or custom animations.
 */
@Getter
@NgImportReference(value = "WaAnimationDirective", reference = "angular-awesome")
@NgImportModule("WaAnimationDirective")
public class WaAnimation<J extends WaAnimation<J>> extends DivSimple<J> implements TransitionTokenCapable<J>
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
    @SuppressWarnings("unchecked")
    public J setEasingEffect(JQEasingEffects easingEffect)
    {
        this.easingEffect = easingEffect;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setPlay(boolean play)
    {
        this.play = play;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDelay(int delay)
    {
        this.delay = delay;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDirection(PlaybackDirection direction)
    {
        this.direction = direction;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDuration(int duration)
    {
        this.duration = duration;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setEndDelay(int endDelay)
    {
        this.endDelay = endDelay;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFill(FillMode fill)
    {
        this.fill = fill;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setIterations(String iterations)
    {
        this.iterations = iterations;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setIterationStart(double iterationStart)
    {
        this.iterationStart = iterationStart;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setKeyframes(Object keyframes)
    {
        this.keyframes = keyframes;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setPlaybackRate(double playbackRate)
    {
        this.playbackRate = playbackRate;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setCurrentTime(Object currentTime)
    {
        this.currentTime = currentTime;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setIconSize(String iconSize)
    {
        this.iconSize = iconSize;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setControlBoxSize(String controlBoxSize)
    {
        this.controlBoxSize = controlBoxSize;
        return (J) this;
    }    public WaAnimation()
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
