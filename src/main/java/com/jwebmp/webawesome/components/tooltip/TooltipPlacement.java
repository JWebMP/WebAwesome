package com.jwebmp.webawesome.components.tooltip;

public enum TooltipPlacement
{
    Top,
    Top_Start,
    Top_End,
    Bottom,
    Bottom_Start,
    Bottom_End,
    Left,
    Left_Start,
    Left_End,
    Right,
    Right_Start,
    Right_End;

    @Override
    public String toString()
    {
        return super.toString().replace("_", "-").toLowerCase();
    }
}
