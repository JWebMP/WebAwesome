package com.jwebmp.webawesome.components.badge;

/**
 * Attention animation for WaBadge.
 * Controls the visual attention-drawing animation style.
 */
public enum BadgeAttention
{
    None,
    Pulse,
    Bounce;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

