package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.tokens.WaFocusToken;

/**
 * Applies Web Awesome focus design tokens as inline styles on components.
 * Controls focus ring appearance for keyboard accessibility.
 */
@SuppressWarnings("unchecked")
public interface FocusTokenCapable<J extends IComponentHierarchyBase<?, J> & FocusTokenCapable<J>>
{
    default J setFocusRing(WaFocusToken token)
    {
        J me = (J) this;
        me.addStyle("outline", token.var());
        return me;
    }

    default J setFocusRingStyle(WaFocusToken token)
    {
        J me = (J) this;
        me.addStyle("outline-style", token.var());
        return me;
    }

    default J setFocusRingWidth(WaFocusToken token)
    {
        J me = (J) this;
        me.addStyle("outline-width", token.var());
        return me;
    }

    default J setFocusRingOffset(WaFocusToken token)
    {
        J me = (J) this;
        me.addStyle("outline-offset", token.var());
        return me;
    }
}
