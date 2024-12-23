package com.jwebmp.webawesome.components.dialog;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.button.WaButton;
import com.jwebmp.webawesome.components.icon.WaIconButton;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WaDialog extends DivSimple<WaDialog>
{
    private String label;
    private Boolean dialogDismiss;
    private Boolean overlayDismiss;
    private Boolean scrolling;
    private Boolean dialogHeaderDenyClose;

    public WaDialog()
    {
        setTag("wa-dialog");
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
                addAttribute("dialog-dismiss", "");
                addClass("dialog-dismiss");
            }
            if (scrolling != null && scrolling)
            {
                addAttribute("scrolling", "");
                addClass("dialog-scrolling");
            }
            if (overlayDismiss != null && overlayDismiss)
            {
                addAttribute("light-dismiss", "");
            }
            if (dialogHeaderDenyClose != null && dialogHeaderDenyClose)
            {
                addAttribute("dialog-deny-close", "");
            }
        }
        super.init();
    }

    public WaDialog withHeader(DivSimple<?> header)
    {
        header.addAttribute("slot", "header");
        addAttribute("with-header", "");
        addClass("dialog-header");
        add(header);
        return this;
    }

    public WaDialog withHeaderActions(List<WaIconButton> iconButtons)
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

    public WaDialog withFooter(DivSimple<?> footer)
    {
        footer.addAttribute("slot", "footer");
        addAttribute("with-footer", "");
        addClass("dialog-footer");
        add(footer);
        return this;
    }

    public WaButton withCloseButton(DivSimple<?> addTo)
    {
        WaButton closeButton = new WaButton("Close");
        addAttribute("data-dialog", "close");
        addTo.add(closeButton);
        return closeButton;
    }

    public WaDialog withInitialFocusOn(IComponentHierarchyBase<?, ?> component)
    {
        component.asAttributeBase().addAttribute("autofocus", "");
        return this;
    }
    
}
