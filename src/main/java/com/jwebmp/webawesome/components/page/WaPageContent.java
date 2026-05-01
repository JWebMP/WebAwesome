package com.jwebmp.webawesome.components.page;


import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.H2;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jspecify.annotations.NonNull;

@Getter
public class WaPageContent<J extends WaPageContent<J>> extends DivSimple<J> implements SpaceTokenCapable<J>
{
    private IComponentHierarchyBase<?, ?> id;
    private IComponentHierarchyBase<?, ?> component;

    public WaPageContent(IComponentHierarchyBase<?, ?> id, IComponentHierarchyBase<?, ?> component)
    {
        this.id = id;
        this.component = component;
        if (this.id != null)
        {
            add(this.id);
        }
        add(component);
    }

    public WaPageContent(String id, IComponentHierarchyBase<?, ?> component)
    {
        if (id != null)
        {
            this.id = new H2<>().setID(id);
            add(this.id);
        }
        this.component = component;
        add(component);
    }

    @Override
    protected StringBuilder renderHTML(int tabCount)
    {
        setCurrentTabIndents(tabCount - 1);
        return super.renderChildren();
    }

    public J setId(IComponentHierarchyBase<?, ?> id) {
        this.id = id;
        return (J)this;
    }

    @Override
    public J setComponent(IComponentHierarchyBase<?, ?> component) {
        this.component = component;
        return (J) this;
    }
}
