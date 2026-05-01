package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.tokens.WaShadowToken;

/**
 * Applies Web Awesome shadow design tokens as inline styles on components.
 * Controls elevation via box-shadow CSS custom properties.
 */
@SuppressWarnings("unchecked")
public interface ShadowTokenCapable<J extends IComponentHierarchyBase<?, J> & ShadowTokenCapable<J>>
{
    default J setShadow(WaShadowToken token)
    {
        J me = (J) this;
        me.addStyle("box-shadow", token.var());
        return me;
    }

    default J setShadowSmall()
    {
        return setShadow(WaShadowToken.ShadowS);
    }

    default J setShadowMedium()
    {
        return setShadow(WaShadowToken.ShadowM);
    }

    default J setShadowLarge()
    {
        return setShadow(WaShadowToken.ShadowL);
    }
}
