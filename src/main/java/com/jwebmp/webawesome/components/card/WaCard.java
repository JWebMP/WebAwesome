package com.jwebmp.webawesome.components.card;

import com.jwebmp.core.base.html.*;

public class WaCard extends DivSimple<WaCard>
{
    public WaCard()
    {
        setTag("wa-card");
    }

    public WaCard withWidth(String width)
    {
        addStyle("width", width);
        return this;
    }

    public WaCard withImage(Image<?> image)
    {
        addAttribute("with-image", "");
        add(0, image);
        return this;
    }

    public WaCard withHeader(String header)
    {
        add(new Strong<>(header));
        return this;
    }


    public WaCard withText(String text)
    {
        add(new Paragraph<>(text).setTextOnly(true));
        return this;
    }


    public WaCard withSubText(String text)
    {
        add(new SmallText<>(text));
        return this;
    }

    public WaCard withHeader(DivSimple<?> header)
    {
        header.addAttribute("slot", "header");
        addAttribute("with-header", "");
        add(header);
        return this;
    }

    public WaCard withFooter(DivSimple<?> footer)
    {
        footer.addAttribute("slot", "footer");
        addAttribute("with-footer", "");
        add(footer);
        return this;
    }


}
