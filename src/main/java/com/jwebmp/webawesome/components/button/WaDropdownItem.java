package com.jwebmp.webawesome.components.button;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * The WaDropdownItem component represents an item within a dropdown menu.
 * It is designed to be used inside a WaDropDown component.
 * <p>
 * Attributes:
 * - `value`: The value associated with this dropdown item
 * - `disabled`: Whether the item is disabled
 * - `checked`: Whether the item is checked (for checkbox-like behavior)
 * <p>
 * Slots:
 * - `start`: Content to place at the start/left of the item
 * - `end`: Content to place at the end/right of the item
 * - default: The main content of the dropdown item
 * - `submenu`: A nested dropdown for hierarchical menus
 * <p>
 * Usage examples:
 * <pre>
 * // Basic dropdown item
 * WaDropdownItem item = new WaDropdownItem("Option 1");
 *
 * // Dropdown item with value
 * WaDropdownItem item = new WaDropdownItem("Option 1")
 *     .setValue("option1");
 *
 * // Disabled dropdown item
 * WaDropdownItem item = new WaDropdownItem("Option 1")
 *     .setDisabled(true);
 * </pre>
 */
@Getter
@Accessors(chain = true)
@NgImportReference(value = "WaDropdownItemDirective", reference = "angular-awesome")
@NgImportModule("WaDropdownItemDirective")
public class WaDropdownItem<J extends WaDropdownItem<J>> extends DivSimple<J>
{
    /**
     * The value associated with this dropdown item.
     */
    private String value;

    /**
     * Whether the item is disabled.
     */
    private Boolean disabled;

    /**
     * Whether the item is checked (for checkbox-like behavior).
     */
    private Boolean checked;

    /**
     * Content to place at the start/left of the item.
     */
    private IComponentHierarchyBase<?, ?> startContent;

    /**
     * Content to place at the end/right of the item.
     */
    private IComponentHierarchyBase<?, ?> endContent;

    /**
     * A nested dropdown for hierarchical menus.
     */
    private WaDropDown<?> submenu;

    /**
     * Whether the submenu is open.
     */
    private Boolean submenuOpen;

    /**
     * Visual variant of the dropdown item (default, danger).
     */
    private DropdownItemVariant variant;

    /**
     * Destination used when this item is rendered as a link.
     */
    private String href;

    /**
     * Browsing context used by a linked item.
     */
    private DropdownItemTarget target;

    /**
     * Link relationship applied to a linked item.
     */
    private String rel;

    /**
     * Download filename applied to a linked item.
     */
    private String download;

    /**
     * Creates a new dropdown item with the given text.
     */
    @SuppressWarnings("unchecked")
    public J setValue(String value)
    {
        this.value = value;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setChecked(Boolean checked)
    {
        this.checked = checked;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setStartContent(IComponentHierarchyBase<?, ?> startContent)
    {
        this.startContent = startContent;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setEndContent(IComponentHierarchyBase<?, ?> endContent)
    {
        this.endContent = endContent;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSubmenu(WaDropDown<?> submenu)
    {
        this.submenu = submenu;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSubmenuOpen(Boolean submenuOpen)
    {
        this.submenuOpen = submenuOpen;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setVariant(DropdownItemVariant variant)
    {
        this.variant = variant;
        return (J) this;
    }

    /**
     * Makes this item navigate to the supplied destination when selected.
     * A submenu takes precedence over this link. Use a destination-describing label because the
     * component remains a menu item for assistive technologies.
     *
     * @param href The destination URL, or {@code null} to clear link behavior
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J setHref(String href)
    {
        this.href = href;
        syncLinkAttributes();
        return (J) this;
    }

    /**
     * Sets the browsing context for a linked item. It is emitted only while {@code href} is set.
     *
     * @param target The browsing context
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J setTarget(DropdownItemTarget target)
    {
        this.target = target;
        syncLinkAttributes();
        return (J) this;
    }

    /**
     * Sets the link relationship for a linked item. It is emitted only while {@code href} is set.
     *
     * @param rel The link relationship
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J setRel(String rel)
    {
        this.rel = rel;
        syncLinkAttributes();
        return (J) this;
    }

    /**
     * Sets the download filename for a linked item. Pass an empty value to keep the server-provided
     * filename. It is emitted only while {@code href} is set.
     *
     * @param download The download filename
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J setDownload(String download)
    {
        this.download = download;
        syncLinkAttributes();
        return (J) this;
    }

    public WaDropdownItem()
    {
        setTag("wa-dropdown-item");
    }

    /**
     * Creates a new dropdown item with the given text.
     *
     * @param text The text content of the dropdown item
     */
    public WaDropdownItem(String text)
    {
        this();
        setText(text);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (value != null)
            {
                addAttribute("value", value);
            }

            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }

            if (checked != null && checked)
            {
                addAttribute("checked", "");
            }

            if (startContent != null)
            {
                // Create a wrapper div with the slot attribute
                DivSimple<?> startWrapper = new DivSimple<>();
                startWrapper.addAttribute("slot", "start");
                startWrapper.add(startContent);
                add(startWrapper);
            }

            if (endContent != null)
            {
                // Create a wrapper div with the slot attribute
                DivSimple<?> endWrapper = new DivSimple<>();
                endWrapper.addAttribute("slot", "end");
                endWrapper.add(endContent);
                add(endWrapper);
            }

            if (submenu != null)
            {
                submenu.addAttribute("slot", "submenu");
                add(submenu);
            }
            if (submenuOpen != null && submenuOpen)
            {
                addAttribute("submenu-open", "");
            }
            if (variant != null)
            {
                addAttribute("variant", variant.toString());
            }
            syncLinkAttributes();
        }
        super.init();
    }

    /**
     * angular-awesome emits link-only attributes only when a destination exists. Keeping the
     * server markup aligned also removes stale attributes when callers clear {@code href}.
     */
    private void syncLinkAttributes()
    {
        if (href == null)
        {
            removeAttribute("href");
            removeAttribute("target");
            removeAttribute("rel");
            removeAttribute("download");
            return;
        }

        addAttribute("href", href);
        syncLinkAttribute("target", target == null ? null : target.toString());
        syncLinkAttribute("rel", rel);
        syncLinkAttribute("download", download);
    }

    private void syncLinkAttribute(String name, String value)
    {
        if (value == null)
        {
            removeAttribute(name);
        }
        else
        {
            addAttribute(name, value);
        }
    }
}
