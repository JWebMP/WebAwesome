package com.jwebmp.webawesome.components;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

@SuppressWarnings("unchecked")
public interface VariantCapable<J extends IComponentHierarchyBase<?, J> & VariantCapable<J>>
{
    default J setSuccess()
    {
        J me = (J) this;
        me.asAttributeBase()
          .addAttribute("variant", "wa-success");
        return me;
    }

    default J setBrand()
    {
        J me = (J) this;
        me.asAttributeBase()
          .addAttribute("variant", "wa-brand");
        return me;
    }

    default J setNeutral()
    {
        J me = (J) this;
        me.asAttributeBase()
          .addAttribute("variant", "wa-neutral");
        return me;
    }

    default J setWarning()
    {
        J me = (J) this;
        me.asAttributeBase()
          .addAttribute("variant", "wa-warning");
        return me;
    }

    default J setDanger()
    {
        J me = (J) this;
        me.asAttributeBase()
          .addAttribute("variant", "wa-danger");
        return me;
    }

}
