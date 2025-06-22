package com.jwebmp.webawesome.components.animation;

/**
 * Defines how the animation applies styles to its target before and after its execution.
 */
public enum FillMode
{
    /**
     * The animation will not apply any styles to the target before or after it executes.
     */
    none,

    /**
     * The animation will apply the property values present at the end of the animation to the target
     * after the animation completes.
     */
    forwards,

    /**
     * The animation will apply the property values present at the beginning of the animation to the target
     * before the animation starts.
     */
    backwards,

    /**
     * The animation will apply both forwards and backwards fill modes.
     */
    both,

    /**
     * The animation will follow the rules of the animation mode.
     */
    auto
}
