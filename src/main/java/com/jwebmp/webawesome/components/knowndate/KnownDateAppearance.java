package com.jwebmp.webawesome.components.knowndate;

/**
 * Appearance options for {@code <wa-known-date>}.
 */
public enum KnownDateAppearance
{
    Filled("filled"),
    Outlined("outlined"),
    FilledOutlined("filled-outlined");

    private final String value;

    KnownDateAppearance(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }
}

