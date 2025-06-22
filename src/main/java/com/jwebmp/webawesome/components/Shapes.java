package com.jwebmp.webawesome.components;

/**
 * Defines the possible shapes for components.
 */
public enum Shapes
{
    /**
     * Square shape with sharp corners
     */
    Square,

    /**
     * Circle shape (or rounded corners for non-square elements)
     */
    Circle,

    /**
     * Rounded shape with slightly rounded corners
     */
    Rounded;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
