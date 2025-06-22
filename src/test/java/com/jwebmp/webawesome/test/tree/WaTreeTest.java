package com.jwebmp.webawesome.test.tree;

import com.jwebmp.webawesome.components.icon.WaIcon;
import com.jwebmp.webawesome.components.tree.TreeSelectionMode;
import com.jwebmp.webawesome.components.tree.WaTree;
import com.jwebmp.webawesome.components.tree.WaTreeItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaTreeTest
{
    @Test
    public void testRenderBasicTreeHtml()
    {
        var rootItem1 = new WaTreeItem<>()
                .setText("Root Item")
                .add(new WaTreeItem<>().setText("Child Item 1"))
                .add(new WaTreeItem<>().setText("Child Item 2"));

        var rootItem2 = new WaTreeItem<>()
                .setText("Another Root Item")
                .add(new WaTreeItem<>().setText("Child Item 3"))
                .add(new WaTreeItem<>().setText("Child Item 4"));

        var s = new WaTree<>()
                .add(rootItem1)
                .add(rootItem2)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-tree>"));
        assertTrue(s.contains("<wa-tree-item>Root Item"));
        assertTrue(s.contains("<wa-tree-item>Child Item 1</wa-tree-item>"));
        assertTrue(s.contains("<wa-tree-item>Another Root Item"));
    }

    @Test
    public void testRenderTreeWithSelectionModeHtml()
    {
        // Single selection mode
        var s1 = new WaTree<>()
                .setSelection(TreeSelectionMode.Single)
                .add(new WaTreeItem<>().setText("Root Item"))
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("selection=\"single\""));

        // Multiple selection mode
        var s2 = new WaTree<>()
                .setSelection(TreeSelectionMode.Multiple)
                .add(new WaTreeItem<>().setText("Root Item"))
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("selection=\"multiple\""));

        // Leaf selection mode
        var s3 = new WaTree<>()
                .setSelection(TreeSelectionMode.Leaf)
                .add(new WaTreeItem<>().setText("Root Item"))
                .toString(true);
        System.out.println(s3);

        assertTrue(s3.contains("selection=\"leaf\""));
    }

    @Test
    public void testRenderTreeWithExpandedAndSelectedItemsHtml()
    {
        var s = new WaTree<>()
                .add(new WaTreeItem<>()
                        .setText("Expanded Root Item")
                        .setExpanded(true)
                        .add(new WaTreeItem<>().setText("Child Item 1"))
                        .add(new WaTreeItem<>().setText("Child Item 2")))
                .add(new WaTreeItem<>()
                        .setText("Selected Root Item")
                        .setSelected(true)
                        .add(new WaTreeItem<>().setText("Child Item 3"))
                        .add(new WaTreeItem<>().setText("Child Item 4")))
                .add(new WaTreeItem<>()
                        .setText("Expanded and Selected Root Item")
                        .setExpanded(true)
                        .setSelected(true)
                        .add(new WaTreeItem<>().setText("Child Item 5"))
                        .add(new WaTreeItem<>().setText("Child Item 6")))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-tree-item expanded>Expanded Root Item"));
        assertTrue(s.contains("<wa-tree-item selected>Selected Root Item"));
        assertTrue(s.contains("<wa-tree-item expanded selected>Expanded and Selected Root Item"));
    }

    @Test
    public void testRenderTreeWithDisabledItemsHtml()
    {
        var s = new WaTree<>()
                .add(new WaTreeItem<>()
                        .setText("Root Item 1")
                        .add(new WaTreeItem<>().setText("Child Item 1.1"))
                        .add(new WaTreeItem<>().setText("Disabled Child Item 1.2")
                                               .setDisabled(true)))
                .add(new WaTreeItem<>()
                        .setText("Disabled Root Item 2")
                        .setDisabled(true)
                        .add(new WaTreeItem<>().setText("Child Item 2.1"))
                        .add(new WaTreeItem<>().setText("Child Item 2.2")))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-tree-item>Root Item 1"));
        assertTrue(s.contains("<wa-tree-item disabled>Disabled Child Item 1.2</wa-tree-item>"));
        assertTrue(s.contains("<wa-tree-item disabled>Disabled Root Item 2"));
    }

    @Test
    public void testRenderTreeWithCustomStylingHtml()
    {
        // Custom indent size and guide style
        var s1 = new WaTree<>()
                .setIndentSize("32px")
                .setIndentGuideStyle("dotted")
                .add(new WaTreeItem<>()
                        .setText("Root Item with Custom Indent")
                        .setExpanded(true)
                        .add(new WaTreeItem<>().setText("Child Item 1"))
                        .add(new WaTreeItem<>().setText("Child Item 2")))
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("style=\"--indent-guide-style:dotted;--indent-size:32px;\""));

        // Custom indent guide color and width
        var s2 = new WaTree<>()
                .setIndentGuideColor("#2196F3")
                .setIndentGuideWidth("2px")
                .add(new WaTreeItem<>()
                        .setText("Root Item with Custom Guide")
                        .setExpanded(true)
                        .add(new WaTreeItem<>().setText("Child Item 1"))
                        .add(new WaTreeItem<>().setText("Child Item 2")))
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("style=\"--indent-guide-color:#2196F3;--indent-guide-width:2px;\""));

        // Custom tree item styling
        var s3 = new WaTree<>()
                .add(new WaTreeItem<>()
                        .setText("Root Item with Custom Colors")
                        .setExpanded(true)
                        .setSelectionBackgroundColor("#e3f2fd")
                        .setSelectionIndicatorColor("#2196F3")
                        .setExpandButtonColor("#1976d2")
                        .add(new WaTreeItem<>().setText("Child Item 1"))
                        .add(new WaTreeItem<>().setText("Child Item 2")))
                .toString(true);
        System.out.println(s3);

        assertTrue(s3.contains("style=\"--expand-button-color:#1976d2;--selection-background-color:#e3f2fd;--selection-indicator-color:#2196F3;\""));

        // Custom animation durations
        var s4 = new WaTree<>()
                .add(new WaTreeItem<>()
                        .setText("Root Item with Custom Animation")
                        .setShowDuration("500ms")
                        .setHideDuration("300ms")
                        .add(new WaTreeItem<>().setText("Child Item 1"))
                        .add(new WaTreeItem<>().setText("Child Item 2")))
                .toString(true);
        System.out.println(s4);

        assertTrue(s4.contains("style=\"--hide-duration:300ms;--show-duration:500ms;\""));
    }

    @Test
    public void testRenderTreeWithCustomIconsHtml()
    {
        var expandIcon = new WaIcon<>().setName("folder-open");
        var collapseIcon = new WaIcon<>().setName("folder");

        var s = new WaTree<>()
                .add(new WaTreeItem<>()
                        .setText("Folder with Custom Icons")
                        .setExpandIcon(expandIcon)
                        .setCollapseIcon(collapseIcon)
                        .add(new WaTreeItem<>().add(new WaIcon<>().setName("document"))
                                               .setText(" Document 1"))
                        .add(new WaTreeItem<>().add(new WaIcon<>().setName("document"))
                                               .setText(" Document 2")))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("slot=\"expand-icon\"") && s.contains("name=\"folder-open\""));
        assertTrue(s.contains("slot=\"collapse-icon\"") && s.contains("name=\"folder\""));
        assertTrue(s.contains("name=\"document\"") && s.contains("Document 1"));
    }

    @Test
    public void testRenderTreeWithBindingsHtml()
    {
        var s = new WaTree<>()
                .bindSelection("selectionMode")
                .bindIndentSize("indentSizeValue")
                .bindIndentGuideColor("guideColorValue")
                .bindIndentGuideOffset("guideOffsetValue")
                .bindIndentGuideStyle("guideStyleValue")
                .bindIndentGuideWidth("guideWidthValue")
                .onSelectionChange("handleSelectionChange($event)")
                .add(new WaTreeItem<>()
                        .bindExpanded("isExpanded")
                        .bindSelected("isSelected")
                        .bindDisabled("isDisabled")
                        .bindLazyLoading("isLazy")
                        .bindSelectionBackgroundColor("bgColorValue")
                        .bindSelectionIndicatorColor("indicatorColorValue")
                        .bindExpandButtonColor("buttonColorValue")
                        .bindShowDuration("showDurationValue")
                        .bindHideDuration("hideDurationValue")
                        .onExpand("handleExpand($event)")
                        .onAfterExpand("handleAfterExpand($event)")
                        .onCollapse("handleCollapse($event)")
                        .onAfterCollapse("handleAfterCollapse($event)")
                        .onLazyChange("handleLazyChange($event)")
                        .onLazyLoad("handleLazyLoad($event)")
                        .setText("Tree Item with Bindings"))
                .toString(true);
        System.out.println(s);

        // Tree bindings
        assertTrue(s.contains("[selection]=\"selectionMode\""));
        assertTrue(s.contains("[style.--indent-size]=\"indentSizeValue\""));
        assertTrue(s.contains("[style.--indent-guide-color]=\"guideColorValue\""));
        assertTrue(s.contains("[style.--indent-guide-offset]=\"guideOffsetValue\""));
        assertTrue(s.contains("[style.--indent-guide-style]=\"guideStyleValue\""));
        assertTrue(s.contains("[style.--indent-guide-width]=\"guideWidthValue\""));
        assertTrue(s.contains("(selectionChange)=\"handleSelectionChange($event)\""));

        // Tree item bindings
        assertTrue(s.contains("[expanded]=\"isExpanded\""));
        assertTrue(s.contains("[selected]=\"isSelected\""));
        assertTrue(s.contains("[disabled]=\"isDisabled\""));
        assertTrue(s.contains("[lazy]=\"isLazy\""));
        assertTrue(s.contains("[style.--selection-background-color]=\"bgColorValue\""));
        assertTrue(s.contains("[style.--selection-indicator-color]=\"indicatorColorValue\""));
        assertTrue(s.contains("[style.--expand-button-color]=\"buttonColorValue\""));
        assertTrue(s.contains("[style.--show-duration]=\"showDurationValue\""));
        assertTrue(s.contains("[style.--hide-duration]=\"hideDurationValue\""));
        assertTrue(s.contains("(expand)=\"handleExpand($event)\""));
        assertTrue(s.contains("(afterExpand)=\"handleAfterExpand($event)\""));
        assertTrue(s.contains("(collapse)=\"handleCollapse($event)\""));
        assertTrue(s.contains("(afterCollapse)=\"handleAfterCollapse($event)\""));
        assertTrue(s.contains("(lazyChange)=\"handleLazyChange($event)\""));
        assertTrue(s.contains("(lazyLoad)=\"handleLazyLoad($event)\""));
    }
}
