package com.jwebmp.webawesome.components.otpinput;

/**
 * Defines the accepted character set of a {@code <wa-otp-input>} element.
 * <p>
 * Introduced with Web Awesome 3.11.0.
 */
public enum OtpType
{
    /**
     * Digits only
     */
    Numeric,

    /**
     * Letters only
     */
    Alpha,

    /**
     * Letters and digits
     */
    Alphanumeric;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

