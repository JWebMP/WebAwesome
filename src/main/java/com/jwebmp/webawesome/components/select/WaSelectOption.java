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
    private IComponentHierarchyBase<?, ?> prefix;

    /**
     * Component to display after the option text
     */
    private IComponentHierarchyBase<?, ?> suffix;

    /**
     * Background color when the option is selected
     */
    private String backgroundColourCurrent;

    /**
     * Background color when hovering over the option
     */
    private String backgroundColourHover;

    /**
     * Text color when the option is selected
     */
    private String textColourCurrent;

    /**
     * Text color when hovering over the option
     */
    private String textColourHover;

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

            if (!Strings.isNullOrEmpty(backgroundColourCurrent))
            {
                addStyle("--background-color-current", backgroundColourCurrent);
            }
            if (!Strings.isNullOrEmpty(backgroundColourHover))
            {
                addStyle("--background-color-hover", backgroundColourHover);
            }
            if (!Strings.isNullOrEmpty(textColourCurrent))
            {
                addStyle("--text-color-current", textColourCurrent);
            }
            if (!Strings.isNullOrEmpty(textColourHover))
            {
                addStyle("--text-color-hover", textColourHover);
            }
        }
        super.init();
    }
}
