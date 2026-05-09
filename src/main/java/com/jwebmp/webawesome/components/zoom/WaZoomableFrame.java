package com.jwebmp.webawesome.components.zoom;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
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

    /**
     * Whether to sync the frame's theme with the parent page.
     */
    private Boolean withThemeSync;

    // Optional inline size helpers
    private String width;
    private String height;
    @SuppressWarnings("unchecked")
    public J setZoom(String zoom)
    {
        this.zoom = zoom;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setMinZoom(String minZoom)
    {
        this.minZoom = minZoom;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setMaxZoom(String maxZoom)
    {
        this.maxZoom = maxZoom;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setPanX(String panX)
    {
        this.panX = panX;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setPanY(String panY)
    {
        this.panY = panY;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWithThemeSync(Boolean withThemeSync)
    {
        this.withThemeSync = withThemeSync;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWidth(String width)
    {
        this.width = width;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setHeight(String height)
    {
        this.height = height;
        return (J) this;
    }
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
            if (Boolean.TRUE.equals(withThemeSync))
            {
                addAttribute("with-theme-sync", "");
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
    @SuppressWarnings("unchecked")
    public J bindZoom(String var)
    {
        addAttribute("[zoom]", var);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindMinZoom(String var)
    {
        addAttribute("[minZoom]", var);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindMaxZoom(String var)
    {
        addAttribute("[maxZoom]", var);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindPanX(String var)
    {
        addAttribute("[panX]", var);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindPanY(String var)
    {
        addAttribute("[panY]", var);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindDisabled(String var)
    {
        addAttribute("[disabled]", var);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindWidth(String var)
    {
        addAttribute("[style.width]", var);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindHeight(String var)
    {
        addAttribute("[style.height]", var);
        return (J) this;
    }
}