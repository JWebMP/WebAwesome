package com.jwebmp.webawesome.components.popup;

public enum WaPopupPlacements
{
    Top,
    TopStart,
    TopEnd,
    Bottom,
    BottomStart,
    BottomEnd,
    Left,
    LeftStart,
    LeftEnd,
    Right,
    RightStart,
    RightEnd;

    @Override
    public String toString()
    {
        return name()
                .replaceAll("([a-z])([A-Z])", "$1-$2") // Add a hyphen before uppercase letters
                .toLowerCase(); // Convert the entire string to lowercase
    }

}
