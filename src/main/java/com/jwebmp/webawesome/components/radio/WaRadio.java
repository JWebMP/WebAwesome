package com.jwebmp.webawesome.components.radio;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Web Awesome radio component.
 * This class provides methods to configure the radio component's attributes.
 */
@Getter
@Setter
@NgImportReference(value = "WaRadioDirective", reference = "angular-awesome")
@NgImportModule("WaRadioDirective")
public class WaRadio<J extends WaRadio<J>> extends DivSimple<J>
{
    /**
     * The value of the radio component.
     * This can be null if not set.
     */
    private String value;

    /**
     * Indicates whether the radio component is disabled.
     * This can be null if not set.
     */
    private Boolean disabled;

    /**
     * The size of the radio component.
     * This can be null if not set.
     */
    private Size size;

    /**
     * The form ID associated with the radio component.
     * This can be null if not set.
     */
    private String formId;

    /**
     * Custom background color for the radio component.
     * This can be null if not set.
     */
    private String styleBackgroundColor;

    /**
     * Custom background color for the radio component when checked.
     * This can be null if not set.
     */
    private String styleBackgroundColorChecked;

    /**
     * Custom border color for the radio component.
     * This can be null if not set.
     */
    private String styleBorderColor;

    /**
     * Custom border color for the radio component when checked.
     * This can be null if not set.
     */
    private String styleBorderColorChecked;

    /**
     * Custom border style for the radio component.
     * This can be null if not set.
     */
    private String styleBorderStyle;

    /**
     * Custom border width for the radio component.
     * This can be null if not set.
     */
    private String styleBorderWidth;

    /**
     * Custom box shadow for the radio component.
     * This can be null if not set.
     */
    private String styleBoxShadow;

    /**
     * Custom color for the checked icon.
     * This can be null if not set.
     */
    private String styleCheckedIconColor;

    /**
     * Custom scale for the checked icon.
     * This can be null if not set.
     */
    private String styleCheckedIconScale;

    /**
     * Custom size for the toggle.
     * This can be null if not set.
     */
    private String styleToggleSize;

    /**
     * Default constructor for the WaRadio class.
     * Initializes the component with a default tag of `wa-radio`.
     */
    public WaRadio()
    {
        setTag("wa-radio");
    }

    /**
     * Initializes the component.
     * Adds the attributes to the component.
     */
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
            if (size != null)
            {
                addAttribute("size", size.name()
                                         .toLowerCase());
            }
            if (!Strings.isNullOrEmpty(formId))
            {
                addAttribute("form", formId);
            }

            // Add CSS custom properties if specified
            if (!Strings.isNullOrEmpty(styleBackgroundColor))
            {
                addStyle("--background-color", styleBackgroundColor);
            }
            if (!Strings.isNullOrEmpty(styleBackgroundColorChecked))
            {
                addStyle("--background-color-checked", styleBackgroundColorChecked);
            }
            if (!Strings.isNullOrEmpty(styleBorderColor))
            {
                addStyle("--border-color", styleBorderColor);
            }
            if (!Strings.isNullOrEmpty(styleBorderColorChecked))
            {
                addStyle("--border-color-checked", styleBorderColorChecked);
            }
            if (!Strings.isNullOrEmpty(styleBorderStyle))
            {
                addStyle("--border-style", styleBorderStyle);
            }
            if (!Strings.isNullOrEmpty(styleBorderWidth))
            {
                addStyle("--border-width", styleBorderWidth);
            }
            if (!Strings.isNullOrEmpty(styleBoxShadow))
            {
                addStyle("--box-shadow", styleBoxShadow);
            }
            if (!Strings.isNullOrEmpty(styleCheckedIconColor))
            {
                addStyle("--checked-icon-color", styleCheckedIconColor);
            }
            if (!Strings.isNullOrEmpty(styleCheckedIconScale))
            {
                addStyle("--checked-icon-scale", styleCheckedIconScale);
            }
            if (!Strings.isNullOrEmpty(styleToggleSize))
            {
                addStyle("--toggle-size", styleToggleSize);
            }
        }
        super.init();
    }
}
