package com.jwebmp.webawesome.components.radio;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Web Awesome radio group component.
 * This class provides methods to configure the radio group component's attributes.
 */
@Getter
@Setter
@NgImportReference(value = "WaRadioGroupDirective", reference = "angular-awesome")
@NgImportModule("WaRadioGroupDirective")
public class WaRadioGroup<J extends WaRadioGroup<J>> extends DivSimple<J>
{
    /**
     * The initial value of the radio group.
     * This can be null if not set.
     */
    private String initialValue;

    /**
     * The hint text for the radio group.
     * This can be null if not set.
     */
    private String hint;

    /**
     * The label for the radio group.
     * This can be null if not set.
     */
    private String label;

    /**
     * The orientation of the radio buttons.
     * Valid values: 'horizontal', 'vertical'
     * This can be null if not set.
     */
    private RadioOrientation orientation;

    /**
     * The size of the radio buttons.
     * This can be null if not set.
     */
    private Size size;

    /**
     * Whether the radio group is required.
     * This can be null if not set.
     */
    private Boolean required;

    /**
     * Whether the radio group is disabled.
     * This can be null if not set.
     */
    private Boolean disabled;

    /**
     * SSR-friendly flag for the label.
     * This can be null if not set.
     */
    private Boolean withLabel;

    /**
     * SSR-friendly flag for the hint.
     * This can be null if not set.
     */
    private Boolean withHint;

    /**
     * Custom gap between radio buttons.
     * This can be null if not set.
     */
    private String styleRadiosGap;

    /**
     * Event handler for when the radio group loses focus.
     */
    private String blurEvent;

    /**
     * Event handler for when the radio group gains focus.
     */
    private String focusEvent;

    /**
     * Event handler for when the user inputs a value.
     */
    private String inputEvent;

    /**
     * Event handler for when the selected value changes.
     */
    private String changeEvent;

    /**
     * Event handler for when validation fails.
     */
    private String invalidEvent;

    /**
     * Default constructor for the WaRadioGroup class.
     * Initializes the component with a default tag of `wa-radio-group`.
     */
    public WaRadioGroup()
    {
        setTag("wa-radio-group");
    }

    /**
     * Initializes the component.
     * Adds the attributes and styles to the component.
     */
    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(initialValue))
            {
                addAttribute("value", initialValue);
            }
            if (!Strings.isNullOrEmpty(getName()))
            {
                addAttribute("name", getName());
            }
            if (!Strings.isNullOrEmpty(hint))
            {
                addAttribute("hint", hint);
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (orientation != null)
            {
                addAttribute("orientation", orientation.toString());
            }
            if (size != null)
            {
                addAttribute("size", size.name()
                                         .toLowerCase());
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (withLabel != null && withLabel)
            {
                addAttribute("with-label", "");
            }
            if (withHint != null && withHint)
            {
                addAttribute("with-hint", "");
            }

            // Add CSS custom properties if specified
            if (!Strings.isNullOrEmpty(styleRadiosGap))
            {
                addStyle("--gap", styleRadiosGap);
            }

            // Add event handlers if specified
            if (!Strings.isNullOrEmpty(blurEvent))
            {
                addAttribute("blur", blurEvent);
            }
            if (!Strings.isNullOrEmpty(focusEvent))
            {
                addAttribute("focus", focusEvent);
            }
            if (!Strings.isNullOrEmpty(inputEvent))
            {
                addAttribute("input", inputEvent);
            }
            if (!Strings.isNullOrEmpty(changeEvent))
            {
                addAttribute("change", changeEvent);
            }
            if (!Strings.isNullOrEmpty(invalidEvent))
            {
                addAttribute("wa-invalid", invalidEvent);
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
    public J bind(String variableName)
    {
        addAttribute("[(ngModel)]", variableName);
        return (J) this;
    }

    /**
     * Binds the value attribute to an Angular variable (one-way binding)
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
     * Backwards-compatible setter that accepts a String orientation and maps it to the enum.
     * Accepts "horizontal" and "vertical" (case-insensitive). Any other non-empty value clears the orientation.
     *
     * @param orientation the orientation string
     * @return this
     */
    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setOrientation(String orientation)
    {
        if (Strings.isNullOrEmpty(orientation))
        {
            this.orientation = null;
        }
        else if ("horizontal".equalsIgnoreCase(orientation))
        {
            this.orientation = RadioOrientation.Horizontal;
        }
        else if ("vertical".equalsIgnoreCase(orientation))
        {
            this.orientation = RadioOrientation.Vertical;
        }
        else
        {
            this.orientation = null;
        }
        return (J) this;
    }
}
