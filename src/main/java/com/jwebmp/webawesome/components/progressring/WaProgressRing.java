package com.jwebmp.webawesome.components.progressring;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Web Awesome progress ring component used to visualize the progression of a task in a circular format.
 * <p>
 * Attributes:
 * - `value`: Current progress percentage, 0-100
 * - `label`: Label for screen readers
 * <p>
 * Events:
 * - `focusEvent`: Emits when the component gains focus
 * - `blurEvent`: Emits when the component loses focus
 * <p>
 * Styling Properties:
 * - `trackWidth`: Sets the --track-width CSS property (width of the track)
 * - `indicatorWidth`: Sets the --indicator-width CSS property (width of the progress indicator)
 * - `trackColor`: Sets the --track-color CSS property (color of the track)
 * - `indicatorColor`: Sets the --indicator-color CSS property (color of the progress indicator)
 * - `size`: Sets the --size CSS property (overall size of the ring)
 * - `indicatorTransitionDuration`: Sets the --indicator-transition-duration CSS property (animation speed)
 * <p>
 * Slots:
 * - default: The default slot can be used to show content inside the ring
 * - prefix: For an optional icon or element before the ring
 * <p>
 * Usage examples:
 * <pre>
 * // Basic progress ring
 * WaProgressRing progressRing = new WaProgressRing();
 * progressRing.setValue(50);
 * progressRing.setLabel("Loading Progress");
 *
 * // Styled progress ring
 * WaProgressRing customRing = new WaProgressRing();
 * customRing.setValue(75);
 * customRing.setSize("100px");
 * customRing.setTrackWidth("4px");
 * customRing.setIndicatorWidth("4px");
 * customRing.setTrackColor("#f0f0f0");
 * customRing.setIndicatorColor("#0078d4");
 * customRing.setIndicatorTransitionDuration("0.3s");
 * customRing.add(new Text("75%"));
 * </pre>
 * <p>
 * Note: This component supports two-way binding for the value property.
 */
@Getter
@Setter
@NgImportReference(value = "WaProgressRingDirective", reference = "angular-awesome")
@NgImportModule("WaProgressRingDirective")
public class WaProgressRing<J extends WaProgressRing<J>> extends DivSimple<J>
{
    /**
     * The current value of the progress ring.
     * This can be null if not set.
     */
    private Number value;

    /**
     * The track width of the progress ring.
     * This can be null if not set.
     */
    private String trackWidth;

    /**
     * The indicator width of the progress ring.
     * This can be null if not set.
     */
    private String indicatorWidth;

    /**
     * The track color of the progress ring.
     * This can be null if not set.
     */
    private String trackColor;

    /**
     * The indicator color of the progress ring.
     * This can be null if not set.
     */
    private String indicatorColor;

    /**
     * The label to display on the progress ring.
     * This can be null if not set.
     */
    private String label;

    /**
     * The size of the progress ring.
     * This can be null if not set.
     */
    private String size;

    /**
     * The transition duration for the indicator.
     * This can be null if not set.
     */
    private String indicatorTransitionDuration;

    /**
     * Event handler for when the progress ring gains focus.
     */
    private String focusEvent;

    /**
     * Event handler for when the progress ring loses focus.
     */
    private String blurEvent;

    /**
     * Optional component to display before the content.
     */
    private IComponentHierarchyBase<?, ?> prefix;

    /**
     * Default constructor for the WaProgressRing class.
     * Initializes the component with a default tag of `wa-progress-ring`.
     */
    public WaProgressRing()
    {
        setTag("wa-progress-ring");
    }

    /**
     * Sets the current value of the progress ring.
     *
     * @param value The value to set.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setValue(int value)
    {
        this.value = value;
        return (J) this;
    }

    /**
     * Sets the track width of the progress ring.
     *
     * @param trackWidth The track width to set.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setTrackWidth(String trackWidth)
    {
        if (!Strings.isNullOrEmpty(trackWidth))
        {
            this.trackWidth = trackWidth;
        }
        return (J) this;
    }

    /**
     * Sets the indicator width of the progress ring.
     *
     * @param indicatorWidth The indicator width to set.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setIndicatorWidth(String indicatorWidth)
    {
        if (!Strings.isNullOrEmpty(indicatorWidth))
        {
            this.indicatorWidth = indicatorWidth;
        }
        return (J) this;
    }

    /**
     * Sets the track color of the progress ring.
     *
     * @param trackColor The track color to set.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setTrackColor(String trackColor)
    {
        if (!Strings.isNullOrEmpty(trackColor))
        {
            this.trackColor = trackColor;
        }
        return (J) this;
    }

    /**
     * Sets the indicator color of the progress ring.
     *
     * @param indicatorColor The indicator color to set.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setIndicatorColor(String indicatorColor)
    {
        if (!Strings.isNullOrEmpty(indicatorColor))
        {
            this.indicatorColor = indicatorColor;
        }
        return (J) this;
    }

    /**
     * Sets the label to display on the progress ring.
     *
     * @param label The label to set.
     * @return The current instance of WaProgressRing for method chaining.
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
     * Sets the size of the progress ring.
     *
     * @param size The size to set.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setSize(String size)
    {
        if (!Strings.isNullOrEmpty(size))
        {
            this.size = size;
        }
        return (J) this;
    }

    /**
     * Sets the transition duration for the indicator.
     *
     * @param indicatorTransitionDuration The transition duration to set.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setIndicatorTransitionDuration(String indicatorTransitionDuration)
    {
        if (!Strings.isNullOrEmpty(indicatorTransitionDuration))
        {
            this.indicatorTransitionDuration = indicatorTransitionDuration;
        }
        return (J) this;
    }

    /**
     * Sets the event handler for when the progress ring gains focus.
     *
     * @param focusEvent The focus event handler to set.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setFocusEvent(String focusEvent)
    {
        this.focusEvent = focusEvent;
        return (J) this;
    }

    /**
     * Sets the event handler for when the progress ring loses focus.
     *
     * @param blurEvent The blur event handler to set.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setBlurEvent(String blurEvent)
    {
        this.blurEvent = blurEvent;
        return (J) this;
    }

    /**
     * Sets the prefix component to display before the content.
     *
     * @param prefix The component to set as prefix.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setPrefix(IComponentHierarchyBase<?, ?> prefix)
    {
        this.prefix = prefix;
        return (J) this;
    }

    /**
     * Initializes the component.
     * Adds the attributes and styles to the component.
     */
    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (value != null)
            {
                addAttribute("value", value.toString());
            }
            if (!Strings.isNullOrEmpty(trackWidth))
            {
                addStyle("--track-width", trackWidth);
            }
            if (!Strings.isNullOrEmpty(indicatorWidth))
            {
                addStyle("--indicator-width", indicatorWidth);
            }
            if (trackColor != null)
            {
                addStyle("--track-color", trackColor);
            }
            if (indicatorColor != null)
            {
                addStyle("--indicator-color", indicatorColor);
            }
            if (!Strings.isNullOrEmpty(size))
            {
                addStyle("--size", size);
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (!Strings.isNullOrEmpty(indicatorTransitionDuration))
            {
                addStyle("--indicator-transition-duration", indicatorTransitionDuration);
            }
            if (!Strings.isNullOrEmpty(focusEvent))
            {
                addAttribute("focus", focusEvent);
            }
            if (!Strings.isNullOrEmpty(blurEvent))
            {
                addAttribute("blur", blurEvent);
            }
            if (prefix != null)
            {
                prefix.asAttributeBase()
                      .addAttribute("slot", "start");
                add(prefix);
            }
        }
        super.init();
    }

    /**
     * Overrides the bind method to support two-way binding with ngModel.
     * This allows the progress ring to be used with [(ngModel)] in Angular templates.
     *
     * @param variableName The name of the variable to bind to.
     * @return The current instance of WaProgressRing for method chaining.
     */
    @Override
    public J bind(String variableName)
    {
        addAttribute("[(ngModel)]", variableName);
        return (J) this;
    }
}
