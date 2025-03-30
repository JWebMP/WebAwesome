package com.jwebmp.webawesome.components.progressring;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.progressbar.WaProgressBar;

/**
 * Represents a Web Awesome progress ring component.
 * This class provides methods to configure the progress ring's attributes.
 */
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
    private Integer trackWidth;

    /**
     * The indicator width of the progress ring.
     * This can be null if not set.
     */
    private Integer indicatorWidth;

    /**
     * The track colour of the progress ring.
     * This can be null if not set.
     */
    private String trackColour;

    /**
     * The indicator colour of the progress ring.
     * This can be null if not set.
     */
    private String indicatorColour;

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
     * Default constructor for the WaProgressRing class.
     * Initializes the component with a default class of `wa-progress-ring`.
     */
    public WaProgressRing()
    {
        addClass("wa-progress-ring");
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
        addAttribute("value", String.valueOf(value));
        return (J) this;
    }

    /**
     * Sets the track width of the progress ring.
     *
     * @param trackWidth The track width to set.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setTrackWidth(int trackWidth)
    {
        this.trackWidth = trackWidth;
        addStyle("--track-width", String.valueOf(trackWidth));
        return (J) this;
    }

    /**
     * Sets the indicator width of the progress ring.
     *
     * @param indicatorWidth The indicator width to set.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setIndicatorWidth(int indicatorWidth)
    {
        this.indicatorWidth = indicatorWidth;
        addStyle("--indicator-width", String.valueOf(indicatorWidth));
        return (J) this;
    }

    /**
     * Sets the track colour of the progress ring.
     *
     * @param trackColour The track colour to set.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setTrackColour(String trackColour)
    {
        if (!Strings.isNullOrEmpty(trackColour))
        {
            this.trackColour = trackColour;
            addStyle("--track-colour", trackColour);
        }
        return (J) this;
    }

    /**
     * Sets the indicator colour of the progress ring.
     *
     * @param indicatorColour The indicator colour to set.
     * @return The current instance of WaProgressRing for method chaining.
     */
    public J setIndicatorColour(String indicatorColour)
    {
        if (!Strings.isNullOrEmpty(indicatorColour))
        {
            this.indicatorColour = indicatorColour;
            addStyle("--indicator-colour", indicatorColour);
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
            addClass("progress-ring-values");
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
            addStyle("--size", size);
        }
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
            if (trackWidth != null)
            {
                addStyle("--track-width", trackWidth.toString());
            }
            if (indicatorWidth != null)
            {
                addStyle("--indicator-width", indicatorWidth.toString());
            }
            if (trackColour != null)
            {
                addStyle("--track-colour", trackColour);
            }
            if (indicatorColour != null)
            {
                addStyle("--indicator-colour", indicatorColour);
            }
            if (!Strings.isNullOrEmpty(size))
            {
                addStyle("--size", size);
            }
            if (!Strings.isNullOrEmpty(label))
            {
                setText(label);
            }
        }
        super.init();
    }
}