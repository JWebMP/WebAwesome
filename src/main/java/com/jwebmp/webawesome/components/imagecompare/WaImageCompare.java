package com.jwebmp.webawesome.components.imagecompare;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
/**
 * Minimal wrapper for the <wa-image-compare> component referenced in docs.
 * This mirrors wa-comparison semantics but uses the legacy/pluralized tag where applicable.
 *
 * Slots:
 * - default before/after content via explicit setters (projected with slot attributes)
 * - handle: optional custom handle content
 *
 * Props:
 * - position: number from 0 to 100 indicating divider position
 * - disabled: boolean flag to disable interaction
 */
@Getter
@NgImportReference(value = "WaImageCompareComponent", reference = "angular-awesome")
@NgImportModule("WaImageCompareComponent")
public class WaImageCompare<J extends WaImageCompare<J>> extends DivSimple<J>
{
    private String position;
    private Boolean disabled;

    private IComponentHierarchyBase<?, ?> before;
    private IComponentHierarchyBase<?, ?> after;
    private IComponentHierarchyBase<?, ?> handle;
    @SuppressWarnings("unchecked")
    public J setPosition(String position)
    {
        this.position = position;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBefore(IComponentHierarchyBase<?, ?> before)
    {
        this.before = before;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAfter(IComponentHierarchyBase<?, ?> after)
    {
        this.after = after;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setHandle(IComponentHierarchyBase<?, ?> handle)
    {
        this.handle = handle;
        return (J) this;
    }
    public WaImageCompare()
    {
        setTag("wa-image-compare");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (position != null)
            {
                addAttribute("position", position);
            }
            if (Boolean.TRUE.equals(disabled))
            {
                addAttribute("disabled", "");
            }
            if (before != null)
            {
                before.asAttributeBase().addAttribute("slot", "before");
                add(before);
            }
            if (after != null)
            {
                after.asAttributeBase().addAttribute("slot", "after");
                add(after);
            }
            if (handle != null)
            {
                handle.asAttributeBase().addAttribute("slot", "handle");
                add(handle);
            }
        }
        super.init();
    }

    // Binding helpers
    @SuppressWarnings("unchecked")
    public J bindPosition(String variable)
    {
        addAttribute("[position]", variable);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindDisabled(String variable)
    {
        addAttribute("[disabled]", variable);
        return (J) this;
    }
}