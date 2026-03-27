package com.jwebmp.webawesome.components.observer;

import com.google.common.base.Strings;
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
    /**
     * CSS selector for the root element to observe intersections against.
     */
    private String root;

    /**
     * CSS class to apply when the element intersects.
     */
    private String intersectClass;

    /**
     * Whether to observe only once and then stop.
     */
    private Boolean once;

    public WaIntersectionObserver()
    {
        setTag("wa-intersection-observer");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(root))
            {
                addAttribute("root", root);
            }
            if (!Strings.isNullOrEmpty(intersectClass))
            {
                addAttribute("intersect-class", intersectClass);
            }
            if (once != null && once)
            {
                addAttribute("once", "");
            }
        }
        super.init();
    }
}
