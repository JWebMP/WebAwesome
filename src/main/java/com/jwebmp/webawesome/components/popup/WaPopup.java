package com.jwebmp.webawesome.components.popup;

import com.google.common.base.Strings;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

/**
 * Popup is a utility component that lets you declaratively anchor "popup" containers to another element.
 * It uses Floating UI under the hood to provide a well-tested, lightweight, and fully declarative positioning utility
 * for tooltips, dropdowns, and more.
 * <p>
 * Popup doesn't provide any styles — just positioning! The popup's preferred placement, distance, and skidding (offset)
 * can be configured using attributes. An arrow that points to the anchor can be shown and customized to your liking.
 * <p>
 * Attributes:
 * - `anchor`: The element the popup will be anchored to. If the anchor lives outside of the popup, you can provide the anchor element id.
 * - `active`: Activates the positioning logic and shows the popup. When this attribute is removed, the positioning logic is torn down and the popup will be hidden.
 * - `placement`: The preferred placement of the popup. Note that the actual placement will vary as configured to keep the panel inside of the viewport.
 * - `boundary`: Which bounding box to use for flipping, shifting, and auto-sizing? Options: 'viewport' or 'scroll'. Default is 'viewport'.
 * - `distance`: The distance in pixels from which to offset the panel away from its anchor. Default is 0.
 * - `skidding`: The distance in pixels from which to offset the panel along its anchor. Default is 0.
 * - `arrow`: Attaches an arrow to the popup. The arrow's size and color can be customized using the --arrow-size and --arrow-color custom properties.
 * - `arrowPlacement`: The placement of the arrow. Options: 'start', 'end', 'center', 'anchor'. Default is 'anchor'.
 * - `arrowPadding`: The amount of padding between the arrow and the edges of the popup. Default is 10.
 * - `flip`: When set, placement of the popup will flip to the opposite site to keep it in view.
 * - `flipFallbackPlacements`: If the preferred placement doesn't fit, popup will be tested in these fallback placements until one fits.
 * - `flipFallbackStrategy`: When neither the preferred placement nor the fallback placements fit, this value will be used to determine whether the popup should be positioned using the best available fit based on available space or as it was initially preferred.
 * - `flipPadding`: The amount of padding, in pixels, to exceed before the flip behavior will occur. Default is 0.
 * - `shift`: Moves the popup along the axis to keep it in view when clipped.
 * - `shiftPadding`: The amount of padding, in pixels, to exceed before the shift behavior will occur. Default is 0.
 * - `autoSize`: When set, this will cause the popup to automatically resize itself to prevent it from overflowing.
 * - `autoSizePadding`: The amount of padding, in pixels, to exceed before the auto-size behavior will occur. Default is 0.
 * - `sync`: Syncs the popup's width or height to that of the anchor element. Options: 'width', 'height', 'both'.
 * - `hoverBridge`: When a gap exists between the anchor and the popup element, this option will add a "hover bridge" that fills the gap using an invisible element.
 * <p>
 * Events:
 * - `waReposition`: Emitted when the popup is repositioned. This event can fire a lot, so avoid putting expensive operations in your listener or consider debouncing it.
 * <p>
 * CSS Custom Properties:
 * - `--arrow-size`: The size of the arrow. Note that an arrow won't be shown unless the arrow attribute is used. Default is 6px.
 * - `--arrow-color`: The color of the arrow. Default is black.
 * - `--auto-size-available-width`: A read-only custom property that determines the amount of width the popup can be before overflowing.
 * - `--auto-size-available-height`: A read-only custom property that determines the amount of height the popup can be before overflowing.
 * - `--show-duration`: The show duration to use when applying built-in animation classes. Default is 100ms.
 * - `--hide-duration`: The hide duration to use when applying built-in animation classes. Default is 100ms.
 */
@Getter
@Setter
@NgImportReference(value = "WaPopupDirective", reference = "angular-awesome")
@NgImportModule("WaPopupDirective")
public class WaPopup<J extends WaPopup<J>> extends DivSimple<J> implements INgComponent<J>
{
    @Serial
    private static final long serialVersionUID = 1L;

    private String anchor;
    private WaPopupPlacements placement;
    private Boolean flip;
    private Boolean active;
    private Integer distance;
    private Integer skidding;
    private String strategy;

    private Boolean arrow;
    private WaPopupArrowPlacements arrowPlacement;
    private Integer arrowPadding;
    private Boolean shift;
    private Boolean hoverBridge;
    private Integer shiftPadding;
    
    private String boundary;
    private String flipFallbackPlacements;
    private WaPopupFallbackStategy flipFallbackStrategy;
    private Integer flipPadding;

    private WaPopupAutoSize autoSize;
    private Integer autoSizePadding;
    
    private WaPopupSync sync;
    
    private String repositionEvent;


    public WaPopup()
    {
        setTag("wa-popup");
    }

    public WaPopup(IComponentHierarchyBase<?, ?> anchor)
    {
        this();
        setAnchor((ComponentHierarchyBase) anchor);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(anchor))
            {
                addAttribute("anchor", anchor);
            }
            if (active != null && active)
            {
                addAttribute("active", "");
            }

            if (distance != null)
            {
                addAttribute("distance", distance + "");
            }
            if (flip != null && flip)
            {
                addAttribute("flip", "");
            }
            if (placement != null)
            {
                addAttribute("placement", placement.toString());
            }
            if (skidding != null)
            {
                addAttribute("skidding", skidding + "");
            }
            if (arrow != null && arrow)
            {
                addAttribute("arrow", "");
            }
            if (arrowPlacement != null)
            {
                addAttribute("arrow-placement", arrowPlacement.toString());
            }
            if (arrowPadding != null)
            {
                addAttribute("arrow-padding", arrowPadding + "");
            }
            if (shift != null && shift)
            {
                addAttribute("shift", "");
            }
            if (hoverBridge != null && hoverBridge)
            {
                addAttribute("hover-bridge", "");
            }
            if (shiftPadding != null)
            {
                addAttribute("shift-padding", shiftPadding + "");
            }
            if (!Strings.isNullOrEmpty(boundary))
            {
                addAttribute("boundary", boundary);
            }
            if (!Strings.isNullOrEmpty(flipFallbackPlacements))
            {
                addAttribute("flip-fallback-placements", flipFallbackPlacements);
            }
            if (flipFallbackStrategy != null)
            {
                addAttribute("flip-fallback-strategy", flipFallbackStrategy.toString());
            }
            if (flipPadding != null)
            {
                addAttribute("flip-padding", flipPadding + "");
            }
            if (autoSize != null)
            {
                addAttribute("auto-size", autoSize.toString());
            }
            if (autoSizePadding != null)
            {
                addAttribute("auto-size-padding", autoSizePadding + "");
            }
            if (sync != null)
            {
                addAttribute("sync", sync.toString());
            }
            if (!Strings.isNullOrEmpty(repositionEvent))
            {
                addAttribute("wa-reposition", repositionEvent);
            }
            if (!Strings.isNullOrEmpty(strategy))
            {
                addAttribute("strategy", strategy);
            }
        }
        super.init();
    }

    public J setAnchor(ComponentHierarchyBase anchor)
    {
        if (anchor != null)
        {
            this.anchor = anchor.asBase()
                                .getID();
            anchor.asAttributeBase()
                  .addAttribute("(click)", "popup" + anchor.asBase()
                                                           .getID() + ".set(!" + "popup" + anchor.asBase()
                                                                                                 .getID() + "())");
            anchor.addConfiguration(AnnotationUtils.getNgImportReference("signal", "@angular/core"));
            anchor.addConfiguration(AnnotationUtils.getNgSignal("popup" + anchor.asBase()
                                                                                .getID(), "false", "boolean"));

            setRenderIDAttribute(true);
            anchor.setRenderIDAttribute(true);

            addAttribute("[attr.active]", "popup" + anchor.asBase()
                                                          .getID() + "() ? '' : null");
        }
        else
        {
            this.anchor = null;
        }
        return (J) this;
    }

}
