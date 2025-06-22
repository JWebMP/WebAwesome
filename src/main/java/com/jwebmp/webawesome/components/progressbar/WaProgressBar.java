package com.jwebmp.webawesome.components.progressbar;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Web Awesome progress bar component.
 * This class provides methods to configure the progress bar's attributes.
 */
@Getter
@Setter
@NgImportReference(value = "WaProgressBarDirective", reference = "angular-awesome")
@NgImportModule("WaProgressBarDirective")
public class WaProgressBar<J extends WaProgressBar<J>> extends DivSimple<J>
{
    /**
     * The current value of the progress bar.
     * This can be null if not set.
     */
    private Integer value;

    /**
     * The maximum value of the progress bar.
     * This can be null if not set.
     */
    private Integer max;

    /**
     * The label to display on the progress bar.
     * This can be null if not set.
     */
    private String label;

    /**
     * Indicates whether the progress bar is indeterminate.
     * This can be null if not set.
     */
    private Boolean indeterminate;

    /**
     * Event handler for when the progress bar gains focus.
     */
    private String focusEvent;

    /**
     * Event handler for when the progress bar loses focus.
     */
    private String blurEvent;

    /**
     * Custom color for the progress indicator.
     */
    private String indicatorColor;

    /**
     * Custom display value for the progress bar.
     */
    private String display;

    /**
     * Optional component to display before the progress bar.
     */
    private IComponentHierarchyBase<?, ?> prefix;

    /**
     * Default constructor for the WaProgressBar class.
     * Initializes the component with a default tag of `wa-progress-bar`.
     */
    public WaProgressBar()
    {
        setTag("wa-progress-bar");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (value != null)
            {
                addAttribute("value", String.valueOf(value));
            }

            if (max != null)
            {
                addAttribute("max", String.valueOf(max));
            }

            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }

            if (indeterminate != null && indeterminate)
            {
                addAttribute("indeterminate", "");
            }

            // Add event handlers
            if (!Strings.isNullOrEmpty(focusEvent))
            {
                addAttribute("focus", focusEvent);
            }

            if (!Strings.isNullOrEmpty(blurEvent))
            {
                addAttribute("blur", blurEvent);
            }

            // Add CSS custom properties
            if (!Strings.isNullOrEmpty(indicatorColor))
            {
                addStyle("--indicator-color", indicatorColor);
            }

            if (!Strings.isNullOrEmpty(display))
            {
                addStyle("--display", display);
            }

            // Add prefix slot if provided
            if (prefix != null)
            {
                prefix.asAttributeBase()
                      .addAttribute("slot", "prefix");
                add(prefix);
            }
        }
        super.init();
    }

    /**
     * Sets the current value of the progress bar.
     *
     * @param value The value to set.
     * @return The current instance of WaProgressBar for method chaining.
     */
    public J setValue(int value)
    {
        this.value = value;
        return (J) this;
    }

    /**
     * Sets the maximum value of the progress bar.
     *
     * @param max The maximum value to set.
     * @return The current instance of WaProgressBar for method chaining.
     */
    public J setMax(int max)
    {
        this.max = max;
        return (J) this;
    }

    /**
     * Sets the label to display on the progress bar.
     *
     * @param label The label to set.
     * @return The current instance of WaProgressBar for method chaining.
     */
    public J setLabel(String label)
    {
        if (!Strings.isNullOrEmpty(label))
        {
            this.label = label;
        }
        return (J) this;
    }

    /**
     * Sets whether the progress bar is indeterminate.
     *
     * @param indeterminate The indeterminate state to set.
     * @return The current instance of WaProgressBar for method chaining.
     */
    public J setIndeterminate(boolean indeterminate)
    {
        this.indeterminate = indeterminate;
        return (J) this;
    }

    /**
     * Sets the custom color for the progress indicator.
     *
     * @param indicatorColor The color to set.
     * @return The current instance of WaProgressBar for method chaining.
     */
    public J setIndicatorColor(String indicatorColor)
    {
        this.indicatorColor = indicatorColor;
        return (J) this;
    }

    /**
     * Sets the custom display value for the progress bar.
     *
     * @param display The display value to set.
     * @return The current instance of WaProgressBar for method chaining.
     */
    public J setDisplay(String display)
    {
        this.display = display;
        return (J) this;
    }

    /**
     * Sets the prefix component to display before the progress bar.
     *
     * @param prefix The component to set as prefix.
     * @return The current instance of WaProgressBar for method chaining.
     */
    public J setPrefix(IComponentHierarchyBase<?, ?> prefix)
    {
        this.prefix = prefix;
        return (J) this;
    }

    /**
     * Gets the current value of the progress bar.
     *
     * @return The current value, or null if not set.
     */
    public Integer getValue()
    {
        return value;
    }

    /**
     * Gets the maximum value of the progress bar.
     *
     * @return The maximum value, or null if not set.
     */
    public Integer getMax()
    {
        return max;
    }

    /**
     * Gets the label of the progress bar.
     *
     * @return The label, or null if not set.
     */
    public String getLabel()
    {
        return label;
    }

    /**
     * Gets whether the progress bar is indeterminate.
     *
     * @return The indeterminate state, or null if not set.
     */
    public Boolean getIndeterminate()
    {
        return indeterminate;
    }

    /**
     * Overrides the bind method to support two-way binding with ngModel.
     * This allows the progress bar to be used with [(ngModel)] in Angular templates.
     *
     * @param variableName The name of the variable to bind to.
     * @return The current instance of WaProgressBar for method chaining.
     */
    @Override
    public J bind(String variableName)
    {
        addAttribute("[value]", variableName);
        addAttribute("(valueChange)", variableName + " = $event");
        return (J) this;
    }
}
