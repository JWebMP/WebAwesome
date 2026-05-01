package com.jwebmp.webawesome.tokens;

/**
 * Web Awesome component group design tokens.
 * Shared tokens for form controls, panels, and tooltips.
 */
public enum WaComponentGroupToken
{
    // ── Form Control ──
    /** Default background color for form controls. */
    FormControlBackgroundColor("--wa-form-control-background-color"),
    /** Default border color for form controls. */
    FormControlBorderColor("--wa-form-control-border-color"),
    /** Default border style for form controls. */
    FormControlBorderStyle("--wa-form-control-border-style"),
    /** Default border width for form controls. */
    FormControlBorderWidth("--wa-form-control-border-width"),
    /** Default border radius for form controls. */
    FormControlBorderRadius("--wa-form-control-border-radius"),
    /** Color for the control when activated/focused. */
    FormControlActivatedColor("--wa-form-control-activated-color"),
    /** Color for form control labels. */
    FormControlLabelColor("--wa-form-control-label-color"),
    /** Font weight for form control labels. */
    FormControlLabelFontWeight("--wa-form-control-label-font-weight"),
    /** Line height for form control labels. */
    FormControlLabelLineHeight("--wa-form-control-label-line-height"),
    /** Color for form control values (input text). */
    FormControlValueColor("--wa-form-control-value-color"),
    /** Font weight for form control values. */
    FormControlValueFontWeight("--wa-form-control-value-font-weight"),
    /** Line height for form control values. */
    FormControlValueLineHeight("--wa-form-control-value-line-height"),
    /** Color for hint/help text below form controls. */
    FormControlHintColor("--wa-form-control-hint-color"),
    /** Font weight for hint text. */
    FormControlHintFontWeight("--wa-form-control-hint-font-weight"),
    /** Line height for hint text. */
    FormControlHintLineHeight("--wa-form-control-hint-line-height"),
    /** Color for placeholder text. */
    FormControlPlaceholderColor("--wa-form-control-placeholder-color"),
    /** Content for the required indicator (e.g. "*"). */
    FormControlRequiredContent("--wa-form-control-required-content"),
    /** Color for the required indicator. */
    FormControlRequiredContentColor("--wa-form-control-required-content-color"),
    /** Horizontal offset for the required indicator. */
    FormControlRequiredContentOffset("--wa-form-control-required-content-offset"),
    /** Block (vertical) padding for form controls. */
    FormControlPaddingBlock("--wa-form-control-padding-block"),
    /** Inline (horizontal) padding for form controls. */
    FormControlPaddingInline("--wa-form-control-padding-inline"),
    /** Height of form controls. */
    FormControlHeight("--wa-form-control-height"),
    /** Size of toggles (checkboxes, radios, etc.). */
    FormControlToggleSize("--wa-form-control-toggle-size"),

    // ── Panel ──
    /** Default border style for panels and cards. */
    PanelBorderStyle("--wa-panel-border-style"),
    /** Default border width for panels. */
    PanelBorderWidth("--wa-panel-border-width"),
    /** Default border radius for panels. */
    PanelBorderRadius("--wa-panel-border-radius"),

    // ── Tooltip ──
    /** Size of the tooltip's pointer arrow. */
    TooltipArrowSize("--wa-tooltip-arrow-size"),
    /** Background color for tooltips. */
    TooltipBackgroundColor("--wa-tooltip-background-color"),
    /** Border color for tooltips. */
    TooltipBorderColor("--wa-tooltip-border-color"),
    /** Border style for tooltips. */
    TooltipBorderStyle("--wa-tooltip-border-style"),
    /** Border width for tooltips. */
    TooltipBorderWidth("--wa-tooltip-border-width"),
    /** Border radius for tooltips. */
    TooltipBorderRadius("--wa-tooltip-border-radius"),
    /** Color for tooltip content text. */
    TooltipContentColor("--wa-tooltip-content-color"),
    /** Font size for tooltips. */
    TooltipFontSize("--wa-tooltip-font-size"),
    /** Line height for tooltips. */
    TooltipLineHeight("--wa-tooltip-line-height");

    private final String token;

    WaComponentGroupToken(String token)
    {
        this.token = token;
    }

    @Override
    public String toString()
    {
        return token;
    }

    /**
     * Returns the token wrapped as a CSS {@code var()} reference.
     */
    public String var()
    {
        return "var(" + token + ")";
    }
}
