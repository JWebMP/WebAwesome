package com.jwebmp.webawesome.components.timeinput;

/**
 * Hour display format for {@code <wa-time-input>}.
 */
public enum HourFormat
{
    Auto("auto"),
    Twelve("12"),
    TwentyFour("24");

    private final String value;

    HourFormat(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }
}

