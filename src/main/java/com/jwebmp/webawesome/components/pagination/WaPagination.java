package com.jwebmp.webawesome.components.pagination;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.TypographyTokenCapable;
import lombok.Getter;

/**
 * The {@code WaPagination} component renders the {@code <wa-pagination>} element, a navigation
 * control for paging through a collection of items.
 * <p>
 * New in Web Awesome <strong>3.11.0</strong> (mirrors {@code WaPaginationDirective} from
 * {@code angular-awesome@3.11.0}).
 *
 * <p><b>Attributes</b></p>
 * <ul>
 *     <li>{@code total} - total number of items being paged</li>
 *     <li>{@code page-size} - number of items per page</li>
 *     <li>{@code page} - the currently active (1 based) page</li>
 *     <li>{@code sibling-count} - number of page buttons rendered either side of the current page</li>
 *     <li>{@code boundary-count} - number of page buttons pinned at the start/end</li>
 *     <li>{@code format} - {@code standard} or {@code compact}</li>
 *     <li>{@code appearance} - {@code outlined}, {@code filled} or {@code plain}</li>
 *     <li>{@code without-nav} - hides the previous/next buttons</li>
 *     <li>{@code with-edges} - shows the first/last buttons</li>
 *     <li>{@code with-summary} - renders the "showing x - y of z" summary</li>
 *     <li>{@code hide-single-page} - hides the entire control when only one page exists</li>
 *     <li>{@code disabled} - disables all interaction</li>
 *     <li>{@code label} - accessible label for the navigation landmark</li>
 *     <li>{@code href-template} - link template, e.g. {@code /products?page={page}}</li>
 * </ul>
 *
 * <p><b>Events</b></p>
 * <ul>
 *     <li>{@code wa-page-change} - fired after the page has changed</li>
 *     <li>{@code wa-before-page-change} - cancelable, fired before the page changes</li>
 * </ul>
 *
 * <p><b>Slots</b>: {@code previous-icon}, {@code next-icon}, {@code first-icon}, {@code last-icon}</p>
 *
 * <p><b>Usage</b></p>
 * <pre>{@code
 * WaPagination<?> pagination = new WaPagination<>()
 *         .setTotal(237)
 *         .setPageSize(10)
 *         .setPage(3)
 *         .setWithEdges(true)
 *         .setWithSummary(true)
 *         .setFormat(PaginationFormat.Compact)
 *         .setPageChangeEvent("onPageChange($event)");
 * }</pre>
 * <p>
 * Note that {@code totalPages} is a read-only property of the native element and is therefore not
 * authored server side.
 */
@Getter
@NgImportReference(value = "WaPaginationDirective", reference = "angular-awesome")
@NgImportModule("WaPaginationDirective")
public class WaPagination<J extends WaPagination<J>> extends DivSimple<J>
        implements BorderTokenCapable<J>, SpaceTokenCapable<J>, TypographyTokenCapable<J>
{
    /**
     * The total number of items being paged.
     */
    private Integer total;

    /**
     * The number of items shown per page.
     */
    private Integer pageSize;

    /**
     * The current (1 based) page.
     * <p>
     * Named {@code currentPage} because {@code getPage()} is already reserved by
     * {@code IComponentHierarchyBase}.
     */
    private Integer currentPage;

    /**
     * The number of pages rendered either side of the current page.
     */
    private Integer siblingCount;

    /**
     * The number of pages pinned to the start and the end of the list.
     */
    private Integer boundaryCount;

    /**
     * The rendering format - standard or compact.
     */
    private PaginationFormat format;

    /**
     * The visual appearance - outlined, filled or plain.
     */
    private PaginationAppearance appearance;

    /**
     * The component size.
     */
    private Size size;

    /**
     * The accessible label applied to the navigation landmark.
     */
    private String label;

    /**
     * A link template used to render page buttons as anchors, e.g. {@code /products?page={page}}.
     */
    private String hrefTemplate;

    /**
     * Hides the previous / next buttons.
     */
    private Boolean withoutNav;

    /**
     * Renders the first / last buttons.
     */
    private Boolean withEdges;

    /**
     * Renders the item range summary.
     */
    private Boolean withSummary;

    /**
     * Hides the control entirely when there is only one page.
     */
    private Boolean hideSinglePage;

    /**
     * Disables the control.
     */
    private Boolean disabled;

    /**
     * Optional replacement icon for the "previous" button.
     */
    private IComponentHierarchyBase<?, ?> previousIcon;

    /**
     * Optional replacement icon for the "next" button.
     */
    private IComponentHierarchyBase<?, ?> nextIcon;

    /**
     * Optional replacement icon for the "first" button.
     */
    private IComponentHierarchyBase<?, ?> firstIcon;

    /**
     * Optional replacement icon for the "last" button.
     */
    private IComponentHierarchyBase<?, ?> lastIcon;

    /**
     * Handler bound to {@code (wa-page-change)}.
     */
    private String pageChangeEvent;

    /**
     * Handler bound to {@code (wa-before-page-change)}.
     */
    private String beforePageChangeEvent;

    /**
     * Creates a new pagination control rendering {@code <wa-pagination>}.
     */
    public WaPagination()
    {
        setTag("wa-pagination");
    }

    /**
     * Creates a new pagination control with the total item count and page size applied.
     *
     * @param total    The total number of items
     * @param pageSize The number of items per page
     */
    public WaPagination(Integer total, Integer pageSize)
    {
        this();
        this.total = total;
        this.pageSize = pageSize;
    }

    @SuppressWarnings("unchecked")
    public J setTotal(Integer total)
    {
        this.total = total;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
        return (J) this;
    }

    /**
     * Sets the currently active (1 based) page.
     *
     * @param page The active page
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J setPage(Integer page)
    {
        this.currentPage = page;
        return (J) this;
    }

    /**
     * Alias for {@link #setPage(Integer)}.
     *
     * @param currentPage The active page
     * @return This component
     */
    public J setCurrentPage(Integer currentPage)
    {
        return setPage(currentPage);
    }

    @SuppressWarnings("unchecked")
    public J setSiblingCount(Integer siblingCount)
    {
        this.siblingCount = siblingCount;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setBoundaryCount(Integer boundaryCount)
    {
        this.boundaryCount = boundaryCount;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setFormat(PaginationFormat format)
    {
        this.format = format;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setAppearance(PaginationAppearance appearance)
    {
        this.appearance = appearance;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSize(Size size)
    {
        this.size = size;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setHrefTemplate(String hrefTemplate)
    {
        this.hrefTemplate = hrefTemplate;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setWithoutNav(Boolean withoutNav)
    {
        this.withoutNav = withoutNav;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setWithEdges(Boolean withEdges)
    {
        this.withEdges = withEdges;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setWithSummary(Boolean withSummary)
    {
        this.withSummary = withSummary;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setHideSinglePage(Boolean hideSinglePage)
    {
        this.hideSinglePage = hideSinglePage;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPreviousIcon(IComponentHierarchyBase<?, ?> previousIcon)
    {
        this.previousIcon = previousIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setNextIcon(IComponentHierarchyBase<?, ?> nextIcon)
    {
        this.nextIcon = nextIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setFirstIcon(IComponentHierarchyBase<?, ?> firstIcon)
    {
        this.firstIcon = firstIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setLastIcon(IComponentHierarchyBase<?, ?> lastIcon)
    {
        this.lastIcon = lastIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPageChangeEvent(String pageChangeEvent)
    {
        this.pageChangeEvent = pageChangeEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setBeforePageChangeEvent(String beforePageChangeEvent)
    {
        this.beforePageChangeEvent = beforePageChangeEvent;
        return (J) this;
    }

    // ---------------------------------------------------------------------
    // Angular property bindings
    // ---------------------------------------------------------------------

    /**
     * Binds the total attribute to an Angular expression.
     *
     * @param variableName The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindTotal(String variableName)
    {
        addAttribute("[total]", variableName);
        return (J) this;
    }

    /**
     * Binds the page size attribute to an Angular expression.
     *
     * @param variableName The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindPageSize(String variableName)
    {
        addAttribute("[pageSize]", variableName);
        return (J) this;
    }

    /**
     * Binds the page attribute to an Angular expression.
     *
     * @param variableName The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindPage(String variableName)
    {
        addAttribute("[page]", variableName);
        return (J) this;
    }

    /**
     * Binds the href template to an Angular expression. Use this overload when the template is a
     * function rather than a string.
     *
     * @param variableName The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindHrefTemplate(String variableName)
    {
        addAttribute("[hrefTemplate]", variableName);
        return (J) this;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (total != null)
            {
                addAttribute("total", total.toString());
            }
            if (pageSize != null)
            {
                addAttribute("page-size", pageSize.toString());
            }
            if (currentPage != null)
            {
                addAttribute("page", currentPage.toString());
            }
            if (siblingCount != null)
            {
                addAttribute("sibling-count", siblingCount.toString());
            }
            if (boundaryCount != null)
            {
                addAttribute("boundary-count", boundaryCount.toString());
            }
            if (format != null)
            {
                addAttribute("format", format.toString());
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString());
            }
            if (size != null)
            {
                addAttribute("size", size.toString());
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (!Strings.isNullOrEmpty(hrefTemplate))
            {
                addAttribute("href-template", hrefTemplate);
            }
            if (withoutNav != null && withoutNav)
            {
                addAttribute("without-nav", "");
            }
            if (withEdges != null && withEdges)
            {
                addAttribute("with-edges", "");
            }
            if (withSummary != null && withSummary)
            {
                addAttribute("with-summary", "");
            }
            if (hideSinglePage != null && hideSinglePage)
            {
                addAttribute("hide-single-page", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (previousIcon != null)
            {
                previousIcon.asAttributeBase()
                            .addAttribute("slot", "previous-icon");
                add(previousIcon);
            }
            if (nextIcon != null)
            {
                nextIcon.asAttributeBase()
                        .addAttribute("slot", "next-icon");
                add(nextIcon);
            }
            if (firstIcon != null)
            {
                firstIcon.asAttributeBase()
                         .addAttribute("slot", "first-icon");
                add(firstIcon);
            }
            if (lastIcon != null)
            {
                lastIcon.asAttributeBase()
                        .addAttribute("slot", "last-icon");
                add(lastIcon);
            }
            if (!Strings.isNullOrEmpty(pageChangeEvent))
            {
                addAttribute("(wa-page-change)", pageChangeEvent);
            }
            if (!Strings.isNullOrEmpty(beforePageChangeEvent))
            {
                addAttribute("(wa-before-page-change)", beforePageChangeEvent);
            }
        }
        super.init();
    }
}




