package com.jwebmp.webawesome.components.numberinput;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaNumberInput component provides a specialized numeric input with increment/decrement controls.
 * It supports min/max bounds, step values, and integrates with Angular forms via ControlValueAccessor.
 * <p>
 * Attributes:
 * - {@code value}: The current numeric value
 * - {@code min}: Minimum allowed value
 * - {@code max}: Maximum allowed value
 * - {@code step}: Step increment/decrement value
 * - {@code disabled}: Whether the input is disabled
 * - {@code size}: Component size (small, medium, large)
 * - {@code label}: Label text displayed above the input
 * - {@code hint}: Hint text displayed below the input
 * - {@code placeholder}: Placeholder text
 * - {@code required}: Whether a value is required
 * - {@code readonly}: Whether the input is read-only
 * - {@code noSpinButtons}: Whether to hide the increment/decrement buttons
 * - {@code form}: Form ID to associate with
 * <p>
 * Events:
 * - {@code wa-input}: Fires on every value change
 * - {@code wa-change}: Fires when value is committed
 * - {@code wa-focus}: Fires when the input gains focus
 * - {@code wa-blur}: Fires when the input loses focus
 * <p>
 * Slots:
 * - label: Custom label content
 * - hint: Custom hint content
 * - start: Content before the input
 * - end: Content after the input
 * - decrement-icon: Custom decrement button icon
 * - increment-icon: Custom increment button icon
 * <p>
 * Usage examples:
 * <pre>
 * WaNumberInput input = new WaNumberInput("Quantity");
 * input.setMin(0).setMax(100).setStep(1).setValue(1);
 *
 * WaNumberInput price = new WaNumberInput("Price", 0.0, 9999.99, 0.01);
 * </pre>
 */
@Getter
@Setter
@NgImportReference(value = "WaNumberInputDirective", reference = "angular-awesome")
@NgImportModule("WaNumberInputDirective")
public class WaNumberInput<J extends WaNumberInput<J>> extends DivSimple<J>
{
    private Number value;
    private Number min;
    private Number max;
    private Number step;
    private Boolean disabled;
    private Boolean readonly;
    private Size size;
    private String label;
    private String hint;
    private String placeholder;
    private Boolean required;
    private Boolean noSpinButtons;
    private String form;

    // Slots
    private IComponentHierarchyBase<?, ?> start;
    private IComponentHierarchyBase<?, ?> end;

    // Event handlers
    private String inputEvent;
    private String changeEvent;
    private String focusEvent;
    private String blurEvent;

    /**
     * Creates a new WaNumberInput component
     */
    public WaNumberInput()
    {
        setTag("wa-number-input");
    }

    /**
     * Creates a new WaNumberInput component with the specified label
     *
     * @param label The label text
     */
    public WaNumberInput(String label)
    {
        this();
        this.label = label;
    }

    /**
     * Creates a new WaNumberInput with label, min, max, and step
     *
     * @param label The label text
     * @param min   Minimum value
     * @param max   Maximum value
     * @param step  Step value
     */
    public WaNumberInput(String label, Number min, Number max, Number step)
    {
        this(label);
        this.min = min;
        this.max = max;
        this.step = step;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (value != null)
            {
                addAttribute("value", String.valueOf(value));
            }
            if (min != null)
            {
                addAttribute("min", String.valueOf(min));
            }
            if (max != null)
            {
                addAttribute("max", String.valueOf(max));
            }
            if (step != null)
            {
                addAttribute("step", String.valueOf(step));
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (readonly != null && readonly)
            {
                addAttribute("readonly", "");
            }
            if (size != null)
            {
                addAttribute("size", size.toString());
            }
            if (label != null)
            {
                addAttribute("label", label);
            }
            if (hint != null)
            {
                addAttribute("hint", hint);
            }
            if (placeholder != null)
            {
                addAttribute("placeholder", placeholder);
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (noSpinButtons != null && noSpinButtons)
            {
                addAttribute("no-spin-buttons", "");
            }
            if (form != null)
            {
                addAttribute("form", form);
            }
            if (start != null)
            {
                start.asAttributeBase().addAttribute("slot", "start");
                add(start);
            }
            if (end != null)
            {
                end.asAttributeBase().addAttribute("slot", "end");
                add(end);
            }

            // Event handlers
            if (!Strings.isNullOrEmpty(inputEvent))
            {
                addAttribute("(wa-input)", inputEvent);
            }
            if (!Strings.isNullOrEmpty(changeEvent))
            {
                addAttribute("(wa-change)", changeEvent);
            }
            if (!Strings.isNullOrEmpty(focusEvent))
            {
                addAttribute("(wa-focus)", focusEvent);
            }
            if (!Strings.isNullOrEmpty(blurEvent))
            {
                addAttribute("(wa-blur)", blurEvent);
            }
        }
        super.init();
    }
}

