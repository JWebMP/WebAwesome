package com.jwebmp.webawesome.components.checkbox;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaCheckbox component represents a checkbox input element.
 * It supports various states like checked, disabled, required, and indeterminate.
 * It also supports form integration, custom styling, and programmatic control.
 */
@Getter
@Setter
@NgImportReference(value = "WaCheckboxDirective", reference = "angular-awesome")
@NgImportModule("WaCheckboxDirective")
public class WaCheckbox<J extends WaCheckbox<J>> extends DivSimple<J>
{
    /**
     * Determines if the checkbox is checked
     */
    private Boolean checked;

    /**
     * Disables the checkbox
     */
    private Boolean disabled;

    /**
     * Sets checkbox to indeterminate state
     */
    private Boolean indeterminate;

    /**
     * Marks checkbox as required
     */
    private Boolean required;

    /**
     * Controls the size of the checkbox
     */
    private Size size;

    /**
     * Descriptive hint text
     */
    private String hint;

    /**
     * Value attribute for the checkbox
     */
    private String value;


    /**
     * Link to external form by ID
     */
    private String form;

    /**
     * The checkbox's background color
     */
    private String backgroundColor;

    /**
     * The checkbox's background color when checked
     */
    private String backgroundColorChecked;

    /**
     * The color of the checkbox's borders
     */
    private String borderColor;

    /**
     * The color of the checkbox's borders when checked
     */
    private String borderColorChecked;

    /**
     * The radius of the checkbox's corners
     */
    private String borderRadius;

    /**
     * The style of the checkbox's borders
     */
    private String borderStyle;

    /**
     * The width of the checkbox's borders
     */
    private String borderWidth;

    /**
     * The shadow effects around the edges of the checkbox
     */
    private String boxShadow;

    /**
     * The color of the checkbox's icon
     */
    private String checkedIconColor;

    /**
     * The size of the checkbox
     */
    private String toggleSize;

    /**
     * Creates a new WaCheckbox component
     */
    public WaCheckbox()
    {
        setTag("wa-checkbox");
    }

    /**
     * Creates a new WaCheckbox component with the specified text
     *
     * @param text The text to display next to the checkbox
     */
    public WaCheckbox(String text)
    {
        this();
        add(new Paragraph<>(text).setTextOnly(true));
    }

    /**
     * Programmatically focuses checkbox
     *
     * @return This object for method chaining
     */
    public WaCheckbox focus()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
    }

    /**
     * Removes focus from checkbox
     *
     * @return This object for method chaining
     */
    public WaCheckbox blur()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
    }

    /**
     * Programmatically clicks the checkbox
     *
     * @return This object for method chaining
     */
    public WaCheckbox click()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
    }

    /**
     * Sets custom validity message
     *
     * @param message The custom validity message
     * @return This object for method chaining
     */
    public WaCheckbox setCustomValidity(String message)
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
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
            if (indeterminate != null && indeterminate)
            {
                addAttribute("indeterminate", "");
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (size != null)
            {
                addAttribute("size", size.toString()
                                         .toLowerCase());
            }
            if (!Strings.isNullOrEmpty(hint))
            {
                addAttribute("hint", hint);
            }
            if (!Strings.isNullOrEmpty(value))
            {
                addAttribute("value", value);
            }
            if (!Strings.isNullOrEmpty(getName()))
            {
                String defaultName = getClass().getName().replace('.', '_');
                if (!getName().equals(defaultName))
                {
                    addAttribute("name", getName());
                }
            }
            if (!Strings.isNullOrEmpty(form))
            {
                addAttribute("form", form);
            }

            // Apply CSS custom properties
            if (!Strings.isNullOrEmpty(backgroundColor))
            {
                addStyle("--background-color", backgroundColor);
            }
            if (!Strings.isNullOrEmpty(backgroundColorChecked))
            {
                addStyle("--background-color-checked", backgroundColorChecked);
            }
            if (!Strings.isNullOrEmpty(borderColor))
            {
                addStyle("--border-color", borderColor);
            }
            if (!Strings.isNullOrEmpty(borderColorChecked))
            {
                addStyle("--border-color-checked", borderColorChecked);
            }
            if (!Strings.isNullOrEmpty(borderRadius))
            {
                addStyle("--border-radius", borderRadius);
            }
            if (!Strings.isNullOrEmpty(borderStyle))
            {
                addStyle("--border-style", borderStyle);
            }
            if (!Strings.isNullOrEmpty(borderWidth))
            {
                addStyle("--border-width", borderWidth);
            }
            if (!Strings.isNullOrEmpty(boxShadow))
            {
                addStyle("--box-shadow", boxShadow);
            }
            if (!Strings.isNullOrEmpty(checkedIconColor))
            {
                addStyle("--checked-icon-color", checkedIconColor);
            }
            if (!Strings.isNullOrEmpty(toggleSize))
            {
                addStyle("--toggle-size", toggleSize);
            }
        }
        super.init();
    }

    @Override
    public J bind(String variableName)
    {
        addAttribute("[(ngModel)]", variableName);
        return (J) this;
    }
}
