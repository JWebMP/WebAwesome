package com.jwebmp.webawesome.components.breadcrumb;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaBreadcrumbItem component represents a link or step in the navigation path.
 * <p>
 * Attributes:
 * - `href`: Link to navigate to when clicked
 * - `target`: Link target behavior (e.g., '_blank', '_parent')
 * - `rel`: Relationship for link behavior, default: 'noreferrer noopener'
 * <p>
 * Slots:
 * - default: The label text or projected content
 * - start: Icon or element before the label
 * - end: Icon or element after the label
 * - separator: Optional per-item separator override
 * <p>
 * Usage examples:
 * <pre>
 * // Basic breadcrumb item
 * WaBreadcrumbItem item = new WaBreadcrumbItem("Home");
 * item.setHref("/home");
 * 
 * // With icon
 * WaBreadcrumbItem item = new WaBreadcrumbItem("Products");
 * item.setHref("/products");
 * item.setStart(new WaIcon("folder"));
 * </pre>
 */
@Getter
@Setter
public class WaBreadcrumbItem<J extends WaBreadcrumbItem<J>> extends DivSimple<J>
{
    /**
     * Icon or element before the label
     */
    private IComponentHierarchyBase<?, ?> start;

    /**
     * Icon or element after the label
     */
    private IComponentHierarchyBase<?, ?> end;

    /**
     * Link to navigate to when clicked
     */
    private String href;

    /**
     * Link target behavior
     */
    private String target;

    /**
     * Relationship for link behavior
     */
    private String rel;

    /**
     * Optional per-item separator override
     */
    private IComponentHierarchyBase<?, ?> separator;

    /**
     * Creates a new WaBreadcrumbItem component
     */
    public WaBreadcrumbItem()
    {
        setTag("wa-breadcrumb-item");
    }

    /**
     * Creates a new WaBreadcrumbItem component with the specified text
     *
     * @param text The label text
     */
    public WaBreadcrumbItem(String text)
    {
        this();
        setText(text);
    }

    /**
     * Creates a new WaBreadcrumbItem component with the specified text and href
     *
     * @param text The label text
     * @param href Link to navigate to when clicked
     */
    public WaBreadcrumbItem(String text, String href)
    {
        this(text);
        this.href = href;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
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
            if (separator != null)
            {
                separator.asAttributeBase()
                         .addAttribute("slot", "separator");
                add(separator);
            }
            if (!Strings.isNullOrEmpty(href))
            {
                addAttribute("href", href);
            }
            if (!Strings.isNullOrEmpty(target))
            {
                addAttribute("target", target);
            }
            if (!Strings.isNullOrEmpty(rel))
            {
                addAttribute("rel", rel);
            }
        }
        super.init();
    }
}
