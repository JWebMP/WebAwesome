package com.jwebmp.webawesome.components.textarea;


import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.FocusTokenCapable;
import com.jwebmp.webawesome.components.TypographyTokenCapable;
import com.jwebmp.webawesome.components.ComponentGroupTokenCapable;
import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
/**
 * The WaTextArea component collects multiline user input with optional labels, hints,
 * resize behaviors, and appearance customization.
 * <p>
 * This component renders as a wa-textarea HTML element and supports various customization options
 * through properties like label, hint, rows, resize, size, appearance, and more.
 */
@Getter
@NgImportReference(value = "WaTextareaComponent", reference = "angular-awesome")
@NgImportModule("WaTextareaComponent")
public class WaTextArea<J extends WaTextArea<J>> extends DivSimple<J> implements BorderTokenCapable<J>, SpaceTokenCapable<J>, FocusTokenCapable<J>, TypographyTokenCapable<J>, ComponentGroupTokenCapable<J>
{
    /**
     * The current value of the textarea
     */
    private String value;

    /**
     * Placeholder text when the input is empty
     */
    private String placeholder;

    /**
     * A label for accessibility
     */
    private String label;

    /**
     * A hint that describes how to use the input
     */
    private String hint;

    /**
     * The number of rows shown by default
     */
    private Integer rows;

    /**
     * Resize behavior of the textarea
     */
    private TextAreaResize resize;

    /**
     * Size of the textarea (small, medium, large, inherit)
     */
    private Size size;

    /**
     * Visual appearance style (filled, outlined)
     */
    private TextAreaAppearance appearance;

    /**
     * Whether the textarea is disabled
     */
    private Boolean disabled;

    /**
     * Whether the textarea is read-only
     */
    private Boolean readonly;

    /**
     * Whether the textarea is a required field
     */
    private Boolean required;

    /**
     * Minimum length constraint
     */
    private Integer minlength;

    /**
     * Maximum length constraint
     */
    private Integer maxlength;

    /**
     * Auto-capitalization mode
     */
    private String autocapitalize;

    /**
     * Enables/disables browser autocorrection
     */
    private String autocorrect;

    /**
     * Autocomplete hint for browsers
     */
    private String autocomplete;

    /**
     * Whether to automatically focus this field on page load
     */
    private Boolean autofocus;

    /**
     * Keyboard enter key hint
     */
    private String enterkeyhint;

    /**
     * Whether spellchecking is enabled
     */
    private Boolean spellcheck;

    /**
     * Virtual keyboard type
     */
    private String inputmode;

    /**
     * SSR helper when using label slot
     */
    private Boolean withLabel;

    /**
     * SSR helper when using hint slot
     */
    private Boolean withHint;

    /**
     * SSR boolean — renders with-count attribute when truthy
     */
    private Boolean withCount;

    /**
     * Background color custom property
     */
    private String backgroundColor;

    /**
     * Border color custom property
     */
    private String borderColor;

    /**
     * Border width custom property
     */
    private String borderWidth;

    /**
     * Box shadow custom property
     */
    private String boxShadow;

    /**
     * Creates a new WaTextArea with the tag "wa-textarea"
     */
    @SuppressWarnings("unchecked")
    public J setValue(String value)
    {
        this.value = value;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setPlaceholder(String placeholder)
    {
        this.placeholder = placeholder;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setHint(String hint)
    {
        this.hint = hint;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setRows(Integer rows)
    {
        this.rows = rows;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setResize(TextAreaResize resize)
    {
        this.resize = resize;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSize(Size size)
    {
        this.size = size;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAppearance(TextAreaAppearance appearance)
    {
        this.appearance = appearance;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setReadonly(Boolean readonly)
    {
        this.readonly = readonly;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setRequired(Boolean required)
    {
        this.required = required;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setMinlength(Integer minlength)
    {
        this.minlength = minlength;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setMaxlength(Integer maxlength)
    {
        this.maxlength = maxlength;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAutocapitalize(String autocapitalize)
    {
        this.autocapitalize = autocapitalize;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAutocorrect(String autocorrect)
    {
        this.autocorrect = autocorrect;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAutocomplete(String autocomplete)
    {
        this.autocomplete = autocomplete;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAutofocus(Boolean autofocus)
    {
        this.autofocus = autofocus;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setEnterkeyhint(String enterkeyhint)
    {
        this.enterkeyhint = enterkeyhint;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSpellcheck(Boolean spellcheck)
    {
        this.spellcheck = spellcheck;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setInputmode(String inputmode)
    {
        this.inputmode = inputmode;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWithLabel(Boolean withLabel)
    {
        this.withLabel = withLabel;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWithHint(Boolean withHint)
    {
        this.withHint = withHint;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWithCount(Boolean withCount)
    {
        this.withCount = withCount;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBackgroundColor(String backgroundColor)
    {
        this.backgroundColor = backgroundColor;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBorderColor(String borderColor)
    {
        this.borderColor = borderColor;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBorderWidth(String borderWidth)
    {
        this.borderWidth = borderWidth;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBoxShadow(String boxShadow)
    {
        this.boxShadow = boxShadow;
        return (J) this;
    }    public WaTextArea()
    {
        setTag("wa-textarea");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(value))
            {
                addAttribute("value", value);
            }
            if (!Strings.isNullOrEmpty(placeholder))
            {
                addAttribute("placeholder", placeholder);
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (!Strings.isNullOrEmpty(hint))
            {
                addAttribute("hint", hint);
            }
            if (rows != null)
            {
                addAttribute("[rows]", rows.toString());
            }
            if (resize != null)
            {
                addAttribute("resize", resize.toString());
            }
            if (size != null)
            {
                addAttribute("size", size.toString());
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString());
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (readonly != null && readonly)
            {
                addAttribute("readonly", "");
            }
            if (!Strings.isNullOrEmpty(getName()))
            {
                String defaultName = getClass().getName().replace('.', '_');
                if (!getName().equals(defaultName))
                {
                    addAttribute("name", getName());
                }
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (minlength != null)
            {
                addAttribute("minlength", minlength.toString());
            }
            if (maxlength != null)
            {
                addAttribute("maxlength", maxlength.toString());
            }
            if (!Strings.isNullOrEmpty(autocapitalize))
            {
                addAttribute("autocapitalize", autocapitalize);
            }
            if (!Strings.isNullOrEmpty(autocorrect))
            {
                addAttribute("autocorrect", autocorrect);
            }
            if (!Strings.isNullOrEmpty(autocomplete))
            {
                addAttribute("autocomplete", autocomplete);
            }
            if (autofocus != null && autofocus)
            {
                addAttribute("autofocus", "");
            }
            if (!Strings.isNullOrEmpty(enterkeyhint))
            {
                addAttribute("enterkeyhint", enterkeyhint);
            }
            if (spellcheck != null)
            {
                addAttribute("spellcheck", spellcheck.toString());
            }
            if (!Strings.isNullOrEmpty(inputmode))
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
            if (withCount != null && withCount)
            {
                addAttribute("with-count", "");
            }
            if (!Strings.isNullOrEmpty(backgroundColor))
            {
                addStyle("--background-color", backgroundColor);
            }
            if (!Strings.isNullOrEmpty(borderColor))
            {
                addStyle("--border-color", borderColor);
            }
            if (!Strings.isNullOrEmpty(borderWidth))
            {
                addStyle("--border-width", borderWidth);
            }
            if (!Strings.isNullOrEmpty(boxShadow))
            {
                addStyle("--box-shadow", boxShadow);
            }
        }
        super.init();
    }

    /**
     * Binds the value attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindValue(String variableName)
    {
        addAttribute("[value]", variableName);
        return (J) this;
    }

    /**
     * Binds the placeholder attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindPlaceholder(String variableName)
    {
        addAttribute("[placeholder]", variableName);
        return (J) this;
    }

    /**
     * Binds the label attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindLabel(String variableName)
    {
        addAttribute("[label]", variableName);
        return (J) this;
    }

    /**
     * Binds the hint attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindHint(String variableName)
    {
        addAttribute("[hint]", variableName);
        return (J) this;
    }

    /**
     * Binds the rows attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindRows(String variableName)
    {
        addAttribute("[rows]", variableName);
        return (J) this;
    }

    /**
     * Binds the resize attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindResize(String variableName)
    {
        addAttribute("[resize]", variableName);
        return (J) this;
    }

    /**
     * Binds the size attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindSize(String variableName)
    {
        addAttribute("[size]", variableName);
        return (J) this;
    }

    /**
     * Binds the appearance attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindAppearance(String variableName)
    {
        addAttribute("[appearance]", variableName);
        return (J) this;
    }

    /**
     * Binds the disabled attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindDisabled(String variableName)
    {
        addAttribute("[disabled]", variableName);
        return (J) this;
    }

    /**
     * Binds the readonly attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindReadonly(String variableName)
    {
        addAttribute("[readonly]", variableName);
        return (J) this;
    }

    /**
     * Binds the name attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindFormName(String variableName)
    {
        addAttribute("[name]", variableName);
        return (J) this;
    }

    /**
     * Binds the required attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindRequired(String variableName)
    {
        addAttribute("[required]", variableName);
        return (J) this;
    }

    /**
     * Adds a handler for the focus event
     *
     * @param handlerScript The JavaScript to execute when the textarea gains focus
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J onFocus(String handlerScript)
    {
        addAttribute("(focusEvent)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the blur event
     *
     * @param handlerScript The JavaScript to execute when the textarea loses focus
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J onBlur(String handlerScript)
    {
        addAttribute("(blurEvent)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the input event
     *
     * @param handlerScript The JavaScript to execute on every value change
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J onInput(String handlerScript)
    {
        addAttribute("(inputEvent)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the change event
     *
     * @param handlerScript The JavaScript to execute when value is committed by user
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J onChange(String handlerScript)
    {
        addAttribute("(changeEvent)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the invalid event
     *
     * @param handlerScript The JavaScript to execute when the form control is invalid
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J onInvalid(String handlerScript)
    {
        addAttribute("(invalid)", handlerScript);
        return (J) this;
    }
}