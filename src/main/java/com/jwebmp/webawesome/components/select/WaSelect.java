package com.jwebmp.webawesome.components.select;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaSelect component is a dropdown select control that allows users to choose from a list of options.
 * It supports features like labeling, hints, placeholder, multiple selection, and custom styling.
 * <p>
 * Attributes:
 * - `value`: Bound via ngModel, corresponds to the value attribute
 * - `label`: Sets the label of the select
 * - `hint`: Provides additional guidance to the user
 * - `placeholder`: Placeholder when no option is selected
 * - `appearance`: Changes visual style (outlined, filled)
 * - `pill`: Applies pill-style rounded borders
 * - `withClear`: Shows a clear button when an option is selected
 * - `disabled`: Disables the select control
 * - `multiple`: Enables multiple selection
 * - `size`: Sets size variant (small, medium, large)
 * - `placement`: Preferred dropdown position (top, bottom)
 * - `required`: Enables HTML form validation
 * - `maxOptionsVisible`: Controls how many selected tags are visible when multiple is true
 * - `form`: Form association when outside a form
 * <p>
 * Events:
 * - `inputEvent`: Fires when the user selects an option
 * - `changeEvent`: Fires when the value changes
 * - `focusEvent`: Fires on focus
 * - `blurEvent`: Fires on blur
 * - `clearEvent`: Emitted when the clear button is clicked
 * - `showEvent`: Emitted when the dropdown opens
 * - `afterShowEvent`: After the dropdown is fully opened
 * - `hideEvent`: Emitted when the dropdown closes
 * - `afterHideEvent`: After the dropdown is fully closed
 * - `invalidEvent`: When constraint validation fails
 * <p>
 * Styling Properties:
 * - `backgroundColor`: Sets the --background-color CSS property
 * - `borderColor`: Sets the --border-color CSS property
 * - `borderWidth`: Sets the --border-width CSS property
 * - `boxShadow`: Sets the --box-shadow CSS property
 * - `backgroundColorCurrent`: Sets the --background-color-current CSS property
 * - `backgroundColorHover`: Sets the --background-color-hover CSS property
 * - `textColorCurrent`: Sets the --text-color-current CSS property
 * - `textColorHover`: Sets the --text-color-hover CSS property
 * <p>
 * Usage examples:
 * <pre>
 * // Basic select
 * WaSelect select = new WaSelect();
 * select.setLabel("Choose an option");
 * select.add(new WaSelectOption().setValue("option1").setText("Option 1"));
 * select.add(new WaSelectOption().setValue("option2").setText("Option 2"));
 * 
 * // Select with multiple selection
 * WaSelect multiSelect = new WaSelect();
 * multiSelect.setLabel("Choose multiple options");
 * multiSelect.setMultiple(true);
 * multiSelect.setMaxOptionsVisible(3);
 * multiSelect.add(new WaSelectOption().setValue("option1").setText("Option 1"));
 * multiSelect.add(new WaSelectOption().setValue("option2").setText("Option 2"));
 * 
 * // Select with custom styling
 * WaSelect styledSelect = new WaSelect();
 * styledSelect.setLabel("Custom styled select");
 * styledSelect.setAppearance(SelectAppearance.Filled);
 * styledSelect.setPill(true);
 * styledSelect.setBackgroundColor("#f8f9fa");
 * styledSelect.setBorderColor("#6c757d");
 * </pre>
 */
@Getter
@Setter
@NgImportReference(value = "WaSelectWrapperComponent", reference = "angular-awesome")
@NgImportModule("WaSelectWrapperComponent")
public class WaSelect<J extends WaSelect<J>> extends DivSimple<J>
{
    /**
     * Hint text to display below the select
     */
    private String hint;

    /**
     * Label text to display above the select
     */
    private String label;

    /**
     * Placeholder text to display when no option is selected
     */
    private String placeholder;

    /**
     * Whether to show a clear button when an option is selected
     */
    private Boolean withClear;

    /**
     * Visual appearance style (outlined or filled)
     */
    private SelectAppearance appearance;

    /**
     * Whether to apply pill-style rounded borders
     */
    private Boolean pill;

    /**
     * Whether the select is disabled
     */
    private Boolean disabled;

    /**
     * Whether multiple options can be selected
     */
    private Boolean multiple;

    /**
     * Whether the select is required for form validation
     */
    private Boolean required;

    /**
     * Form association when outside a <form>
     */
    private String form;

    /**
     * Maximum number of visible selected options when multiple is true
     */
    private Integer maxOptionsVisible;

    /**
     * Size variant (small, medium, large)
     */
    private Size size;

    /**
     * Preferred dropdown position (top or bottom)
     */
    private SelectPlacement placement;

    /**
     * Component to display before the select text
     */
    private IComponentHierarchyBase<?, ?> start;

    /**
     * Component to display after the select text
     */
    private IComponentHierarchyBase<?, ?> end;
    
    /**
     * Event handler for when the user selects an option
     */
    private String inputEvent;
    
    /**
     * Event handler for when the value changes
     */
    private String changeEvent;
    
    /**
     * Event handler for when the select gains focus
     */
    private String focusEvent;
    
    /**
     * Event handler for when the select loses focus
     */
    private String blurEvent;
    
    /**
     * Event handler for when the clear button is clicked
     */
    private String clearEvent;
    
    /**
     * Event handler for when the dropdown opens
     */
    private String showEvent;
    
    /**
     * Event handler for after the dropdown is fully opened
     */
    private String afterShowEvent;
    
    /**
     * Event handler for when the dropdown closes
     */
    private String hideEvent;
    
    /**
     * Event handler for after the dropdown is fully closed
     */
    private String afterHideEvent;
    
    /**
     * Event handler for when constraint validation fails
     */
    private String invalidEvent;

    /**
     * Background color of the select
     */
    private String backgroundColor;

    /**
     * Border color of the select
     */
    private String borderColor;

    /**
     * Border width of the select
     */
    private String borderWidth;

    /**
     * Box shadow of the select
     */
    private String boxShadow;

    /**
     * Background color when an option is selected
     */
    private String backgroundColorCurrent;

    /**
     * Background color when hovering over an option
     */
    private String backgroundColorHover;

    /**
     * Text color when an option is selected
     */
    private String textColorCurrent;

    /**
     * Text color when hovering over an option
     */
    private String textColorHover;

    /**
     * A space delimited list of values to set as the selected options.
     */
    private String value;

    /**
     * Creates a new WaSelect with the tag "wa-select-wrapper"
     */
    public WaSelect()
    {
        setTag("wa-select-wrapper");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(hint))
            {
                addAttribute("hint", hint);
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (!Strings.isNullOrEmpty(placeholder))
            {
                addAttribute("placeholder", placeholder);
            }
            if (withClear != null && withClear)
            {
                addAttribute("with-clear", "");
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString());
            }
            if (pill != null && pill)
            {
                addAttribute("pill", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (multiple != null && multiple)
            {
                addAttribute("multiple", "");
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (!Strings.isNullOrEmpty(form))
            {
                addAttribute("form", form);
            }
            if (maxOptionsVisible != null)
            {
                addAttribute("max-options-visible", maxOptionsVisible.toString());
            }
            if (size != null)
            {
                addAttribute("size", size.toString().toLowerCase());
            }
            if (placement != null)
            {
                addAttribute("placement", placement.toString());
            }
            if (!Strings.isNullOrEmpty(value))
            {
                addAttribute("value", value);
            }

            if (start != null)
            {
                start.asAttributeBase()
                     .addAttribute("slot", "start");
                add(0, start);
            }
            if (end != null)
            {
                end.asAttributeBase()
                   .addAttribute("slot", "end");
                add(end);
            }
            
            // Add event handlers
            if (!Strings.isNullOrEmpty(inputEvent))
            {
                addAttribute("input", inputEvent);
            }
            if (!Strings.isNullOrEmpty(changeEvent))
            {
                addAttribute("change", changeEvent);
            }
            if (!Strings.isNullOrEmpty(focusEvent))
            {
                addAttribute("focus", focusEvent);
            }
            if (!Strings.isNullOrEmpty(blurEvent))
            {
                addAttribute("blur", blurEvent);
            }
            if (!Strings.isNullOrEmpty(clearEvent))
            {
                addAttribute("wa-clear", clearEvent);
            }
            if (!Strings.isNullOrEmpty(showEvent))
            {
                addAttribute("wa-show", showEvent);
            }
            if (!Strings.isNullOrEmpty(afterShowEvent))
            {
                addAttribute("wa-after-show", afterShowEvent);
            }
            if (!Strings.isNullOrEmpty(hideEvent))
            {
                addAttribute("wa-hide", hideEvent);
            }
            if (!Strings.isNullOrEmpty(afterHideEvent))
            {
                addAttribute("wa-after-hide", afterHideEvent);
            }
            if (!Strings.isNullOrEmpty(invalidEvent))
            {
                addAttribute("wa-invalid", invalidEvent);
            }

            // Add CSS custom properties
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
            if (!Strings.isNullOrEmpty(backgroundColorCurrent))
            {
                addStyle("--background-color-current", backgroundColorCurrent);
            }
            if (!Strings.isNullOrEmpty(backgroundColorHover))
            {
                addStyle("--background-color-hover", backgroundColorHover);
            }
            if (!Strings.isNullOrEmpty(textColorCurrent))
            {
                addStyle("--text-color-current", textColorCurrent);
            }
            if (!Strings.isNullOrEmpty(textColorHover))
            {
                addStyle("--text-color-hover", textColorHover);
            }
        }
        super.init();
    }

    @Override
    public J bind(String variableName)
    {
        addAttribute("[(ngModel)]", variableName);
        addConfiguration(AnnotationUtils.getNgImportReference("FormsModule", "@angular/forms"));
        addConfiguration(AnnotationUtils.getNgImportModule("FormsModule"));
        return (J) this;
    }
}