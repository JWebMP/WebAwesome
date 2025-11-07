package com.jwebmp.webawesome.test.tabgroup;

import com.jwebmp.webawesome.components.tabgroup.TabActivation;
import com.jwebmp.webawesome.components.tabgroup.TabPlacement;
import com.jwebmp.webawesome.components.tabgroup.WaTab;
import com.jwebmp.webawesome.components.tabgroup.WaTabGroup;
import com.jwebmp.webawesome.components.tabgroup.WaTabPanel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaTabGroupTest
{
    @Test
    public void testRenderBasicTabGroupHtml()
    {
        var s = new WaTabGroup<>()
                .addTab("tab1", "Tab 1", true)
                .addTab("tab2", "Tab 2", false)
                .addTab("tab3", "Tab 3", false)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-tab-group active=\"tab1\">"));
        assertTrue(s.contains("<wa-tab panel=\"tab1\">Tab 1</wa-tab>"));
        assertTrue(s.contains("<wa-tab panel=\"tab2\">Tab 2</wa-tab>"));
        assertTrue(s.contains("<wa-tab panel=\"tab3\">Tab 3</wa-tab>"));
        assertTrue(s.contains("<wa-tab-panel name=\"tab1\"></wa-tab-panel>"));
        assertTrue(s.contains("<wa-tab-panel name=\"tab2\"></wa-tab-panel>"));
        assertTrue(s.contains("<wa-tab-panel name=\"tab3\"></wa-tab-panel>"));
    }

    @Test
    public void testRenderTabGroupWithDifferentPlacementsHtml()
    {
        // Top placement (default)
        var s1 = new WaTabGroup<>()
                .setPlacement(TabPlacement.Top)
                .addTab("tab1", "Tab 1", true)
                .addTab("tab2", "Tab 2", false)
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("placement=\"top\""));

        // Bottom placement
        var s2 = new WaTabGroup<>()
                .setPlacement(TabPlacement.Bottom)
                .addTab("tab1", "Tab 1", true)
                .addTab("tab2", "Tab 2", false)
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("placement=\"bottom\""));

        // Start placement (left)
        var s3 = new WaTabGroup<>()
                .setPlacement(TabPlacement.Start)
                .addTab("tab1", "Tab 1", true)
                .addTab("tab2", "Tab 2", false)
                .toString(true);
        System.out.println(s3);

        assertTrue(s3.contains("placement=\"start\""));

        // End placement (right)
        var s4 = new WaTabGroup<>()
                .setPlacement(TabPlacement.End)
                .addTab("tab1", "Tab 1", true)
                .addTab("tab2", "Tab 2", false)
                .toString(true);
        System.out.println(s4);

        assertTrue(s4.contains("placement=\"end\""));
    }

    @Test
    public void testRenderTabGroupWithActivationModesHtml()
    {
        // Auto activation (default)
        var s1 = new WaTabGroup<>()
                .setActivation(TabActivation.Auto)
                .addTab("tab1", "Tab 1", true)
                .addTab("tab2", "Tab 2", false)
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("activation=\"auto\""));

        // Manual activation
        var s2 = new WaTabGroup<>()
                .setActivation(TabActivation.Manual)
                .addTab("tab1", "Tab 1", true)
                .addTab("tab2", "Tab 2", false)
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("activation=\"manual\""));
    }

    @Test
    public void testRenderTabGroupWithDisabledTabsHtml()
    {
        var s = new WaTabGroup<>()
                .addTab("tab1", "Tab 1", true)
                .add(new WaTab<>().setPanel("tab2").setText("Tab 2 (Disabled)").setDisabled(true))
                .add(new WaTabPanel<>().setName("tab2"))
                .addTab("tab3", "Tab 3", false)
                .toString(true);
        System.out.println(s);

        boolean disabledAfterPanel = s.contains("<wa-tab panel=\"tab2\" disabled>Tab 2 (Disabled)</wa-tab>");
        boolean disabledBeforePanel = s.contains("<wa-tab disabled panel=\"tab2\">Tab 2 (Disabled)</wa-tab>");
        assertTrue(disabledAfterPanel || disabledBeforePanel, "Disabled tab should render regardless of attribute order");
    }

    @Test
    public void testRenderTabGroupWithCustomStylingHtml()
    {
        // Custom indicator and track colors
        var s1 = new WaTabGroup<>()
                .setIndicatorColor("#2196F3")
                .setTrackColor("#e0e0e0")
                .setTrackWidth("2px")
                .addTab("tab1", "Tab 1", true)
                .addTab("tab2", "Tab 2", false)
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("style="));
        assertTrue(s1.contains("--indicator-color:#2196F3"));
        assertTrue(s1.contains("--track-color:#e0e0e0"));
        assertTrue(s1.contains("--track-width:2px"));

        // Custom active tab color
        var s2 = new WaTabGroup<>()
                .add(new WaTab<>().setPanel("tab1").setText("Tab 1").setActiveTabColor("#4CAF50"))
                .add(new WaTabPanel<>().setName("tab1"))
                .add(new WaTab<>().setPanel("tab2").setText("Tab 2").setActiveTabColor("#FF5722"))
                .add(new WaTabPanel<>().setName("tab2"))
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("--active-tab-color:#4CAF50"));
        assertTrue(s2.contains("--active-tab-color:#FF5722"));

        // Custom panel padding
        var s3 = new WaTabGroup<>()
                .add(new WaTab<>().setPanel("tab1").setText("Tab 1"))
                .add(new WaTabPanel<>().setName("tab1").setPadding("24px"))
                .add(new WaTab<>().setPanel("tab2").setText("Tab 2"))
                .add(new WaTabPanel<>().setName("tab2").setPadding("8px"))
                .toString(true);
        System.out.println(s3);

        assertTrue(s3.contains("--padding:24px"));
        assertTrue(s3.contains("--padding:8px"));
    }

    @Test
    public void testRenderTabGroupWithNoScrollControlsHtml()
    {
        var s = new WaTabGroup<>()
                .setNoScrollControls(true)
                .addTab("tab1", "Tab 1", true)
                .addTab("tab2", "Tab 2", false)
                .addTab("tab3", "Tab 3", false)
                .addTab("tab4", "Tab 4", false)
                .addTab("tab5", "Tab 5", false)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("no-scroll-controls"));
    }

    @Test
    public void testRenderTabGroupWithBindingsHtml()
    {
        var s = new WaTabGroup<>()
                .bindActive("activeTab")
                .bindPlacement("tabPlacement")
                .bindActivation("tabActivation")
                .bindNoScrollControls("disableScrollControls")
                .bindIndicatorColor("indicatorColorValue")
                .bindTrackColor("trackColorValue")
                .bindTrackWidth("trackWidthValue")
                .add(new WaTab<>()
                        .bindPanel("tab1Panel")
                        .bindDisabled("tab1Disabled")
                        .bindActiveTabColor("tab1Color"))
                .add(new WaTabPanel<>()
                        .bindPanelName("panel1Name")
                        .bindActive("panel1Active")
                        .bindPadding("panel1Padding"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("[active]=\"activeTab\""));
        assertTrue(s.contains("[placement]=\"tabPlacement\""));
        assertTrue(s.contains("[activation]=\"tabActivation\""));
        assertTrue(s.contains("[no-scroll-controls]=\"disableScrollControls\""));
        assertTrue(s.contains("[style.--indicator-color]=\"indicatorColorValue\""));
        assertTrue(s.contains("[style.--track-color]=\"trackColorValue\""));
        assertTrue(s.contains("[style.--track-width]=\"trackWidthValue\""));
        assertTrue(s.contains("[panel]=\"tab1Panel\""));
        assertTrue(s.contains("[disabled]=\"tab1Disabled\""));
        assertTrue(s.contains("[style.--active-tab-color]=\"tab1Color\""));
        assertTrue(s.contains("[name]=\"panel1Name\""));
        assertTrue(s.contains("[active]=\"panel1Active\""));
        assertTrue(s.contains("[style.--padding]=\"panel1Padding\""));
    }
}
