package com.jwebmp.webawesome.components.drawer;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.Placement;
import com.jwebmp.webawesome.components.button.WaButton;
import com.jwebmp.webawesome.components.dialog.WaDialog;
import com.jwebmp.webawesome.components.icon.WaIconButton;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WaDrawer extends DivSimple<WaDrawer>
{
    private String label;
    private Boolean dialogDismiss;
    private Boolean overlayDismiss;
    private Boolean scrolling;

    private Placement slideInFrom;

    private Boolean dialogHeaderDenyClose;

    public WaDrawer()
    {
        setTag("wa-drawer");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (dialogDismiss != null && dialogDismiss)
            {
                addAttribute("drawer-dismiss", "");
                addClass("drawer-dismiss");
            }
            if (scrolling != null && scrolling)
            {
                addAttribute("scrolling", "");
                addClass("drawer-scrolling");
            }
            if (overlayDismiss != null && overlayDismiss)
            {
                addAttribute("light-dismiss", "");
            }
            if (dialogHeaderDenyClose != null && dialogHeaderDenyClose)
            {
                addAttribute("drawer-deny-close", "");
            }
            if (slideInFrom != null)
            {
                addAttribute("placement", slideInFrom.toString().toLowerCase());
            }
        }
        super.init();
    }

    public WaDrawer withHeader(DivSimple<?> header)
    {
        header.addAttribute("slot", "header");
        addAttribute("with-header", "");
        addClass("drawer-header");
        add(header);
        return this;
    }

    public WaDrawer withHeaderActions(List<WaIconButton> iconButtons)
    {
        for (WaIconButton iconButton : iconButtons)
        {
            iconButton.addAttribute("slot", "header-actions");
            addAttribute("with-header", "");
            addClass("dialog-header-actions");
            add(iconButton);
        }

        return this;
    }

    public WaDrawer withFooter(DivSimple<?> footer)
    {
        footer.addAttribute("slot", "footer");
        addAttribute("with-footer", "");
        addClass("drawer-footer");
        add(footer);
        return this;
    }

    public WaButton withCloseButton(DivSimple<?> addTo)
    {
        WaButton closeButton = new WaButton("Close");
        addAttribute("data-drawer", "close");
        addTo.add(closeButton);
        return closeButton;
    }


    public WaDrawer withInitialFocusOn(IComponentHierarchyBase<?, ?> component)
    {
        component.asAttributeBase().addAttribute("autofocus", "");
        return this;
    }

}
