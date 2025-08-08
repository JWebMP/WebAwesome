package com.jwebmp.webawesome.components.icon;

public enum IconFamily
{
    Brands,
    Classic;

    @Override
    public String toString()
    {
        return name().replace('_', '-')
                     .toLowerCase();
    }
}
