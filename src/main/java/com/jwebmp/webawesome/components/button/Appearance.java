package com.jwebmp.webawesome.components.button;

public enum Appearance
{
    Accent,
    Filled,
    Tinted,
    Outlined,
    Text,
    Plain,
    Filled_Outlined,
    Accent_Outlined;

    @Override
    public String toString()
    {
        return name().toLowerCase().replace('_', ' ');
    }
}
