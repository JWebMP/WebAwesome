package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.tokens.WaBorderToken;

/**
 * Applies Web Awesome border design tokens as inline styles on components.
 * Controls border style, width, and radius via CSS custom properties.
 */
@SuppressWarnings("unchecked")
public interface BorderTokenCapable<J extends IComponentHierarchyBase<?, J> & BorderTokenCapable<J>>
{
    default J setBorderStyle(WaBorderToken token)
    {
        J me = (J) this;
        me.addStyle("border-style", token.var());
        return me;
    }

    default J setBorderWidth(WaBorderToken token)
    {
        J me = (J) this;
        me.addStyle("border-width", token.var());
        return me;
    }

    default J setBorderRadius(WaBorderToken token)
    {
        J me = (J) this;
        me.addStyle("border-radius", token.var());
        return me;
    }

    default J setBorder(WaBorderToken width, WaBorderToken style, WaBorderToken radius)
    {
        setBorderWidth(width);
        setBorderStyle(style);
        setBorderRadius(radius);
        return (J) this;
    }
}
