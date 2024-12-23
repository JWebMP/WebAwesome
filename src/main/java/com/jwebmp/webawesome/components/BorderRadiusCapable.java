package com.jwebmp.webawesome.components;

public interface BorderRadiusCapable<J> extends WaComponent<J>
{
    /**
     * @param pageSize Set Gap From Size
     */
    default J setBorderRadius(PageSize pageSize)
    {
        addClass("wa-border-radius-" + pageSize.getSize());
        return (J) this;
    }
}
