package com.jwebmp.webawesome.components.progressbar;


import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.TransitionTokenCapable;
import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
/**
 * Represents a Web Awesome progress bar component used to visualize the progression of a task.
 * <p>
 * Attributes:
 * - `value`: Current progress percentage, 0-100
 * - `indeterminate`: If true, shows indeterminate loading animation (value and content are ignored)
 * - `label`: Label for screen readers
 * <p>
 * Events:
 * - `focusEvent`: Emits when the component gains focus
 * - `blurEvent`: Emits when the component loses focus
 * <p>
 * Styling Properties:
 * - `indicatorColor`: Sets the --indicator-color CSS property
 * - `display`: Sets the --display CSS property
 * - `trackHeight`: Sets the --track-height CSS property
 * <p>
 * Slots:
 * - default: The default slot can be used to show the current value as text (e.g., "50%")
 * - start: For an optional icon or element before the bar
 * <p>
 * Usage examples:
 * <pre>
 * // Basic progress bar
 * WaProgressBar progressBar = new WaProgressBar();
 * progressBar.setValue(50);
 * progressBar.setLabel("Upload Progress");
 *
 * // Indeterminate progress bar
 * WaProgressBar indeterminateBar = new WaProgressBar();
 * indeterminateBar.setIndeterminate(true);
 * indeterminateBar.setLabel("Loading...");
 *
 * // Progress bar with custom styling
 * WaProgressBar customBar = new WaProgressBar();
 * customBar.setValue(75);
 * customBar.setIndicatorColor("green");
 * customBar.setDisplay("block");
 * customBar.add(new Text("75%"));
 * </pre>
 * <p>
 * Note: This component supports two-way binding with ngModel for the value property.
 */
@Getter
@NgImportReference(value = "WaProgressBarDirective", reference = "angular-awesome")
@NgImportModule("WaProgressBarDirective")
public class WaProgressBar<J extends WaProgressBar<J>> extends DivSimple<J> implements BorderTokenCapable<J>, SpaceTokenCapable<J>, TransitionTokenCapable<J>
{
    private Integer value;
    private Integer max;
    private String label;
    private Boolean indeterminate;
    private String focusEvent;
    private String blurEvent;
    private String indicatorColor;
    private String display;
    private String trackHeight;
    private IComponentHierarchyBase<?, ?> prefix;

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
    @SuppressWarnings("unchecked")
    public J setValue(Integer value)
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
    @SuppressWarnings("unchecked")
    public J setMax(Integer max)
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
    @SuppressWarnings("unchecked")
    public J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }

    /**
     * Sets whether the progress bar is indeterminate.
     *
     * @param indeterminate The indeterminate state to set.
     * @return The current instance of WaProgressBar for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setIndeterminate(Boolean indeterminate)
    {
        this.indeterminate = indeterminate;
        return (J) this;
    }

    /**
     * Sets the event handler for when the progress bar gains focus.
     *
     * @param focusEvent The focus event handler to set.
     * @return The current instance of WaProgressBar for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setFocusEvent(String focusEvent)
    {
        this.focusEvent = focusEvent;
        return (J) this;
    }

    /**
     * Sets the event handler for when the progress bar loses focus.
     *
     * @param blurEvent The blur event handler to set.
     * @return The current instance of WaProgressBar for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setBlurEvent(String blurEvent)
    {
        this.blurEvent = blurEvent;
        return (J) this;
    }

    /**
     * Sets the custom color for the progress indicator.
     *
     * @param indicatorColor The color to set.
     * @return The current instance of WaProgressBar for method chaining.
     */
    @SuppressWarnings("unchecked")
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
    @SuppressWarnings("unchecked")
    public J setDisplay(String display)
    {
        this.display = display;
        return (J) this;
    }

    /**
     * Sets the custom track height for the progress bar.
     *
     * @param trackHeight The track height value to set.
     * @return The current instance of WaProgressBar for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setTrackHeight(String trackHeight)
    {
        this.trackHeight = trackHeight;
        return (J) this;
    }

    /**
     * Sets the prefix component to display before the progress bar.
     *
     * @param prefix The component to set as prefix.
     * @return The current instance of WaProgressBar for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setPrefix(IComponentHierarchyBase<?, ?> prefix)
    {
        this.prefix = prefix;
        return (J) this;
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

            if (!Strings.isNullOrEmpty(focusEvent))
            {
                addAttribute("focus", focusEvent);
            }

            if (!Strings.isNullOrEmpty(blurEvent))
            {
                addAttribute("blur", blurEvent);
            }

            if (!Strings.isNullOrEmpty(indicatorColor))
            {
                addStyle("--indicator-color", indicatorColor);
            }

            if (!Strings.isNullOrEmpty(display))
            {
                addStyle("--display", display);
            }

            if (!Strings.isNullOrEmpty(trackHeight))
            {
                addStyle("--track-height", trackHeight);
            }

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
     * Binds the value property to an Angular variable and wires two-way updates.
     *
     * @param variableName The name of the variable to bind to.
     * @return The current instance of WaProgressBar for method chaining.
     */
    @Override
    @SuppressWarnings("unchecked")
    public J bind(String variableName)
    {
        addAttribute("[value]", variableName);
        addAttribute("(valueChange)", variableName + " = $event");
        return (J) this;
    }

}