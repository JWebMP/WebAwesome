package com.jwebmp.webawesome.components.card;

/**
 * Orientation options for WaCard layout.
 */
public enum CardOrientation
{
    Horizontal,
    Vertical;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

