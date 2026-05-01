package com.jwebmp.webawesome.tokens;

/**
 * Web Awesome border design tokens.
 * Controls border style, width, and radius across components.
 */
public enum WaBorderToken
{
    /** The default border style. */
    Style("--wa-border-style"),

    // Width
    /** Small border width. */
    WidthS("--wa-border-width-s"),
    /** Medium border width. */
    WidthM("--wa-border-width-m"),
    /** Large border width. */
    WidthL("--wa-border-width-l"),
    /** Border width scale factor. */
    WidthScale("--wa-border-width-scale"),

    // Radius
    /** Pill-shaped border radius. */
    RadiusPill("--wa-border-radius-pill"),
    /** Circular border radius (50%). */
    RadiusCircle("--wa-border-radius-circle"),
    /** Sharp corners (0px). */
    RadiusSquare("--wa-border-radius-square"),
    /** Small border radius. */
    RadiusS("--wa-border-radius-s"),
    /** Medium border radius. */
    RadiusM("--wa-border-radius-m"),
    /** Large border radius. */
    RadiusL("--wa-border-radius-l"),
    /** Border radius scale factor. */
    RadiusScale("--wa-border-radius-scale");

    private final String token;

    WaBorderToken(String token)
    {
        this.token = token;
    }

    /**
     * Returns the CSS custom property name, e.g. {@code --wa-border-width-s}.
     */
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
