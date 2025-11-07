package com.jwebmp.webawesome.components.tag;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.VariantCapable;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.Variant;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaTag component represents a compact visual indicator typically used for labeling,
 * categorizing, or indicating selection status.
 * <p>
 * This component renders as a wa-tag HTML element and supports various customization options
 * through properties like variant, appearance, size, pill, and removable.
 */
@Getter
@Setter
@NgImportReference(value = "WaTagDirective", reference = "angular-awesome")
@NgImportModule("WaTagDirective")
public class WaTag<J extends WaTag<J>> extends DivSimple<J> implements VariantCapable<J>
{
    /**
     * The theme of the tag (brand, neutral, success, warning, danger, inherit)
     */
    private Variant variant;

    /**
     * The visual style of the tag (accent, outlined accent, filled, outlined, outlined filled)
     */
    private TagAppearance appearance;

    /**
     * The size of the tag (small, medium, large, inherit)
     */
    private Size size;

    /**
     * Whether the tag has a pill (rounded) appearance
     */
    private Boolean pill;

    /**
     * Whether the tag has a remove button
     */
    private Boolean removable;

    /**
     * Creates a new WaTag with the tag "wa-tag"
     */
    public WaTag()
    {
        setTag("wa-tag");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (variant != null)
            {
                addAttribute("variant", variant.toString()
                                               .toLowerCase());
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString());
            }
            if (size != null)
            {
                addAttribute("size", size.toString()
                                         .toLowerCase());
            }
            if (pill != null && pill)
            {
                addAttribute("pill", "");
            }
            if (removable != null && removable)
            {
                addAttribute("removable", "");
            }
        }
        super.init();
    }

    /**
     * Binds the variant attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindVariant(String variableName)
    {
        addAttribute("[variant]", variableName);
        return (J) this;
    }

    /**
     * Binds the appearance attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindAppearance(String variableName)
    {
        addAttribute("[appearance]", variableName);
        return (J) this;
    }

    /**
     * Binds the size attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindSize(String variableName)
    {
        addAttribute("[size]", variableName);
        return (J) this;
    }

    /**
     * Binds the pill attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindPill(String variableName)
    {
        addAttribute("[pill]", variableName);
        return (J) this;
    }

    /**
     * Binds the removable attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindRemovable(String variableName)
    {
        addAttribute("[removable]", variableName);
        return (J) this;
    }

    /**
     * Adds a handler for the waRemove event
     *
     * @param handlerScript The JavaScript to execute when the remove button is clicked
     * @return This component
     */
    public J onRemove(String handlerScript)
    {
        addAttribute("(waRemove)", handlerScript);
        return (J) this;
    }
}
