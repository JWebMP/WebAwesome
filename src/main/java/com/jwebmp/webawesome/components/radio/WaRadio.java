package com.jwebmp.webawesome.components.radio;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Web Awesome radio component.
 * This class provides methods to configure the radio component's attributes.
 */
@Getter
@Setter
public class WaRadio extends DivSimple<WaRadio>
{
    /**
     * The value of the radio component.
     * This can be null if not set.
     */
    private String value;

    /**
     * Indicates whether the radio component is disabled.
     * This can be null if not set.
     */
    private Boolean disabled;

    /**
     * The size of the radio component.
     * This can be null if not set.
     */
    private Size size;

    /**
     * The form ID associated with the radio component.
     * This can be null if not set.
     */
    private String formId;

    /**
     * Default constructor for the WaRadio class.
     * Initializes the component with a default tag of `wa-radio`.
     */
    public WaRadio()
    {
        setTag("wa-radio");
    }

    /**
     * Initializes the component.
     * Adds the attributes to the component.
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
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (size != null)
            {
                addAttribute("size", size.name().toLowerCase());
            }
            if (!Strings.isNullOrEmpty(formId))
            {
                addAttribute("form", formId);
            }
        }
        super.init();
    }
}