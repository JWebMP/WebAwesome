package com.jwebmp.webawesome.components.progressbar;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;

/**
 * Represents a Web Awesome progress bar component.
 * This class provides methods to configure the progress bar's attributes.
 */
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
     * Default constructor for the WaProgressBar class.
     * Initializes the component with a default tag of `wa-progress-bar`.
     */
    public WaProgressBar()
    {
        setTag("wa-progress-bar");
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
        addAttribute("value", String.valueOf(value));
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
        addAttribute("max", String.valueOf(max));
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
            addAttribute("label", label);
            setText(label);
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
        if (indeterminate)
        {
            addAttribute("indeterminate", "");
        }
        else
        {
            removeAttribute("indeterminate");
        }
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
}