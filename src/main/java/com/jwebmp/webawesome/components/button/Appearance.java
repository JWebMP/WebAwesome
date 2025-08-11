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
    Accent_Outlined,
    Plain_Outlined,
    Tinted_Outlined,
    Text_Outlined;

    @Override
    public String toString()
    {
        return name().toLowerCase()
                     .replace('_', ' ');
    }
}
