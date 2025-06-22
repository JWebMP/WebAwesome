package com.jwebmp.webawesome.components.rating;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Script;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * The WaRating component allows users to provide or view ratings using configurable visual representations.
 * It supports features like labeling, custom maximum values, precision, and custom styling.
 * <p>
 * This component renders as a wa-rating HTML element and supports various customization options
 * through properties and CSS custom properties.
 */
@Getter
@Setter
@NgImportReference(value = "WaRatingDirective", reference = "angular-awesome")
@NgImportModule("WaRatingDirective")
public class WaRating<J extends WaRating<J>> extends DivSimple<J>
{
    /**
     * Label text to describe the component for accessibility
     */
    private String label;

    /**
     * Current selected value (supports fractional values)
     */
    private String value;

    /**
     * Maximum rating value (defaults to 5)
     */
    private Number max;

    /**
     * Precision for decimal steps (e.g., 0.5 for half-stars)
     */
    private Number precision;

    /**
     * Makes the component non-editable but still visually active
     */
    private Boolean readonly;

    /**
     * Fully disables the control
     */
    private Boolean disabled;

    /**
     * Size variant (small, medium, large)
     */
    private Size size;

    /**
     * Color applied to base or symbols
     */
    private String color;

    /**
     * Background color of the component
     */
    private String backgroundColor;

    /**
     * Font size that overrides symbol sizing
     */
    private String fontSize;

    /**
     * A list of icons to be used in the rating for each rating
     */
    private List<WaIcon<?>> icons;

    /**
     * Custom symbol to use for the rating
     */
    private WaIcon<?> symbol;

    /**
     * Inactive color for symbols (--symbol-color)
     */
    private String symbolColour;

    /**
     * Active rating color (--symbol-color-active)
     */
    private String symbolColourActive;

    /**
     * Space between symbols (--symbol-spacing)
     */
    private String symbolSpacing;

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
            if (size != null)
            {
                addAttribute("size", size.toString()
                                         .toLowerCase());
            }
            if (!Strings.isNullOrEmpty(color))
            {
                addAttribute("color", color);
            }
            if (!Strings.isNullOrEmpty(backgroundColor))
            {
                addStyle("background-color", backgroundColor);
            }
            if (!Strings.isNullOrEmpty(fontSize))
            {
                addStyle("font-size", fontSize);
            }
            if (!Strings.isNullOrEmpty(symbolColour))
            {
                addStyle("--symbol-color", symbolColour);
            }
            if (!Strings.isNullOrEmpty(symbolColourActive))
            {
                addStyle("--symbol-color-active", symbolColourActive);
            }
            if (!Strings.isNullOrEmpty(symbolSpacing))
            {
                addStyle("--symbol-spacing", symbolSpacing);
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
                added.add("'" + icon.getName() + "'");
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
                    """.formatted(getID(true), symbol.setTiny(true)
                                                     .toString(0)));
            sb.append(script.toString(0));
        }

        return sb;
    }

    @Override
    public J bind(String variableName)
    {
        addAttribute("[attrs.value]", variableName);
        return (J) this;
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

    public WaRating bindSize(String variableName)
    {
        addAttribute("[attrs.size]", variableName);
        return this;
    }

    public WaRating bindColor(String variableName)
    {
        addAttribute("[attrs.color]", variableName);
        return this;
    }

    public WaRating bindBackgroundColor(String variableName)
    {
        addStyle("[style.background-color]", variableName);
        return this;
    }

    public WaRating bindFontSize(String variableName)
    {
        addStyle("[style.font-size]", variableName);
        return this;
    }

    public WaRating bindSymbolColor(String variableName)
    {
        addStyle("[style.--symbol-color]", variableName);
        return this;
    }

    public WaRating bindSymbolColorActive(String variableName)
    {
        addStyle("[style.--symbol-color-active]", variableName);
        return this;
    }

    public WaRating bindSymbolSpacing(String variableName)
    {
        addStyle("[style.--symbol-spacing]", variableName);
        return this;
    }
}
