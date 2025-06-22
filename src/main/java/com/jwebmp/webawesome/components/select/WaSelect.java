package com.jwebmp.webawesome.components.select;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
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
 * This component renders as a wa-select-wrapper HTML element and supports various customization options
 * through properties and CSS custom properties.
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
    private Boolean clearable;

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
    private IComponentHierarchyBase<?, ?> prefix;

    /**
     * Component to display after the select text
     */
    private IComponentHierarchyBase<?, ?> suffix;

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
            if (clearable != null && clearable)
            {
                addAttribute("clearable", "");
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
                addAttribute("size", size.toString());
            }
            if (placement != null)
            {
                addAttribute("placement", placement.toString());
            }
            if (!Strings.isNullOrEmpty(value))
            {
                addAttribute("value", value);
            }

            if (prefix != null)
            {
                prefix.asAttributeBase()
                      .addAttribute("slot", "prefix");
                add(0, prefix);
            }
            if (suffix != null)
            {
                suffix.asAttributeBase()
                      .addAttribute("slot", "suffix");
                add(suffix);
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
        addAttribute("[attrs.value]", variableName);
        return (J) this;
    }
}
