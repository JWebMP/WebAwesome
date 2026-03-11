package com.jwebmp.webawesome.components.variant;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Variant;
import lombok.Getter;
import lombok.Setter;

/**
 * Web Awesome variant container component ({@code <wa-variant>}).
 * Applies a semantic colour variant to all child components.
 * <p>
 * Usage:
 * <pre>
 * WaVariantContainer danger = new WaVariantContainer(Variant.Danger);
 * danger.add(new WaButton("Delete"));
 * danger.add(new WaCallout().setText("This action is destructive"));
 * // All children inherit the "danger" variant styling
 * </pre>
 */
@Getter
@Setter
@NgImportReference(value = "WaVariantDirective", reference = "angular-awesome")
@NgImportModule("WaVariantDirective")
public class WaVariantContainer<J extends WaVariantContainer<J>> extends DivSimple<J>
{
    private Variant variant;

    public WaVariantContainer()
    {
        setTag("wa-variant");
    }

    public WaVariantContainer(Variant variant)
    {
        this();
        this.variant = variant;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (variant != null)
            {
                addAttribute("variant", variant.toString());
            }
        }
        super.init();
    }
}

