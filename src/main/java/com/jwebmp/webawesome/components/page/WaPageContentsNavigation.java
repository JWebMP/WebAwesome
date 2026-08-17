package com.jwebmp.webawesome.components.page;


import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgComponentReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

public class WaPageContentsNavigation<J extends WaPageContentsNavigation<J>> extends DivSimple<J> implements SpaceTokenCapable<J>
{

    public WaPageContentsNavigation()
    {
        setTag("nav");
        addAttribute("slot", "navigation");
    }

    @SuppressWarnings("unchecked")
    public J addNavAnchor(String id, String text)
    {
        Link<?> aLink = new Link<>();
        aLink.setTag("a");
        aLink.addAttribute("href", (Strings.nullToEmpty(id).startsWith("#") ? "" : "#") + id);
        aLink.setText(text);
        add(aLink);
        return (J) this;
    }

}