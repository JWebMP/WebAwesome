package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

/**
 * Vertical alignment of items in capable
 *
 * @param <J>
 */
public interface AlignVerticalCapable<J extends IComponentHierarchyBase<GlobalChildren, J> & AlignVerticalCapable<J>>
{
    default J setAlignVerticalBaseline()
    {
        J me = (J) this;
        me.addClass("wa-align-items-baseline");
        return me;
    }

    default J setAlignVerticalCenter()
    {
        J me = (J) this;
        me.addClass("wa-align-items-center");
        return me;
    }

    default J setAlignVerticalEnd()
    {
        J me = (J) this;
        me.addClass("wa-align-items-end");
        return me;
    }

    default J setAlignVerticalStart()
    {
        J me = (J) this;
        me.addClass("wa-align-items-start");
        return me;
    }

    default J setAlignVerticalStretch()
    {
        J me = (J) this;
        me.addClass("wa-align-items-stretch");
        return me;
    }
}
