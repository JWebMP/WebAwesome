package com.jwebmp.webawesome.components.callout;


import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.ShadowTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.TypographyTokenCapable;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.VariantCapable;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.Variant;
import com.jwebmp.webawesome.components.button.Appearance;
import lombok.Getter;
/**
 * The WaCallout component displays inline messages or alerts.
 * It supports color variants, size and appearance options, and an optional icon via slot.
 */
@Getter
@NgImportReference(value = "WaCalloutDirective", reference = "angular-awesome")
@NgImportModule("WaCalloutDirective")
public class WaCallout<J extends WaCallout<J>> extends DivSimple<J> implements VariantCapable<J>, BorderTokenCapable<J>, ShadowTokenCapable<J>, SpaceTokenCapable<J>, TypographyTokenCapable<J>
{
    /**
     * Optional icon slot
     */
    private IComponentHierarchyBase<?, ?> icon;

    /**
     * The visual style variant of the callout
     */
    private Variant variant;

    /**
     * The appearance of the callout
     */
    private Appearance appearance;

    /**
     * The size of the callout
     */
    private Size size;
    @SuppressWarnings("unchecked")
    public J setIcon(IComponentHierarchyBase<?, ?> icon)
    {
        this.icon = icon;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setVariant(Variant variant)
    {
        this.variant = variant;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAppearance(Appearance appearance)
    {
        this.appearance = appearance;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSize(Size size)
    {
        this.size = size;
        return (J) this;
    }
    public WaCallout()
    {
        setTag("wa-callout");
        setRenderTextBeforeChildren(false);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (icon != null)
            {
                icon.asAttributeBase()
                    .addAttribute("slot", "icon");
                add(icon);
            }
            if (variant != null)
            {
                addAttribute("variant", variant.toString()
                                               .toLowerCase());
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString()
                                                     .toLowerCase());
            }
            if (size != null)
            {
                addAttribute("size", size.toString()
                                         .toLowerCase());
            }
        }
        super.init();
    }
}
