package com.jwebmp.webawesome.components.divider;


import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
/**
 * Dividers visually separate or group elements.
 * <p>
 * Attributes:
 * - `orientation`: Sets the orientation of the divider ('vertical' or 'horizontal'). Default is 'horizontal'.
 * - `vertical`: Deprecated. Use orientation="vertical" instead.
 * <p>
 * Style Inputs:
 * - `color`: Sets the --color CSS property (color of the divider).
 * - `width`: Sets the --width CSS property (thickness/width of the divider).
 * - `spacing`: Sets the --spacing CSS property (space around the divider).
 * <p>
 * Usage examples:
 * <pre>
 * // Horizontal divider with custom width
 * WaDivider divider = new WaDivider();
 * divider.setWidth("4px");
 * 
 * // Vertical divider
 * WaDivider verticalDivider = new WaDivider();
 * verticalDivider.setOrientation("vertical");
 * verticalDivider.setSpacing("1rem");
 * </pre>
 */
@Getter
@NgImportReference(value = "WaDividerDirective", reference = "angular-awesome")
@NgImportModule("WaDividerDirective")
public class WaDivider<J extends WaDivider<J>> extends DivSimple<J> implements BorderTokenCapable<J>, SpaceTokenCapable<J>
{
    /**
     * The color of the divider.
     * Maps to --color CSS property.
     */
    private String color;
    
    /**
     * The thickness/width of the divider.
     * Maps to --width CSS property.
     */
    private String width;
    
    /**
     * Space around the divider.
     * Maps to --spacing CSS property.
     */
    private String spacing;
    
    /**
     * Sets the orientation of the divider.
     * Options: 'vertical' or 'horizontal'. Default is 'horizontal'.
     */
    private String orientation;

    /**
     * @deprecated Use orientation="vertical" instead.
     * Sets the divider to vertical orientation when true.
     */
    @Deprecated(since = "2025-08-09", forRemoval = true)
    private Boolean vertical;
    private Boolean withLabel;
    private String labelPlacement;
    private String labelSpacing;
    private String labelOffset;
    private IComponentHierarchyBase<?, ?> label;
    @SuppressWarnings("unchecked")
    public J setColor(String color)
    {
        this.color = color;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWidth(String width)
    {
        this.width = width;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSpacing(String spacing)
    {
        this.spacing = spacing;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setOrientation(String orientation)
    {
        this.orientation = orientation;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setVertical(Boolean vertical)
    {
        this.vertical = vertical;
        return (J) this;
    }
    @SuppressWarnings("unchecked")
    public J setWithLabel(Boolean withLabel)
    {
        this.withLabel = withLabel;
        return (J) this;
    }
    @SuppressWarnings("unchecked")
    public J setLabelPlacement(String labelPlacement)
    {
        this.labelPlacement = labelPlacement;
        return (J) this;
    }
    @SuppressWarnings("unchecked")
    public J setLabelSpacing(String labelSpacing)
    {
        this.labelSpacing = labelSpacing;
        return (J) this;
    }
    @SuppressWarnings("unchecked")
    public J setLabelOffset(String labelOffset)
    {
        this.labelOffset = labelOffset;
        return (J) this;
    }
    @SuppressWarnings("unchecked")
    public J setLabel(IComponentHierarchyBase<?, ?> label)
    {
        this.label = label;
        return (J) this;
    }
    public WaDivider()
    {
        setTag("wa-divider");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(color))
            {
                addStyle("--color", color);
            }
            if (!Strings.isNullOrEmpty(width))
            {
                addStyle("--width", width);
            }
            if (!Strings.isNullOrEmpty(spacing))
            {
                addStyle("--spacing", spacing);
            }
            if (!Strings.isNullOrEmpty(labelSpacing))
            {
                addStyle("--label-spacing", labelSpacing);
            }
            if (!Strings.isNullOrEmpty(labelOffset))
            {
                addStyle("--label-offset", labelOffset);
            }
            
            // Apply orientation attribute if specified
            if (!Strings.isNullOrEmpty(orientation))
            {
                addAttribute("orientation", orientation);
            }
            // Apply deprecated vertical attribute for backward compatibility
            else if (vertical != null && vertical)
            {
                addAttribute("vertical", "");
            }
            if (Boolean.TRUE.equals(withLabel))
            {
                addAttribute("with-label", "");
            }
            if (!Strings.isNullOrEmpty(labelPlacement))
            {
                addAttribute("label-placement", labelPlacement);
            }
            if (label != null)
            {
                add(label);
            }
        }
        super.init();
    }
}
