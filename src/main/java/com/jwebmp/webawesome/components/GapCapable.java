package com.jwebmp.webawesome.components;

public interface GapCapable<J> extends WaComponent<J>
{
    /**
     * @param pageSize Set Gap From Size
     */
    default J setGap(PageSize pageSize)
    {
        addClass("wa-gap-" + pageSize.getSize());
        return (J) this;
    }

}
