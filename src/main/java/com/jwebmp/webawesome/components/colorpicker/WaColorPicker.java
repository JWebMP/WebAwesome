package com.jwebmp.webawesome.components.colorpicker;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;


/**
 * WaColorPicker is a customizable web component for selecting colors with specific configurations.
 * It extends {@link DivSimple}, making it easy to integrate into web applications.
 * The component features various attributes and options to tailor the color-picking experience, including labels, formats, swatch presets, and more.
 *
 * <p><b>Attributes:</b></p>
 * <ul>
 *   <li><b>label</b>: The descriptive label displayed alongside the color picker.</li>
 *   <li><b>value</b>: The default or pre-selected color value.</li>
 *   <li><b>format</b>: Specifies the format of the selected color (e.g., HEX, RGB).</li>
 *   <li><b>noFormatToggle</b>: Disables user toggle of format.</li>
 *   <li><b>swatches</b>: A list of predefined color swatches available for quick selection.</li>
 *   <li><b>size</b>: Configures the size of the picker (e.g., small, medium, large).</li>
 *   <li><b>disabled</b>: Disables the picker, preventing user interaction.</li>
 *   <li><b>opacity</b>: Enables opacity adjustments for the selected color.</li>
 *   <li><b>uppercase</b>: Converts output color values to uppercase if enabled.</li>
 *   <li><b>hint</b>: Provides additional text or instructions for users.</li>
 *   <li><b>form</b>: Associates the color picker with an HTML form element.</li>
 *   <li><b>name</b>: Used in form submissions.</li>
 *   <li><b>required</b>: Marks the picker as a required input.</li>
 * </ul>
 *
 * <p>The WaColorPicker enhances user interactivity while ensuring flexibility and simplicity.</p>
 */
@Getter
@Setter
@NgImportReference(value = "WaColorPickerDirective", reference = "angular-awesome")
@NgImportModule("WaColorPickerDirective")
public class WaColorPicker<J extends WaColorPicker<J>> extends DivSimple<J>
{
    /**
     * The label displayed alongside the color picker.
     * It provides users with a description or context of what the color picker is for.
     */
    private String label;

    /**
     * Custom HTML label content
     */
    private IComponentHierarchyBase<?, ?> labelSlot;

    /**
     * The default or pre-selected value of the color picker.
     * It allows initializing the color input with a specific color.
     */
    private String value;

    /**
     * The format of the color value (e.g., HEX, RGB, etc.).
     * This ensures the selected color is returned in the required format.
     */
    private String format;

    /**
     * Disables user toggle of format
     */
    private Boolean noFormatToggle;

    /**
     * A list of predefined color swatches available for quick selection
     */
    private List<String> swatches;

    /**
     * The size of the picker (small, medium, large)
     */
    private Size size;

    /**
     * Disables the picker, preventing user interaction
     */
    private Boolean disabled;

    /**
     * Enables opacity adjustments for the selected color
     */
    private Boolean opacity;

    /**
     * Converts output color values to uppercase if enabled
     */
    private Boolean uppercase;

    /**
     * Marks the picker as a required input
     */
    private Boolean required;

    /**
     * Provides additional text or instructions for users
     */
    private String hint;

    /**
     * Custom HTML hint content
     */
    private IComponentHierarchyBase<?, ?> hintSlot;

    /**
     * Associates the color picker with an HTML form element
     */
    private String form;

    /**
     * Custom styling properties
     */
    private String swatchSize;
    private String swatchSpacing;
    private String borderRadius;
    private String dropdownWidth;
    private String dropdownHeight;

    /**
     * Default constructor for WaColorPicker.
     * Sets up the component with the required tag for integration.
     */
    public WaColorPicker()
    {
        setTag("wa-color-picker");
    }

    /**
     * Programmatically focuses the color picker
     *
     * @return This object for method chaining
     */
    public WaColorPicker focus()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
    }

    /**
     * Removes focus from the color picker
     *
     * @return This object for method chaining
     */
    public WaColorPicker blur()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
    }

    /**
     * Returns the color value in the specified format
     *
     * @param format The format to return the color value in (hex, rgb, hsl, hsv)
     * @return The formatted color string
     */
    public String getFormattedValue(String format)
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return "";
    }

    /**
     * Triggers form validation UI
     *
     * @return This object for method chaining
     */
    public WaColorPicker reportValidity()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
    }

    /**
     * Converts HSV to hex string
     *
     * @param h Hue value
     * @param s Saturation value
     * @param v Value
     * @param a Alpha value
     * @return The hex color string
     */
    public String getHexString(double h, double s, double v, double a)
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return "";
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            // Handle label
            if (labelSlot != null)
            {
                labelSlot.asAttributeBase()
                         .addAttribute("slot", "label");
                add(labelSlot);
            }
            else if (label != null)
            {
                addAttribute("label", label);
            }

            // Handle hint
            if (hintSlot != null)
            {
                hintSlot.asAttributeBase()
                        .addAttribute("slot", "hint");
                add(hintSlot);
            }
            else if (!Strings.isNullOrEmpty(hint))
            {
                addAttribute("hint", hint);
            }

            // Handle other attributes
            if (value != null)
            {
                addAttribute("value", value);
            }
            if (format != null)
            {
                addAttribute("format", format);
            }
            if (noFormatToggle != null && noFormatToggle)
            {
                addAttribute("no-format-toggle", "");
            }
            if (swatches != null)
            {
                var text = swatches.stream()
                                   .collect(Collectors.joining(";"));
                addAttribute("swatches", text);
            }
            if (size != null)
            {
                addAttribute("size", size.toString()
                                         .toLowerCase());
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (opacity != null && opacity)
            {
                addAttribute("opacity", "");
            }
            if (form != null)
            {
                addAttribute("form", form);
            }
            if (!Strings.isNullOrEmpty(getName()))
            {
                addAttribute("name", getName());
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (uppercase != null && uppercase)
            {
                addAttribute("uppercase", "");
            }

            // Handle custom styling properties
            if (swatchSize != null)
            {
                addStyle("--swatch-size", swatchSize);
            }
            if (swatchSpacing != null)
            {
                addStyle("--swatch-spacing", swatchSpacing);
            }
            if (borderRadius != null)
            {
                addStyle("--border-radius", borderRadius);
            }
            if (dropdownWidth != null)
            {
                addStyle("--dropdown-width", dropdownWidth);
            }
            if (dropdownHeight != null)
            {
                addStyle("--dropdown-height", dropdownHeight);
            }
        }
        super.init();
    }
}
