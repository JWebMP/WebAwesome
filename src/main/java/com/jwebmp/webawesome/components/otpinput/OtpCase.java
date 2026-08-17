package com.jwebmp.webawesome.components.otpinput;

/**
 * Defines the character casing applied by a {@code <wa-otp-input>} element.
 * <p>
 * Introduced with Web Awesome 3.11.0.
 */
public enum OtpCase
{
    /**
     * Keep whatever the user typed
     */
    Preserve,

    /**
     * Force upper case
     */
    Upper,

    /**
     * Force lower case
     */
    Lower;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

