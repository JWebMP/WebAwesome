package com.jwebmp.webawesome.components.input;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaInput component provides a way to capture user input with various types, validations, and styling options.
 */
@Getter
@NgImportReference(value = "WaInputDirective", reference = "angular-awesome")
@NgImportModule("WaInputDirective")
public class WaInput<J extends WaInput<J>> extends DivSimple<J>
{
    /**
     * The input type (text, password, email, number, etc.)
     */
    private String type;

    /**
     * The input value
     */
    private String value;

    /**
     * The default value of the input (used primarily for form reset)
     */
    private String defaultValue;

    /**
     * The input size (small, medium, large, inherit)
     */
    private InputSize size;

    /**
     * The input appearance style (filled, outlined)
     */
    private InputAppearance appearance;

    /**
     * Whether to use pill-shaped input
     */
    private Boolean pill;

    /**
     * The label text
     */
    private String label;

    /**
     * The hint text displayed below the input
     */
    private String hint;

    /**
     * SSR flag to indicate the label slot is present on initial paint
     */
    private Boolean withLabel;

    /**
     * SSR flag to indicate the hint slot is present on initial paint
     */
    private Boolean withHint;

    /**
     * Whether to show a clear button
     */
    private Boolean clearable;

    /**
     * The placeholder text
     */
    private String placeholder;

    /**
     * Whether the input is read-only
     */
    private Boolean readonly;

    /**
     * Whether the input is disabled
     */
    private Boolean disabled;

    /**
     * Whether to show password toggle button (for password type)
     */
    private Boolean passwordToggle;

    /**
     * Whether password is initially visible
     */
    private Boolean passwordVisible;

    /**
     * Whether to hide spin buttons (for number type)
     */
    private Boolean noSpinButtons;

    /**
     * Form ID to associate with
     */
    private String form;

    /**
     * Whether the input is required
     */
    private Boolean required;

    /**
     * Validation pattern
     */
    private String pattern;

    /**
     * Minimum input length
     */
    private String minlength;

    /**
     * Maximum input length
     */
    private String maxlength;

    /**
     * Minimum value (for number type)
     */
    private String min;

    /**
     * Maximum value (for number type)
     */
    private String max;

    /**
     * Step value (for number type)
     */
    private String step;

    /**
     * Autocapitalization behavior
     */
    private String autocapitalize;

    /**
     * Autocorrection behavior
     */
    private String autocorrect;

    /**
     * Autocomplete behavior
     */
    private String autocomplete;

    /**
     * Whether to autofocus the input
     */
    private Boolean autofocus;

    /**
     * Customize enter key behavior
     */
    private String enterkeyhint;

    /**
     * Whether to enable spellcheck
     */
    private Boolean spellcheck;

    /**
     * Input mode hint
     */
    private String inputmode;

    /**
     * Background color
     */
    private String backgroundColor;

    /**
     * Border color
     */
    private String borderColor;

    /**
     * Border width
     */
    private String borderWidth;

    /**
     * Box shadow
     */
    private String boxShadow;

    // Slots: label, start, end, clear-icon, show-password-icon, hide-password-icon, hint
    private IComponentHierarchyBase<?, ?> labelSlot;
    private IComponentHierarchyBase<?, ?> start;
    private IComponentHierarchyBase<?, ?> end;
    private IComponentHierarchyBase<?, ?> clearIcon;
    private IComponentHierarchyBase<?, ?> showPasswordIcon;
    private IComponentHierarchyBase<?, ?> hidePasswordIcon;
    private IComponentHierarchyBase<?, ?> hintSlot;

    /**
     * Creates a new WaInput component
     */
    public WaInput()
    {
        setTag("wa-input");
    }

    /**
     * Creates a new WaInput component with the specified label
     *
     * @param label The label text
     */
    public WaInput(String label)
    {
        this();
        this.label = label;
    }

    /**
     * Creates a new WaInput component with the specified label and type
     *
     * @param label The label text
     * @param type  The input type
     */
    public WaInput(String label, String type)
    {
        this(label);
        this.type = type;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (type != null)
            {
                addAttribute("type", type);
            }
            if (value != null)
            {
                addAttribute("value", value);
            }
            else if (defaultValue != null)
            {
                // Use defaultValue when value is not explicitly set
                addAttribute("value", defaultValue);
            }
            if (size != null)
            {
                addAttribute("size", size.toString());
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString());
            }
            if (pill != null && pill)
            {
                addAttribute("pill", "");
            }
            if (label != null)
            {
                addAttribute("label", label);
            }
            if (hint != null)
            {
                addAttribute("hint", hint);
            }
            if (clearable != null && clearable)
            {
                addAttribute("with-clear", "");
            }
            if (placeholder != null)
            {
                addAttribute("placeholder", placeholder);
            }
            if (getName() != null && !getName().isEmpty())
            {
                String defaultName = getClass().getName().replace('.', '_');
                if (!getName().equals(defaultName))
                {
                    addAttribute("name", getName());
                }
            }
            if (readonly != null && readonly)
            {
                addAttribute("readonly", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (passwordToggle != null && passwordToggle)
            {
                addAttribute("password-toggle", "");
            }
            if (passwordVisible != null && passwordVisible)
            {
                addAttribute("password-visible", "");
            }
            if (noSpinButtons != null && noSpinButtons)
            {
                addAttribute("without-spin-buttons", "");
            }
            if (form != null)
            {
                addAttribute("form", form);
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (pattern != null)
            {
                addAttribute("pattern", pattern);
            }
            if (minlength != null)
            {
                addAttribute("minlength", minlength);
            }
            if (maxlength != null)
            {
                addAttribute("maxlength", maxlength);
            }
            if (min != null)
            {
                addAttribute("min", min);
            }
            if (max != null)
            {
                addAttribute("max", max);
            }
            if (step != null)
            {
                addAttribute("step", step);
            }
            if (autocapitalize != null)
            {
                addAttribute("autocapitalize", autocapitalize);
            }
            if (autocorrect != null)
            {
                addAttribute("autocorrect", autocorrect);
            }
            if (autocomplete != null)
            {
                addAttribute("autocomplete", autocomplete);
            }
            if (autofocus != null && autofocus)
            {
                addAttribute("autofocus", "");
            }
            if (enterkeyhint != null)
            {
                addAttribute("enterkeyhint", enterkeyhint);
            }
            if (spellcheck != null)
            {
                addAttribute("spellcheck", spellcheck.toString());
            }
            if (inputmode != null)
            {
                addAttribute("inputmode", inputmode);
            }
            if (withLabel != null && withLabel)
            {
                addAttribute("with-label", "");
            }
            if (withHint != null && withHint)
            {
                addAttribute("with-hint", "");
            }
            if (backgroundColor != null)
            {
                addStyle("--background-color", backgroundColor);
            }
            if (borderColor != null)
            {
                addStyle("--border-color", borderColor);
            }
            if (borderWidth != null)
            {
                addStyle("--border-width", borderWidth);
            }
            if (boxShadow != null)
            {
                addStyle("--box-shadow", boxShadow);
            }

            // Append slot components if provided
            if (labelSlot != null)
            {
                labelSlot.asAttributeBase()
                         .addAttribute("slot", "label");
                add(labelSlot);
            }
            if (start != null)
            {
                start.asAttributeBase()
                     .addAttribute("slot", "start");
                add(start);
            }
            if (end != null)
            {
                end.asAttributeBase()
                   .addAttribute("slot", "end");
                add(end);
            }
            if (clearIcon != null)
            {
                clearIcon.asAttributeBase()
                         .addAttribute("slot", "clear-icon");
                add(clearIcon);
            }
            if (showPasswordIcon != null)
            {
                showPasswordIcon.asAttributeBase()
                                .addAttribute("slot", "show-password-icon");
                add(showPasswordIcon);
            }
            if (hidePasswordIcon != null)
            {
                hidePasswordIcon.asAttributeBase()
                                .addAttribute("slot", "hide-password-icon");
                add(hidePasswordIcon);
            }
            if (hintSlot != null)
            {
                hintSlot.asAttributeBase()
                        .addAttribute("slot", "hint");
                add(hintSlot);
            }
        }
        super.init();
    }

    public @org.jspecify.annotations.NonNull J setType(String type)
    {
        this.type = type;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setValue(String value)
    {
        this.value = value;
        return (J) this;
    }

    /**
     * Sets the default value (used when value is not explicitly set)
     */
    public @org.jspecify.annotations.NonNull J setDefaultValue(String defaultValue)
    {
        this.defaultValue = defaultValue;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setSize(InputSize size)
    {
        this.size = size;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setAppearance(InputAppearance appearance)
    {
        this.appearance = appearance;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setPill(Boolean pill)
    {
        this.pill = pill;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setHint(String hint)
    {
        this.hint = hint;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setWithLabel(Boolean withLabel)
    {
        this.withLabel = withLabel;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setWithHint(Boolean withHint)
    {
        this.withHint = withHint;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setClearable(Boolean clearable)
    {
        this.clearable = clearable;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setPlaceholder(String placeholder)
    {
        this.placeholder = placeholder;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setReadonly(Boolean readonly)
    {
        this.readonly = readonly;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setPasswordToggle(Boolean passwordToggle)
    {
        this.passwordToggle = passwordToggle;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setPasswordVisible(Boolean passwordVisible)
    {
        this.passwordVisible = passwordVisible;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setNoSpinButtons(Boolean noSpinButtons)
    {
        this.noSpinButtons = noSpinButtons;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setForm(String form)
    {
        this.form = form;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setRequired(Boolean required)
    {
        this.required = required;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setPattern(String pattern)
    {
        this.pattern = pattern;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setMinlength(String minlength)
    {
        this.minlength = minlength;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setMaxlength(String maxlength)
    {
        this.maxlength = maxlength;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setMin(String min)
    {
        this.min = min;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setMax(String max)
    {
        this.max = max;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setStep(String step)
    {
        this.step = step;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setAutocapitalize(String autocapitalize)
    {
        this.autocapitalize = autocapitalize;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setAutocorrect(String autocorrect)
    {
        this.autocorrect = autocorrect;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setAutocomplete(String autocomplete)
    {
        this.autocomplete = autocomplete;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setAutofocus(Boolean autofocus)
    {
        this.autofocus = autofocus;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setEnterkeyhint(String enterkeyhint)
    {
        this.enterkeyhint = enterkeyhint;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setSpellcheck(Boolean spellcheck)
    {
        this.spellcheck = spellcheck;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setInputmode(String inputmode)
    {
        this.inputmode = inputmode;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setBackgroundColor(String backgroundColor)
    {
        this.backgroundColor = backgroundColor;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setBorderColor(String borderColor)
    {
        this.borderColor = borderColor;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setBorderWidth(String borderWidth)
    {
        this.borderWidth = borderWidth;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setBoxShadow(String boxShadow)
    {
        this.boxShadow = boxShadow;
        return (J) this;
    }

    // Slot setters
    public @org.jspecify.annotations.NonNull J setLabelSlot(IComponentHierarchyBase<?, ?> labelSlot)
    {
        this.labelSlot = labelSlot;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setStart(IComponentHierarchyBase<?, ?> start)
    {
        this.start = start;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setEnd(IComponentHierarchyBase<?, ?> end)
    {
        this.end = end;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setClearIcon(IComponentHierarchyBase<?, ?> clearIcon)
    {
        this.clearIcon = clearIcon;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setShowPasswordIcon(IComponentHierarchyBase<?, ?> showPasswordIcon)
    {
        this.showPasswordIcon = showPasswordIcon;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setHidePasswordIcon(IComponentHierarchyBase<?, ?> hidePasswordIcon)
    {
        this.hidePasswordIcon = hidePasswordIcon;
        return (J) this;
    }

    public @org.jspecify.annotations.NonNull J setHintSlot(IComponentHierarchyBase<?, ?> hintSlot)
    {
        this.hintSlot = hintSlot;
        return (J) this;
    }

    @Override
    public J bind(String variableName)
    {
        return addAttribute("[(ngModel)]", variableName);
    }
}
