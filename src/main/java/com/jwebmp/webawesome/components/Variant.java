package com.jwebmp.webawesome.components;

public enum Variant
{
    Brand,
    Success,
    Neutral,
    Warning,
    Danger,
    Inherit;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
