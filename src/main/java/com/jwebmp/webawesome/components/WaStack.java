package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.html.DivSimple;

public class WaStack<J extends WaStack<J>> extends DivSimple<J> implements GapCapable<J>, AlignVerticalCapable<J>, SpaceTokenCapable<J>
{
    public WaStack()
    {
        addClass("wa-stack");
    }

}
