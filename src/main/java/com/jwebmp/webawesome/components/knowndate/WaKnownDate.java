package com.jwebmp.webawesome.components.knowndate;

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
 * A Web Awesome {@code <wa-known-date>} form control that captures a known date using separate
 * day/month/year fields.
 * <p>
 * Values are exchanged in ISO format ({@code YYYY-MM-DD}).
 * <p>
 * Events: {@code input}, {@code change}, {@code focus}, {@code blur}, {@code wa-invalid}.
 * <p>
 * Slots: {@code label}, {@code hint}.
 */
@Getter
@NgImportReference(value = "WaKnownDateDirective", reference = "angular-awesome")
@NgImportModule("WaKnownDateDirective")
public class WaKnownDate<J extends WaKnownDate<J>> extends DivSimple<J>
        implements BorderTokenCapable<J>, SpaceTokenCapable<J>, FocusTokenCapable<J>, TypographyTokenCapable<J>
{
    /**
     * The control value (ISO {@code YYYY-MM-DD}).
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
    private KnownDateSize size;

    /**
     * The control appearance.
     */
    private KnownDateAppearance appearance;

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
     * The autocomplete behaviour (e.g., {@code bday}).
     */
    private String autocomplete;

    /**
     * The earliest selectable date (ISO {@code YYYY-MM-DD}).
     */
    private String min;

    /**
     * The latest selectable date (ISO {@code YYYY-MM-DD}).
     */
    private String max;

    /**
     * The locale used to format and order the fields.
     */
    private String locale;

    /**
     * SSR flag to indicate the label slot is present on initial paint.
     */
    private Boolean withLabel;

    /**
     * SSR flag to indicate the hint slot is present on initial paint.
     */
    private Boolean withHint;

    // Slots
    private IComponentHierarchyBase<?, ?> labelSlot;
    private IComponentHierarchyBase<?, ?> hintSlot;

    // Events
    private String inputEvent;
    private String changeEvent;
    private String focusEvent;
    private String blurEvent;
    private String invalidEvent;

    /**
     * Creates a new WaKnownDate component.
     */
    public WaKnownDate()
    {
        setTag("wa-known-date");
    }

    /**
     * Creates a new WaKnownDate with the specified label.
     *
     * @param label The label text
     */
    public WaKnownDate(String label)
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
    public @org.jspecify.annotations.NonNull J setSize(KnownDateSize size)
    {
        this.size = size;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAppearance(KnownDateAppearance appearance)
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
    public @org.jspecify.annotations.NonNull J setLocale(String locale)
    {
        this.locale = locale;
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
            if (locale != null)
            {
                addAttribute("locale", locale);
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
            if (withLabel != null && withLabel)
            {
                addAttribute("with-label", "");
            }
            if (withHint != null && withHint)
            {
                addAttribute("with-hint", "");
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
        }
        super.init();
    }
}

