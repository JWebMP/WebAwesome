package com.jwebmp.webawesome.components.button;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.PlacementExtended;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaDropDown component provides a dropdown menu triggered by a button.
 * It exposes additional content in a popover panel, often triggered by a button.
 * <p>
 * Attributes:
 * - `placement`: Preferred placement of the dropdown (top, top-start, top-end, bottom, etc.)
 * - `disabled`: Disables the dropdown trigger
 * - `stayOpenOnSelect`: Prevents dropdown from closing on item selection
 * - `containingElement`: Custom element that controls close-on-outside-click behavior
 * - `distance`: Pixel distance offset between trigger and panel
 * - `skidding`: Pixel offset along the trigger
 * - `sync`: Syncs dropdown panel dimensions with the trigger (width, height, both)
 * - `value`: The selected value from the dropdown's menu
 * <p>
 * Events:
 * - `waShow`: Fires when the dropdown opens
 * - `waAfterShow`: Fires after dropdown animations finish
 * - `waHide`: Fires when the dropdown begins closing
 * - `waAfterHide`: Fires after dropdown is fully closed
 * - `waSelect`: Fires when a dropdown item is selected
 * <p>
 * Slots:
 * - `trigger`: The button or element that triggers the dropdown
 * - default: The content to display in the dropdown
 * <p>
 * Methods:
 * - `show()`: Programmatically open the dropdown
 * - `hide()`: Programmatically close the dropdown
 * - `reposition()`: Force realignment of the dropdown
 * <p>
 * Note: This component previously depended on WaMenu which has been deprecated.
 * It now accepts any component as content for the dropdown.
 * <p>
 * Usage examples:
 * <pre>
 * // Basic dropdown
 * WaButton button = new WaButton("Dropdown");
 * DivSimple<?> content = new DivSimple<>();
 * content.add(new Paragraph<>("Item 1"));
 * content.add(new Paragraph<>("Item 2"));
 * WaDropDown dropdown = new WaDropDown()
 *     .setButton(button)
 *     .setContent(content);
 * 
 * // Dropdown with placement and events
 * WaDropDown dropdown = new WaDropDown()
 *     .setButton(new WaButton("Options"))
 *     .setContent(content)
 *     .setPlacement(PlacementExtended.Bottom_Start)
 *     .setShowEvent("onShow()")
 *     .setSelectEvent("onSelect($event)");
 * </pre>
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
     * The content to display in the dropdown.
     * This replaces the previous WaMenu dependency which has been deprecated.
     */
    private IComponentHierarchyBase<?, ?> content;
    
    /**
     * List of dropdown items.
     * This is an alternative to setting the content directly.
     */
    private java.util.List<WaDropdownItem<?>> items = new java.util.ArrayList<>();

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
    
    /**
     * Event handler for when the dropdown opens.
     */
    private String showEvent;
    
    /**
     * Event handler for after dropdown animations finish.
     */
    private String afterShowEvent;
    
    /**
     * Event handler for when the dropdown begins closing.
     */
    private String hideEvent;
    
    /**
     * Event handler for after dropdown is fully closed.
     */
    private String afterHideEvent;
    
    /**
     * Event handler for when a dropdown item is selected.
     */
    private String selectEvent;

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
            if (content != null)
            {
                add(content);
            }
            // Add all dropdown items
            if (!items.isEmpty())
            {
                for (WaDropdownItem<?> item : items)
                {
                    add(item);
                }
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
            
            // Add event handlers
            if (!Strings.isNullOrEmpty(showEvent))
            {
                addAttribute("wa-show", showEvent);
            }
            if (!Strings.isNullOrEmpty(afterShowEvent))
            {
                addAttribute("wa-after-show", afterShowEvent);
            }
            if (!Strings.isNullOrEmpty(hideEvent))
            {
                addAttribute("wa-hide", hideEvent);
            }
            if (!Strings.isNullOrEmpty(afterHideEvent))
            {
                addAttribute("wa-after-hide", afterHideEvent);
            }
            if (!Strings.isNullOrEmpty(selectEvent))
            {
                addAttribute("wa-select", selectEvent);
            }
        }
        super.init();
    }
    
    /**
     * Adds a dropdown item to this dropdown.
     *
     * @param item The dropdown item to add
     * @return This object for method chaining
     */
    public J addItem(WaDropdownItem<?> item)
    {
        items.add(item);
        return (J) this;
    }
    
    /**
     * Adds a dropdown item with the given text.
     *
     * @param text The text for the dropdown item
     * @return This object for method chaining
     */
    public J addItem(String text)
    {
        return addItem(new WaDropdownItem<>(text));
    }
    
    /**
     * Adds a dropdown item with the given text and value.
     *
     * @param text The text for the dropdown item
     * @param value The value for the dropdown item
     * @return This object for method chaining
     */
    public J addItem(String text, String value)
    {
        return addItem(new WaDropdownItem<>(text).setValue(value));
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
     * Creates a dropdown with a button trigger and content.
     *
     * @param buttonText The text for the button
     * @param content    The content to display in the dropdown
     * @return The created dropdown
     */
    public static WaDropDown create(String buttonText, IComponentHierarchyBase<?, ?> content)
    {
        WaDropDown dropdown = new WaDropDown();
        dropdown.setButton(new WaButton(buttonText));
        dropdown.setContent(content);
        return dropdown;
    }
    
    /**
     * Overrides the bind method to support two-way binding with ngModel.
     * This allows the dropdown to be used with [(ngModel)] in Angular templates.
     *
     * @param variableName The name of the variable to bind to.
     * @return The current instance of WaDropDown for method chaining.
     */
    @Override
    public J bind(String variableName)
    {
        addAttribute("[(ngModel)]", variableName);
        addConfiguration(AnnotationUtils.getNgImportReference("FormsModule", "@angular/forms"));
        addConfiguration(AnnotationUtils.getNgImportModule("FormsModule"));
        return (J) this;
    }
}
