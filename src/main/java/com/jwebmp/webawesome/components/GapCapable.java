package com.jwebmp.webawesome.components;

public interface GapCapable<J>
{
    /**
     * @param pageSize Set Gap From Size
     */
    default J setGap(PageSize pageSize)
    {
        addClass("wa-gap-" + pageSize.getSize());
        return (J) this;
    }

    /**
     * Adds a class name to the class list
     * <p>
     *
     * @param value The class name to add
     *              <p>
     * @return True if it was added, false if it already existed
     */
    J addClass(String value);

    /**
     * Removes a class name from this component
     * <p>
     *
     * @param className Class Name to Remove
     *                  <p>
     * @return True if the class was removed, False if the class was not part of the collection
     */
    J removeClass(String className);
}
