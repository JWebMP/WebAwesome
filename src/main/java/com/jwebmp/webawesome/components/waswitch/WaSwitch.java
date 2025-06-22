package com.jwebmp.webawesome.components.waswitch;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaSwitch component is a toggle switch that can be used in forms.
 * It provides a visual way for users to toggle between two states (on/off).
 * <p>
 * This component renders as a wa-switch HTML element and supports various customization options
 * through properties like checked, disabled, size, and hint.
 */
@Getter
@Setter
@NgImportReference(value = "WaSwitchDirective", reference = "angular-awesome")
@NgImportModule("WaSwitchDirective")
public class WaSwitch<J extends WaSwitch<J>> extends DivSimple<J>
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
    public WaSwitch()
    {
        setTag("wa-switch");
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
     * Binds the checked attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
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
    public J onBlur(String handlerScript)
    {
        addAttribute("(blurEvent)", handlerScript);
        return (J) this;
    }
}
