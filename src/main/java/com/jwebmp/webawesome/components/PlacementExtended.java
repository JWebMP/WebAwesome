package com.jwebmp.webawesome.components;

public enum PlacementExtended
{
    Start,
    Top_Start,
    Bottom_Start,
    End,
    Top_End,
    Bottom_End,
    Top,
    Bottom;

    @Override
    public String toString()
    {
        return super.toString().toLowerCase().replace('_', '-');
    }
}
