package com.jwebmp.webawesome.components.checkbox;

/**
 * Orientation options for the {@link WaCheckboxGroup} component.
 * Matches Web Awesome checkbox group orientation values.
 */
public enum CheckboxGroupOrientation
{
    /**
     * Lay the grouped checkboxes/switches out horizontally.
     */
    Horizontal,
    /**
     * Lay the grouped checkboxes/switches out vertically (the default).
     */
    Vertical;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

