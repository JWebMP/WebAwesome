package com.jwebmp.webawesome.components.rating;


import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.FocusTokenCapable;
import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Script;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * The WaRating component allows users to provide or view ratings using configurable visual representations.
 * It supports features like labeling, custom maximum values, precision, and custom styling.
 * <p>
 * This component renders as a wa-rating HTML element and supports various customization options
 * through properties and CSS custom properties.
 * <p>
 * Note: As of Web Awesome 3.4.1, the {@code getSymbol} callback signature has been updated to
 * {@code (value: number, isSelected: boolean) => String}. The second parameter indicates whether
 * the symbol at that position is currently selected/active.
 */
@Getter
@NgImportReference(value = "WaRatingDirective", reference = "angular-awesome")
@NgImportModule("WaRatingDirective")
public class WaRating<J extends WaRating<J>> extends DivSimple<J> implements SpaceTokenCapable<J>, FocusTokenCapable<J>
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

    /**
     * Form control name
     */
    private String formName;

    /**
     * Initial value for form resets
     */
    private Number defaultValue;

    /**
     * Whether the rating is a required form field
     */
    private Boolean required;

    /**
     * Associates with a form element by id
     */
    private String form;
    @SuppressWarnings("unchecked")
    public J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setValue(String value)
    {
        this.value = value;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setMax(Number max)
    {
        this.max = max;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setPrecision(Number precision)
    {
        this.precision = precision;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setReadonly(Boolean readonly)
    {
        this.readonly = readonly;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSize(Size size)
    {
        this.size = size;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setColor(String color)
    {
        this.color = color;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBackgroundColor(String backgroundColor)
    {
        this.backgroundColor = backgroundColor;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFontSize(String fontSize)
    {
        this.fontSize = fontSize;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setIcons(List<WaIcon<?>> icons)
    {
        this.icons = icons;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSymbol(WaIcon<?> symbol)
    {
        this.symbol = symbol;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSymbolColour(String symbolColour)
    {
        this.symbolColour = symbolColour;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSymbolColourActive(String symbolColourActive)
    {
        this.symbolColourActive = symbolColourActive;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSymbolSpacing(String symbolSpacing)
    {
        this.symbolSpacing = symbolSpacing;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFormName(String formName)
    {
        this.formName = formName;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDefaultValue(Number defaultValue)
    {
        this.defaultValue = defaultValue;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setRequired(Boolean required)
    {
        this.required = required;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setForm(String form)
    {
        this.form = form;
        return (J) this;
    }
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
            if (!Strings.isNullOrEmpty(formName))
            {
                addAttribute("name", formName);
            }
            if (defaultValue != null)
            {
                addAttribute("default-value", String.valueOf(defaultValue));
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (!Strings.isNullOrEmpty(form))
            {
                addAttribute("form", form);
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
                    
                      rating.getSymbol = (value, isSelected) => {
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
                    
                      rating.getSymbol = (value, isSelected) =>'%s'
                    """.formatted(getID(true), symbol.setTiny(true)
                                                     .toString(0)));
            sb.append(script.toString(0));
        }

        return sb;
    }

    @Override
    @SuppressWarnings("unchecked")
    public J bind(String variableName)
    {
        addAttribute("[attrs.value]", variableName);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindMax(String variableName)
    {
        addAttribute("[attrs.max]", variableName);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindLabel(String variableName)
    {
        addAttribute("[attrs.label]", variableName);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindPrecision(String variableName)
    {
        addAttribute("[attrs.precision]", variableName);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindReadonly(String variableName)
    {
        addAttribute("[attrs.readonly]", variableName);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindDisabled(String variableName)
    {
        addAttribute("[attrs.disabled]", variableName);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindSize(String variableName)
    {
        addAttribute("[attrs.size]", variableName);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindColor(String variableName)
    {
        addAttribute("[attrs.color]", variableName);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindBackgroundColor(String variableName)
    {
        addStyle("[style.background-color]", variableName);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindFontSize(String variableName)
    {
        addStyle("[style.font-size]", variableName);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindSymbolColor(String variableName)
    {
        addStyle("[style.--symbol-color]", variableName);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindSymbolColorActive(String variableName)
    {
        addStyle("[style.--symbol-color-active]", variableName);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindSymbolSpacing(String variableName)
    {
        addStyle("[style.--symbol-spacing]", variableName);
        return (J) this;
    }
}