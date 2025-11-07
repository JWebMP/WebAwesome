package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

public interface SplitCapable<J extends SplitCapable<J> & IComponentHierarchyBase<GlobalChildren, J>>
{
    default J setSplit()
    {
        J me = (J) this;
        me.addClass("wa-split");
        return (J) this;
    }
}
