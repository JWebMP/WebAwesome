package com.jwebmp.webawesome.components.taginput;

public enum TagInputAppearance
{
    Filled("filled"),
    Outlined("outlined"),
    FilledOutlined("filled-outlined");

    private final String value;

    TagInputAppearance(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }
}
