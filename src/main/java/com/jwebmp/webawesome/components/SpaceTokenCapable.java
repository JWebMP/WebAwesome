package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.tokens.WaSpaceToken;

/**
 * Applies Web Awesome space design tokens as inline styles on components.
 * Controls padding, margin, and gap via CSS custom properties.
 */
@SuppressWarnings("unchecked")
public interface SpaceTokenCapable<J extends IComponentHierarchyBase<?, J> & SpaceTokenCapable<J>>
{
    default J setPadding(WaSpaceToken token)
    {
        J me = (J) this;
        me.addStyle("padding", token.var());
        return me;
    }

    default J setPaddingBlock(WaSpaceToken token)
    {
        J me = (J) this;
        me.addStyle("padding-block", token.var());
        return me;
    }

    default J setPaddingInline(WaSpaceToken token)
    {
        J me = (J) this;
        me.addStyle("padding-inline", token.var());
        return me;
    }

    default J setMargin(WaSpaceToken token)
    {
        J me = (J) this;
        me.addStyle("margin", token.var());
        return me;
    }

    default J setMarginBlock(WaSpaceToken token)
    {
        J me = (J) this;
        me.addStyle("margin-block", token.var());
        return me;
    }

    default J setMarginInline(WaSpaceToken token)
    {
        J me = (J) this;
        me.addStyle("margin-inline", token.var());
        return me;
    }

    default J setGap(WaSpaceToken token)
    {
        J me = (J) this;
        me.addStyle("gap", token.var());
        return me;
    }
}
