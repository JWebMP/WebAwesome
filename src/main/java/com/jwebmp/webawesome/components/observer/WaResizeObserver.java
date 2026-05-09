package com.jwebmp.webawesome.components.observer;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
/**
 * Web Awesome resize observer component ({@code <wa-resize-observer>}).
 * Wraps the ResizeObserver API to detect when child elements change size.
 * <p>
 * Attributes:
 * - {@code disabled}: Whether the observer is disabled
 * <p>
 * Events:
 * - {@code wa-resize}: Fires when observed elements change size
 */
@Getter
@NgImportReference(value = "WaResizeObserverDirective", reference = "angular-awesome")
@NgImportModule("WaResizeObserverDirective")
public class WaResizeObserver<J extends WaResizeObserver<J>> extends DivSimple<J>
{
    private Boolean disabled;
    @SuppressWarnings("unchecked")
    public J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }
    public WaResizeObserver()
    {
        setTag("wa-resize-observer");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
        }
        super.init();
    }
}

