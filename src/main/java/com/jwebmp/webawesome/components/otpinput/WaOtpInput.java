package com.jwebmp.webawesome.components.otpinput;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.TypographyTokenCapable;
import lombok.Getter;

/**
 * The {@code WaOtpInput} component renders the {@code <wa-otp-input>} element - a segmented form
 * control used to capture one-time passcodes.
 * <p>
 * New in Web Awesome <strong>3.11.0</strong> (mirrors {@code WaOtpInputDirective} from
 * {@code angular-awesome@3.11.0}). The Angular directive implements {@code ControlValueAccessor}
 * and {@code Validator} - a partially filled control reports an {@code incomplete} error - so
 * reactive form wiring is handled client side. This wrapper is responsible for the element and its
 * authoring time attributes only.
 *
 * <p><b>Attributes</b></p>
 * <ul>
 *     <li>{@code value} - the current value</li>
 *     <li>{@code length} - the number of segments (default 6)</li>
 *     <li>{@code format} - a segment mask, e.g. {@code ###-###}</li>
 *     <li>{@code type} - {@code numeric}, {@code alpha} or {@code alphanumeric}</li>
 *     <li>{@code case} - {@code preserve}, {@code upper} or {@code lower}</li>
 *     <li>{@code appearance}, {@code size}, {@code label}, {@code hint}</li>
 *     <li>{@code mask}, {@code with-mask}, {@code required}, {@code readonly}, {@code autosubmit},
 *     {@code autofocus}, {@code disabled}</li>
 *     <li>{@code autocomplete} (defaults to {@code one-time-code} - only emitted when overridden)</li>
 *     <li>{@code name}, {@code form}</li>
 * </ul>
 *
 * <p><b>CSS custom properties</b>: {@code --segment-size}, {@code --segment-gap},
 * {@code --segment-border-radius}, {@code --mask-char}</p>
 *
 * <p><b>Events</b>: {@code input}, {@code change}, {@code wa-complete}, {@code wa-clear},
 * {@code wa-invalid}</p>
 *
 * <p><b>Slots</b>: {@code label}, {@code hint}</p>
 *
 * <p><b>Usage</b></p>
 * <pre>{@code
 * WaOtpInput<?> otp = new WaOtpInput<>()
 *         .setLength(6)
 *         .setFormat("###-###")
 *         .setRequired(true)
 *         .setAppearance(OtpAppearance.Filled_Outlined)
 *         .setCompleteEvent("onComplete($event)");
 * }</pre>
 */
@Getter
@NgImportReference(value = "WaOtpInputDirective", reference = "angular-awesome")
@NgImportModule("WaOtpInputDirective")
public class WaOtpInput<J extends WaOtpInput<J>> extends DivSimple<J>
        implements BorderTokenCapable<J>, SpaceTokenCapable<J>, TypographyTokenCapable<J>
{
    /**
     * The current value of the control.
     */
    private String value;

    /**
     * The number of segments rendered.
     */
    private Integer length;

    /**
     * The visual appearance of the segments.
     */
    private OtpAppearance appearance;

    /**
     * The accepted character set.
     */
    private OtpType type;

    /**
     * The casing applied to typed characters.
     */
    private OtpCase otpCase;

    /**
     * The component size.
     */
    private Size size;

    /**
     * The label text.
     */
    private String label;

    /**
     * The hint text.
     */
    private String hint;

    /**
     * A segment format mask, for example {@code ###-###}.
     */
    private String format;

    /**
     * The autocomplete token. Defaults to {@code one-time-code} on the native element, so this is
     * only emitted when explicitly set.
     */
    private String autocomplete;

    /**
     * The form control name submitted with the owning form.
     */
    private String name;

    /**
     * The id of the form this control belongs to.
     */
    private String form;

    /**
     * Masks the entered characters.
     */
    private Boolean mask;

    /**
     * Renders the mask toggle button.
     */
    private Boolean withMask;

    /**
     * Whether a value is required.
     */
    private Boolean required;

    /**
     * Whether the control is read only.
     */
    private Boolean readonly;

    /**
     * Automatically submits the owning form once all segments are filled.
     */
    private Boolean autosubmit;

    /**
     * Focuses the first segment on load.
     */
    private Boolean autofocus;

    /**
     * Whether the control is disabled.
     */
    private Boolean disabled;

    // CSS custom properties
    private String segmentSize;
    private String segmentGap;
    private String segmentBorderRadius;
    private String maskChar;

    // Slots
    private IComponentHierarchyBase<?, ?> labelSlot;
    private IComponentHierarchyBase<?, ?> hintSlot;

    // Events
    private String inputEvent;
    private String changeEvent;
    private String completeEvent;
    private String clearEvent;
    private String invalidEvent;

    /**
     * Creates a new one-time passcode input rendering {@code <wa-otp-input>}.
     */
    public WaOtpInput()
    {
        setTag("wa-otp-input");
    }

    /**
     * Creates a new one-time passcode input with the given label.
     *
     * @param label The label text
     */
    public WaOtpInput(String label)
    {
        this();
        this.label = label;
    }

    @SuppressWarnings("unchecked")
    public J setValue(String value)
    {
        this.value = value;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setLength(Integer length)
    {
        this.length = length;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setAppearance(OtpAppearance appearance)
    {
        this.appearance = appearance;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setType(OtpType type)
    {
        this.type = type;
        return (J) this;
    }

    /**
     * Sets the casing applied to typed characters, rendered as the {@code case} attribute.
     *
     * @param otpCase The casing to apply
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J setOtpCase(OtpCase otpCase)
    {
        this.otpCase = otpCase;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSize(Size size)
    {
        this.size = size;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setHint(String hint)
    {
        this.hint = hint;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setFormat(String format)
    {
        this.format = format;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setAutocomplete(String autocomplete)
    {
        this.autocomplete = autocomplete;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setName(String name)
    {
        this.name = name;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setForm(String form)
    {
        this.form = form;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setMask(Boolean mask)
    {
        this.mask = mask;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setWithMask(Boolean withMask)
    {
        this.withMask = withMask;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setRequired(Boolean required)
    {
        this.required = required;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setReadonly(Boolean readonly)
    {
        this.readonly = readonly;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setAutosubmit(Boolean autosubmit)
    {
        this.autosubmit = autosubmit;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setAutofocus(Boolean autofocus)
    {
        this.autofocus = autofocus;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSegmentSize(String segmentSize)
    {
        this.segmentSize = segmentSize;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSegmentGap(String segmentGap)
    {
        this.segmentGap = segmentGap;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSegmentBorderRadius(String segmentBorderRadius)
    {
        this.segmentBorderRadius = segmentBorderRadius;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setMaskChar(String maskChar)
    {
        this.maskChar = maskChar;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setLabelSlot(IComponentHierarchyBase<?, ?> labelSlot)
    {
        this.labelSlot = labelSlot;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setHintSlot(IComponentHierarchyBase<?, ?> hintSlot)
    {
        this.hintSlot = hintSlot;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setInputEvent(String inputEvent)
    {
        this.inputEvent = inputEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setChangeEvent(String changeEvent)
    {
        this.changeEvent = changeEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setCompleteEvent(String completeEvent)
    {
        this.completeEvent = completeEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setClearEvent(String clearEvent)
    {
        this.clearEvent = clearEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setInvalidEvent(String invalidEvent)
    {
        this.invalidEvent = invalidEvent;
        return (J) this;
    }

    // ---------------------------------------------------------------------
    // Angular bindings
    // ---------------------------------------------------------------------

    /**
     * Binds the value to an Angular expression.
     *
     * @param variableName The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindValue(String variableName)
    {
        addAttribute("[value]", variableName);
        return (J) this;
    }

    /**
     * Applies a two way {@code ngModel} binding to the control.
     *
     * @param variableName The model to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindNgModel(String variableName)
    {
        addAttribute("[(ngModel)]", variableName);
        return (J) this;
    }

    /**
     * Applies a reactive forms {@code formControlName} binding to the control.
     *
     * @param controlName The form control name
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J setFormControlName(String controlName)
    {
        addAttribute("formControlName", controlName);
        return (J) this;
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
            if (length != null)
            {
                addAttribute("length", length.toString());
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString());
            }
            if (type != null)
            {
                addAttribute("type", type.toString());
            }
            if (otpCase != null)
            {
                addAttribute("case", otpCase.toString());
            }
            if (size != null)
            {
                addAttribute("size", size.toString());
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (!Strings.isNullOrEmpty(hint))
            {
                addAttribute("hint", hint);
            }
            if (!Strings.isNullOrEmpty(format))
            {
                addAttribute("format", format);
            }
            if (!Strings.isNullOrEmpty(autocomplete))
            {
                addAttribute("autocomplete", autocomplete);
            }
            if (!Strings.isNullOrEmpty(name))
            {
                addAttribute("name", name);
            }
            if (!Strings.isNullOrEmpty(form))
            {
                addAttribute("form", form);
            }
            if (mask != null && mask)
            {
                addAttribute("mask", "");
            }
            if (withMask != null && withMask)
            {
                addAttribute("with-mask", "");
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (readonly != null && readonly)
            {
                addAttribute("readonly", "");
            }
            if (autosubmit != null && autosubmit)
            {
                addAttribute("autosubmit", "");
            }
            if (autofocus != null && autofocus)
            {
                addAttribute("autofocus", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }

            // CSS custom properties
            if (!Strings.isNullOrEmpty(segmentSize))
            {
                addStyle("--segment-size", segmentSize);
            }
            if (!Strings.isNullOrEmpty(segmentGap))
            {
                addStyle("--segment-gap", segmentGap);
            }
            if (!Strings.isNullOrEmpty(segmentBorderRadius))
            {
                addStyle("--segment-border-radius", segmentBorderRadius);
            }
            if (!Strings.isNullOrEmpty(maskChar))
            {
                addStyle("--mask-char", maskChar);
            }

            // Slots
            if (labelSlot != null)
            {
                labelSlot.asAttributeBase()
                         .addAttribute("slot", "label");
                add(labelSlot);
            }
            if (hintSlot != null)
            {
                hintSlot.asAttributeBase()
                        .addAttribute("slot", "hint");
                add(hintSlot);
            }

            // Events
            if (!Strings.isNullOrEmpty(inputEvent))
            {
                addAttribute("(input)", inputEvent);
            }
            if (!Strings.isNullOrEmpty(changeEvent))
            {
                addAttribute("(change)", changeEvent);
            }
            if (!Strings.isNullOrEmpty(completeEvent))
            {
                addAttribute("(wa-complete)", completeEvent);
            }
            if (!Strings.isNullOrEmpty(clearEvent))
            {
                addAttribute("(wa-clear)", clearEvent);
            }
            if (!Strings.isNullOrEmpty(invalidEvent))
            {
                addAttribute("(wa-invalid)", invalidEvent);
            }
        }
        super.init();
    }
}

