package com.jwebmp.webawesome.components;

public interface SplitCapable<J> extends WaComponent<J>
{
    default void setSplit(boolean split)
    {
        if (split)
        {
            addClass("wa-split");
        } else
        {
            removeClass("wa-split");
        }
    }
}
