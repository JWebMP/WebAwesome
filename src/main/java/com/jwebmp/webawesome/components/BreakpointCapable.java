package com.jwebmp.webawesome.components;

public interface BreakpointCapable<J> extends WaComponent<J>
{
    default void setMobileBreakpoint(int breakpoint)
    {
        addAttribute("mobile-breakpoint", breakpoint + "");
    }
}
