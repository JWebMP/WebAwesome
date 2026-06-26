package com.jwebmp.webawesome.components.accordion;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.TransitionTokenCapable;
import lombok.Getter;

/**
 * A Web Awesome {@code <wa-accordion-item>} that lives inside a {@link WaAccordion}.
 * <p>
 * Attributes:
 * - {@code label}: The text label shown in the heading.
 * - {@code expanded}: Whether the item is expanded.
 * - {@code disabled}: Whether the item is disabled.
 * <p>
 * Methods:
 * - {@link #expand()}, {@link #collapse()}, {@link #toggle()}, {@link #focus()}.
 * <p>
 * Slots:
 * - default: the item body.
 * - {@code label}: HTML content for the heading.
 * - {@code icon}: the expand/collapse icon.
 * <p>
 * CSS Custom Properties:
 * - {@code --spacing}, {@code --show-duration}, {@code --hide-duration}, {@code --easing}, {@code --wa-accordion-divider-color}.
 */
@Getter
@NgImportReference(value = "WaAccordionItemDirective", reference = "angular-awesome")
@NgImportModule("WaAccordionItemDirective")
public class WaAccordionItem<J extends WaAccordionItem<J>> extends DivSimple<J>
        implements SpaceTokenCapable<J>, TransitionTokenCapable<J>
{
    /**
     * The text label shown in the item heading.
     */
    private String label;

    /**
     * Whether the item is expanded.
     */
    private Boolean expanded;

    /**
     * Whether the item is disabled.
     */
    private Boolean disabled;

    /**
     * HTML content for the label slot.
     */
    private IComponentHierarchyBase<?, ?> labelSlot;

    /**
     * Content for the icon slot.
     */
    private IComponentHierarchyBase<?, ?> iconSlot;

    /**
     * The {@code --spacing} CSS custom property.
     */
    private String spacing;

    /**
     * The {@code --show-duration} CSS custom property.
     */
    private String showDuration;

    /**
     * The {@code --show-duration} CSS custom property. Default {@code var(--wa-transition-normal)}.
     */
    private String hideDuration;

    /**
     * The {@code --hide-duration} CSS custom property. Default {@code var(--wa-transition-normal)}.
     */
    private String easing;

    /**
     * The {@code --easing} CSS custom property. Default {@code var(--wa-transition-easing)}.
     */
    private String dividerColor;

    /**
     * Creates a new WaAccordionItem component.
     * <p>
     * No longer documented upstream as of Web Awesome 3.9.0; retained for backward compatibility.
     */
    public WaAccordionItem()
    {
        setTag("wa-accordion-item");
    }

    /**
     * Creates a new WaAccordionItem with the specified label.
     *
     * @param label The label text
     */
    public WaAccordionItem(String label)
    {
        this();
        this.label = label;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setExpanded(Boolean expanded)
    {
        this.expanded = expanded;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setLabelSlot(IComponentHierarchyBase<?, ?> labelSlot)
    {
        this.labelSlot = labelSlot;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setIconSlot(IComponentHierarchyBase<?, ?> iconSlot)
    {
        this.iconSlot = iconSlot;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setSpacing(String spacing)
    {
        this.spacing = spacing;
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
    public @org.jspecify.annotations.NonNull J setEasing(String easing)
    {
        this.easing = easing;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setDividerColor(String dividerColor)
    {
        this.dividerColor = dividerColor;
        return (J) this;
    }

    /**
     * Expands the item. Implemented client-side; provided here for fluent chaining and documentation.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J expand()
    {
        return (J) this;
    }

    /**
     * Collapses the item. Implemented client-side; provided here for fluent chaining and documentation.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J collapse()
    {
        return (J) this;
    }

    /**
     * Toggles the item. Implemented client-side; provided here for fluent chaining and documentation.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J toggle()
    {
        return (J) this;
    }

    /**
     * Sets focus on the item. Implemented client-side; provided here for fluent chaining and documentation.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J focus()
    {
        return (J) this;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (expanded != null && expanded)
            {
                addAttribute("expanded", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (labelSlot != null)
            {
                labelSlot.asAttributeBase()
                         .addAttribute("slot", "label");
                add(labelSlot);
            }
            if (iconSlot != null)
            {
                iconSlot.asAttributeBase()
                        .addAttribute("slot", "icon");
                add(iconSlot);
            }
            if (!Strings.isNullOrEmpty(spacing))
            {
                addStyle("--spacing", spacing);
            }
            if (!Strings.isNullOrEmpty(showDuration))
            {
                addStyle("--show-duration", showDuration);
            }
            if (!Strings.isNullOrEmpty(hideDuration))
            {
                addStyle("--hide-duration", hideDuration);
            }
            if (!Strings.isNullOrEmpty(easing))
            {
                addStyle("--easing", easing);
            }
            if (!Strings.isNullOrEmpty(dividerColor))
            {
                addStyle("--wa-accordion-divider-color", dividerColor);
            }
        }
        super.init();
    }
}

