package com.jwebmp.webawesome.components.observer;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * Web Awesome intersection observer component ({@code <wa-intersection-observer>}).
 * Wraps the IntersectionObserver API to detect when child elements enter or leave the viewport.
 * <p>
 * Events:
 * - {@code wa-intersection}: Fires when observed elements cross the visibility threshold
 */
@Getter
@Setter
@NgImportReference(value = "WaIntersectionObserverDirective", reference = "angular-awesome")
@NgImportModule("WaIntersectionObserverDirective")
public class WaIntersectionObserver<J extends WaIntersectionObserver<J>> extends DivSimple<J>
{
    public WaIntersectionObserver()
    {
        setTag("wa-intersection-observer");
    }
}

