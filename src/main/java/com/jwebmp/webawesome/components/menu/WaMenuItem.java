package com.jwebmp.webawesome.components.menu;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaMenuItem component represents an item in a menu.
 * It supports various features like type (normal or checkbox), checked state, value, loading state, etc.
 */
@Getter
@Setter
@NgImportReference(value = "WaMenuItemDirective", reference = "angular-awesome")
@NgImportModule("WaMenuItemDirective")
public class WaMenuItem<J extends WaMenuItem<J>> extends DivSimple<J>
{
    /**
     * Event handler for when the menu item loses focus.
     */
    private String blurEvent;

    /**
     * Event handler for when the menu item gains focus.
     */
    private String focusEvent;

    /**
     * Icon or label to display before the content.
     */
    private IComponentHierarchyBase<?, ?> prefix;

    /**
     * Icon or badge to display after the content.
     */
    private IComponentHierarchyBase<?, ?> suffix;

    /**
     * The type of menu item.
     * Valid values: 'normal', 'checkbox'
     */
    private String type;

    /**
     * Whether the checkbox is checked.
     * Only applicable when type is 'checkbox'.
     */
    private Boolean checked;

    /**
     * Whether the menu item is disabled.
     */
    private Boolean disabled;

    /**
     * Whether the menu item is in a loading state.
     */
    private Boolean loading;

    /**
     * The value of the menu item.
     */
    private String value;

    /**
     * Plain text label override.
     */
    private String label;

    /**
     * Whether the menu item has a submenu.
     */
    private Boolean withSubmenu;

    /**
     * Nested menu for submenu.
     */
    private WaMenu submenu;

    /**
     * Icon used when checkbox is checked.
     */
    private IComponentHierarchyBase<?, ?> checkedIcon;

    /**
     * Icon indicating submenu availability.
     */
    private IComponentHierarchyBase<?, ?> submenuIcon;

    /**
     * Custom background color on hover.
     */
    private String backgroundColorHover;

    /**
     * Custom text color on hover.
     */
    private String textColorHover;

    /**
     * Custom submenu offset.
     */
    private String submenuOffset;

    /**
     * Custom padding.
     */
    private String padding;

    /**
     * Custom margin.
     */
    private String margin;

    /**
     * Custom font size.
     */
    private String fontSize;

    /**
     * Creates a new WaMenuItem component.
     */
    public WaMenuItem()
    {
        setTag("wa-menu-item");
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
            if (!Strings.isNullOrEmpty(type))
            {
                addAttribute("type", type);
            }
            if (checked != null)
            {
                if (checked)
                {
                    addAttribute("checked", "");
                }
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (loading != null && loading)
            {
                addAttribute("loading", "");
            }
            if (!Strings.isNullOrEmpty(value))
            {
                addAttribute("value", value);
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (withSubmenu != null && withSubmenu)
            {
                addAttribute("with-submenu", "");
            }
            if (submenu != null)
            {
                submenu.asAttributeBase()
                       .addAttribute("slot", "submenu");
                add(submenu);
            }
            if (checkedIcon != null)
            {
                checkedIcon.asAttributeBase()
                           .addAttribute("slot", "checked-icon");
                add(checkedIcon);
            }
            if (submenuIcon != null)
            {
                submenuIcon.asAttributeBase()
                           .addAttribute("slot", "submenu-icon");
                add(submenuIcon);
            }

            // Add CSS custom properties if specified
            if (!Strings.isNullOrEmpty(backgroundColorHover))
            {
                addStyle("--background-color-hover", backgroundColorHover);
            }
            if (!Strings.isNullOrEmpty(textColorHover))
            {
                addStyle("--text-color-hover", textColorHover);
            }
            if (!Strings.isNullOrEmpty(submenuOffset))
            {
                addStyle("--submenu-offset", submenuOffset);
            }
            if (!Strings.isNullOrEmpty(padding))
            {
                addStyle("--padding", padding);
            }
            if (!Strings.isNullOrEmpty(margin))
            {
                addStyle("--margin", margin);
            }
            if (!Strings.isNullOrEmpty(fontSize))
            {
                addStyle("--font-size", fontSize);
            }

            // Add event handlers if specified
            if (!Strings.isNullOrEmpty(blurEvent))
            {
                addAttribute("blur", blurEvent);
            }
            if (!Strings.isNullOrEmpty(focusEvent))
            {
                addAttribute("focus", focusEvent);
            }
        }
        super.init();
    }

    @Override
    public J bind(String variableName)
    {
        addAttribute("[attrs.value]", variableName);
        return (J) this;
    }
}
