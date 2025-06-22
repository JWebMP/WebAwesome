package com.jwebmp.webawesome.components.range;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Script;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaRange component is a slider input that allows users to select a value from a range.
 * It supports features like labeling, hints, min/max values, tooltips, and custom styling.
 * <p>
 * This component renders as a wa-slider HTML element and supports various customization options
 * through properties and CSS custom properties.
 */
@Getter
@Setter
@NgImportReference(value = "WaSliderDirective", reference = "angular-awesome")
@NgImportModule("WaSliderDirective")
public class WaRange<J extends WaRange<J>> extends DivSimple<J>
{
    /**
     * Hint text to display below the slider
     */
    private String hint;

    /**
     * Label text to display above the slider
     */
    private String label;

    /**
     * Default value of the slider
     */
    private Number defaultValue;

    /**
     * Current value of the slider
     */
    private Number value;

    /**
     * Whether the slider is disabled
     */
    private Boolean disabled;

    /**
     * Minimum value allowed
     */
    private Number min;

    /**
     * Maximum value allowed
     */
    private Number max;

    /**
     * Step size for value changes
     */
    private Number step;

    /**
     * Position of the tooltip (Top, Bottom, None)
     */
    private RangeTooltipPosition tooltipPosition;

    /**
     * Color of the active (filled) part of the track
     */
    private String trackColourActive;

    /**
     * Color of the inactive (unfilled) part of the track
     */
    private String trackColourInactive;

    /**
     * Height of the track
     */
    private String trackHeight;

    /**
     * Offset of the active track
     */
    private Number trackActiveOffset;

    /**
     * Color of the thumb
     */
    private String thumbColor;

    /**
     * Size of the thumb
     */
    private String thumbSize;

    /**
     * Shadow effect for the thumb
     */
    private String thumbShadow;

    /**
     * Gap around the thumb
     */
    private String thumbGap;

    /**
     * Offset of the tooltip from the thumb
     */
    private String tooltipOffset;

    /**
     * Custom formatter for the tooltip value
     */
    private String tooltipFormatter;

    public WaRange()
    {
        setTag("wa-slider");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (hint != null)
            {
                addAttribute("hint", hint);
            }
            if (label != null)
            {
                addAttribute("label", label);
            }
            if (!Strings.isNullOrEmpty(getName()))
            {
                addAttribute("name", getName());
            }
            if (defaultValue != null)
            {
                addAttribute("default-value", defaultValue.toString());
            }
            if (value != null)
            {
                addAttribute("value", value.toString());
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (min != null)
            {
                addAttribute("min", min.toString());
            }
            if (max != null)
            {
                addAttribute("max", max.toString());
            }
            if (step != null)
            {
                addAttribute("step", step.toString());
            }
            if (tooltipPosition != null)
            {
                addAttribute("tooltip", tooltipPosition.toString());
            }
            if (!Strings.isNullOrEmpty(trackColourActive))
            {
                addStyle("--track-color-active", trackColourActive);
            }
            if (!Strings.isNullOrEmpty(trackColourInactive))
            {
                addStyle("--track-color-inactive", trackColourInactive);
            }
            if (!Strings.isNullOrEmpty(trackHeight))
            {
                addStyle("--track-height", trackHeight);
            }
            if (trackActiveOffset != null)
            {
                addStyle("--track-active-offset", trackActiveOffset.toString());
            }
            if (!Strings.isNullOrEmpty(thumbColor))
            {
                addStyle("--thumb-color", thumbColor);
            }
            if (!Strings.isNullOrEmpty(thumbSize))
            {
                addStyle("--thumb-size", thumbSize);
            }
            if (!Strings.isNullOrEmpty(thumbShadow))
            {
                addStyle("--thumb-shadow", thumbShadow);
            }
            if (!Strings.isNullOrEmpty(thumbGap))
            {
                addStyle("--thumb-gap", thumbGap);
            }
            if (!Strings.isNullOrEmpty(tooltipOffset))
            {
                addStyle("--tooltip-offset", tooltipOffset);
            }
        }
        super.init();
    }

    @Override
    protected StringBuilder renderAfterTag()
    {
        var sb = super.renderAfterTag();
        if (sb == null)
        {
            sb = new StringBuilder();
        }
        if (tooltipFormatter == null)
        {
            return sb;
        }

        Script<?, ?> script = new Script<>();
        script.setText("""
                const range = document.querySelector('%s');
                range.tooltipFormatter = value => `%s`;
                """.formatted(getID(true), tooltipFormatter));
        sb.append(script.toString(0));
        return sb;
    }
}
