package com.jwebmp.webawesome.components;

public interface SplitCapable<J>
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
