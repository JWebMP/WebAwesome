package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.tokens.WaTransitionToken;

/**
 * Applies Web Awesome transition design tokens as inline styles on components.
 * Controls animation duration and easing for state changes.
 */
@SuppressWarnings("unchecked")
public interface TransitionTokenCapable<J extends IComponentHierarchyBase<?, J> & TransitionTokenCapable<J>>
{
    default J setTransitionDuration(WaTransitionToken token)
    {
        J me = (J) this;
        me.addStyle("transition-duration", token.var());
        return me;
    }

    default J setTransitionEasing(WaTransitionToken token)
    {
        J me = (J) this;
        me.addStyle("transition-timing-function", token.var());
        return me;
    }

    default J setTransition(String property, WaTransitionToken duration, WaTransitionToken easing)
    {
        J me = (J) this;
        me.addStyle("transition", property + " " + duration.var() + " " + easing.var());
        return me;
    }

    default J setTransitionFast()
    {
        return setTransitionDuration(WaTransitionToken.Fast);
    }

    default J setTransitionNormal()
    {
        return setTransitionDuration(WaTransitionToken.Normal);
    }

    default J setTransitionSlow()
    {
        return setTransitionDuration(WaTransitionToken.Slow);
    }
}
