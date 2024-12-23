package com.jwebmp.webawesome.components.icon;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.interfaces.IIcon;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaIcon<J extends WaIcon<J>> extends DivSimple<J> implements IIcon<GlobalChildren, J>
{
    private String family;

    private String iconName;
    private String primaryColour;
    private Double primaryOpacity;
    private String secondaryColour;
    private Double secondaryOpacity;
    private String fontSize;
    private Boolean fixedWidth;

    private String label;
    private IconVariant iconVariant;


    public WaIcon()
    {
        setTag("wa-icon");
    }

    @Override
    public String getClassName()
    {
        return "";
    }

    @Override
    public IComponentHierarchyBase<?, ?> getIconComponent()
    {
        return new WaIcon();
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(family))
            {
                addAttribute("family", family);
            }
            if (!Strings.isNullOrEmpty(iconName))
            {
                addAttribute("name", iconName);
            }
            if (!Strings.isNullOrEmpty(primaryColour))
            {
                addStyle("--primary-colour", primaryColour);
            }
            if (primaryOpacity != null)
            {
                addStyle("--primary-opacity", primaryOpacity + "");
            }
            if (!Strings.isNullOrEmpty(secondaryColour))
            {
                addStyle("--secondary-colour", secondaryColour);
            }
            if (secondaryOpacity != null)
            {
                addStyle("--secondary-opacity", secondaryOpacity + "");
            }
            if (!Strings.isNullOrEmpty(fontSize))
            {
                addStyle("--font-size", fontSize);
            }
            if (fixedWidth != null)
            {
                addAttribute("fixed-width", "");
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (iconVariant != null)
            {
                addAttribute("variant", iconVariant.toString().toLowerCase());
            }
        }
        super.init();
    }
}
