package com.jwebmp.webawesome.components.colorpicker;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
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
 *   <li><b>swatches</b>: A list of predefined color swatches available for quick selection.</li>
 *   <li><b>size</b>: Configures the size of the picker (e.g., small, medium, large).</li>
 *   <li><b>disabled</b>: Disables the picker, preventing user interaction.</li>
 *   <li><b>opacity</b>: Enables opacity adjustments for the selected color.</li>
 *   <li><b>uppercase</b>: Converts output color values to uppercase if enabled.</li>
 *   <li><b>hint</b>: Provides additional text or instructions for users.</li>
 *   <li><b>formId</b>: Associates the color picker with an HTML form element.</li>
 *   <li><b>required</b>: Marks the picker as a required input.</li>
 * </ul>
 *
 * <p>The WaColorPicker enhances user interactivity while ensuring flexibility and simplicity.</p>
 */
@Getter
@Setter
public class WaColorPicker extends DivSimple<WaColorPicker>
{
    /**
     * The label displayed alongside the color picker.
     * It provides users with a description or context of what the color picker is for.
     */
    private String label;

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

    private List<String> swatches;

    private Size size;
    private Boolean disabled;
    private Boolean opacity;
    private Boolean uppercase;
    private Boolean required;
    private String hint;
    private String formId;

    /**
     * Default constructor for WaColorPicker.
     * Sets up the component with the required tag for integration.
     */
    public WaColorPicker()
    {
        setTag("wa-color-picker");
    }

    /**
     * Initializes the color picker component with the configured attributes.
     * This method ensures the label, value, and format are added as HTML attributes before rendering.
     */
    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (label != null)
            {
                addAttribute("label", label);
            }
            if (value != null)
            {
                addAttribute("value", value);
            }
            if (format != null)
            {
                addAttribute("format", format);
            }
            if (swatches != null)
            {
                var text = swatches.stream().collect(Collectors.joining("; ", "swatches=", ";"));
                addAttribute("swatches", text);
            }
            if (size != null)
            {
                addAttribute("size", size.toString().toLowerCase());
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (!Strings.isNullOrEmpty(hint))
            {
                addAttribute("hint", hint);
            }
            if (opacity != null && opacity)
            {
                addAttribute("opacity", "");
            }
            if (formId != null)
            {
                addAttribute("form", formId);
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (uppercase != null && uppercase)
            {
                addAttribute("uppercase", "");
            }
        }
        super.init();
    }
}
