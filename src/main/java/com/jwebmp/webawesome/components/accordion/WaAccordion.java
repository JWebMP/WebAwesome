package com.jwebmp.webawesome.components.accordion;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.FocusTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.TransitionTokenCapable;
import lombok.Getter;

/**
 * A Web Awesome {@code <wa-accordion>} container that groups one or more
 * {@link WaAccordionItem} elements so they can be expanded and collapsed.
 * <p>
 * Attributes:
 * - {@code mode}: How items open ({@code single}, {@code single-collapsible}, {@code multiple}). Default {@code multiple}.
 * - {@code icon-placement}: Placement of the expand/collapse icon ({@code start}, {@code end}). Default {@code end}.
 * - {@code heading-level}: The heading level used for item headings ({@code 1}-{@code 6} or {@code none}). Default {@code 3}.
 * - {@code appearance}: The visual appearance ({@code filled}, {@code outlined}, {@code filled-outlined}, {@code plain}). Default {@code outlined}.
 * <p>
 * Methods:
 * - {@link #expandAll()}, {@link #collapseAll()}.
 * <p>
 * Events:
 * - {@code wa-expand} (cancelable), {@code wa-after-expand}, {@code wa-collapse} (cancelable), {@code wa-after-collapse}.
 * <p>
 * Slots:
 * - default: one or more {@code <wa-accordion-item>}.
 */
@Getter
@NgImportReference(value = "WaAccordionDirective", reference = "angular-awesome")
@NgImportModule("WaAccordionDirective")
public class WaAccordion<J extends WaAccordion<J>> extends DivSimple<J>
        implements BorderTokenCapable<J>, SpaceTokenCapable<J>, FocusTokenCapable<J>, TransitionTokenCapable<J>
{
    /**
     * How items open and close.
     */
    private AccordionMode mode;

    /**
     * Placement of the expand/collapse icon.
     */
    private AccordionIconPlacement iconPlacement;

    /**
     * The heading level for item headings ({@code 1}-{@code 6} or {@code none}). Default {@code 3}.
     */
    private String headingLevel;

    /**
     * Visual appearance of the accordion.
     */
    private AccordionAppearance appearance;

    /**
     * Raw appearance string to allow multiple or custom values (e.g., "filled outlined").
     */
    private String appearanceRaw;

    /**
     * Event handler for when an item starts to expand (cancelable).
     */
    private String expandEvent;

    /**
     * Event handler for after an item has expanded.
     */
    private String afterExpandEvent;

    /**
     * Event handler for when an item starts to collapse (cancelable).
     */
    private String collapseEvent;

    /**
     * Event handler for after an item has collapsed.
     */
    private String afterCollapseEvent;

    /**
     * Creates a new WaAccordion component.
     */
    public WaAccordion()
    {
        setTag("wa-accordion");
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setMode(AccordionMode mode)
    {
        this.mode = mode;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setIconPlacement(AccordionIconPlacement iconPlacement)
    {
        this.iconPlacement = iconPlacement;
        return (J) this;
    }

    /**
     * Convenience setter accepting a string value for icon placement.
     */
    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setIconPlacement(String iconPlacement)
    {
        if (iconPlacement == null)
        {
            this.iconPlacement = null;
        }
        else
        {
            var normalized = iconPlacement.trim()
                                          .toLowerCase();
            this.iconPlacement = "start".equals(normalized) ? AccordionIconPlacement.Start : AccordionIconPlacement.End;
        }
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setHeadingLevel(String headingLevel)
    {
        this.headingLevel = headingLevel;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setHeadingLevel(int headingLevel)
    {
        this.headingLevel = String.valueOf(headingLevel);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAppearance(AccordionAppearance appearance)
    {
        this.appearance = appearance;
        return (J) this;
    }

    /**
     * Convenience setter accepting a string value for appearance; preserves raw input (supports multiple values).
     */
    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAppearance(String appearance)
    {
        this.appearanceRaw = appearance;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAppearanceRaw(String appearanceRaw)
    {
        this.appearanceRaw = appearanceRaw;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setExpandEvent(String expandEvent)
    {
        this.expandEvent = expandEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAfterExpandEvent(String afterExpandEvent)
    {
        this.afterExpandEvent = afterExpandEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setCollapseEvent(String collapseEvent)
    {
        this.collapseEvent = collapseEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAfterCollapseEvent(String afterCollapseEvent)
    {
        this.afterCollapseEvent = afterCollapseEvent;
        return (J) this;
    }

    /**
     * Expands all items. Implemented client-side; provided here for fluent chaining and documentation.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J expandAll()
    {
        return (J) this;
    }

    /**
     * Collapses all items. Implemented client-side; provided here for fluent chaining and documentation.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J collapseAll()
    {
        return (J) this;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (mode != null)
            {
                addAttribute("mode", mode.toString());
            }
            if (iconPlacement != null)
            {
                addAttribute("icon-placement", iconPlacement.toString());
            }
            if (!Strings.isNullOrEmpty(headingLevel))
            {
                addAttribute("heading-level", headingLevel);
            }
            if (!Strings.isNullOrEmpty(appearanceRaw))
            {
                addAttribute("appearance", appearanceRaw);
            }
            else if (appearance != null)
            {
                addAttribute("appearance", appearance.toString());
            }
            if (!Strings.isNullOrEmpty(expandEvent))
            {
                addAttribute("wa-expand", expandEvent);
            }
            if (!Strings.isNullOrEmpty(afterExpandEvent))
            {
                addAttribute("wa-after-expand", afterExpandEvent);
            }
            if (!Strings.isNullOrEmpty(collapseEvent))
            {
                addAttribute("wa-collapse", collapseEvent);
            }
            if (!Strings.isNullOrEmpty(afterCollapseEvent))
            {
                addAttribute("wa-after-collapse", afterCollapseEvent);
            }
        }
        super.init();
    }
}

