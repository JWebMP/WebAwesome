package com.jwebmp.webawesome.tokens;

/**
 * Web Awesome space design tokens.
 * Controls consistent spacing throughout components.
 */
public enum WaSpaceToken
{
    /** Spacing scale multiplier. */
    Scale("--wa-space-scale"),
    /** Extra extra extra small space. */
    Space3XS("--wa-space-3xs"),
    /** Extra extra small space. */
    Space2XS("--wa-space-2xs"),
    /** Extra small space. */
    SpaceXS("--wa-space-xs"),
    /** Small space. */
    SpaceS("--wa-space-s"),
    /** Medium space. */
    SpaceM("--wa-space-m"),
    /** Large space. */
    SpaceL("--wa-space-l"),
    /** Extra large space. */
    SpaceXL("--wa-space-xl"),
    /** Extra extra large space. */
    Space2XL("--wa-space-2xl"),
    /** Extra extra extra large space. */
    Space3XL("--wa-space-3xl"),
    /** Extra extra extra extra large space. */
    Space4XL("--wa-space-4xl"),
    /** Extra extra extra extra extra large space. */
    Space5XL("--wa-space-5xl");

    private final String token;

    WaSpaceToken(String token)
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
