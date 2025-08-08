package com.jwebmp.webawesome.components.tree;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaTreeItem component represents an item in a tree structure.
 * It can contain other tree items to create a hierarchical structure.
 * <p>
 * This component renders as a wa-tree-item HTML element and supports various customization options
 * through properties like expanded, selected, disabled, and lazy.
 */
@Getter
@Setter
@NgImportReference(value = "WaTreeItemDirective", reference = "angular-awesome")
@NgImportModule("WaTreeItemDirective")
public class WaTreeItem<J extends WaTreeItem<J>> extends DivSimple<J>
{
    /**
     * Whether the item is initially selected
     */
    private Boolean selected;

    /**
     * Whether the item is initially expanded
     */
    private Boolean expanded;

    /**
     * Disables interaction with the item
     */
    private Boolean disabled;

    /**
     * Enables lazy loading
     */
    private Boolean lazyLoading;

    /**
     * Custom icon when item is expanded
     */
    private WaIcon<?> expandIcon;

    /**
     * Custom icon when item is collapsed
     */
    private WaIcon<?> collapseIcon;

    /**
     * Background color when item is selected
     */
    private String selectionBackgroundColor;

    /**
     * Color of the selection indicator
     */
    private String selectionIndicatorColor;

    /**
     * Color of the expand button
     */
    private String expandButtonColor;

    /**
     * Duration of the show animation
     */
    private String showDuration;

    /**
     * Duration of the hide animation
     */
    private String hideDuration;

    /**
     * Creates a new WaTreeItem with the tag "wa-tree-item"
     */
    public WaTreeItem()
    {
        setTag("wa-tree-item");
        setRenderTextBeforeChildren(true);
    }

    /**
     * Adds a child WaTreeItem to this WaTreeItem
     *
     * @param child The child WaTreeItem to add
     * @return This component
     */
    public J add(WaTreeItem<?> child)
    {
        super.add(child);
        return (J) this;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (selected != null && selected)
            {
                addAttribute("selected", "");
            }
            if (expanded != null && expanded)
            {
                addAttribute("[expanded]", "true");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (lazyLoading != null && lazyLoading)
            {
                addAttribute("lazy", "");
            }
            if (expandIcon != null)
            {
                expandIcon.addAttribute("slot", "expand-icon");
                add(expandIcon);
            }
            if (collapseIcon != null)
            {
                collapseIcon.addAttribute("slot", "collapse-icon");
                add(collapseIcon);
            }
            if (!Strings.isNullOrEmpty(selectionBackgroundColor))
            {
                addStyle("--selection-background-color", selectionBackgroundColor);
            }
            if (!Strings.isNullOrEmpty(selectionIndicatorColor))
            {
                addStyle("--selection-indicator-color", selectionIndicatorColor);
            }
            if (!Strings.isNullOrEmpty(expandButtonColor))
            {
                addStyle("--expand-button-color", expandButtonColor);
            }
            if (!Strings.isNullOrEmpty(showDuration))
            {
                addStyle("--show-duration", showDuration);
            }
            if (!Strings.isNullOrEmpty(hideDuration))
            {
                addStyle("--hide-duration", hideDuration);
            }
        }
        super.init();
    }

    /**
     * Binds the selected attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindSelected(String variableName)
    {
        addAttribute("[selected]", variableName);
        return (J) this;
    }

    /**
     * Binds the expanded attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindExpanded(String variableName)
    {
        addAttribute("[expanded]", variableName);
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
     * Binds the lazy attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindLazyLoading(String variableName)
    {
        addAttribute("[lazy]", variableName);
        return (J) this;
    }

    /**
     * Binds the selection-background-color style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindSelectionBackgroundColor(String variableName)
    {
        addAttribute("[style.--selection-background-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the selection-indicator-color style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindSelectionIndicatorColor(String variableName)
    {
        addAttribute("[style.--selection-indicator-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the expand-button-color style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindExpandButtonColor(String variableName)
    {
        addAttribute("[style.--expand-button-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the show-duration style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindShowDuration(String variableName)
    {
        addAttribute("[style.--show-duration]", variableName);
        return (J) this;
    }

    /**
     * Binds the hide-duration style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindHideDuration(String variableName)
    {
        addAttribute("[style.--hide-duration]", variableName);
        return (J) this;
    }

    /**
     * Adds a handler for the expand event
     *
     * @param handlerScript The JavaScript to execute when the item starts expanding
     * @return This component
     */
    public J onExpand(String handlerScript)
    {
        addAttribute("(expand)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the afterExpand event
     *
     * @param handlerScript The JavaScript to execute after item has finished expanding
     * @return This component
     */
    public J onAfterExpand(String handlerScript)
    {
        addAttribute("(afterExpand)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the collapse event
     *
     * @param handlerScript The JavaScript to execute when the item starts collapsing
     * @return This component
     */
    public J onCollapse(String handlerScript)
    {
        addAttribute("(collapse)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the afterCollapse event
     *
     * @param handlerScript The JavaScript to execute after item has finished collapsing
     * @return This component
     */
    public J onAfterCollapse(String handlerScript)
    {
        addAttribute("(afterCollapse)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the lazyChange event
     *
     * @param handlerScript The JavaScript to execute when the lazy state changes
     * @return This component
     */
    public J onLazyChange(String handlerScript)
    {
        addAttribute("(lazyChange)", handlerScript);
        return (J) this;
    }

    /**
     * Adds a handler for the lazyLoad event
     *
     * @param handlerScript The JavaScript to execute when a lazy item is triggered to expand and needs loading
     * @return This component
     */
    public J onLazyLoad(String handlerScript)
    {
        addAttribute("(lazyLoad)", handlerScript);
        return (J) this;
    }


}
