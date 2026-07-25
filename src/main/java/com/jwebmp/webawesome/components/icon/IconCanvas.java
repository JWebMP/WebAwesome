package com.jwebmp.webawesome.components.icon;

/**
 * The rendering canvas for a {@link WaIcon}, mapped to the {@code canvas} attribute (Web Awesome 3.10).
 * <p>
 * Controls the size of the box the icon glyph is drawn within. When unset the element renders as
 * {@link #FIXED} (1.25em wide by 1em tall). Mirrors Font Awesome's {@code fa-fixed-width},
 * {@code fa-width-auto}, {@code fa-canvas-square} and {@code fa-canvas-roomy} utilities.
 * <p>
 * The on-wire attribute value is preserved via {@link #toString()}.
 */
public enum IconCanvas
{
    /**
     * Fixed canvas of 1.25em &times; 1em. This is the implicit rendering when {@code canvas} is unset.
     */
    FIXED("fixed"),

    /**
     * Canvas hugs the intrinsic icon width.
     */
    AUTO("auto"),

    /**
     * Square canvas of 1.25em &times; 1.25em.
     */
    SQUARE("square"),

    /**
     * Roomy canvas of 1.5em &times; 1.5em.
     */
    ROOMY("roomy");

    private final String value;

    IconCanvas(String value)
    {
        this.value = value;
    }

    /**
     * @return The on-wire attribute value.
     */
    @Override
    public String toString()
    {
        return value;
    }
}
