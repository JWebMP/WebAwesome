package com.jwebmp.webawesome.components.randomcontent;

/**
 * Selection strategy for the {@code <wa-random-content>} component.
 * <p>
 * The on-wire attribute value is preserved via {@link #toString()}.
 */
public enum RandomContentMode
{
    /**
     * Selects children purely at random, allowing the same child (or set) to repeat across selections.
     */
    RANDOM("random"),

    /**
     * Selects children at random but avoids repeating the previously shown selection where possible.
     * This is the default mode.
     */
    UNIQUE("unique"),

    /**
     * Selects children in document order, advancing sequentially on each selection.
     */
    SEQUENCE("sequence");

    private final String value;

    RandomContentMode(String value)
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
