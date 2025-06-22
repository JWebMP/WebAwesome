package com.jwebmp.webawesome.components.details;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

/**
 * A Web Awesome-specific extension of {@link DivSimple}, representing a Web Awesome details container.
 * This class is used to manage collapsible/expandable details sections, including optional icons
 * for expand/collapse functionality, and supports customizable summaries.
 */
@Getter
@Setter
@NgImportReference(value = "WaDetailsDirective", reference = "angular-awesome")
@NgImportModule("WaDetailsDirective")
public class WaDetails<J extends WaDetails<J>> extends DivSimple<J>
{
    /**
     * The summary text displayed on the details container header.
     * If set, this becomes the attribute 'summary' on the container.
     */
    private String summary;

    /**
     * HTML content for the summary slot.
     */
    private IComponentHierarchyBase<?, ?> summarySlot;

    /**
     * Indicates whether the details container is disabled.
     * If true, the container will have the 'disabled' attribute applied.
     */
    private Boolean disabled;

    /**
     * Controls the open state of the details section.
     */
    private Boolean open;

    /**
     * Visual style for the component (filled, outlined, plain).
     * Multiple values allowed space-separated.
     */
    private String appearance;

    /**
     * An icon displayed when the container is in a collapsed state.
     * Used to visually indicate that the container can be expanded.
     */
    private WaIcon expandIcon;

    /**
     * An icon displayed when the container is in an expanded state.
     * Used to visually indicate that the container can be collapsed.
     */
    private WaIcon collapseIcon;

    /**
     * Color of the expand/collapse icon.
     */
    private String iconColor;

    /**
     * Spacing between summary and content.
     */
    private String spacing;

    /**
     * Expand animation duration.
     */
    private String showDuration;

    /**
     * Collapse animation duration.
     */
    private String hideDuration;

    /**
     * Sets the display behavior.
     */
    private String display;

    /**
     * Default constructor for the WaDetails component.
     * Initializes this component with a default HTML tag name of 'wa-details'.
     */
    public WaDetails()
    {
        setTag("wa-details");
    }

    /**
     * Constructor with summary text.
     *
     * @param summary The summary text to display
     */
    public WaDetails(String summary)
    {
        this();
        this.summary = summary;
    }

    /**
     * Shows the details programmatically.
     *
     * @return This object for method chaining
     */
    public WaDetails show()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
    }

    /**
     * Hides the details programmatically.
     *
     * @return This object for method chaining
     */
    public WaDetails hide()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
    }

    /**
     * Initializes the WaDetails component by applying configured
     * attributes, icons, and other properties.
     * Ensures all attributes and child components are properly set before rendering.
     */
    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(summary))
            {
                addAttribute("summary", summary);
            }
            if (summarySlot != null)
            {
                summarySlot.asAttributeBase()
                           .addAttribute("slot", "summary");
                add(summarySlot);
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (open != null && open)
            {
                addAttribute("open", "");
            }
            if (!Strings.isNullOrEmpty(appearance))
            {
                addAttribute("appearance", appearance);
            }
            if (expandIcon != null)
            {
                expandIcon.asAttributeBase()
                          .addAttribute("slot", "expand-icon");
                add(expandIcon);
            }
            if (collapseIcon != null)
            {
                collapseIcon.asAttributeBase()
                            .addAttribute("slot", "collapse-icon");
                add(collapseIcon);
            }

            // Apply CSS custom properties
            if (!Strings.isNullOrEmpty(iconColor))
            {
                addStyle("--icon-color", iconColor);
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
            if (!Strings.isNullOrEmpty(display))
            {
                addStyle("--display", display);
            }
        }
        super.init();
    }
}
