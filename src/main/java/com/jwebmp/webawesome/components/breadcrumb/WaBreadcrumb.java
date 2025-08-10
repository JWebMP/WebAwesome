package com.jwebmp.webawesome.components.breadcrumb;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaBreadcrumb component provides a way to display a breadcrumb navigation path.
 * <p>
 * Attributes:
 * - `label`: Screen-reader label for accessibility
 * <p>
 * Slots:
 * - default: One or more WaBreadcrumbItem elements
 * - separator: Optional separator (icon, text, or element) between items
 * <p>
 * Usage examples:
 * <pre>
 * // Basic breadcrumb
 * WaBreadcrumb breadcrumb = new WaBreadcrumb("Site Navigation");
 * breadcrumb.add(new WaBreadcrumbItem("Home").setHref("/home"));
 * breadcrumb.add(new WaBreadcrumbItem("Products").setHref("/products"));
 * breadcrumb.add(new WaBreadcrumbItem("Current Page"));
 * 
 * // With custom separator
 * WaBreadcrumb breadcrumb = new WaBreadcrumb();
 * WaIcon separator = new WaIcon("angles-right");
 * breadcrumb.setSeparator(separator);
 * breadcrumb.add(new WaBreadcrumbItem("Level 1"));
 * breadcrumb.add(new WaBreadcrumbItem("Level 2"));
 * breadcrumb.add(new WaBreadcrumbItem("Current"));
 * </pre>
 */
@Getter
@Setter
public class WaBreadcrumb<J extends WaBreadcrumb<J>> extends DivSimple<J>
{
    /**
     * The separator component to use between breadcrumb items
     */
    private IComponentHierarchyBase<?, ?> separator;

    /**
     * Screen-reader label for accessibility
     */
    private String label;

    /**
     * Creates a new WaBreadcrumb component
     */
    public WaBreadcrumb()
    {
        setTag("wa-breadcrumb");
    }

    /**
     * Creates a new WaBreadcrumb component with the specified label
     *
     * @param label Screen-reader label for accessibility
     */
    public WaBreadcrumb(String label)
    {
        this();
        this.label = label;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (separator != null)
            {
                separator.asAttributeBase()
                         .addAttribute("slot", "separator");
                add(0, separator);
            }

            if (label != null)
            {
                addAttribute("label", label);
            }
        }
        super.init();
    }
}
