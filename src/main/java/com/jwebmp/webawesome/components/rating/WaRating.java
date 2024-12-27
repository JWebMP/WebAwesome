package com.jwebmp.webawesome.components.rating;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Script;
import com.jwebmp.webawesome.components.icon.WaIcon;
import com.jwebmp.webawesome.components.relativetime.WaRelativeTime;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class WaRating extends DivSimple<WaRating>
{
    private String label;
    private String value;
    private Number max;
    private Number precision;
    private Boolean readonly;
    private Boolean disabled;

    /**
     * A list of icons to be used in the rating for each rating
     */
    private List<WaIcon<?>> icons;
    private WaIcon<?> symbol;

    private String symbolColour;
    private String symbolColourActive;
    private String symbolSize;
    private Integer symbolSpacing;

    public WaRating()
    {
        setTag("wa-rating");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (!Strings.isNullOrEmpty(value))
            {
                addAttribute("value", value);
            }
            if (max != null)
            {
                addAttribute("max", String.valueOf(max));
            }
            if (precision != null)
            {
                addAttribute("precision", String.valueOf(precision));
            }
            if (readonly != null && readonly)
            {
                addAttribute("readonly", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
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
        if (icons != null)
        {
            StringBuilder sbb = new StringBuilder();
            Set<String> added = new LinkedHashSet<>();
            for (WaIcon<?> icon : icons)
            {
                added.add("'" + icon.getIconName() + "'");
            }
            Script<?, ?> script = new Script<>();
            script.addAttribute("type", "module");
            script.setText("""
                    const rating = document.querySelector('%s');
                    
                      await customElements.whenDefined("wa-rating")
                      await rating.updateComplete
                    
                      rating.getSymbol = value => {
                        const icons = [%s];
                        return `<wa-icon name="${icons[value - 1]}"></wa-icon>`;
                      };
                    """.formatted(getID(true), String.join(",", added)));
            sb.append(script.toString(0));
        }
        if (symbol != null)
        {
            Script<?, ?> script = new Script<>();
            script.addAttribute("type", "module");
            script.setText("""
                    const rating = document.querySelector('%s');
                    
                      await customElements.whenDefined("wa-rating")
                      await rating.updateComplete
                    
                      rating.getSymbol = () =>'%s'
                    """.formatted(getID(true), symbol.setTiny(true).toString(0)));
            sb.append(script.toString(0));
        }

        return sb;
    }

    @Override
    public WaRating bind(String variableName)
    {
        addAttribute("[attrs.value]", variableName);
        return this;
    }

    public WaRating bindMax(String variableName)
    {
        addAttribute("[attrs.max]", variableName);
        return this;
    }

    public WaRating bindLabel(String variableName)
    {
        addAttribute("[attrs.label]", variableName);
        return this;
    }

    public WaRating bindPrecision(String variableName)
    {
        addAttribute("[attrs.precision]", variableName);
        return this;
    }

    public WaRating bindReadonly(String variableName)
    {
        addAttribute("[attrs.readonly]", variableName);
        return this;
    }

    public WaRating bindDisabled(String variableName)
    {
        addAttribute("[attrs.disabled]", variableName);
        return this;
    }

    
}
