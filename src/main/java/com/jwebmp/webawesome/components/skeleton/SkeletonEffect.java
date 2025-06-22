package com.jwebmp.webawesome.components.skeleton;

/**
 * Defines the possible animation effects for the WaSkeleton component.
 */
public enum SkeletonEffect
{
    /**
     * No animation effect
     */
    None,

    /**
     * Sheen animation effect - a light gradient that moves across the skeleton
     */
    Sheen,

    /**
     * Pulse animation effect - the skeleton fades in and out
     */
    Pulse;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
