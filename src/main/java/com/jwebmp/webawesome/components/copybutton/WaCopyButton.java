
package com.jwebmp.webawesome.components.copybutton;


import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.FocusTokenCapable;
/**
 * Represents a Web Awesome Copy Button component, extending a simple Div element.
 * This component is used to create a button that enables users to copy specified text.
 * It offers customization options, including labels, icons, and feedback duration.
 */

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.icon.WaIcon;
import lombok.Getter;
@Getter
@NgImportReference(value = "WaCopyButtonDirective", reference = "angular-awesome")
@NgImportModule("WaCopyButtonDirective")
public class WaCopyButton<J extends WaCopyButton<J>> extends DivSimple<J> implements FocusTokenCapable<J>, SpaceTokenCapable<J>
{
    /**
     * The value (text) to be copied by the button. If set, this value will be copied directly.
     */
    private String value;
    /**
     * The ID of the HTML element from which the value will be copied.
     * If set, the button will copy the text content of the specified element.
     * Supports [attr] and .prop syntax.
     */
    private String from;


    /**
     * The label text displayed on the button while copying.
     */
    private String copyLabel;

    /**
     * The label text displayed when the copy operation is successful.
     */
    private String successLabel;

    /**
     * The label text displayed when the copy operation fails.
     */
    private String errorLabel;

    /**
     * The icon displayed on the button during the copy operation.
     */
    private WaIcon icon;

    /**
     * The icon displayed when the copy operation is successful.
     */
    private WaIcon successIcon;

    /**
     * The icon displayed when the copy operation fails.
     */
    private WaIcon errorIcon;

    /**
     * Indicates whether the button is disabled. If true, the button is non-interactive.
     */
    private Boolean disabled;

    /**
     * The duration (in milliseconds) for which the feedback message/icons will be shown.
     */
    private Integer feedbackDuration;

    /**
     * The placement of the tooltip relative to the button.
     * Possible values: 'top', 'right', 'bottom', 'left'
     */
    private String tooltipPlacement;

    /**
     * Default constructor for the WaCopyButton component.
     * Initializes the button element with the required tag name.
     */
    @SuppressWarnings("unchecked")
    public J setValue(String value)
    {
        this.value = value;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFrom(String from)
    {
        this.from = from;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setCopyLabel(String copyLabel)
    {
        this.copyLabel = copyLabel;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSuccessLabel(String successLabel)
    {
        this.successLabel = successLabel;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setErrorLabel(String errorLabel)
    {
        this.errorLabel = errorLabel;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setIcon(WaIcon icon)
    {
        this.icon = icon;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSuccessIcon(WaIcon successIcon)
    {
        this.successIcon = successIcon;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setErrorIcon(WaIcon errorIcon)
    {
        this.errorIcon = errorIcon;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFeedbackDuration(Integer feedbackDuration)
    {
        this.feedbackDuration = feedbackDuration;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setTooltipPlacement(String tooltipPlacement)
    {
        this.tooltipPlacement = tooltipPlacement;
        return (J) this;
    }    public WaCopyButton()
    {
        setTag("wa-copy-button");
    }

    /**
     * Initializes the component and prepares the necessary attributes and child elements.
     * This method sets HTML attributes for all defined fields, such as value and labels.
     * It also appends the corresponding icons to the component, if defined.
     */
    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(value))
            {
                addAttribute("value", value);
            }
            if (!Strings.isNullOrEmpty(from))
            {
                addAttribute("from", from);
            }
            if (!Strings.isNullOrEmpty(copyLabel))
            {
                addAttribute("copy-label", copyLabel);
            }
            if (!Strings.isNullOrEmpty(successLabel))
            {
                addAttribute("success-label", successLabel);
            }
            if (!Strings.isNullOrEmpty(errorLabel))
            {
                addAttribute("error-label", errorLabel);
            }
            if (icon != null)
            {
                icon.addAttribute("slot", "copy-icon");
                add(icon);
            }
            if (successIcon != null)
            {
                successIcon.addAttribute("slot", "success-icon");
                add(successIcon);
            }
            if (errorIcon != null)
            {
                errorIcon.addAttribute("slot", "error-icon");
                add(errorIcon);
            }

            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (feedbackDuration != null)
            {
                addAttribute("feedback-duration", feedbackDuration + "");
            }
            if (!Strings.isNullOrEmpty(tooltipPlacement))
            {
                addAttribute("tooltip-placement", tooltipPlacement);
            }

        }
        super.init();
    }

}
