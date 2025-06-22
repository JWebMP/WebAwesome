package com.jwebmp.webawesome.components.tabgroup;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaTab component represents a tab in a WaTabGroup.
 * It is linked to a WaTabPanel via the panel attribute, which should match the name attribute of the panel.
 * <p>
 * This component renders as a wa-tab HTML element and supports various customization options
 * through properties and CSS custom properties.
 */
@Getter
@Setter
@NgImportReference(value = "WaTabDirective", reference = "angular-awesome")
@NgImportModule("WaTabDirective")
public class WaTab<J extends WaTab<J>> extends DivSimple<J>
{
    /**
     * Links to the corresponding tab panel
     */
    private String panel;

    /**
     * Whether the tab is disabled
     */
    private Boolean disabled;

    /**
     * Color of the tab when active
     */
    private String activeTabColor;

    /**
     * Creates a new WaTab with the tag "wa-tab"
     */
    public WaTab()
    {
        setTag("wa-tab");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(panel))
            {
                addAttribute("panel", panel);
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (!Strings.isNullOrEmpty(activeTabColor))
            {
                addStyle("--active-tab-color", activeTabColor);
            }
        }
        super.init();
    }

    /**
     * Binds the panel attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindPanel(String variableName)
    {
        addAttribute("[panel]", variableName);
        return (J) this;
    }

    /**
     * Binds the disabled attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindDisabled(String variableName)
    {
        addAttribute("[disabled]", variableName);
        return (J) this;
    }

    /**
     * Binds the activeTabColor style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindActiveTabColor(String variableName)
    {
        addAttribute("[style.--active-tab-color]", variableName);
        return (J) this;
    }
}
