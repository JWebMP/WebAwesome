package com.jwebmp.webawesome.components.breadcrumb;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaBreadcrumbItem component represents a link or step in the navigation path.
 */
@Getter
@Setter
public class WaBreadcrumbItem<J extends WaBreadcrumb<J>> extends DivSimple<J>
{
    /**
     * Icon or element before the label
     */
    private IComponentHierarchyBase<?, ?> prefix;

    /**
     * Icon or element after the label
     */
    private IComponentHierarchyBase<?, ?> suffix;

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
            if (prefix != null)
            {
                prefix.asAttributeBase()
                      .addAttribute("slot", "prefix");
                add(prefix);
            }
            if (suffix != null)
            {
                suffix.asAttributeBase()
                      .addAttribute("slot", "suffix");
                add(suffix);
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
