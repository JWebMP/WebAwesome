package com.jwebmp.webawesome.components.details;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/**
 * A Web Awesome-specific extension of {@link DivSimple}, representing a Web Awesome details container.
 * This class is used to manage collapsible/expandable details sections, including optional icons
 * for expand/collapse functionality, and supports customizable summaries.
 */
public class WaDetails extends DivSimple<WaDetails>
{
    /**
     * The summary text displayed on the details container header.
     * If set, this becomes the attribute 'summary' on the container.
     */
    private String summary;

    /**
     * Indicates whether the details container is disabled.
     * If true, the container will have the 'disabled' attribute applied.
     */
    private Boolean disabled;

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
     * Default constructor for the WaDetails component.
     * Initializes this component with a default HTML tag name of 'wa-details'.
     */
    public WaDetails()
    {
        setTag("wa-details");
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
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (expandIcon != null && collapseIcon != null)
            {
                add(0, collapseIcon);
                add(0, expandIcon);
                setRenderTextBeforeChildren(false);
            }
        }
        super.init();
    }
}
