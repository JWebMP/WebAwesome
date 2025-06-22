package com.jwebmp.webawesome.components.textarea;

/**
 * Represents the resize behavior options for the WaTextArea component.
 * Possible values are: 'none', 'vertical', 'horizontal', 'both', 'auto'.
 */
public enum TextAreaResize
{
    None,
    Vertical,
    Horizontal,
    Both,
    Auto;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}
