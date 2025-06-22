
package com.jwebmp.webawesome.components.copybutton;

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
import lombok.Setter;

@Getter
@Setter
@NgImportReference(value = "WaCopyButtonDirective", reference = "angular-awesome")
@NgImportModule("WaCopyButtonDirective")
public class WaCopyButton<J extends WaCopyButton<J>> extends DivSimple<J>
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
    public WaCopyButton()
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
