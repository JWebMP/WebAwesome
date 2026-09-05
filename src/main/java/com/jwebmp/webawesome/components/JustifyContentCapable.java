package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

/**
 * Main-axis content justification for capable layout containers.
 *
 * @param <J> the fluent component type
 */
public interface JustifyContentCapable<J extends IComponentHierarchyBase<GlobalChildren, J> & JustifyContentCapable<J>>
{
    default J justifyContentStart()
    {
        J me = (J) this;
        me.addClass("wa-justify-content-start");
        return me;
    }

    default J justifyContentEnd()
    {
        J me = (J) this;
        me.addClass("wa-justify-content-end");
        return me;
    }

    default J justifyContentCenter()
    {
        J me = (J) this;
        me.addClass("wa-justify-content-center");
        return me;
    }

    default J justifyContentSpaceAround()
    {
        J me = (J) this;
        me.addClass("wa-justify-content-space-around");
        return me;
    }

    default J justifyContentSpaceBetween()
    {
        J me = (J) this;
        me.addClass("wa-justify-content-space-between");
        return me;
    }

    default J justifyContentSpaceEvenly()
    {
        J me = (J) this;
        me.addClass("wa-justify-content-space-evenly");
        return me;
    }
}
