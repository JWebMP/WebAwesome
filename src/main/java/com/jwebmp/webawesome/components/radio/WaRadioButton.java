package com.jwebmp.webawesome.components.radio;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Web Awesome radio button component.
 * This class provides methods to configure the radio button component's attributes.
 * It extends WaRadio and adds support for pill styling and prefix/suffix slots.
 */
@Getter
@Setter
@NgImportReference(value = "WaRadioButtonDirective", reference = "angular-awesome")
@NgImportModule("WaRadioButtonDirective")
public class WaRadioButton<J extends WaRadioButton<J>> extends WaRadio<J>
{
    /**
     * Whether the radio button should be displayed as a pill.
     * This can be null if not set.
     */
    private Boolean asPill;

    /**
     * An icon or other component to display before the radio button text.
     * This can be null if not set.
     */
    private IComponentHierarchyBase<?, ?> prefix;

    /**
     * An icon or other component to display after the radio button text.
     * This can be null if not set.
     */
    private IComponentHierarchyBase<?, ?> suffix;

    /**
     * SSR-friendly flag for the prefix slot.
     * This can be null if not set.
     */
    private Boolean withPrefix;

    /**
     * SSR-friendly flag for the suffix slot.
     * This can be null if not set.
     */
    private Boolean withSuffix;

    /**
     * Custom indicator color for the radio button.
     * This can be null if not set.
     */
    private String styleIndicatorColor;

    /**
     * Custom indicator width for the radio button.
     * This can be null if not set.
     */
    private String styleIndicatorWidth;

    /**
     * Custom display value for the radio button.
     * This can be null if not set.
     */
    private String styleDisplay;

    /**
     * Default constructor for the WaRadioButton class.
     * Initializes the component with a default tag of `wa-radio-button`.
     */
    public WaRadioButton()
    {
        setTag("wa-radio-button");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (asPill != null && asPill)
            {
                addAttribute("as-pill", "");
            }

            if (withPrefix != null && withPrefix)
            {
                addAttribute("with-prefix", "");
            }

            if (withSuffix != null && withSuffix)
            {
                addAttribute("with-suffix", "");
            }

            if (prefix != null)
            {
                prefix.asAttributeBase()
                      .addAttribute("slot", "prefix");
                add(prefix);
            }
            if (suffix != null)
            {
                suffix.asAttributeBase()
                      .addAttribute("slot", "suffix");
                add(suffix);
            }

            // Add CSS custom properties if specified
            if (!Strings.isNullOrEmpty(styleIndicatorColor))
            {
                addStyle("--indicator-color", styleIndicatorColor);
            }

            if (!Strings.isNullOrEmpty(styleIndicatorWidth))
            {
                addStyle("--indicator-width", styleIndicatorWidth);
            }

            if (!Strings.isNullOrEmpty(styleDisplay))
            {
                addStyle("--display", styleDisplay);
            }
        }
        super.init();
    }
}
