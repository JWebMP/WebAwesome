package com.jwebmp.webawesome.components.timeinput;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.FocusTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.TypographyTokenCapable;
import lombok.Getter;

/**
 * A Web Awesome {@code <wa-time-input>} form control combining a text field with a pop-up time picker.
 * <p>
 * Values are exchanged in 24-hour wire format ({@code HH:mm}, {@code HH:mm:ss}, or {@code HH:mm:ss.sss}).
 * <p>
 * Events: {@code input}, {@code change}, {@code focus}, {@code blur}, {@code wa-clear}, {@code wa-show},
 * {@code wa-after-show}, {@code wa-hide}, {@code wa-after-hide}, {@code wa-invalid}.
 * <p>
 * Slots: {@code label}, {@code hint}, {@code start}, {@code end}, {@code clear-icon}, {@code expand-icon}, {@code footer}.
 * <p>
 * CSS Custom Properties: {@code --show-duration}, {@code --hide-duration}, {@code --column-item-height}, {@code --column-width}.
 */
@Getter
@NgImportReference(value = "WaTimeInputDirective", reference = "angular-awesome")
@NgImportModule("WaTimeInputDirective")
public class WaTimeInput<J extends WaTimeInput<J>> extends DivSimple<J>
        implements BorderTokenCapable<J>, SpaceTokenCapable<J>, FocusTokenCapable<J>, TypographyTokenCapable<J>
{
    /**
     * The control value ({@code HH:mm}, {@code HH:mm:ss}, or {@code HH:mm:ss.sss}, always 24h).
     */
    private String value;

    /**
     * Whether the control is disabled.
     */
    private Boolean disabled;

    /**
     * Whether the control is required.
     */
    private Boolean required;

    /**
     * Whether the control is read-only.
     */
    private Boolean readonly;

    /**
     * The control size.
     */
    private TimeInputSize size;

    /**
     * The control appearance.
     */
    private TimeInputAppearance appearance;

    /**
     * Whether to render pill-shaped corners.
     */
    private Boolean pill;

    /**
     * The label text.
     */
    private String label;

    /**
     * The hint text displayed below the control.
     */
    private String hint;

    /**
     * The autocomplete behaviour.
     */
    private String autocomplete;

    /**
     * Whether to show a clear button.
     */
    private Boolean withClear;

    /**
     * Whether to show a "now" button.
     */
    private Boolean withNow;

    /**
     * SSR flag to indicate the label slot is present on initial paint.
     */
    private Boolean withLabel;

    /**
     * SSR flag to indicate the hint slot is present on initial paint.
     */
    private Boolean withHint;

    /**
     * The earliest selectable time.
     */
    private String min;

    /**
     * The latest selectable time.
     */
    private String max;

    /**
     * The granularity, in seconds, or {@code any}. Default {@code 60}.
     */
    private String step;

    /**
     * The hour display format ({@code auto}, {@code 12}, {@code 24}).
     */
    private HourFormat hourFormat;

    /**
     * Whether the time picker is open.
     */
    private Boolean open;

    /**
     * The preferred placement of the picker.
     */
    private String placement;

    /**
     * The distance, in pixels, between the control and the picker.
     */
    private String distance;

    /**
     * The {@code --show-duration} CSS custom property.
     */
    private String showDuration;

    /**
     * The {@code --hide-duration} CSS custom property.
     */
    private String hideDuration;

    /**
     * The {@code --column-item-height} CSS custom property.
     */
    private String columnItemHeight;

    /**
     * The {@code --column-width} CSS custom property.
     */
    private String columnWidth;

    // Slots
    private IComponentHierarchyBase<?, ?> labelSlot;
    private IComponentHierarchyBase<?, ?> hintSlot;
    private IComponentHierarchyBase<?, ?> start;
    private IComponentHierarchyBase<?, ?> end;
    private IComponentHierarchyBase<?, ?> clearIcon;
    private IComponentHierarchyBase<?, ?> expandIcon;
    private IComponentHierarchyBase<?, ?> footer;

    // Events
    private String inputEvent;
    private String changeEvent;
    private String focusEvent;
    private String blurEvent;
    private String clearEvent;
    private String showEvent;
    private String afterShowEvent;
    private String hideEvent;
    private String afterHideEvent;
    private String invalidEvent;

    /**
     * Creates a new WaTimeInput component.
     */
    public WaTimeInput()
    {
        setTag("wa-time-input");
    }

    /**
     * Creates a new WaTimeInput with the specified label.
     *
     * @param label The label text
     */
    public WaTimeInput(String label)
    {
        this();
        this.label = label;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setValue(String value)
    {
        this.value = value;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setRequired(Boolean required)
    {
        this.required = required;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setReadonly(Boolean readonly)
    {
        this.readonly = readonly;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setSize(TimeInputSize size)
    {
        this.size = size;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAppearance(TimeInputAppearance appearance)
    {
        this.appearance = appearance;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setPill(Boolean pill)
    {
        this.pill = pill;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setHint(String hint)
    {
        this.hint = hint;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAutocomplete(String autocomplete)
    {
        this.autocomplete = autocomplete;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setWithClear(Boolean withClear)
    {
        this.withClear = withClear;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setWithNow(Boolean withNow)
    {
        this.withNow = withNow;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setWithLabel(Boolean withLabel)
    {
        this.withLabel = withLabel;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setWithHint(Boolean withHint)
    {
        this.withHint = withHint;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setMin(String min)
    {
        this.min = min;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setMax(String max)
    {
        this.max = max;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setStep(String step)
    {
        this.step = step;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setStep(int step)
    {
        this.step = String.valueOf(step);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setHourFormat(HourFormat hourFormat)
    {
        this.hourFormat = hourFormat;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setOpen(Boolean open)
    {
        this.open = open;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setPlacement(String placement)
    {
        this.placement = placement;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setDistance(String distance)
    {
        this.distance = distance;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setShowDuration(String showDuration)
    {
        this.showDuration = showDuration;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setHideDuration(String hideDuration)
    {
        this.hideDuration = hideDuration;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setColumnItemHeight(String columnItemHeight)
    {
        this.columnItemHeight = columnItemHeight;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setColumnWidth(String columnWidth)
    {
        this.columnWidth = columnWidth;
        return (J) this;
    }

    // Slot setters
    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setLabelSlot(IComponentHierarchyBase<?, ?> labelSlot)
    {
        this.labelSlot = labelSlot;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setHintSlot(IComponentHierarchyBase<?, ?> hintSlot)
    {
        this.hintSlot = hintSlot;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setStart(IComponentHierarchyBase<?, ?> start)
    {
        this.start = start;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setEnd(IComponentHierarchyBase<?, ?> end)
    {
        this.end = end;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setClearIcon(IComponentHierarchyBase<?, ?> clearIcon)
    {
        this.clearIcon = clearIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setExpandIcon(IComponentHierarchyBase<?, ?> expandIcon)
    {
        this.expandIcon = expandIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setFooter(IComponentHierarchyBase<?, ?> footer)
    {
        this.footer = footer;
        return (J) this;
    }

    // Event setters
    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setInputEvent(String inputEvent)
    {
        this.inputEvent = inputEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setChangeEvent(String changeEvent)
    {
        this.changeEvent = changeEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setFocusEvent(String focusEvent)
    {
        this.focusEvent = focusEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setBlurEvent(String blurEvent)
    {
        this.blurEvent = blurEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setClearEvent(String clearEvent)
    {
        this.clearEvent = clearEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setShowEvent(String showEvent)
    {
        this.showEvent = showEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAfterShowEvent(String afterShowEvent)
    {
        this.afterShowEvent = afterShowEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setHideEvent(String hideEvent)
    {
        this.hideEvent = hideEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAfterHideEvent(String afterHideEvent)
    {
        this.afterHideEvent = afterHideEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setInvalidEvent(String invalidEvent)
    {
        this.invalidEvent = invalidEvent;
        return (J) this;
    }

    /**
     * Sets focus on the control. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J focus()
    {
        return (J) this;
    }

    /**
     * Removes focus from the control. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J blur()
    {
        return (J) this;
    }

    /**
     * Shows the time picker. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J show()
    {
        return (J) this;
    }

    /**
     * Hides the time picker. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J hide()
    {
        return (J) this;
    }

    @Override
    public J bind(String variableName)
    {
        return addAttribute("[(ngModel)]", variableName);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (getName() != null && !getName().isEmpty())
            {
                String defaultName = getClass().getName().replace('.', '_');
                if (!getName().equals(defaultName))
                {
                    addAttribute("name", getName());
                }
            }
            if (value != null)
            {
                addAttribute("value", value);
            }
            if (size != null)
            {
                addAttribute("size", size.toString());
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString());
            }
            if (label != null)
            {
                addAttribute("label", label);
            }
            if (hint != null)
            {
                addAttribute("hint", hint);
            }
            if (autocomplete != null)
            {
                addAttribute("autocomplete", autocomplete);
            }
            if (min != null)
            {
                addAttribute("min", min);
            }
            if (max != null)
            {
                addAttribute("max", max);
            }
            if (step != null)
            {
                addAttribute("step", step);
            }
            if (hourFormat != null)
            {
                addAttribute("hour-format", hourFormat.toString());
            }
            if (placement != null)
            {
                addAttribute("placement", placement);
            }
            if (distance != null)
            {
                addAttribute("distance", distance);
            }

            // Boolean attributes
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (readonly != null && readonly)
            {
                addAttribute("readonly", "");
            }
            if (pill != null && pill)
            {
                addAttribute("pill", "");
            }
            if (withClear != null && withClear)
            {
                addAttribute("with-clear", "");
            }
            if (withNow != null && withNow)
            {
                addAttribute("with-now", "");
            }
            if (withLabel != null && withLabel)
            {
                addAttribute("with-label", "");
            }
            if (withHint != null && withHint)
            {
                addAttribute("with-hint", "");
            }
            if (open != null && open)
            {
                addAttribute("open", "");
            }

            // CSS custom properties
            if (!Strings.isNullOrEmpty(showDuration))
            {
                addStyle("--show-duration", showDuration);
            }
            if (!Strings.isNullOrEmpty(hideDuration))
            {
                addStyle("--hide-duration", hideDuration);
            }
            if (!Strings.isNullOrEmpty(columnItemHeight))
            {
                addStyle("--column-item-height", columnItemHeight);
            }
            if (!Strings.isNullOrEmpty(columnWidth))
            {
                addStyle("--column-width", columnWidth);
            }

            // Events
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
            if (clearIcon != null)
            {
                clearIcon.asAttributeBase()
                         .addAttribute("slot", "clear-icon");
                add(clearIcon);
            }
            if (expandIcon != null)
            {
                expandIcon.asAttributeBase()
                          .addAttribute("slot", "expand-icon");
                add(expandIcon);
            }
            if (footer != null)
            {
                footer.asAttributeBase()
                      .addAttribute("slot", "footer");
                add(footer);
            }
        }
        super.init();
    }
}

