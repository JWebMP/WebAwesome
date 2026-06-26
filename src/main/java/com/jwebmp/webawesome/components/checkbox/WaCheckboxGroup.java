package com.jwebmp.webawesome.components.checkbox;


import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.ComponentGroupTokenCapable;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import lombok.Getter;

/**
 * A Web Awesome {@code <wa-checkbox-group>} labelling/grouping container for related
 * {@code <wa-checkbox>} and {@code <wa-switch>} elements. It gives the grouped controls a
 * shared label, hint, and grouping semantics.
 * <p>
 * This component is a <strong>container only</strong>. It does <strong>not</strong> own a value:
 * the child checkboxes/switches keep their own value and binding. It exposes <strong>no events</strong>
 * and no methods beyond standard DOM access.
 * <p>
 * Attributes:
 * <ul>
 *   <li>{@code label} – the group label (also available as a {@code label} slot). Required for accessibility.</li>
 *   <li>{@code hint} – hint text (also available as a {@code hint} slot).</li>
 *   <li>{@code orientation} – {@code horizontal} or {@code vertical} (default {@code vertical}).</li>
 *   <li>{@code size} – {@code xs | s | m | l | xl | small | medium | large}, applied to all child controls.</li>
 *   <li>{@code required} – visual indicator only; enforce on the individual checkboxes.</li>
 *   <li>{@code with-label} – SSR-only flag, set when slotting a {@code label} element.</li>
 *   <li>{@code with-hint} – SSR-only flag, set when slotting a {@code hint} element.</li>
 * </ul>
 * <p>
 * Slots:
 * <ul>
 *   <li>{@code (default)} – the {@code <wa-checkbox>} / {@code <wa-switch>} items.</li>
 *   <li>{@code label} – HTML content for the group label.</li>
 *   <li>{@code hint} – HTML content for the hint.</li>
 * </ul>
 * <p>
 * CSS custom properties:
 * <ul>
 *   <li>{@code --gap} – the gap between grouped checkboxes (default {@code 0.5em}); see {@link #setStyleGap(String)}.</li>
 * </ul>
 * <p>
 * CSS parts: {@code form-control}, {@code form-control-label}, {@code form-control-input}, {@code hint}.
 */
@Getter
@NgImportReference(value = "WaCheckboxGroupDirective", reference = "angular-awesome")
@NgImportModule("WaCheckboxGroupDirective")
public class WaCheckboxGroup<J extends WaCheckboxGroup<J>> extends DivSimple<J> implements SpaceTokenCapable<J>, ComponentGroupTokenCapable<J>
{
    /**
     * The group label. Also available as a {@code label} slot. Required for accessibility.
     */
    private String label;

    /**
     * Hint text for the group. Also available as a {@code hint} slot.
     */
    private String hint;

    /**
     * The orientation of the grouped checkboxes/switches.
     * Default {@code vertical}.
     */
    private CheckboxGroupOrientation orientation;

    /**
     * The size applied to all child checkboxes/switches.
     */
    private Size size;

    /**
     * Whether the group is required. Visual indicator only; enforce on the individual checkboxes.
     */
    private Boolean required;

    /**
     * SSR-only flag, set when slotting a {@code label} element.
     */
    private Boolean withLabel;

    /**
     * SSR-only flag, set when slotting a {@code hint} element.
     */
    private Boolean withHint;

    /**
     * Custom gap between grouped checkboxes ({@code --gap}).
     */
    private String styleGap;

    /**
     * Default constructor for the WaCheckboxGroup class.
     * Initializes the component with a default tag of {@code wa-checkbox-group}.
     */
    public WaCheckboxGroup()
    {
        setTag("wa-checkbox-group");
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
    public J setOrientation(CheckboxGroupOrientation orientation)
    {
        this.orientation = orientation;
        return (J) this;
    }

    /**
     * Backwards-compatible setter that accepts a String orientation and maps it to the enum.
     * Accepts "horizontal" and "vertical" (case-insensitive). Any other non-empty value clears the orientation.
     *
     * @param orientation the orientation string
     * @return this
     */
    @SuppressWarnings("unchecked")
    public J setOrientation(String orientation)
    {
        if (Strings.isNullOrEmpty(orientation))
        {
            this.orientation = null;
        }
        else if ("horizontal".equalsIgnoreCase(orientation))
        {
            this.orientation = CheckboxGroupOrientation.Horizontal;
        }
        else if ("vertical".equalsIgnoreCase(orientation))
        {
            this.orientation = CheckboxGroupOrientation.Vertical;
        }
        else
        {
            this.orientation = null;
        }
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSize(Size size)
    {
        this.size = size;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setRequired(Boolean required)
    {
        this.required = required;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setWithLabel(Boolean withLabel)
    {
        this.withLabel = withLabel;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setWithHint(Boolean withHint)
    {
        this.withHint = withHint;
        return (J) this;
    }

    /**
     * Sets the {@code --gap} CSS custom property controlling the gap between grouped checkboxes.
     *
     * @param styleGap the gap value (e.g. {@code 0.5em})
     * @return this
     */
    @SuppressWarnings("unchecked")
    public J setStyleGap(String styleGap)
    {
        this.styleGap = styleGap;
        return (J) this;
    }

    /**
     * Initializes the component, adding the attributes and styles.
     */
    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (!Strings.isNullOrEmpty(hint))
            {
                addAttribute("hint", hint);
            }
            if (orientation != null)
            {
                addAttribute("orientation", orientation.toString());
            }
            if (size != null)
            {
                addAttribute("size", size.name()
                                         .toLowerCase());
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (withLabel != null && withLabel)
            {
                addAttribute("with-label", "");
            }
            if (withHint != null && withHint)
            {
                addAttribute("with-hint", "");
            }

            // Add CSS custom properties if specified
            if (!Strings.isNullOrEmpty(styleGap))
            {
                addStyle("--gap", styleGap);
            }
        }
        super.init();
    }
}

