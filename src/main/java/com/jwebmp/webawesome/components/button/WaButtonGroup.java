package com.jwebmp.webawesome.components.button;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.servlets.enumarations.Orientation;
import com.jwebmp.webawesome.components.VariantCapable;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.Variant;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaButtonGroup component provides a way to group related buttons with shared attributes.
 * It supports size, variant, orientation, and accessibility features.
 */
@Getter
@Setter
@NgImportReference(value = "WaButtonGroupDirective", reference = "angular-awesome")
@NgImportModule("WaButtonGroupDirective")
public class WaButtonGroup<J extends WaButtonGroup<J>> extends DivSimple<J> implements VariantCapable<J>
{
    /**
     * The size of the button group (small, medium, large)
     */
    private Size size;

    /**
     * A label for the button group for accessibility
     */
    private String label;

    /**
     * The orientation of the button group (horizontal or vertical)
     */
    private Orientation orientation;

    /**
     * The visual style variant of the button group
     */
    private Variant variant;

    public WaButtonGroup()
    {
        setTag("wa-button-group");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (size != null)
            {
                addAttribute("size", size.toString()
                                         .toLowerCase());
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (orientation != null)
            {
                addAttribute("orientation", orientation.toString()
                                                       .toLowerCase());
            }
            if (variant != null)
            {
                addAttribute("variant", variant.toString()
                                               .toLowerCase());
            }
        }
        super.init();
    }


}
