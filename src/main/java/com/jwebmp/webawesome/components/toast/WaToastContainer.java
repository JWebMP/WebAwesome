package com.jwebmp.webawesome.components.toast;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * Minimal wrapper for the wa-toast-container element referenced by the docs.
 * <p>
 * The container is responsible for positioning and stacking toasts created via a service on the client.
 * For OSS purposes, we expose the position attribute so layouts/tests can assert correct markup.
 */
@Getter
@Setter
@NgImportReference(value = "WaToastContainerComponent", reference = "angular-awesome")
@NgImportModule("WaToastContainerComponent")
public class WaToastContainer<J extends WaToastContainer<J>> extends DivSimple<J>
{
    /**
     * Position of the container on the screen. Supported values per docs:
     * top-right, top-left, bottom-right, bottom-left, top-center, bottom-center
     */
    private String position;

    /**
     * Maximum concurrent toasts visible. Optional; usually configured via provider.
     */
    private Integer max;

    /**
     * Default duration for auto-dismiss in ms. Optional; usually configured via provider.
     */
    private Integer duration;

    /**
     * When true, newer toasts appear at the top of the stack.
     */
    private Boolean newestOnTop;

    /**
     * Gap between toasts in pixels.
     */
    private Integer gap;

    /**
     * z-index used for the container.
     */
    private Integer zIndex;

    public WaToastContainer()
    {
        setTag("wa-toast-container");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (position != null)
            {
                addAttribute("position", position);
            }
            if (max != null)
            {
                addAttribute("max", String.valueOf(max));
            }
            if (duration != null)
            {
                addAttribute("duration", String.valueOf(duration));
            }
            if (newestOnTop != null && newestOnTop)
            {
                addAttribute("newest-on-top", "");
            }
            if (gap != null)
            {
                addAttribute("gap", String.valueOf(gap));
            }
            if (zIndex != null)
            {
                addAttribute("z-index", String.valueOf(zIndex));
            }
        }
        super.init();
    }

    // Binding helpers
    public J bindPosition(String variable)
    {
        addAttribute("[position]", variable);
        return (J) this;
    }

    public J bindMax(String variable)
    {
        addAttribute("[max]", variable);
        return (J) this;
    }

    public J bindDuration(String variable)
    {
        addAttribute("[duration]", variable);
        return (J) this;
    }

    public J bindNewestOnTop(String variable)
    {
        addAttribute("[newestOnTop]", variable);
        return (J) this;
    }

    public J bindGap(String variable)
    {
        addAttribute("[gap]", variable);
        return (J) this;
    }

    public J bindZIndex(String variable)
    {
        addAttribute("[zIndex]", variable);
        return (J) this;
    }
}
