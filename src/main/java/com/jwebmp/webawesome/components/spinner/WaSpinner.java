package com.jwebmp.webawesome.components.spinner;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaSpinner component is used to show the progress of an indeterminate operation.
 * It is a purely visual and stateless component.
 * <p>
 * This component renders as a wa-spinner HTML element and supports various customization options
 * through CSS custom properties.
 */
@Getter
@Setter
@NgImportReference(value = "WaSpinnerDirective", reference = "angular-awesome")
@NgImportModule("WaSpinnerDirective")
public class WaSpinner<J extends WaSpinner<J>> extends DivSimple<J>
{
    /**
     * Sets the font-size style directly on the host element, controlling the overall size
     */
    private String fontSize;

    /**
     * Sets the width of the spinner track
     */
    private String trackWidth;

    /**
     * Sets the color of the spinner track
     */
    private String trackColor;

    /**
     * Sets the color of the moving indicator
     */
    private String indicatorColor;

    /**
     * Sets the animation speed of the spinner
     */
    private String speed;

    /**
     * Creates a new WaSpinner with the tag "wa-spinner"
     */
    public WaSpinner()
    {
        setTag("wa-spinner");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(fontSize))
            {
                addStyle("font-size", fontSize);
            }

            if (!Strings.isNullOrEmpty(trackWidth))
            {
                addStyle("--track-width", trackWidth);
            }
            if (!Strings.isNullOrEmpty(trackColor))
            {
                addStyle("--track-color", trackColor);
            }
            if (!Strings.isNullOrEmpty(indicatorColor))
            {
                addStyle("--indicator-color", indicatorColor);
            }
            if (!Strings.isNullOrEmpty(speed))
            {
                addStyle("--speed", speed);
            }
        }
        super.init();
    }

    /**
     * Binds the font-size style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindFontSize(String variableName)
    {
        addAttribute("[style.font-size]", variableName);
        return (J) this;
    }

    /**
     * Binds the track width style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindTrackWidth(String variableName)
    {
        addAttribute("[style.--track-width]", variableName);
        return (J) this;
    }

    /**
     * Binds the track color style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindTrackColor(String variableName)
    {
        addAttribute("[style.--track-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the indicator color style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindIndicatorColor(String variableName)
    {
        addAttribute("[style.--indicator-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the animation speed style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindSpeed(String variableName)
    {
        addAttribute("[style.--speed]", variableName);
        return (J) this;
    }
}
