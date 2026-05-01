package com.jwebmp.webawesome.tokens;

/**
 * Web Awesome transition design tokens.
 * Controls animation duration and easing for state changes.
 */
public enum WaTransitionToken
{
    /** Fast transition duration. */
    Fast("--wa-transition-fast"),
    /** Normal transition duration. */
    Normal("--wa-transition-normal"),
    /** Slow transition duration. */
    Slow("--wa-transition-slow"),
    /** Transition timing function (easing). */
    Easing("--wa-transition-easing");

    private final String token;

    WaTransitionToken(String token)
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
