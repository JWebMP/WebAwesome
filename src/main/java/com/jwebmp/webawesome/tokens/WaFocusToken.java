package com.jwebmp.webawesome.tokens;

/**
 * Web Awesome focus design tokens.
 * Controls focus ring appearance for keyboard accessibility.
 */
public enum WaFocusToken
{
    /** Focus ring style (e.g. solid). */
    RingStyle("--wa-focus-ring-style"),
    /** Focus ring width. */
    RingWidth("--wa-focus-ring-width"),
    /** Combined focus ring shorthand. */
    Ring("--wa-focus-ring"),
    /** Offset between the element and the focus ring. */
    RingOffset("--wa-focus-ring-offset");

    private final String token;

    WaFocusToken(String token)
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
