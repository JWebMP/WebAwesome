package com.jwebmp.webawesome.components.waswitch;


import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.FocusTokenCapable;
import com.jwebmp.webawesome.components.ComponentGroupTokenCapable;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
/**
 * The WaSwitch component is a toggle switch that can be used in forms.
 * It provides a visual way for users to toggle between two states (on/off).
 * <p>
 * This component renders as a wa-switch HTML element and supports various customization options
 * through properties like checked, disabled, size, and hint.
 */
@Getter
@NgImportReference(value = "WaSwitchDirective", reference = "angular-awesome")
@NgImportModule("WaSwitchDirective")
public class WaSwitch<J extends WaSwitch<J>> extends DivSimple<J> implements SpaceTokenCapable<J>, FocusTokenCapable<J>, ComponentGroupTokenCapable<J>
{
    /**
     * Whether the switch is checked (on)
     */
    private Boolean checked;

    /**
     * Whether the switch is disabled
     */
    private Boolean disabled;

    /**
     * Size of the switch (small, medium, large, inherit)
     */
    private Size size;

    /**
     * Hint text displayed below the switch
     */
    private String hint;

    /**
     * The value of the switch for form submission.
     */
    private String value;

    /**
     * Whether the switch is required for form validation.
     */
    private Boolean required;

    /**
     * Whether to render the hint slot.
     */
    private Boolean withHint;

    /**
     * Width of the switch
     */
    private String width;

    /**
     * Height of the switch
     */
    private String height;

    /**
     * Size of the thumb (the movable part of the switch)
     */
    private String thumbSize;

    /**
     * Color of the thumb
     */
    private String thumbColor;

    /**
     * Color of the thumb when checked
     */
    private String thumbColorChecked;

    /**
     * Shadow of the thumb
     */
    private String thumbShadow;

    /**
     * Background color of the switch
     */
    private String backgroundColor;

    /**
     * Background color of the switch when checked
     */
    private String backgroundColorChecked;

    /**
     * Border color of the switch
     */
    private String borderColor;

    /**
     * Border color of the switch when checked
     */
    private String borderColorChecked;

    /**
     * Border style of the switch
     */
    private String borderStyle;

    /**
     * Border width of the switch
     */
    private String borderWidth;

    /**
     * Box shadow of the switch
     */
    private String boxShadow;

    /**
     * Creates a new WaSwitch with the tag "wa-switch"
     */
    @SuppressWarnings("unchecked")
    public J setChecked(Boolean checked)
    {
        this.checked = checked;
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
    public J setHint(String hint)
    {
        this.hint = hint;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setValue(String value)
    {
        this.value = value;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setRequired(Boolean required)
    {
        this.required = required;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWithHint(Boolean withHint)
    {
        this.withHint = withHint;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWidth(String width)
    {
        this.width = width;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setHeight(String height)
    {
        this.height = height;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setThumbSize(String thumbSize)
    {
        this.thumbSize = thumbSize;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setThumbColor(String thumbColor)
    {
        this.thumbColor = thumbColor;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setThumbColorChecked(String thumbColorChecked)
    {
        this.thumbColorChecked = thumbColorChecked;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setThumbShadow(String thumbShadow)
    {
        this.thumbShadow = thumbShadow;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBackgroundColor(String backgroundColor)
    {
        this.backgroundColor = backgroundColor;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBackgroundColorChecked(String backgroundColorChecked)
    {
        this.backgroundColorChecked = backgroundColorChecked;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBorderColor(String borderColor)
    {
        this.borderColor = borderColor;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBorderColorChecked(String borderColorChecked)
    {
        this.borderColorChecked = borderColorChecked;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBorderStyle(String borderStyle)
    {
        this.borderStyle = borderStyle;
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
    }    public WaSwitch()
    {
        setTag("wa-switch");
        // Do not emit the waSwitch directive attribute; tag name is sufficient
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (checked != null && checked)
            {
                addAttribute("checked", "");
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
            if (hint != null)
            {
                addAttribute("hint", hint);
            }
            if (!com.google.common.base.Strings.isNullOrEmpty(getName()))
            {
                String defaultName = getClass().getName().replace('.', '_');
                if (!getName().equals(defaultName))
                {
                    addAttribute("name", getName());
                }
            }
            if (value != null)
            {
                addAttribute("value", value);
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (withHint != null && withHint)
            {
                addAttribute("with-hint", "");
            }
            if (width != null)
            {
                addStyle("--width", width);
            }
            if (height != null)
            {
                addStyle("--height", height);
            }
            if (thumbSize != null)
            {
                addStyle("--thumb-size", thumbSize);
            }
            if (thumbColor != null)
            {
                addStyle("--thumb-color", thumbColor);
            }
            if (thumbColorChecked != null)
            {
                addStyle("--thumb-color-checked", thumbColorChecked);
            }
            if (thumbShadow != null)
            {
                addStyle("--thumb-shadow", thumbShadow);
            }
            if (backgroundColor != null)
            {
                addStyle("--background-color", backgroundColor);
            }
            if (backgroundColorChecked != null)
            {
                addStyle("--background-color-checked", backgroundColorChecked);
            }
            if (borderColor != null)
            {
                addStyle("--border-color", borderColor);
            }
            if (borderColorChecked != null)
            {
                addStyle("--border-color-checked", borderColorChecked);
            }
            if (borderStyle != null)
            {
                addStyle("--border-style", borderStyle);
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

    /**
     * Overrides the bind method to support two-way binding with ngModel.
     * This allows the radio group to be used with [(ngModel)] in Angular templates.
     *
     * @param variableName The name of the variable to bind to.
     * @return The current instance of WaRadioGroup for method chaining.
     */
    @Override
    @SuppressWarnings("unchecked")
    public J bind(String variableName)
    {
        addAttribute("[(ngModel)]", variableName);
        addConfiguration(AnnotationUtils.getNgImportReference("FormsModule", "@angular/forms"));
        addConfiguration(AnnotationUtils.getNgImportModule("FormsModule"));
        return (J) this;
    }

    /**
     * Binds the checked attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindChecked(String variableName)
    {
        addAttribute("[checked]", variableName);
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
     * Binds the background-color style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindBackgroundColor(String variableName)
    {
        addAttribute("[style.--background-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the background-color-checked style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindBackgroundColorChecked(String variableName)
    {
        addAttribute("[style.--background-color-checked]", variableName);
        return (J) this;
    }

    /**
     * Binds the border-color style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindBorderColor(String variableName)
    {
        addAttribute("[style.--border-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the border-color-checked style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindBorderColorChecked(String variableName)
    {
        addAttribute("[style.--border-color-checked]", variableName);
        return (J) this;
    }

    /**
     * Binds the border-style style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindBorderStyle(String variableName)
    {
        addAttribute("[style.--border-style]", variableName);
        return (J) this;
    }

    /**
     * Binds the border-width style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindBorderWidth(String variableName)
    {
        addAttribute("[style.--border-width]", variableName);
        return (J) this;
    }

    /**
     * Binds the box-shadow style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindBoxShadow(String variableName)
    {
        addAttribute("[style.--box-shadow]", variableName);
        return (J) this;
    }

    /**
     * Binds the height style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindHeight(String variableName)
    {
        addAttribute("[style.--height]", variableName);
        return (J) this;
    }

    /**
     * Binds the thumb-color style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindThumbColor(String variableName)
    {
        addAttribute("[style.--thumb-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the thumb-color-checked style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindThumbColorChecked(String variableName)
    {
        addAttribute("[style.--thumb-color-checked]", variableName);
        return (J) this;
    }

    /**
     * Binds the thumb-shadow style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindThumbShadow(String variableName)
    {
        addAttribute("[style.--thumb-shadow]", variableName);
        return (J) this;
    }

    /**
     * Binds the thumb-size style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindThumbSize(String variableName)
    {
        addAttribute("[style.--thumb-size]", variableName);
        return (J) this;
    }

    /**
     * Binds the width style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindWidth(String variableName)
    {
        addAttribute("[style.--width]", variableName);
        return (J) this;
    }

    /**
     * Adds a handler for the change event
     *
     * @param handlerScript The JavaScript to execute when the checked state changes
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J onChange(String handlerScript)
    {
        addAttribute("(changeEvent)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the input event
     *
     * @param handlerScript The JavaScript to execute when the switch receives input
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J onInput(String handlerScript)
    {
        addAttribute("(inputEvent)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the focus event
     *
     * @param handlerScript The JavaScript to execute when the control gains focus
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
     * @param handlerScript The JavaScript to execute when the control loses focus
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J onBlur(String handlerScript)
    {
        addAttribute("(blurEvent)", handlerScript);
        return (J) this;
    }
}