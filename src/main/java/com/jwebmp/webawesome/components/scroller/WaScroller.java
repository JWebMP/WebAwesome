package com.jwebmp.webawesome.components.scroller;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * Minimal wrapper for the <wa-scroller-wrapper> element as referenced in docs.
 * It provides orientation and visual flags to control scrollbar and shadow visibility.
 */
@Getter
@Setter
@NgImportReference(value = "WaScrollerComponent", reference = "angular-awesome")
@NgImportModule("WaScrollerComponent")
public class WaScroller<J extends WaScroller<J>> extends DivSimple<J>
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
    public J bindOrientation(String variable)
    {
        addAttribute("[orientation]", variable);
        return (J) this;
    }

    public J bindWithoutScrollbar(String variable)
    {
        addAttribute("[withoutScrollbar]", variable);
        return (J) this;
    }

    public J bindWithoutShadow(String variable)
    {
        addAttribute("[withoutShadow]", variable);
        return (J) this;
    }

    public J bindHeight(String variable)
    {
        addAttribute("[style.height]", variable);
        return (J) this;
    }

    public J bindWidth(String variable)
    {
        addAttribute("[style.width]", variable);
        return (J) this;
    }
}
