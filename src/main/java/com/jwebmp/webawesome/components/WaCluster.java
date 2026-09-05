package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.DivSimple;

public class WaCluster<J extends WaCluster<J>> extends DivSimple<J> implements GapCapable<J>, AlignVerticalCapable<J>, JustifyContentCapable<J>, SplitCapable<J>, SpaceTokenCapable<J>
{
    public WaCluster()
    {
        addClass("wa-cluster");
    }

    @SuppressWarnings("unchecked")
    public J setNoWrap()
    {
        addStyle("flex-wrap", "nowrap");
        return (J) this;
    }

}
