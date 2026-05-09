package com.jwebmp.webawesome.components.scroller;


import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
/**
 * Minimal wrapper for the <wa-scroller-wrapper> element as referenced in docs.
 * It provides orientation and visual flags to control scrollbar and shadow visibility.
 */
@Getter
@NgImportReference(value = "WaScrollerDirective", reference = "angular-awesome")
@NgImportModule("WaScrollerDirective")
public class WaScroller<J extends WaScroller<J>> extends DivSimple<J> implements SpaceTokenCapable<J>, BorderTokenCapable<J>
{
    /**
     * Orientation of scrolling: "vertical" or "horizontal".
     */
    private String orientation;

    /**
     * Hide the native scrollbar visuals (content still scrolls).
     */
    private Boolean withoutScrollbar;

    /**
     * Hide the scroll shadow affordance.
     */
    private Boolean withoutShadow;

    /**
     * Optional inline height style, e.g., "200px".
     */
    private String height;

    /**
     * Optional inline width style, e.g., "100%".
     */
    private String width;
    @SuppressWarnings("unchecked")
    public J setOrientation(String orientation)
    {
        this.orientation = orientation;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWithoutScrollbar(Boolean withoutScrollbar)
    {
        this.withoutScrollbar = withoutScrollbar;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWithoutShadow(Boolean withoutShadow)
    {
        this.withoutShadow = withoutShadow;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setHeight(String height)
    {
        this.height = height;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWidth(String width)
    {
        this.width = width;
        return (J) this;
    }
    public WaScroller()
    {
        setTag("wa-scroller");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (orientation != null)
            {
                addAttribute("orientation", orientation);
            }
            if (Boolean.TRUE.equals(withoutScrollbar))
            {
                addAttribute("without-scrollbar", "");
            }
            if (Boolean.TRUE.equals(withoutShadow))
            {
                addAttribute("without-shadow", "");
            }
            if (height != null)
            {
                addStyle("height", height);
            }
            if (width != null)
            {
                addStyle("width", width);
            }
        }
        super.init();
    }

    // Binding helpers
    @SuppressWarnings("unchecked")
    public J bindOrientation(String variable)
    {
        addAttribute("[orientation]", variable);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindWithoutScrollbar(String variable)
    {
        addAttribute("[withoutScrollbar]", variable);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindWithoutShadow(String variable)
    {
        addAttribute("[withoutShadow]", variable);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindHeight(String variable)
    {
        addAttribute("[style.height]", variable);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindWidth(String variable)
    {
        addAttribute("[style.width]", variable);
        return (J) this;
    }
}