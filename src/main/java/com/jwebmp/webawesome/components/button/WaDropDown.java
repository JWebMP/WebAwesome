package com.jwebmp.webawesome.components.button;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.PlacementExtended;
import com.jwebmp.webawesome.components.menu.WaMenu;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaDropDown component provides a dropdown menu triggered by a button.
 * It supports features like placement, distance, skidding, and event handling.
 */
@Getter
@Setter
@NgImportReference(value = "WaDropdownDirective", reference = "angular-awesome")
@NgImportModule("WaDropdownDirective")
public class WaDropDown<J extends WaDropDown<J>> extends DivSimple<J>
{
    /**
     * The button that triggers the dropdown.
     */
    private WaButton<?> button;

    /**
     * The menu to display in the dropdown.
     */
    private WaMenu<?> menu;

    /**
     * Preferred placement of the dropdown.
     */
    private PlacementExtended placement;

    /**
     * Pixel distance offset between trigger and panel.
     */
    private Integer distance;

    /**
     * Pixel offset along the trigger.
     */
    private Integer skidding;

    /**
     * Whether to render the dropdown in a containing element.
     */
    private Boolean hoist;

    /**
     * Disables the dropdown trigger.
     */
    private Boolean disabled;

    /**
     * Prevents dropdown from closing on item selection.
     */
    private Boolean stayOpenOnSelect;

    /**
     * Custom element that controls close-on-outside-click behavior.
     */
    private IComponentHierarchyBase<?, ?> containingElement;

    /**
     * Syncs dropdown panel dimensions with the trigger.
     */
    private String sync;

    /**
     * Shadow styling around dropdown.
     */
    private String boxShadow;

    /**
     * The selected value from the dropdown's menu.
     */
    private String value;

    public WaDropDown()
    {
        setTag("wa-dropdown");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (button != null)
            {
                button.setCaret(true);
                button.addAttribute("slot", "trigger");
                add(button);
            }
            if (menu != null)
            {
                add(menu);
            }
            if (placement != null)
            {
                addAttribute("placement", placement.toString()
                                                   .toLowerCase());
            }
            if (distance != null)
            {
                addAttribute("distance", distance + "");
            }
            if (skidding != null)
            {
                addAttribute("skidding", skidding + "");
            }
            if (hoist != null && hoist)
            {
                addAttribute("hoist", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (stayOpenOnSelect != null && stayOpenOnSelect)
            {
                addAttribute("stay-open-on-select", "");
            }
            if (containingElement != null)
            {
                addAttribute("containing-element", containingElement.asBase()
                                                                    .getID());
            }
            if (!Strings.isNullOrEmpty(sync))
            {
                addAttribute("sync", sync);
            }
            if (!Strings.isNullOrEmpty(boxShadow))
            {
                addStyle("--box-shadow", boxShadow);
            }
            if (!Strings.isNullOrEmpty(value))
            {
                addAttribute("value", value);
            }
        }
        super.init();
    }

    /**
     * Programmatically open the dropdown.
     *
     * @return This object for method chaining
     */
    public WaDropDown show()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
    }

    /**
     * Programmatically close the dropdown.
     *
     * @return This object for method chaining
     */
    public WaDropDown hide()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
    }

    /**
     * Force realignment of the dropdown.
     * Typically used if the trigger's layout changes.
     *
     * @return This object for method chaining
     */
    public WaDropDown reposition()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return this;
    }

    /**
     * Creates a dropdown with a button trigger and menu.
     *
     * @param buttonText The text for the button
     * @param menu       The menu to display
     * @return The created dropdown
     */
    public static WaDropDown create(String buttonText, WaMenu menu)
    {
        WaDropDown dropdown = new WaDropDown();
        dropdown.setButton(new WaButton(buttonText));
        dropdown.setMenu(menu);
        return dropdown;
    }
}
