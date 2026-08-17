package com.jwebmp.webawesome.components.otpinput;

/**
 * Defines the visual appearance of a {@code <wa-otp-input>} element.
 * <p>
 * Web Awesome appearance values are space separated tokens, so {@code Filled_Outlined} renders as
 * {@code filled outlined} - matching the convention used by the other Web Awesome appearance enums.
 * <p>
 * Introduced with Web Awesome 3.11.0.
 */
public enum OtpAppearance
{
    /**
     * Outlined segments
     */
    Outlined,

    /**
     * Filled segments
     */
    Filled,

    /**
     * Filled segments with an outline
     */
    Filled_Outlined,

    /**
     * Segments rendered inside a single container
     */
    Contained;

    @Override
    public String toString()
    {
        return name().toLowerCase()
                     .replace('_', ' ');
    }
}


