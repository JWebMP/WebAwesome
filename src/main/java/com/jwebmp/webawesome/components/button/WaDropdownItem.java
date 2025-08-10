package com.jwebmp.webawesome.components.button;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;
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
@Setter
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
     * Creates a new dropdown item with the given text.
     */
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
        }
        super.init();
    }
}