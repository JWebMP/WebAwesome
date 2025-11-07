package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

public interface GapCapable<J extends IComponentHierarchyBase<GlobalChildren, J>>
{
    /**
     * @param pageSize Set Gap From Size
     */
    @SuppressWarnings("unchecked")
    default J setGap(PageSize pageSize)
    {
        J me = (J) this;
        me.addClass("wa-gap-" + pageSize.getSize());
        return (J) this;
    }

}
