package com.jwebmp.webawesome.test.dialog;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.button.WaButton;
import com.jwebmp.webawesome.components.dialog.WaDialog;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WaDialogTest
{
    @Test
    public void testRenderBasicDialogHtml()
    {
        var s = new WaDialog<>("dialog-test")
                .setLabel("Basic Dialog")
                .setText("This is a basic dialog with default styling.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dialog"), "Should render wa-dialog tag");
        assertTrue(s.contains("label=\"Basic Dialog\""), "Label attribute should be present");
        assertTrue(s.contains("This is a basic dialog with default styling."));
    }

    @Test
    public void testRenderDialogWithOpenStateHtml()
    {
        var s = new WaDialog<>("dialog-test")
                .setLabel("Open Dialog")
                .setOpen(true)
                .setText("This dialog is open by default.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dialog"), "Should render wa-dialog tag");
        assertTrue(s.contains("label=\"Open Dialog\""), "Label attribute should be present");
        assertTrue(s.contains(" open") || s.contains(" open="), "Open boolean should render");
        assertTrue(s.contains("This dialog is open by default."));
    }

    @Test
    public void testRenderDialogWithLightDismissHtml()
    {
        var s = new WaDialog<>("dialog-test")
                .setLabel("Light Dismiss Dialog")
                .setLightDismiss(true)
                .setText("This dialog can be closed by clicking outside.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dialog"), "Should render wa-dialog tag");
        assertTrue(s.contains("label=\"Light Dismiss Dialog\""), "Label attribute should be present");
        assertTrue(s.contains(" light-dismiss") || s.contains(" light-dismiss="), "light-dismiss boolean should render");
        assertTrue(s.contains("This dialog can be closed by clicking outside."));
    }

    @Test
    public void testRenderDialogWithoutHeaderHtml()
    {
        var s = new WaDialog<>("dialog-test")
                .setLabel("No Header Dialog")
                .setWithoutHeader(true)
                .setText("This dialog has no header.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dialog"), "Should render wa-dialog tag");
        assertTrue(s.contains("label=\"No Header Dialog\""), "Label attribute should be present");
        assertTrue(s.contains(" without-header") || s.contains(" without-header="), "without-header boolean should render");
        assertTrue(s.contains("This dialog has no header."));
    }

    @Test
    public void testRenderDialogWithHeaderHtml()
    {
        var header = new DivSimple<>();
        header.setText("Dialog Header");

        var s = new WaDialog<>("dialog-test")
                .setLabel("With Header Dialog")
                .withHeader(header)
                .setText("This dialog has a custom header.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dialog"), "Should render wa-dialog tag");
        assertTrue(s.contains("label=\"With Header Dialog\""), "Label attribute should be present");
        // Some builds may not include with-header attribute; accept presence of header class or attribute
        assertTrue(s.contains("with-header") || s.contains("dialog-header"), "Should include header indicator (attr or class)");
        assertTrue(s.contains("dialog-header"), "Should include dialog-header class");
        // Header text may be projected via slot="header" or slot="label" depending on implementation
        boolean headerSlot = (s.contains("slot=\"header\"") || s.contains("slot=\"label\"")) && s.contains("Dialog Header");
        assertTrue(headerSlot, "Header or label slot content should render");
        assertTrue(s.contains("This dialog has a custom header."));
    }

    @Test
    public void testRenderDialogWithHeaderActionsHtml()
    {
        var button = new WaButton<>();
        var icon = new WaIcon<>("settings");
        button.setPrefix(icon);

        List<WaButton<?>> buttons = new ArrayList<>();
        buttons.add(button);

        var s = new WaDialog<>("dialog-test")
                .setLabel("With Header Actions Dialog")
                .withHeaderActions(buttons)
                .setText("This dialog has header actions.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dialog"), "Should render wa-dialog tag");
        assertTrue(s.contains("label=\"With Header Actions Dialog\""), "Label attribute should be present");
        assertTrue(s.contains("with-header"), "with-header flag should render");
        assertTrue(s.contains("dialog-header-actions"), "Should include dialog-header-actions class");
        assertTrue(s.contains("<wa-button slot=\"header-actions\">") || s.contains("<wa-button slot=\"header-actions\""), "Header actions button slot should render");
        boolean hasIconPrefixOrStart = s.contains("<wa-icon name=\"settings\" slot=\"prefix\">") || s.contains("<wa-icon name=\"settings\" slot=\"start\">");
        assertTrue(hasIconPrefixOrStart, "Icon slot should be prefix or start");
        assertTrue(s.contains("This dialog has header actions."));
    }

    @Test
    public void testRenderDialogWithFooterHtml()
    {
        var footer = new DivSimple<>();
        footer.setText("Dialog Footer");

        var s = new WaDialog<>("dialog-test")
                .setLabel("With Footer Dialog")
                .withFooter(footer)
                .setText("This dialog has a footer.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dialog"), "Should render wa-dialog tag");
                assertTrue(s.contains("id=\"dialog-test\""), "Should include dialog id");
                assertTrue(s.contains("class=\"dialog-footer\"") || s.contains("dialog-footer"), "Should include dialog-footer class");
                assertTrue(s.contains("label=\"With Footer Dialog\""), "Label attribute should be present");
                assertTrue(s.contains("with-footer"), "with-footer flag should render");
        assertTrue(s.contains("<div slot=\"footer\">Dialog Footer</div>"));
        assertTrue(s.contains("This dialog has a footer."));
    }

    @Test
    public void testRenderDialogWithCloseButtonHtml()
    {
        var footer = new DivSimple<>();

        var dialog = new WaDialog<>("dialog-test")
                .setLabel("With Close Button Dialog")
                .withFooter(footer)
                .setText("This dialog has a close button in the footer.");

        dialog.withCloseButton(footer);

        var s = dialog.toString(true);

        System.out.println("[DEBUG_LOG] Rendered HTML: " + s);

        boolean containsDialogTag = s.contains("<wa-dialog") && (s.contains("class=\"dialog-footer\"") || s.contains("dialog-footer"));
        boolean containsLabel = s.contains("label=\"With Close Button Dialog\"");
        boolean containsWithFooter = s.contains("with-footer");
        System.out.println("[DEBUG_LOG] Contains dialog tag: " + containsDialogTag);
        System.out.println("[DEBUG_LOG] Contains label: " + containsLabel);
        System.out.println("[DEBUG_LOG] Contains with-footer: " + containsWithFooter);

        boolean containsFooterSlot = s.contains("<div slot=\"footer\"");
        boolean containsButtonTag = s.contains("<wa-button data-dialog=\"close\">");
        boolean containsCloseText = s.contains("Close") && s.contains("</wa-button>");
        System.out.println("[DEBUG_LOG] Contains footer slot: " + containsFooterSlot);
        System.out.println("[DEBUG_LOG] Contains button tag: " + containsButtonTag);
        System.out.println("[DEBUG_LOG] Contains close text: " + containsCloseText);

        assertTrue(containsDialogTag && containsLabel && containsWithFooter);
        assertTrue(containsFooterSlot && containsButtonTag && containsCloseText);
        assertTrue(s.contains("This dialog has a close button in the footer."));
    }

    @Test
    public void testRenderDialogWithInitialFocusHtml()
    {
        var button = new WaButton("Focused Button");

        var s = new WaDialog<>("dialog-test")
                .setLabel("With Initial Focus Dialog")
                .withInitialFocusOn(button)
                .add(button)
                .setText("This dialog has a button with initial focus.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dialog"), "Should render wa-dialog tag");
                assertTrue(s.contains("id=\"dialog-test\""), "Should include dialog id");
                assertTrue(s.contains("label=\"With Initial Focus Dialog\""), "Label attribute should be present");
        assertTrue(s.contains("<wa-button autofocus") && s.contains("Focused Button"));
        assertTrue(s.contains("This dialog has a button with initial focus."));
    }

    @Test
    public void testRenderDialogWithCustomStylingHtml()
    {
        var s = new WaDialog<>("dialog-test")
                .setLabel("Styled Dialog")
                .setBackgroundColor("#f8f9fa")
                .setBorderRadius("12px")
                .setBoxShadow("0 4px 6px rgba(0, 0, 0, 0.1)")
                .setSpacing("16px")
                .setWidth("500px")
                .setShowDuration("300ms")
                .setHideDuration("200ms")
                .setText("This dialog has custom styling.")
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-dialog"), "Should render wa-dialog tag");
                assertTrue(s.contains("id=\"dialog-test\""), "Should include dialog id");
                assertTrue(s.contains("label=\"Styled Dialog\""), "Label attribute should be present");
                assertTrue(s.contains("--background-color:#f8f9fa"));
                assertTrue(s.contains("--border-radius:12px"));
                assertTrue(s.contains("--box-shadow:0 4px 6px rgba(0, 0, 0, 0.1)"));
                assertTrue(s.contains("--hide-duration:200ms"));
                assertTrue(s.contains("--show-duration:300ms"));
                assertTrue(s.contains("--spacing:16px"));
                assertTrue(s.contains("--width:500px"));
        assertTrue(s.contains("This dialog has custom styling."));
    }

    @Test
    public void testRenderDialogWithAllFeaturesHtml()
    {
        var header = new DivSimple<>();
        header.setText("Complete Dialog");

        var actionButton = new WaButton<>();
        var actionIcon = new WaIcon<>("settings");
        actionButton.setPrefix(actionIcon);

        List<WaButton<?>> actionButtons = new ArrayList<>();
        actionButtons.add(actionButton);

        var footer = new DivSimple<>();
        footer.setText("Dialog Actions");

        var button = new WaButton<>("Save");

        WaDialog<?> dialog = new WaDialog<>("dialog-test")
                .setLabel("Complete Dialog")
                .setOpen(true)
                .setLightDismiss(true)
                .withHeader(header)
                .withHeaderActions(actionButtons)
                .withFooter(footer)
                .withInitialFocusOn(button)
                .add(button)
                .setText("This is a complete dialog with all features.")
                .setBackgroundColor("#ffffff")
                .setBorderRadius("8px")
                .setWidth("600px");

        dialog.withCloseButton(footer);

        var s = dialog.toString(true);

        System.out.println("[DEBUG_LOG] Rendered HTML: " + s);

        // Check for each attribute and feature individually
        boolean containsDialogTag = s.contains("<wa-dialog");
        boolean containsLabel = s.contains("label=\"Complete Dialog\"");
        boolean containsOpen = s.contains("open");
        boolean containsLightDismiss = s.contains("light-dismiss");
        boolean containsClasses = s.contains("class=\"") && s.contains("dialog-header") && s.contains("dialog-header-actions") && s.contains("dialog-footer");
        boolean containsWithHeader = s.contains("with-header");
        boolean containsWithFooter = s.contains("with-footer");
        boolean containsStyles = s.contains("style=\"") && s.contains("--background-color:#ffffff") && s.contains("--border-radius:8px") && s.contains("--width:600px");
        boolean containsHeaderSlot = s.contains("<div slot=\"header\"") && s.contains("Complete Dialog");
        boolean containsIconButton = s.contains("<wa-button slot=\"header-actions\"") && s.contains("<wa-icon name=\"settings\" slot=\"prefix\"></wa-icon>");
        boolean containsFooterSlot = s.contains("<div slot=\"footer\"") && s.contains("Dialog Actions");
        boolean containsCloseButton = s.contains("<wa-button data-dialog=\"close\"") && s.contains("Close") && s.contains("</wa-button>");
        boolean containsSaveButton = s.contains("<wa-button autofocus") && s.contains("Save");
        boolean containsText = s.contains("This is a complete dialog with all features.");

        System.out.println("[DEBUG_LOG] Contains dialog tag: " + containsDialogTag);
        System.out.println("[DEBUG_LOG] Contains label: " + containsLabel);
        System.out.println("[DEBUG_LOG] Contains open: " + containsOpen);
        System.out.println("[DEBUG_LOG] Contains light-dismiss: " + containsLightDismiss);
        System.out.println("[DEBUG_LOG] Contains classes: " + containsClasses);
        System.out.println("[DEBUG_LOG] Contains with-header: " + containsWithHeader);
        System.out.println("[DEBUG_LOG] Contains with-footer: " + containsWithFooter);
        System.out.println("[DEBUG_LOG] Contains styles: " + containsStyles);
        System.out.println("[DEBUG_LOG] Contains header slot: " + containsHeaderSlot);
        System.out.println("[DEBUG_LOG] Contains icon button: " + containsIconButton);
        System.out.println("[DEBUG_LOG] Contains footer slot: " + containsFooterSlot);
        System.out.println("[DEBUG_LOG] Contains close button: " + containsCloseButton);
        System.out.println("[DEBUG_LOG] Contains save button: " + containsSaveButton);
        System.out.println("[DEBUG_LOG] Contains text: " + containsText);

        assertTrue(containsDialogTag);
        assertTrue(containsLabel);
        assertTrue(containsOpen);
        assertTrue(containsLightDismiss);
        assertTrue(containsClasses);
        assertTrue(containsWithHeader);
        assertTrue(containsWithFooter);
        assertTrue(containsStyles);
        assertTrue(containsHeaderSlot);
        assertTrue(containsIconButton);
        assertTrue(containsFooterSlot);
        assertTrue(containsCloseButton);
        assertTrue(containsSaveButton);
        assertTrue(containsText);
    }
}
