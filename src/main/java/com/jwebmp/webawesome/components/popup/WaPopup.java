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
    private Boolean shift;
    private Boolean hoverBridge;
    private Integer shiftPadding;

    private WaPopupFallbackStategy flipFallbackStrategy;
    private Integer flipPadding;

    private WaPopupAutoSize autoSize;
    private Integer autoSizePadding;


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
