package com.jwebmp.webawesome.components.comparison;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Image;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaComparison component provides a slider to compare two images or content side by side.
 * It supports features like initial position setting and custom handle icons.
 */
@Getter
@Setter
@NgImportReference(value = "WaComparisonDirective", reference = "angular-awesome")
@NgImportModule("WaComparisonDirective")
public class WaComparison extends DivSimple<WaComparison>
{
    /**
     * The image to display in the "before" slot (left or top side).
     */
    private Image<?> image1;

    /**
     * The image to display in the "after" slot (right or bottom side).
     */
    private Image<?> image2;

    /**
     * Optional custom handle icon.
     */
    private WaIcon<?> icon;

    /**
     * The initial position of the divider as a percentage (0-100).
     */
    private Integer position;

    /**
     * Color of the slider divider.
     */
    private String dividerColor;

    /**
     * Width of the slider line.
     */
    private String dividerWidth;

    /**
     * Color of the slider handle icon.
     */
    private String handleColor;

    /**
     * Size of the handle element.
     */
    private String handleSize;

    public WaComparison()
    {
        setTag("wa-comparison");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (image1 != null)
            {
                add(image1);
                image1.asAttributeBase()
                      .addAttribute("slot", "before");
            }
            if (image2 != null)
            {
                add(image2);
                image2.asAttributeBase()
                      .addAttribute("slot", "after");
            }

            if (position != null)
            {
                addAttribute("position", position.toString()
                                                 .toLowerCase());
            }

            if (icon != null)
            {
                icon.asAttributeBase()
                    .addAttribute("slot", "handle");
                add(icon);
            }

            // Add CSS custom properties if specified
            if (dividerColor != null)
            {
                addStyle("--divider-color", dividerColor);
            }

            if (dividerWidth != null)
            {
                addStyle("--divider-width", dividerWidth);
            }

            if (handleColor != null)
            {
                addStyle("--handle-color", handleColor);
            }

            if (handleSize != null)
            {
                addStyle("--handle-size", handleSize);
            }
        }
        super.init();
    }
}