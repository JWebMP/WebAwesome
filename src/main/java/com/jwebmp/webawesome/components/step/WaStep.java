package com.jwebmp.webawesome.components.step;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.Variant;
import lombok.Getter;

/** A stage inside a {@code <wa-stepper>}. */
@Getter
@NgImportReference(value = "WaStepDirective", reference = "angular-awesome")
@NgImportModule("WaStepDirective")
public class WaStep<J extends WaStep<J>> extends DivSimple<J>
{
    private String name;
    private Boolean completed;
    private Boolean loading;
    private Boolean disabled;
    private Variant variant;
    private StepAttention attention;
    private Boolean withDescription;
    private Boolean active;
    private String pulseColor;
    private IComponentHierarchyBase<?, ?> description;
    private IComponentHierarchyBase<?, ?> icon;

    public WaStep() { setTag("wa-step"); }
    public WaStep(String name) { this(); this.name = name; }

    @SuppressWarnings("unchecked") public J setName(String value) { name = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setCompleted(Boolean value) { completed = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setLoading(Boolean value) { loading = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setDisabled(Boolean value) { disabled = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setVariant(Variant value) { variant = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setAttention(StepAttention value) { attention = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setWithDescription(Boolean value) { withDescription = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setActive(Boolean value) { active = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setPulseColor(String value) { pulseColor = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setDescription(IComponentHierarchyBase<?, ?> value) { description = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setIcon(IComponentHierarchyBase<?, ?> value) { icon = value; return (J) this; }

    @Override protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(name)) addAttribute("name", name);
            if (Boolean.TRUE.equals(completed)) addAttribute("completed", "");
            if (Boolean.TRUE.equals(loading)) addAttribute("loading", "");
            if (Boolean.TRUE.equals(disabled)) addAttribute("disabled", "");
            if (variant != null) addAttribute("variant", variant.toString());
            if (attention != null) addAttribute("attention", attention.toString());
            if (Boolean.TRUE.equals(withDescription)) addAttribute("with-description", "");
            if (Boolean.TRUE.equals(active)) addAttribute("active", "");
            if (!Strings.isNullOrEmpty(pulseColor)) addStyle("--pulse-color", pulseColor);
            slot(description, "description");
            slot(icon, "icon");
        }
        super.init();
    }

    private void slot(IComponentHierarchyBase<?, ?> component, String name)
    {
        if (component != null)
        {
            component.asAttributeBase().addAttribute("slot", name);
            add(component);
        }
    }
}
