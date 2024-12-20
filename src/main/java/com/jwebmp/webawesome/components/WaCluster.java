package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.DivSimple;

public class WaCluster extends DivSimple<WaCluster> implements GapCapable<WaCluster>
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
