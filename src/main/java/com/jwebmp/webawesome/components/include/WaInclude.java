package com.jwebmp.webawesome.components.include;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaInclude component allows embedding external HTML content into the page.
 * It supports different CORS modes and can optionally allow scripts to execute in the included content.
 * Content is fetched and inserted asynchronously via fetch().
 */
@Getter
@Setter
@NgImportReference(value = "WaIncludeDirective", reference = "angular-awesome")
@NgImportModule("WaIncludeDirective")
public class WaInclude<J extends WaInclude<J>> extends DivSimple<J>
{
    /**
     * The URL to fetch content from. Required.
     */
    private String src;

    /**
     * The CORS mode to use when fetching the content.
     * Valid values: 'cors', 'no-cors', 'same-origin'
     * Defaults to 'cors'.
     */
    private CorsMode mode;

    /**
     * Whether to allow embedded scripts to execute.
     * Default is false.
     * Be cautious with this setting as it can lead to XSS vulnerabilities.
     */
    private Boolean allowScripts;

    /**
     * Creates a new WaInclude component.
     */
    public WaInclude()
    {
        setTag("wa-include");
    }

    /**
     * Creates a new WaInclude component with the specified source URL.
     *
     * @param src The URL to fetch content from
     */
    public WaInclude(String src)
    {
        this();
        this.src = src;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(src))
            {
                addAttribute("src", src);
            }
            if (mode != null)
            {
                addAttribute("mode", mode.toString());
            }
            if (allowScripts != null && allowScripts)
            {
                addAttribute("allow-scripts", "");
            }
        }
        super.init();
    }
}
