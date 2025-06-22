package com.jwebmp.webawesome.components.skeleton;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaSkeleton component is used to create loading placeholders or "skeletons" for content that is still loading.
 * It supports different animation effects and custom styling options.
 * <p>
 * This component renders as a wa-skeleton HTML element and supports various customization options
 * through properties and CSS custom properties.
 */
@Getter
@Setter
@NgImportReference(value = "WaSkeletonDirective", reference = "angular-awesome")
@NgImportModule("WaSkeletonDirective")
public class WaSkeleton<J extends WaSkeleton<J>> extends DivSimple<J>
{
    /**
     * Animation effect (none, sheen, pulse)
     */
    private SkeletonEffect effect;

    /**
     * Base color of the skeleton
     */
    private String colour;

    /**
     * Color of the sheen animation effect
     */
    private String sheenColour;

    /**
     * Border radius of the skeleton
     */
    private String borderRadius;

    /**
     * Creates a new WaSkeleton with the tag "wa-skeleton"
     */
    public WaSkeleton()
    {
        setTag("wa-skeleton");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (effect != null)
            {
                addAttribute("effect", effect.toString());
            }
            if (!Strings.isNullOrEmpty(colour))
            {
                addStyle("--color", colour);
            }
            if (!Strings.isNullOrEmpty(sheenColour))
            {
                addStyle("--sheen-color", sheenColour);
            }
            if (!Strings.isNullOrEmpty(borderRadius))
            {
                addStyle("--border-radius", borderRadius);
            }
        }
        super.init();
    }

    /**
     * Binds the effect attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindEffect(String variableName)
    {
        addAttribute("[attrs.effect]", variableName);
        return (J) this;
    }

    /**
     * Binds the color style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindColour(String variableName)
    {
        addAttribute("[style.--color]", variableName);
        return (J) this;
    }

    /**
     * Binds the sheen color style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindSheenColour(String variableName)
    {
        addAttribute("[style.--sheen-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the border radius style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindBorderRadius(String variableName)
    {
        addAttribute("[style.--border-radius]", variableName);
        return (J) this;
    }
}
