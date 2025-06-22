package com.jwebmp.webawesome.components.animation;

/**
 * Defines the direction of the animation playback.
 */
public enum PlaybackDirection
{
    /**
     * The animation plays forwards from beginning to end.
     */
    normal,

    /**
     * The animation plays backwards from end to beginning.
     */
    reverse,

    /**
     * The animation plays forwards first, then backwards.
     */
    alternate,

    /**
     * The animation plays backwards first, then forwards.
     */
    alternateReverse
}
