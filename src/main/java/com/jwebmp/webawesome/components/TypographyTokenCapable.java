package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.tokens.WaTypographyToken;

/**
 * Applies Web Awesome typography design tokens as inline styles on components.
 * Controls font family, size, weight, and line height via CSS custom properties.
 */
@SuppressWarnings("unchecked")
public interface TypographyTokenCapable<J extends IComponentHierarchyBase<?, J> & TypographyTokenCapable<J>>
{
    default J setFontFamily(WaTypographyToken token)
    {
        J me = (J) this;
        me.addStyle("font-family", token.var());
        return me;
    }

    default J setFontSize(WaTypographyToken token)
    {
        J me = (J) this;
        me.addStyle("font-size", token.var());
        return me;
    }

    default J setFontWeight(WaTypographyToken token)
    {
        J me = (J) this;
        me.addStyle("font-weight", token.var());
        return me;
    }

    default J setLineHeight(WaTypographyToken token)
    {
        J me = (J) this;
        me.addStyle("line-height", token.var());
        return me;
    }

    default J setTypography(WaTypographyToken family, WaTypographyToken size, WaTypographyToken weight, WaTypographyToken lineHeight)
    {
        setFontFamily(family);
        setFontSize(size);
        setFontWeight(weight);
        setLineHeight(lineHeight);
        return (J) this;
    }
}
