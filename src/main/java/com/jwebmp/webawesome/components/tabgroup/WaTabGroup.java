package com.jwebmp.webawesome.components.tabgroup;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaTabGroup component organizes content into panels, showing one at a time.
 * Tabs are linked to panels via the panel and name attributes.
 * It supports features like different placements, activation modes, and custom styling.
 * <p>
 * This component renders as a wa-tab-group HTML element and supports various customization options
 * through properties and CSS custom properties.
 */
@Getter
@Setter
@NgImportReference(value = "WaTabGroupDirective", reference = "angular-awesome")
@NgImportModule("WaTabGroupDirective")
public class WaTabGroup<J extends WaTabGroup<J>> extends DivSimple<J>
{
    /**
     * Name of the currently active tab panel
     */
    private String active;

    /**
     * Position of tabs (top, bottom, start, end)
     */
    private TabPlacement placement;

    /**
     * Keyboard activation behavior (auto, manual)
     */
    private TabActivation activation;

    /**
     * Whether to disable scroll arrows
     */
    private Boolean noScrollControls;

    /**
     * Color of the active tab indicator
     */
    private String indicatorColor;

    /**
     * Color of the track
     */
    private String trackColor;

    /**
     * Width of the track
     */
    private String trackWidth;

    /**
     * Creates a new WaTabGroup with the tag "wa-tab-group"
     */
    public WaTabGroup()
    {
        setTag("wa-tab-group");
    }

    /**
     * Adds a tab and panel to the tab group
     *
     * @param panelName The name of the panel
     * @param tabText   The text to display in the tab
     * @param active    Whether this panel should be active
     * @return This component
     */
    public J addTab(String panelName, String tabText, boolean active)
    {
        WaTab<?> tab = new WaTab<>();
        tab.setPanel(panelName);
        tab.setText(tabText);

        WaTabPanel<?> panel = new WaTabPanel<>();
        panel.setName(panelName);

        if (active)
        {
            this.active = panelName;
        }

        add(tab);
        add(panel);
        return (J) this;
    }

    /**
     * Adds a tab and panel to the tab group
     *
     * @param tab    The tab to add
     * @param panel  The panel to add
     * @param active Whether this panel should be active
     * @return This component
     */
    public J addTab(WaTab<?> tab, WaTabPanel<?> panel, boolean active)
    {
        if (active)
        {
            this.active = panel.getName();
        }

        add(tab);
        add(panel);
        return (J) this;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(active))
            {
                addAttribute("active", active);
            }
            if (placement != null)
            {
                addAttribute("placement", placement.toString());
            }
            if (activation != null)
            {
                addAttribute("activation", activation.toString());
            }
            if (noScrollControls != null && noScrollControls)
            {
                addAttribute("no-scroll-controls", "");
            }
            if (!Strings.isNullOrEmpty(indicatorColor))
            {
                addStyle("--indicator-color", indicatorColor);
            }
            if (!Strings.isNullOrEmpty(trackColor))
            {
                addStyle("--track-color", trackColor);
            }
            if (!Strings.isNullOrEmpty(trackWidth))
            {
                addStyle("--track-width", trackWidth);
            }
        }
        super.init();
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
     * Binds the placement attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindPlacement(String variableName)
    {
        addAttribute("[placement]", variableName);
        return (J) this;
    }

    /**
     * Binds the activation attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindActivation(String variableName)
    {
        addAttribute("[activation]", variableName);
        return (J) this;
    }

    /**
     * Binds the noScrollControls attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindNoScrollControls(String variableName)
    {
        addAttribute("[no-scroll-controls]", variableName);
        return (J) this;
    }

    /**
     * Binds the indicatorColor style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindIndicatorColor(String variableName)
    {
        addAttribute("[style.--indicator-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the trackColor style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindTrackColor(String variableName)
    {
        addAttribute("[style.--track-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the trackWidth style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindTrackWidth(String variableName)
    {
        addAttribute("[style.--track-width]", variableName);
        return (J) this;
    }
}
