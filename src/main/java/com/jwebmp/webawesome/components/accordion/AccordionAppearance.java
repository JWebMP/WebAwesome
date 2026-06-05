package com.jwebmp.webawesome.components.accordion;

/**
 * Visual appearance options for {@code <wa-accordion>}.
 */
public enum AccordionAppearance
{
    Filled("filled"),
    Outlined("outlined"),
    FilledOutlined("filled-outlined"),
    Plain("plain");

    private final String value;

    AccordionAppearance(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }
}

