package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.interfaces.GlobalChildren;

public interface WaComponent<J>
{
    /**
     * Adds a component to this one
     *
     * @param component
     * @return
     */
    J add(GlobalChildren component);

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

    /**
     * Adds an attribute value to the attribute collection, and marks it with a GlobalAttribute Enumeration.
     * <p>
     *
     * @param attribute The GlobalAttribute to set the attribute to
     * @param value     The value of the attribute
     * @return
     */
    J addAttribute(String attribute, String value);


}
