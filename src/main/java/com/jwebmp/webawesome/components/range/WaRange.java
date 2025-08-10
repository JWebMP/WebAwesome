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
     * Whether the slider is read-only
     */
    private Boolean readonly;

    /**
     * Whether the slider is required
     */
    private Boolean required;

    /**
     * Form association (by id)
     */
    private String form;

    /**
     * SSR optimization for label slot
     */
    private Boolean withLabel;

    /**
     * SSR optimization for hint slot
     */
    private Boolean withHint;

    /**
     * Enables dual-thumb range selection
     */
    private Boolean range;

    /**
     * Min value for range selection
     */
    private Number minValue;

    /**
     * Max value for range selection
     */
    private Number maxValue;

    /**
     * Slider orientation (horizontal or vertical)
     */
    private String orientation;

    /**
     * Slider size (small, medium, large)
     */
    private String size;

    /**
     * Starting value for the filled indicator
     */
    private Number indicatorOffset;

    /**
     * Shows markers at each step
     */
    private Boolean withMarkers;

    /**
     * Shows tooltip with current value
     */
    private Boolean withTooltip;

    /**
     * Distance of tooltip from thumb
     */
    private Number tooltipDistance;

    /**
     * Tooltip placement
     */
    private RangeTooltipPosition tooltipPlacement;

    /**
     * Autofocus the slider when page loads
     */
    private Boolean autofocus;

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
     * @deprecated Use tooltipPlacement and withTooltip instead
     */
    @Deprecated
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
     * Width of the track
     */
    private String trackSize;

    /**
     * Width of the marker
     */
    private String markerWidth;

    /**
     * Height of the marker
     */
    private String markerHeight;

    /**
     * Width of the thumb
     */
    private String thumbWidth;

    /**
     * Height of the thumb
     */
    private String thumbHeight;

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
            if (!Strings.isNullOrEmpty(form))
            {
                addAttribute("form", form);
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
            if (readonly != null && readonly)
            {
                addAttribute("readonly", "");
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (withLabel != null && withLabel)
            {
                addAttribute("with-label", "");
            }
            if (withHint != null && withHint)
            {
                addAttribute("with-hint", "");
            }
            if (range != null && range)
            {
                addAttribute("range", "");
            }
            if (minValue != null)
            {
                addAttribute("min-value", minValue.toString());
            }
            if (maxValue != null)
            {
                addAttribute("max-value", maxValue.toString());
            }
            if (!Strings.isNullOrEmpty(orientation))
            {
                addAttribute("orientation", orientation);
            }
            if (!Strings.isNullOrEmpty(size))
            {
                addAttribute("size", size);
            }
            if (indicatorOffset != null)
            {
                addAttribute("indicator-offset", indicatorOffset.toString());
            }
            if (withMarkers != null && withMarkers)
            {
                addAttribute("with-markers", "");
            }
            if (withTooltip != null && withTooltip)
            {
                addAttribute("with-tooltip", "");
            }
            if (tooltipDistance != null)
            {
                addAttribute("tooltip-distance", tooltipDistance.toString());
            }
            if (tooltipPlacement != null)
            {
                addAttribute("tooltip-placement", tooltipPlacement.toString());
            }
            if (autofocus != null && autofocus)
            {
                addAttribute("autofocus", "");
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
            // Handle deprecated tooltipPosition for backward compatibility
            if (tooltipPosition != null)
            {
                if (tooltipPosition != RangeTooltipPosition.None)
                {
                    if (withTooltip == null)
                    {
                        addAttribute("with-tooltip", "");
                    }
                    if (tooltipPlacement == null)
                    {
                        addAttribute("tooltip-placement", tooltipPosition.toString());
                    }
                }
                // For backward compatibility
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
            if (!Strings.isNullOrEmpty(trackSize))
            {
                addStyle("--track-size", trackSize);
            }
            if (!Strings.isNullOrEmpty(markerWidth))
            {
                addStyle("--marker-width", markerWidth);
            }
            if (!Strings.isNullOrEmpty(markerHeight))
            {
                addStyle("--marker-height", markerHeight);
            }
            if (!Strings.isNullOrEmpty(thumbWidth))
            {
                addStyle("--thumb-width", thumbWidth);
            }
            if (!Strings.isNullOrEmpty(thumbHeight))
            {
                addStyle("--thumb-height", thumbHeight);
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
