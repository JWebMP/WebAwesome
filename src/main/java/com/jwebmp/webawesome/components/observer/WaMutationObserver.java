package com.jwebmp.webawesome.components.observer;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * Web Awesome mutation observer component ({@code <wa-mutation-observer>}).
 * Wraps the MutationObserver API to detect changes in the DOM subtree of child elements.
 * <p>
 * Attributes:
 * - {@code attr}: Observe attribute changes (space-separated attribute names or {@code *} for all)
 * - {@code childList}: Whether to observe child node additions/removals
 * - {@code charData}: Whether to observe text content changes
 * - {@code disabled}: Whether the observer is disabled
 * <p>
 * Events:
 * - {@code wa-mutation}: Fires when a watched mutation occurs
 */
@Getter
@Setter
@NgImportReference(value = "WaMutationObserverDirective", reference = "angular-awesome")
@NgImportModule("WaMutationObserverDirective")
public class WaMutationObserver<J extends WaMutationObserver<J>> extends DivSimple<J>
{
    private String attr;
    private Boolean childList;
    private Boolean charData;
    private Boolean disabled;

    private String mutationEvent;

    public WaMutationObserver()
    {
        setTag("wa-mutation-observer");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (attr != null)
            {
                addAttribute("attr", attr);
            }
            if (childList != null && childList)
            {
                addAttribute("child-list", "");
            }
            if (charData != null && charData)
            {
                addAttribute("char-data", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (!Strings.isNullOrEmpty(mutationEvent))
            {
                addAttribute("(wa-mutation)", mutationEvent);
            }
        }
        super.init();
    }
}

