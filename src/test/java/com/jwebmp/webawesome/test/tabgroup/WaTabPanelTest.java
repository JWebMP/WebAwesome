package com.jwebmp.webawesome.test.tabgroup;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.tabgroup.WaTabPanel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaTabPanelTest {

    @Test
    public void testPanelTemplateUsesWaTabContentAndNestsChildren() {
        var panel = new WaTabPanel<>()
                .setName("a");

        // Add text and a child element; they should end up inside the ng-template
        panel.add("Hello");
        panel.add(new DivSimple<>().setTag("panel-child"));

        var html = panel.toString(true);
        System.out.println(html);

        // Root element and name
        assertTrue(html.contains("<wa-tab-panel name=\"a\""), "Panel root with name attribute should render");

        // Ensure ng-template uses waTabContent (not waTabPanel) and contains our children
        assertTrue(html.contains("<ng-template waTabContent>"), "Panel template should use waTabContent attribute");
        assertTrue(html.contains("Hello"), "Text content should be inside the template");
        assertTrue(html.contains("<panel-child></panel-child>"), "Child element should render inside the template");

        // Ensure no direct children are added to the root other than the template
        // Basic sanity: there should be exactly one ng-template and no direct panel-child under root
        assertFalse(html.contains("<wa-tab-panel name=\"a\"><panel-child>"), "Children must not be direct children of the root panel");
    }

    @Test
    public void testStaticAttributesAndStyles() {
        var panel = new WaTabPanel<>()
                .setName("b")
                .setActive(true)
                .setPadding("16px");

        var html = panel.toString(true);
        System.out.println(html);

        assertTrue(html.contains("name=\"b\""), "name=\"b\" should be present");
        assertTrue(html.contains(" active"), "active attribute should be present when setActive(true)");
        assertTrue(html.contains("--padding:16px"), "Padding CSS var should be rendered");
    }

    @Test
    public void testBindingHelpers() {
        var panel = new WaTabPanel<>()
                .bindPanelName("panelNameVar")
                .bindActive("active==='b'")
                .bindPadding("paddingVar");

        var html = panel.toString(true);
        System.out.println(html);

        assertTrue(html.contains("[name]=\"panelNameVar\""), "[name] binding should render");
        assertTrue(html.contains("[active]=\"active==='b'\""), "[active] binding should render");
        assertTrue(html.contains("[style.--padding]=\"paddingVar\""), "[style.--padding] binding should render");
    }
}
