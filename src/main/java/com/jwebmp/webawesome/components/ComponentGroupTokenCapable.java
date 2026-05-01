package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.tokens.WaComponentGroupToken;

/**
 * Applies Web Awesome component group design tokens as inline styles on components.
 * Provides fine-grained control over form controls, panels, and tooltips
 * via CSS custom properties.
 */
@SuppressWarnings("unchecked")
public interface ComponentGroupTokenCapable<J extends IComponentHierarchyBase<?, J> & ComponentGroupTokenCapable<J>>
{
    /**
     * Applies any component group token as a CSS custom property override on this element.
     * The token name is used directly as the property (e.g. {@code --wa-form-control-border-radius}).
     */
    default J setComponentGroupToken(WaComponentGroupToken token, String value)
    {
        J me = (J) this;
        me.addStyle(token.toString(), value);
        return me;
    }

    // ── Form Control shortcuts ──

    default J setFormControlBackgroundColor(String value)
    {
        return setComponentGroupToken(WaComponentGroupToken.FormControlBackgroundColor, value);
    }

    default J setFormControlBorderColor(String value)
    {
        return setComponentGroupToken(WaComponentGroupToken.FormControlBorderColor, value);
    }

    default J setFormControlBorderRadius(String value)
    {
        return setComponentGroupToken(WaComponentGroupToken.FormControlBorderRadius, value);
    }

    default J setFormControlHeight(String value)
    {
        return setComponentGroupToken(WaComponentGroupToken.FormControlHeight, value);
    }

    // ── Panel shortcuts ──

    default J setPanelBorderRadius(String value)
    {
        return setComponentGroupToken(WaComponentGroupToken.PanelBorderRadius, value);
    }

    default J setPanelBorderWidth(String value)
    {
        return setComponentGroupToken(WaComponentGroupToken.PanelBorderWidth, value);
    }

    // ── Tooltip shortcuts ──

    default J setTooltipBackgroundColor(String value)
    {
        return setComponentGroupToken(WaComponentGroupToken.TooltipBackgroundColor, value);
    }

    default J setTooltipBorderRadius(String value)
    {
        return setComponentGroupToken(WaComponentGroupToken.TooltipBorderRadius, value);
    }

    default J setTooltipFontSize(String value)
    {
        return setComponentGroupToken(WaComponentGroupToken.TooltipFontSize, value);
    }
}
