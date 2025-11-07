package com.jwebmp.webawesome.components.badge;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.VariantCapable;
import com.jwebmp.webawesome.components.Variant;
import com.jwebmp.webawesome.components.button.Appearance;
import lombok.Getter;
import lombok.Setter;

/**
 * A badge component for displaying small counts, labels, or status indicators.
 * <p>
 * Attributes:
 * - `variant`: Visual style variant (brand, neutral, success, warning, danger, inherit)
 * - `appearance`: Visual appearance style (accent, filled, outlined)
 * - `pill`: Renders the badge with rounded pill-shaped edges
 * - `pulse`: Adds a pulsing animation to the badge
 * <p>
 * Custom Style Properties:
 * - `backgroundColor`: Sets the --background-color CSS property
 * - `borderColor`: Sets the --border-color CSS property
 * - `textColor`: Sets the --text-color CSS property
 * - `pulseColor`: Sets the --pulse-color CSS property
 * - `fontSize`: Sets the font size of the badge
 * <p>
 * Usage examples:
 * <pre>
 * // Basic badge
 * WaBadge badge = new WaBadge();
 * badge.add(new Text("4"));
 * badge.setVariant(Variant.Brand);
 *
 * // Pill badge with custom styling
 * WaBadge pillBadge = new WaBadge();
 * pillBadge.add(new Text("New"));
 * pillBadge.setVariant(Variant.Success);
 * pillBadge.setAppearance(Appearance.Outlined);
 * pillBadge.setPill(true);
 * pillBadge.setTextColor("red");
 * </pre>
 */
@Getter
@Setter
@NgImportReference(value = "WaBadgeDirective", reference = "angular-awesome")
@NgImportModule("WaBadgeDirective")
public class WaBadge<J extends WaBadge<J>> extends DivSimple<J> implements VariantCapable<J>
{
    private Variant variant;
    private Appearance appearance;

    private Boolean pill;
    private Boolean pulse;

    // Custom style properties
    private String backgroundColor;
    private String borderColor;
    private String textColor;
    private String pulseColor;
    private String fontSize;

    public WaBadge()
    {
        setTag("wa-badge");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (variant != null)
            {
                addAttribute("variant", variant.toString()
                                               .toLowerCase());
            }
            if (pill != null && pill)
            {
                addAttribute("pill", "");
            }
            if (pulse != null && pulse)
            {
                addAttribute("pulse", "");
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString()
                                                     .toLowerCase());
            }

            // Apply custom style properties
            if (backgroundColor != null)
            {
                addStyle("--background-color", backgroundColor);
            }
            if (borderColor != null)
            {
                addStyle("--border-color", borderColor);
            }
            if (textColor != null)
            {
                addStyle("--text-color", textColor);
            }
            if (pulseColor != null)
            {
                addStyle("--pulse-color", pulseColor);
            }
            if (fontSize != null)
            {
                addStyle("font-size", fontSize);
            }
        }
        super.init();
    }


}
