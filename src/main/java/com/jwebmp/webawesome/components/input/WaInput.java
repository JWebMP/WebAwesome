package com.jwebmp.webawesome.components.input;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaInput component provides a way to capture user input with various types, validations, and styling options.
 */
@Getter
@Setter
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
                addAttribute("clearable", "");
            }
            if (placeholder != null)
            {
                addAttribute("placeholder", placeholder);
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
                addAttribute("no-spin-buttons", "");
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
        }
        super.init();
    }
}
