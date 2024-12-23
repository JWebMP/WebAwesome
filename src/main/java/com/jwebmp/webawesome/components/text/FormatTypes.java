package com.jwebmp.webawesome.components.text;

public enum FormatTypes
{
    bit, $byte;

    @Override
    public String toString()
    {
        return super.toString().replace("$", "");
    }
}
