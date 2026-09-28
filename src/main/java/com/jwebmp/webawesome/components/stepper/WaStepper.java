package com.jwebmp.webawesome.components.stepper;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import lombok.Getter;

/** Guides users through named {@code <wa-step>} children. */
@Getter
@NgImportReference(value = "WaStepperDirective", reference = "angular-awesome")
@NgImportModule("WaStepperDirective")
public class WaStepper<J extends WaStepper<J>> extends DivSimple<J> implements SpaceTokenCapable<J>
{
    private String active;
    private StepperOrientation orientation;
    private Boolean linear;
    private Boolean clickable;
    private String label;
    private String beforeStepChangeEvent;
    private String stepChangeEvent;
    private String markerSize;
    private String connectorColor;
    private String connectorColorActive;
    private String connectorWidth;
    private String connectorGap;

    public WaStepper() { setTag("wa-stepper"); }

    @SuppressWarnings("unchecked") public J setActive(String value) { active = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setOrientation(StepperOrientation value) { orientation = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setLinear(Boolean value) { linear = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setClickable(Boolean value) { clickable = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setLabel(String value) { label = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setBeforeStepChangeEvent(String value) { beforeStepChangeEvent = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setStepChangeEvent(String value) { stepChangeEvent = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setMarkerSize(String value) { markerSize = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setConnectorColor(String value) { connectorColor = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setConnectorColorActive(String value) { connectorColorActive = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setConnectorWidth(String value) { connectorWidth = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setConnectorGap(String value) { connectorGap = value; return (J) this; }
    @SuppressWarnings("unchecked") public J bindActive(String expression) { addAttribute("[active]", expression); return (J) this; }
    @SuppressWarnings("unchecked") public J goTo(String name) { return (J) this; }
    @SuppressWarnings("unchecked") public J next() { return (J) this; }
    @SuppressWarnings("unchecked") public J previous() { return (J) this; }

    @Override protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(active)) addAttribute("active", active);
            if (orientation != null) addAttribute("orientation", orientation.toString());
            if (Boolean.TRUE.equals(linear)) addAttribute("linear", "");
            if (Boolean.TRUE.equals(clickable)) addAttribute("clickable", "");
            if (!Strings.isNullOrEmpty(label)) addAttribute("label", label);
            if (!Strings.isNullOrEmpty(beforeStepChangeEvent)) addAttribute("(wa-before-step-change)", beforeStepChangeEvent);
            if (!Strings.isNullOrEmpty(stepChangeEvent)) addAttribute("(wa-step-change)", stepChangeEvent);
            style("--marker-size", markerSize);
            style("--connector-color", connectorColor);
            style("--connector-color-active", connectorColorActive);
            style("--connector-width", connectorWidth);
            style("--connector-gap", connectorGap);
        }
        super.init();
    }

    private void style(String name, String value)
    {
        if (!Strings.isNullOrEmpty(value)) addStyle(name, value);
    }
}
