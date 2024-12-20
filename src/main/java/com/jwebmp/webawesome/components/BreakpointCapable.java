package com.jwebmp.webawesome.components;

public interface BreakpointCapable<J>
{
    default void setMobileBreakpoint(int breakpoint)
    {
        addAttribute("mobile-breakpoint", breakpoint + "");
    }

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
