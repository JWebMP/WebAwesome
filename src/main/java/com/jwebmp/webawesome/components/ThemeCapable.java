package com.jwebmp.webawesome.components;

public interface ThemeCapable<J> extends WaComponent<J>
{
    /**
     * @param themeName Set Gap From Size
     */
    default J setTheme(String themeName)
    {
        addClass("wa-theme-" + themeName);
        return (J) this;
    }
}
