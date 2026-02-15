package com.jwebmp.webawesome.components.tabgroup;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
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
    private DivSimple<?> panelTemplate;

    /**
     * Creates a new WaTabPanel with the tag "wa-tab-panel"
     */
    public WaTabPanel()
    {
        setTag("wa-tab-panel");
        panelTemplate = new DivSimple<>()
                .setTag("ng-template")
                .addAttribute("waTabContent", "");
        super.add(panelTemplate);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            addConfiguration(AnnotationUtils.getNgImportModule("WaTabGroupComponent"));
            addConfiguration(AnnotationUtils.getNgImportModule("WaTabPanelComponent"));
            addConfiguration(AnnotationUtils.getNgImportModule("WaTabContent"));
            addConfiguration(AnnotationUtils.getNgImportModule("WaTabComponent"));
            addConfiguration(AnnotationUtils.getNgImportReference("WaTabGroupComponent", "angular-awesome"));
            addConfiguration(AnnotationUtils.getNgImportReference("WaTabPanelComponent", "angular-awesome"));
            addConfiguration(AnnotationUtils.getNgImportReference("WaTabContent", "angular-awesome"));
            addConfiguration(AnnotationUtils.getNgImportReference("WaTabComponent", "angular-awesome"));

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

    @Override
    public J add(String textToAdd) {
        this.panelTemplate.add(textToAdd);
        return (J)this;
    }

    @Override
    public J add(GlobalChildren newChild) {
        this.panelTemplate.add(newChild);
        return (J)this;
    }

    @Override
    public J add(String textToAdd, boolean inline) {
        this.panelTemplate.add(textToAdd, inline);
        return (J)this;
    }

    @Override
    public J add(Integer position, GlobalChildren newChild) {
        panelTemplate.getChildren().add(position, newChild);
        return (J)this;
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
