package com.jwebmp.webawesome.components.button;

/**
 * Visual variant options for WaDropdownItem.
 */
public enum DropdownItemVariant
{
    Default,
    Danger;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

