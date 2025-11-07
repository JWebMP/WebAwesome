package com.jwebmp.webawesome.components.toast;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.base.angular.client.annotations.angular.NgDataType;
import com.jwebmp.core.base.angular.client.services.interfaces.INgDataType;

/**
 * A lightweight data type representing a toast entry used by WaToastDataService.
 * This exists to enable Angular data service codegen for programmatic toasts.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
@NgDataType
public class WaToastItem implements INgDataType<WaToastItem>
{
    /**
     * Unique identifier for the toast (uuid)
     */
    private String id;

    /**
     * Message/body to display in the toast
     */
    private String message;

    /**
     * Visual variant (brand, neutral, success, warning, danger)
     */
    private String variant;

    /**
     * Duration in ms before auto-dismiss. 0 or negative = sticky
     */
    private Integer duration;

    /**
     * Whether a close button is shown and manual dismiss is allowed
     */
    private Boolean closable;

    public String getId()
    {
        return id;
    }

    public WaToastItem setId(String id)
    {
        this.id = id;
        return this;
    }

    public String getMessage()
    {
        return message;
    }

    public WaToastItem setMessage(String message)
    {
        this.message = message;
        return this;
    }

    public String getVariant()
    {
        return variant;
    }

    public WaToastItem setVariant(String variant)
    {
        this.variant = variant;
        return this;
    }

    public Integer getDuration()
    {
        return duration;
    }

    public WaToastItem setDuration(Integer duration)
    {
        this.duration = duration;
        return this;
    }

    public Boolean getClosable()
    {
        return closable;
    }

    public WaToastItem setClosable(Boolean closable)
    {
        this.closable = closable;
        return this;
    }
}
