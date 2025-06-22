package com.jwebmp.webawesome.components.tooltip;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaTooltip component displays contextual information when hovering, focusing, clicking,
 * or programmatically toggling visibility on a target element.
 * <p>
 * This component renders as a wa-tooltip HTML element and is bound via the 'for' attribute
 * to the id of another element.
 */
@Getter
@Setter
@NgImportReference(value = "WaTooltipDirective", reference = "angular-awesome")
@NgImportModule("WaTooltipDirective")
public class WaTooltip<J extends WaTooltip<J>> extends DivSimple<J>
{
    /**
     * The id of the target element this tooltip is attached to
     */
    private String forId;

    /**
     * Preferred placement of the tooltip
     */
    private TooltipPlacement placement;

    /**
     * If true, removes the arrow from the tooltip
     */
    private Boolean noArrow;

    /**
     * Maximum width of the tooltip
     */
    private String maxWidth;

    /**
     * If true, the tooltip will be appended to the document body
     */
    private Boolean hoist;

    /**
     * Distance in pixels to offset the tooltip
     */
    private Integer distance;

    /**
     * Programmatically control tooltip visibility
     */
    private Boolean open;

    /**
     * Skidding offset in pixels along the target
     */
    private Integer skidding;

    /**
     * Delay before showing (ms)
     */
    private Integer showDelay;

    /**
     * Delay before hiding (ms)
     */
    private Integer hideDelay;

    /**
     * If true, disables tooltip display
     */
    private Boolean disabled;

    /**
     * Trigger method: click, hover, focus, manual, or space-separated combinations
     */
    private String trigger;

    /**
     * Background color custom property
     */
    private String backgroundColor;

    /**
     * Border radius custom property
     */
    private String borderRadius;

    /**
     * Padding custom property
     */
    private String padding;

    /**
     * Creates a new WaTooltip with the tag "wa-tooltip"
     */
    public WaTooltip()
    {
        setTag("wa-tooltip");
    }

    /**
     * Creates a new WaTooltip for the specified component
     *
     * @param component The component to attach the tooltip to
     */
    public WaTooltip(IComponentHierarchyBase<?, ?> component)
    {
        setTag("wa-tooltip");
        setForId(component.asBase()
                          .getID());
    }


    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (forId != null)
            {
                addAttribute("for", forId);
            }
            if (placement != null)
            {
                addAttribute("placement", placement.toString());
            }
            if (noArrow != null && noArrow)
            {
                addStyle("--wa-tooltip-arrow-size", "0");
            }
            if (maxWidth != null)
            {
                addStyle("--max-width", maxWidth);
            }
            if (hoist != null && hoist)
            {
                addAttribute("hoist", "");
            }
            if (distance != null)
            {
                addAttribute("distance", distance.toString());
            }
            if (open != null && open)
            {
                addAttribute("open", "");
            }
            if (skidding != null)
            {
                addAttribute("skidding", skidding.toString());
            }
            if (showDelay != null)
            {
                addAttribute("show-delay", showDelay.toString());
            }
            if (hideDelay != null)
            {
                addAttribute("hide-delay", hideDelay.toString());
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (!Strings.isNullOrEmpty(trigger))
            {
                addAttribute("trigger", trigger);
            }
            if (!Strings.isNullOrEmpty(backgroundColor))
            {
                addStyle("--background-color", backgroundColor);
            }
            if (!Strings.isNullOrEmpty(borderRadius))
            {
                addStyle("--border-radius", borderRadius);
            }
            if (!Strings.isNullOrEmpty(padding))
            {
                addStyle("--padding", padding);
            }
        }
        super.init();
    }

    /**
     * Binds the for attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindForId(String variableName)
    {
        addAttribute("[for]", variableName);
        return (J) this;
    }

    /**
     * Binds the placement attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindPlacement(String variableName)
    {
        addAttribute("[placement]", variableName);
        return (J) this;
    }

    /**
     * Binds the distance attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindDistance(String variableName)
    {
        addAttribute("[distance]", variableName);
        return (J) this;
    }

    /**
     * Binds the skidding attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindSkidding(String variableName)
    {
        addAttribute("[skidding]", variableName);
        return (J) this;
    }

    /**
     * Binds the open attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindOpen(String variableName)
    {
        addAttribute("[open]", variableName);
        return (J) this;
    }

    /**
     * Binds the show-delay attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindShowDelay(String variableName)
    {
        addAttribute("[show-delay]", variableName);
        return (J) this;
    }

    /**
     * Binds the hide-delay attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindHideDelay(String variableName)
    {
        addAttribute("[hide-delay]", variableName);
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
     * Binds the trigger attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindTrigger(String variableName)
    {
        addAttribute("[trigger]", variableName);
        return (J) this;
    }

    /**
     * Binds the hoist attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindHoist(String variableName)
    {
        addAttribute("[hoist]", variableName);
        return (J) this;
    }

    /**
     * Binds the background-color style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindBackgroundColor(String variableName)
    {
        addAttribute("[style.--background-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the border-radius style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindBorderRadius(String variableName)
    {
        addAttribute("[style.--border-radius]", variableName);
        return (J) this;
    }

    /**
     * Binds the max-width style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindMaxWidth(String variableName)
    {
        addAttribute("[style.--max-width]", variableName);
        return (J) this;
    }

    /**
     * Binds the padding style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindPadding(String variableName)
    {
        addAttribute("[style.--padding]", variableName);
        return (J) this;
    }

    /**
     * Adds a handler for the waShow event
     *
     * @param handlerScript The JavaScript to execute when the tooltip starts showing
     * @return This component
     */
    public J onShow(String handlerScript)
    {
        addAttribute("(waShow)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the waAfterShow event
     *
     * @param handlerScript The JavaScript to execute after the tooltip is fully shown
     * @return This component
     */
    public J onAfterShow(String handlerScript)
    {
        addAttribute("(waAfterShow)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the waHide event
     *
     * @param handlerScript The JavaScript to execute when the tooltip starts hiding
     * @return This component
     */
    public J onHide(String handlerScript)
    {
        addAttribute("(waHide)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the waAfterHide event
     *
     * @param handlerScript The JavaScript to execute after the tooltip is fully hidden
     * @return This component
     */
    public J onAfterHide(String handlerScript)
    {
        addAttribute("(waAfterHide)", handlerScript);
        return (J) this;
    }
}
