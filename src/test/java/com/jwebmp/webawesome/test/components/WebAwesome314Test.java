package com.jwebmp.webawesome.test.components;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Variant;
import com.jwebmp.webawesome.components.WebAwesomePageConfigurator;
import com.jwebmp.webawesome.components.dialog.WaDialog;
import com.jwebmp.webawesome.components.divider.WaDivider;
import com.jwebmp.webawesome.components.drawer.WaDrawer;
import com.jwebmp.webawesome.components.page.WaPage;
import com.jwebmp.webawesome.components.step.StepAttention;
import com.jwebmp.webawesome.components.step.WaStep;
import com.jwebmp.webawesome.components.stepper.StepperOrientation;
import com.jwebmp.webawesome.components.stepper.WaStepper;
import com.jwebmp.webawesome.components.taginput.TagInputAppearance;
import com.jwebmp.webawesome.components.taginput.WaTagInput;
import com.jwebmp.webawesome.components.zoom.WaZoomableFrame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WebAwesome314Test
{
    @Test
    void tagInputRendersInputsSlotsEventsAndBindings()
    {
        var icon = new DivSimple<>().setText("icon");
        var html = new WaTagInput<>()
                .setValue("java,jwebmp")
                .setDelimiter(",;")
                .setMaxTags(5)
                .setAllowDuplicates(true)
                .setWithClear(true)
                .setWithLabel(true)
                .setAppearance(TagInputAppearance.FilledOutlined)
                .setReadOnly(true)
                .setSpellcheck(false)
                .setStart(icon)
                .setCreateEvent("guardTag($event)")
                .bindValue("tags")
                .bindValidationTarget("target")
                .toString(true);

        assertTrue(html.startsWith("<wa-tag-input"));
        assertTrue(html.contains("value=\"java,jwebmp\""));
        assertTrue(html.contains("delimiter=\",;\""));
        assertTrue(html.contains("max-tags=\"5\""));
        assertTrue(html.contains("allow-duplicates"));
        assertTrue(html.contains("with-clear"));
        assertTrue(html.contains("with-label"));
        assertTrue(html.contains("appearance=\"filled-outlined\""));
        assertTrue(html.contains("readonly"));
        assertTrue(html.contains("spellcheck=\"false\""));
        assertTrue(html.contains("slot=\"start\""));
        assertTrue(html.contains("(wa-create)=\"guardTag($event)\""));
        assertTrue(html.contains("[value]=\"tags\""));
        assertTrue(html.contains("[validationTarget]=\"target\""));
        assertImport(WaTagInput.class, "WaTagInputDirective");
    }

    @Test
    void stepAndStepperRenderStatusSsrEventsAndStyles()
    {
        var description = new DivSimple<>().setText("Configure access");
        var step = new WaStep<>("security")
                .setCompleted(true)
                .setLoading(true)
                .setDisabled(true)
                .setVariant(Variant.Warning)
                .setAttention(StepAttention.Pulse)
                .setWithDescription(true)
                .setActive(true)
                .setPulseColor("orange")
                .setDescription(description);
        var html = new WaStepper<>()
                .setActive("security")
                .setOrientation(StepperOrientation.Auto)
                .setLinear(true)
                .setClickable(true)
                .setLabel("Setup progress")
                .setBeforeStepChangeEvent("validateStep($event)")
                .setStepChangeEvent("loadStep($event)")
                .setMarkerSize("2.5rem")
                .add(step)
                .toString(true);

        assertTrue(html.contains("<wa-stepper"));
        assertTrue(html.contains("active=\"security\""));
        assertTrue(html.contains("orientation=\"auto\""));
        assertTrue(html.contains(" linear"));
        assertTrue(html.contains(" clickable"));
        assertTrue(html.contains("(wa-before-step-change)=\"validateStep($event)\""));
        assertTrue(html.contains("(wa-step-change)=\"loadStep($event)\""));
        assertTrue(html.contains("--marker-size:2.5rem"));
        assertTrue(html.contains("<wa-step"));
        assertTrue(html.contains("variant=\"warning\""));
        assertTrue(html.contains("attention=\"pulse\""));
        assertTrue(html.contains("with-description"));
        assertTrue(html.contains("slot=\"description\""));
        assertImport(WaStep.class, "WaStepDirective");
        assertImport(WaStepper.class, "WaStepperDirective");
    }

    @Test
    void changedComponentsRender314Inputs()
    {
        var divider = new WaDivider<>()
                .setWithLabel(true)
                .setLabelPlacement("end")
                .setLabelSpacing("1rem")
                .setLabelOffset("2rem")
                .setLabel(new DivSimple<>().setText("OR"))
                .toString(true);
        assertTrue(divider.contains("with-label"));
        assertTrue(divider.contains("label-placement=\"end\""));
        assertTrue(divider.contains("--label-spacing:1rem"));
        assertTrue(divider.contains("--label-offset:2rem"));
        assertTrue(divider.contains(">OR</div>"));

        assertTrue(new WaDialog<>("dialog").setWithLabel(true).toString(true).contains("with-label"));
        assertTrue(new WaDrawer<>().setWithLabel(true).toString(true).contains("with-label"));
        assertTrue(new WaPage<>().setNonce("nonce-value").toString(true).contains("nonce=\"nonce-value\""));

        var frame = new WaZoomableFrame<>()
                .setAllow("clipboard-write; fullscreen")
                .setName("preview")
                .setLabel("Document preview")
                .toString(true);
        assertTrue(frame.contains("allow=\"clipboard-write; fullscreen\""));
        assertTrue(frame.contains("name=\"preview\""));
        assertTrue(frame.contains("label=\"Document preview\""));
        assertImport(WaZoomableFrame.class, "WaZoomableFrameDirective");
    }

    @Test
    void configuratorOwns314AngularDependency()
    {
        var dependency = WebAwesomePageConfigurator.class.getAnnotation(TsDependency.class);
        assertEquals("angular-awesome", dependency.value());
        assertEquals("^3.14.0", dependency.version());
    }

    private static void assertImport(Class<?> type, String expected)
    {
        assertEquals(expected, type.getAnnotation(NgImportReference.class).value());
        assertEquals(expected, type.getAnnotation(NgImportModule.class).value());
    }
}
