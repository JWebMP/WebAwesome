package com.jwebmp.webawesome.components.range;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Script;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaRange extends DivSimple<WaRange>
{
    private String hint;
    private String label;

    private String name;
    private Number defaultValue;
    private Number value;
    private Boolean disabled;

    private Number min;
    private Number max;
    private Number step;

    private RangeTooltipPosition tooltipPosition;

    private String trackColourActive;
    private String trackColourInactive;
    private Number trackActiveOffset;

    private String tooltipFormatter;

    public WaRange()
    {
        setTag("wa-range");
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
            if (name != null)
            {
                addAttribute("name", name);
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
                addAttribute("tooltip", tooltipPosition.name().toLowerCase());
            }
            if (!Strings.isNullOrEmpty(trackColourActive))
            {
                addStyle("--track-color-active", trackColourActive);
            }
            if (!Strings.isNullOrEmpty(trackColourInactive))
            {
                addStyle("--track-color-inactive", trackColourInactive);
            }
            if (trackActiveOffset != null)
            {
                addStyle("--track-active-offset", trackActiveOffset.toString());
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
