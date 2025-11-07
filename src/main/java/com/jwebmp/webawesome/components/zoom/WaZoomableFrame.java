package com.jwebmp.webawesome.components.zoom;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * Wrapper for a zoomable/pannable frame as referenced in docs.
 *
 * Tag: <wa-zoomable-frame>
 *
 * Props:
 * - zoom: current zoom level (e.g., 1, 1.5, 2)
 * - min-zoom: minimum zoom level
 * - max-zoom: maximum zoom level
 * - pan-x: current horizontal pan offset (px)
 * - pan-y: current vertical pan offset (px)
 * - disabled: disables user interaction
 *
 * Bindings:
 * - [zoom], [minZoom], [maxZoom], [panX], [panY], [disabled]
 * - [style.width], [style.height]
 */
@Getter
@Setter
@NgImportReference(value = "WaZoomableFrameComponent", reference = "angular-awesome")
@NgImportModule("WaZoomableFrameComponent")
public class WaZoomableFrame<J extends WaZoomableFrame<J>> extends DivSimple<J>
{
    private String zoom;
    private String minZoom;
    private String maxZoom;
    private String panX;
    private String panY;
    private Boolean disabled;

    // Optional inline size helpers
    private String width;
    private String height;

    public WaZoomableFrame()
    {
        setTag("wa-zoomable-frame");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (zoom != null)
            {
                addAttribute("zoom", zoom);
            }
            if (minZoom != null)
            {
                addAttribute("min-zoom", minZoom);
            }
            if (maxZoom != null)
            {
                addAttribute("max-zoom", maxZoom);
            }
            if (panX != null)
            {
                addAttribute("pan-x", panX);
            }
            if (panY != null)
            {
                addAttribute("pan-y", panY);
            }
            if (Boolean.TRUE.equals(disabled))
            {
                addAttribute("disabled", "");
            }
            if (width != null)
            {
                addStyle("width", width);
            }
            if (height != null)
            {
                addStyle("height", height);
            }
        }
        super.init();
    }

    // Binding helpers
    public J bindZoom(String var)
    {
        addAttribute("[zoom]", var);
        return (J) this;
    }

    public J bindMinZoom(String var)
    {
        addAttribute("[minZoom]", var);
        return (J) this;
    }

    public J bindMaxZoom(String var)
    {
        addAttribute("[maxZoom]", var);
        return (J) this;
    }

    public J bindPanX(String var)
    {
        addAttribute("[panX]", var);
        return (J) this;
    }

    public J bindPanY(String var)
    {
        addAttribute("[panY]", var);
        return (J) this;
    }

    public J bindDisabled(String var)
    {
        addAttribute("[disabled]", var);
        return (J) this;
    }

    public J bindWidth(String var)
    {
        addAttribute("[style.width]", var);
        return (J) this;
    }

    public J bindHeight(String var)
    {
        addAttribute("[style.height]", var);
        return (J) this;
    }
}
