package com.jwebmp.webawesome.tokens;

/**
 * Web Awesome shadow design tokens.
 * Controls elevation via box-shadow across components.
 */
public enum WaShadowToken
{
    // Composite shadows
    /** Small elevation shadow. */
    ShadowS("--wa-shadow-s"),
    /** Medium elevation shadow. */
    ShadowM("--wa-shadow-m"),
    /** Large elevation shadow. */
    ShadowL("--wa-shadow-l"),

    // Offset-X
    /** Shadow horizontal offset scale factor. */
    OffsetXScale("--wa-shadow-offset-x-scale"),
    /** Small horizontal offset. */
    OffsetXS("--wa-shadow-offset-x-s"),
    /** Medium horizontal offset. */
    OffsetXM("--wa-shadow-offset-x-m"),
    /** Large horizontal offset. */
    OffsetXL("--wa-shadow-offset-x-l"),

    // Offset-Y
    /** Shadow vertical offset scale factor. */
    OffsetYScale("--wa-shadow-offset-y-scale"),
    /** Small vertical offset. */
    OffsetYS("--wa-shadow-offset-y-s"),
    /** Medium vertical offset. */
    OffsetYM("--wa-shadow-offset-y-m"),
    /** Large vertical offset. */
    OffsetYL("--wa-shadow-offset-y-l"),

    // Blur
    /** Shadow blur scale factor. */
    BlurScale("--wa-shadow-blur-scale"),
    /** Small blur radius. */
    BlurS("--wa-shadow-blur-s"),
    /** Medium blur radius. */
    BlurM("--wa-shadow-blur-m"),
    /** Large blur radius. */
    BlurL("--wa-shadow-blur-l"),

    // Spread
    /** Shadow spread scale factor. */
    SpreadScale("--wa-shadow-spread-scale"),
    /** Small spread radius. */
    SpreadS("--wa-shadow-spread-s"),
    /** Medium spread radius. */
    SpreadM("--wa-shadow-spread-m"),
    /** Large spread radius. */
    SpreadL("--wa-shadow-spread-l");

    private final String token;

    WaShadowToken(String token)
    {
        this.token = token;
    }

    @Override
    public String toString()
    {
        return token;
    }

    /**
     * Returns the token wrapped as a CSS {@code var()} reference.
     */
    public String var()
    {
        return "var(" + token + ")";
    }
}
