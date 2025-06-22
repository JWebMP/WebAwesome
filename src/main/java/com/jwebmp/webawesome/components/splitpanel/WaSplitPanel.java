package com.jwebmp.webawesome.components.splitpanel;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaSplitPanel component displays two adjacent panels (start/end) separated by a resizable divider.
 * It supports features like custom initial position, vertical orientation, primary panel designation,
 * snap positions, and custom styling.
 * <p>
 * This component renders as a wa-split-panel HTML element and supports various customization options
 * through properties and CSS custom properties.
 */
@Getter
@Setter
@NgImportReference(value = "WaSplitPanelDirective", reference = "angular-awesome")
@NgImportModule("WaSplitPanelDirective")
public class WaSplitPanel<J extends WaSplitPanel<J>> extends DivSimple<J>
{
    /**
     * Content of the start panel
     */
    private IComponentHierarchyBase<?, ?> start;

    /**
     * Content of the end panel
     */
    private IComponentHierarchyBase<?, ?> end;

    /**
     * Percentage (0-100) of initial divider position
     */
    private Integer position;

    /**
     * Initial divider position in pixels
     */
    private Integer positionInPixels;

    /**
     * Whether the split orientation is vertical
     */
    private Boolean vertical;

    /**
     * Space-separated values to which the divider can snap
     */
    private String snap;

    /**
     * Proximity threshold in pixels to trigger snapping
     */
    private Integer snapThreshold;

    /**
     * Prevents resizing the divider
     */
    private Boolean disabled;

    /**
     * Designates the primary panel that maintains size during host resize ('start' or 'end')
     */
    private SplitPanelPrimary primary;

    /**
     * Minimum size constraint for the primary panel
     */
    private String min;

    /**
     * Maximum size constraint for the primary panel
     */
    private String max;

    /**
     * Color of the divider
     */
    private String dividerColor;

    /**
     * Width of the divider
     */
    private String dividerWidth;

    /**
     * Size of the hit area for the divider
     */
    private String dividerHitArea;

    /**
     * Custom divider icon or handle
     */
    private WaIcon<?> dividerIcon;


    /**
     * Creates a new WaSplitPanel with the tag "wa-split-panel"
     */
    public WaSplitPanel()
    {
        setTag("wa-split-panel");
    }

    /**
     * Utility method to add the "wa-split" class to a component
     *
     * @param component The component to add the class to
     * @param <T>       The type of the component
     * @return The component with the class added
     */
    public static <T extends IComponentHierarchyBase<?, ?>> T split(T component)
    {
        component.addClass("wa-split");
        return component;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (dividerIcon != null)
            {
                dividerIcon.addAttribute("slot", "divider");
                add(dividerIcon);
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

            if (positionInPixels != null)
            {
                addAttribute("position-in-pixels", String.valueOf(positionInPixels));
            }
            if (position != null)
            {
                addAttribute("position", String.valueOf(position));
            }
            if (vertical != null && vertical)
            {
                addAttribute("vertical", "");
            }
            if (!Strings.isNullOrEmpty(snap))
            {
                addAttribute("snap", snap);
            }
            if (snapThreshold != null)
            {
                addAttribute("snap-threshold", String.valueOf(snapThreshold));
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (primary != null)
            {
                addAttribute("primary", primary.toString()
                                               .toLowerCase());
            }
            if (!Strings.isNullOrEmpty(min))
            {
                addStyle("--min", min);
            }
            if (!Strings.isNullOrEmpty(max))
            {
                addStyle("--max", max);
            }
            if (!Strings.isNullOrEmpty(dividerColor))
            {
                addStyle("--divider-color", dividerColor);
            }
            if (!Strings.isNullOrEmpty(dividerWidth))
            {
                addStyle("--divider-width", dividerWidth);
            }
            if (!Strings.isNullOrEmpty(dividerHitArea))
            {
                addStyle("--divider-hit-area", dividerHitArea);
            }
        }
        super.init();
    }

    /**
     * Binds the position attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindPosition(String variableName)
    {
        addAttribute("[position]", variableName);
        return (J) this;
    }

    /**
     * Binds the positionInPixels attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindPositionInPixels(String variableName)
    {
        addAttribute("[position-in-pixels]", variableName);
        return (J) this;
    }

    /**
     * Binds the vertical attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindVertical(String variableName)
    {
        addAttribute("[vertical]", variableName);
        return (J) this;
    }

    /**
     * Binds the snap attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindSnap(String variableName)
    {
        addAttribute("[snap]", variableName);
        return (J) this;
    }

    /**
     * Binds the snapThreshold attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindSnapThreshold(String variableName)
    {
        addAttribute("[snap-threshold]", variableName);
        return (J) this;
    }

    /**
     * Binds the disabled attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindDisabled(String variableName)
    {
        addAttribute("[disabled]", variableName);
        return (J) this;
    }

    /**
     * Binds the primary attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindPrimary(String variableName)
    {
        addAttribute("[primary]", variableName);
        return (J) this;
    }

    /**
     * Binds the min style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindMin(String variableName)
    {
        addAttribute("[style.--min]", variableName);
        return (J) this;
    }

    /**
     * Binds the max style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindMax(String variableName)
    {
        addAttribute("[style.--max]", variableName);
        return (J) this;
    }

    /**
     * Binds the dividerColor style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindDividerColor(String variableName)
    {
        addAttribute("[style.--divider-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the dividerWidth style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindDividerWidth(String variableName)
    {
        addAttribute("[style.--divider-width]", variableName);
        return (J) this;
    }

    /**
     * Binds the dividerHitArea style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindDividerHitArea(String variableName)
    {
        addAttribute("[style.--divider-hit-area]", variableName);
        return (J) this;
    }
}
