package com.jwebmp.webawesome.components.select;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaSelect extends DivSimple<WaSelect>
{
    private String hint;
    private String label;
    private String placeholder;
    private Boolean clearable;

    private SelectAppearance appearance;
    private Boolean pill;
    private Boolean disabled;
    private Boolean multiple;

    private Size size;
    private SelectPlacement placement;

    private IComponentHierarchyBase<?, ?> prefix;
    private IComponentHierarchyBase<?, ?> suffix;

    /**
     * A space delimited list of values to set as the selected options.
     */
    private String value;

    public WaSelect()
    {
        setTag("wa-select");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(hint))
            {
                addAttribute("hint", hint);
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (!Strings.isNullOrEmpty(placeholder))
            {
                addAttribute("placeholder", placeholder);
            }
            if (clearable != null)
            {
                addAttribute("clearable", "");
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString().toLowerCase());
            }
            if (pill != null)
            {
                addAttribute("pill", "");
            }
            if (disabled != null)
            {
                addAttribute("disabled", "");
            }
            if (multiple != null)
            {
                addAttribute("multiple", "");
            }
            if (size != null)
            {
                addAttribute("size", size.toString().toLowerCase());
            }
            if (placement != null)
            {
                addAttribute("placement", placement.toString().toLowerCase());
            }

            if (prefix != null)
            {
                prefix.asAttributeBase().addAttribute("slot", "prefix");
                add(0, prefix);
            }
            if (suffix != null)
            {
                suffix.asAttributeBase().addAttribute("slot", "suffix");
                add(suffix);
            }

        }
        super.init();
    }

    @Override
    public WaSelect bind(String variableName)
    {
        addAttribute("[attrs.value]", variableName);
        return this;
    }
    
}
