package com.jwebmp.webawesome.components.timeinput;

/**
 * Appearance options for {@code <wa-time-input>}.
 */
public enum TimeInputAppearance
{
    Filled("filled"),
    Outlined("outlined"),
    FilledOutlined("filled-outlined");

    private final String value;

    TimeInputAppearance(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }
}

