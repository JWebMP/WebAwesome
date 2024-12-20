package com.jwebmp.webawesome.components;

public enum PageSize
{
    ExtraSmall("xs"),
    Small("s"),
    Medium("m"),
    Large("l"),
    ExtraLarge("xl");

    private final String size;

    PageSize(String size)
    {
        this.size = size;
    }

    public String getSize()
    {
        return size;
    }
}
