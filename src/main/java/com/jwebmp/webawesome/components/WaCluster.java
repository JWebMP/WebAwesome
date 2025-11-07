package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.DivSimple;

public class WaCluster<J extends WaCluster<J>> extends DivSimple<J> implements GapCapable<J>, AlignVerticalCapable<J>, SplitCapable<J>
{
    public WaCluster()
    {
        addClass("wa-cluster");
    }

    public WaCluster setNoWrap()
    {
        addStyle("flex-wrap", "nowrap");
        return this;
    }

}
