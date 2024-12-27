package com.jwebmp.webawesome.components.tree;

import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaTree extends DivSimple<WaTree>
{
    private TreeSelectionMode selectionMode;

    private String identGuideWidth;
    private String identGuideColour;
    private String identGuideStyle;
    private String identGuideOffset;

    public WaTree()
    {
        setTag("wa-tree");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (selectionMode != null)
            {
                addAttribute("selection-mode", selectionMode.toString().toLowerCase());
            }
            if (identGuideWidth != null)
            {
                addStyle("--ident-guide-width", identGuideWidth);
            }
            if (identGuideColour != null)
            {
                addStyle("--ident-guide-color", identGuideColour);
            }
            if (identGuideStyle != null)
            {
                addStyle("--ident-guide-style", identGuideStyle);
            }
            if (identGuideOffset != null)
            {
                addStyle("--ident-guide-offset", identGuideOffset);
            }
        }
        super.init();
    }
}
