package com.jwebmp.webawesome.components.randomcontent;

/**
 * Entrance animation applied to newly displayed children of the {@code <wa-random-content>} component.
 * <p>
 * The on-wire attribute value is preserved via {@link #toString()}.
 */
public enum RandomContentAnimation
{
    /**
     * No entrance animation (default).
     */
    NONE("none"),

    /**
     * Fade the new content in.
     */
    FADE("fade"),

    /**
     * Fade in while translating upwards.
     */
    FADE_UP("fade-up"),

    /**
     * Fade in while translating downwards.
     */
    FADE_DOWN("fade-down"),

    /**
     * Fade in while translating from the left.
     */
    FADE_LEFT("fade-left"),

    /**
     * Fade in while translating from the right.
     */
    FADE_RIGHT("fade-right");

    private final String value;

    RandomContentAnimation(String value)
    {
        this.value = value;
    }

    /**
     * @return The on-wire attribute value.
     */
    @Override
    public String toString()
    {
        return value;
    }
}
