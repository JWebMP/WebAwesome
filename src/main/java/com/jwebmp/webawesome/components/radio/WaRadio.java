package com.jwebmp.webawesome.components.radio;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Web Awesome radio component.
 * This class provides methods to configure the radio component's attributes.
 * <p>
 * Attributes:
 * - `value`: The value of the radio component
 * - `disabled`: Whether the radio component is disabled
 * - `size`: The size of the radio component (small, medium, large)
 * - `appearance`: Visual appearance style (default is standard radio, "button" for button-like appearance)
 * - `asPill`: Whether to display the radio button with rounded pill-shaped edges (when appearance="button")
 * <p>
 * Slots:
 * - default: The text content of the radio
 * - start: Icon or element before the text (when appearance="button")
 * - end: Icon or element after the text (when appearance="button")
 * <p>
 * Styling Properties for standard radio:
 * - `styleBackgroundColor`: Sets the --background-color CSS property
 * - `styleBackgroundColorChecked`: Sets the --background-color-checked CSS property
 * - `styleBorderColor`: Sets the --border-color CSS property
 * - `styleBorderColorChecked`: Sets the --border-color-checked CSS property
 * - `styleBorderStyle`: Sets the --border-style CSS property
 * - `styleBorderWidth`: Sets the --border-width CSS property
 * - `styleBoxShadow`: Sets the --box-shadow CSS property
 * - `styleCheckedIconColor`: Sets the --checked-icon-color CSS property
 * - `styleCheckedIconScale`: Sets the --checked-icon-scale CSS property
 * - `styleToggleSize`: Sets the --toggle-size CSS property
 * <p>
 * Additional styling properties when appearance="button":
 * - `styleIndicatorColor`: Sets the --indicator-color CSS property
 * - `styleIndicatorWidth`: Sets the --indicator-width CSS property
 * - `styleDisplay`: Sets the --display CSS property
 * <p>
 * Usage examples:
 * <pre>
 * // Basic radio
 * WaRadio radio = new WaRadio();
 * radio.setValue("option1");
 * radio.setText("Option 1");
 *
 * // Radio button (replaces deprecated WaRadioButton)
 * WaRadio radioButton = new WaRadio();
 * radioButton.setValue("option1");
 * radioButton.setText("Option 1");
 * radioButton.setAppearance("button");
 * radioButton.setAsPill(true);
 *
 * // Radio button with icon
 * WaRadio radioWithIcon = new WaRadio();
 * radioWithIcon.setValue("happy");
 * radioWithIcon.setText("Happy");
 * radioWithIcon.setAppearance("button");
 * radioWithIcon.setStart(new WaIcon("face-smile"));
 * radioWithIcon.setWithStart(true); // For SSR
 * </pre>
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
     * The appearance of the radio component.
     * Set to "button" to use as a replacement for WaRadioButton.
     */
    private RadioAppearance appearance;

    /**
     * Whether to display the radio button with rounded pill-shaped edges.
     * Only applicable when appearance="button".
     */
    private Boolean asPill;

    /**
     * Icon or element before the text.
     * Only applicable when appearance="button".
     */
    private IComponentHierarchyBase<?, ?> start;

    /**
     * Icon or element after the text.
     * Only applicable when appearance="button".
     */
    private IComponentHierarchyBase<?, ?> end;

    /**
     * SSR-friendly flag for the start slot.
     * Only applicable when appearance="button".
     */
    private Boolean withStart;

    /**
     * SSR-friendly flag for the end slot.
     * Only applicable when appearance="button".
     */
    private Boolean withEnd;

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
     * Custom indicator color for the radio button.
     * Only applicable when appearance="button".
     */
    private String styleIndicatorColor;

    /**
     * Custom indicator width for the radio button.
     * Only applicable when appearance="button".
     */
    private String styleIndicatorWidth;

    /**
     * Custom display value for the radio button.
     * Only applicable when appearance="button".
     */
    private String styleDisplay;

    /**
     * Default constructor for the WaRadio class.
     * Initializes the component with a default tag of `wa-radio`.
     */
    public WaRadio()
    {
        setTag("wa-radio");
    }

    /**
     * Constructor that initializes the radio with a value.
     *
     * @param value The value of the radio
     */
    public WaRadio(String value)
    {
        this();
        this.value = value;
    }

    /**
     * Constructor that initializes the radio with a value and text.
     *
     * @param value The value of the radio
     * @param text  The text content of the radio
     */
    public WaRadio(String value, String text)
    {
        this(value);
        setText(text);
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
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString());
            }
            if (asPill != null && asPill)
            {
                addAttribute("as-pill", "");
            }
            if (start != null)
            {
                start.asAttributeBase()
                     .addAttribute("slot", "start");
                add(start);
            }
            if (end != null)
            {
                end.asAttributeBase()
                   .addAttribute("slot", "end");
                add(end);
            }
            if (withStart != null && withStart)
            {
                addAttribute("with-start", "");
            }
            if (withEnd != null && withEnd)
            {
                addAttribute("with-end", "");
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
            if (!Strings.isNullOrEmpty(styleIndicatorColor))
            {
                addStyle("--indicator-color", styleIndicatorColor);
            }
            if (!Strings.isNullOrEmpty(styleIndicatorWidth))
            {
                addStyle("--indicator-width", styleIndicatorWidth);
            }
            if (!Strings.isNullOrEmpty(styleDisplay))
            {
                addStyle("--display", styleDisplay);
            }
        }
        super.init();
    }
    /**
     * Backwards-compatible setter that accepts a String appearance value and maps it to the enum.
     * Accepts "button" (case-insensitive). Any other non-empty value clears the appearance (no attribute).
     * @param appearance the appearance string
     * @return this
     */
    @SuppressWarnings("unchecked")
    public J setAppearance(String appearance)
    {
        if (Strings.isNullOrEmpty(appearance))
        {
            this.appearance = null;
        }
        else if ("button".equalsIgnoreCase(appearance))
        {
            this.appearance = RadioAppearance.Button;
        }
        else
        {
            this.appearance = null;
        }
        return (J) this;
    }
}
