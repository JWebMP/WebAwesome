package com.jwebmp.webawesome.components.popup;

public enum WaPopupStrategy
{
    Absolute,
    Fixed;


    @Override
    public String

    toString()
    {
        return name()
                .replaceAll("([a-z])([A-Z])", "$1-$2") // Add a hyphen before uppercase letters
                .toLowerCase(); // Convert the entire string to lowercase
    }

}
