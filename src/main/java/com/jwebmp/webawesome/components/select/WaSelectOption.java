package com.jwebmp.webawesome.components.select;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaSelectOption component represents an option within a WaSelect dropdown.
 * It allows for setting a value, disabled state, and custom styling.
 * <p>
 * Attributes:
 * - `value`: The value of the option, used when the option is selected
 * - `disabled`: Whether the option is disabled and cannot be selected
 * <p>
 * Slots:
 * - default: The text content of the option
 * - start: Icon or element before the option text
 * - end: Icon or element after the option text
 * <p>
 * Styling Properties:
 * - `backgroundColorCurrent`: Sets the --background-color-current CSS property
 * - `backgroundColorHover`: Sets the --background-color-hover CSS property
 * - `textColorCurrent`: Sets the --text-color-current CSS property
 * - `textColorHover`: Sets the --text-color-hover CSS property
 * <p>
 * Usage examples:
 * <pre>
 * // Basic option
 * WaSelectOption option = new WaSelectOption();
 * option.setValue("option1");
 * option.setText("Option 1");
 * 
 * // Disabled option
 * WaSelectOption disabledOption = new WaSelectOption();
 * disabledOption.setValue("option2");
 * disabledOption.setText("Option 2");
 * disabledOption.setDisabled(true);
 * 
 * // Option with custom styling
 * WaSelectOption styledOption = new WaSelectOption();
 * styledOption.setValue("option3");
 * styledOption.setText("Option 3");
 * styledOption.setBackgroundColorHover("#e9ecef");
 * styledOption.setTextColorHover("#007bff");
 * </pre>
 */
@Getter
@Setter
@NgImportReference(value = "WaSelectOptionDirective", reference = "angular-awesome")
@NgImportModule("WaSelectOptionDirective")
public class WaSelectOption<J extends WaSelectOption<J>> extends DivSimple<J>
{
    /**
     * The value of the option, used when the option is selected
     */
    private String value;

    /**
     * Whether the option is disabled and cannot be selected
     */
    private Boolean disabled;

    /**
     * Component to display before the option text
     */
    private IComponentHierarchyBase<?, ?> start;

    /**
     * Component to display after the option text
     */
    private IComponentHierarchyBase<?, ?> end;

    /**
     * Background color when the option is selected
     */
    private String backgroundColorCurrent;

    /**
     * Background color when hovering over the option
     */
    private String backgroundColorHover;

    /**
     * Text color when the option is selected
     */
    private String textColorCurrent;

    /**
     * Text color when hovering over the option
     */
    private String textColorHover;

    /**
     * Creates a new WaSelectOption with the tag "wa-option"
     */
    public WaSelectOption()
    {
        setTag("wa-option");
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
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
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
}