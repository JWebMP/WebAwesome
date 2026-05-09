package com.jwebmp.webawesome.components.observer;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
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
@NgImportReference(value = "WaMutationObserverDirective", reference = "angular-awesome")
@NgImportModule("WaMutationObserverDirective")
public class WaMutationObserver<J extends WaMutationObserver<J>> extends DivSimple<J>
{
    private String attr;
    private Boolean childList;
    private Boolean charData;
    private Boolean disabled;

    /**
     * Whether to record the previous value of observed attributes.
     */
    private Boolean attrOldValue;

    /**
     * Whether to record the previous value of character data changes.
     */
    private Boolean charDataOldValue;

    private String mutationEvent;
    @SuppressWarnings("unchecked")
    public J setAttr(String attr)
    {
        this.attr = attr;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setChildList(Boolean childList)
    {
        this.childList = childList;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setCharData(Boolean charData)
    {
        this.charData = charData;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAttrOldValue(Boolean attrOldValue)
    {
        this.attrOldValue = attrOldValue;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setCharDataOldValue(Boolean charDataOldValue)
    {
        this.charDataOldValue = charDataOldValue;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setMutationEvent(String mutationEvent)
    {
        this.mutationEvent = mutationEvent;
        return (J) this;
    }
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
            if (attrOldValue != null && attrOldValue)
            {
                addAttribute("attr-old-value", "");
            }
            if (charDataOldValue != null && charDataOldValue)
            {
                addAttribute("char-data-old-value", "");
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
