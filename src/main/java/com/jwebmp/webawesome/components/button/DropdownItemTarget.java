package com.jwebmp.webawesome.components.button;

/**
 * Targets supported by a linked {@link WaDropdownItem}.
 */
public enum DropdownItemTarget
{
    Blank,
    Parent,
    Self,
    Top;

    @Override
    public String toString()
    {
        return "_" + name().toLowerCase();
    }
}
