package com.jwebmp.webawesome.components.tabgroup;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaTabPanel component represents a panel of content associated with a tab in a WaTabGroup.
 * It is linked to a WaTab via the name attribute, which should match the panel attribute of the tab.
 * <p>
 * This component renders as a wa-tab-panel HTML element and supports various customization options
 * through properties and CSS custom properties.
 */
@Getter
@Setter
@NgImportReference(value = "WaTabPanelDirective", reference = "angular-awesome")
@NgImportModule("WaTabPanelDirective")
public class WaTabPanel<J extends WaTabPanel<J>> extends DivSimple<J>
{
    /**
     * Whether this panel is visible
     */
    private Boolean active;

    /**
     * Padding of the panel
     */
    private String padding;

    /**
     * Creates a new WaTabPanel with the tag "wa-tab-panel"
     */
    public WaTabPanel()
    {
        setTag("wa-tab-panel");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(getName()))
            {
                addAttribute("name", getName());
            }
            if (active != null && active)
            {
                addAttribute("active", "");
            }
            if (!Strings.isNullOrEmpty(padding))
            {
                addStyle("--padding", padding);
            }
        }
        super.init();
    }

    /**
     * Binds the name attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindPanelName(String variableName)
    {
        addAttribute("[name]", variableName);
        return (J) this;
    }

    /**
     * Binds the active attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindActive(String variableName)
    {
        addAttribute("[active]", variableName);
        return (J) this;
    }

    /**
     * Binds the padding style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindPadding(String variableName)
    {
        addAttribute("[style.--padding]", variableName);
        return (J) this;
    }
}
