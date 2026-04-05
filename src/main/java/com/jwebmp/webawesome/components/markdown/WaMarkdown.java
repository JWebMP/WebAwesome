package com.jwebmp.webawesome.components.markdown;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaMarkdown component wraps the {@code <wa-markdown>} web component,
 * rendering Markdown content as HTML.
 * <p>
 * Attributes:
 * <ul>
 *   <li><b>tabSize</b>: Tab size for code blocks.</li>
 * </ul>
 * <p>
 * Methods (client-side):
 * <ul>
 *   <li>{@code getMarked()} — Returns the internal Marked instance.</li>
 *   <li>{@code updateAll()} — Re-renders all markdown content.</li>
 *   <li>{@code renderMarkdown(markdown)} — Renders a markdown string to HTML.</li>
 * </ul>
 */
@Getter
@Setter
@NgImportReference(value = "WaMarkdownDirective", reference = "angular-awesome")
@NgImportModule("WaMarkdownDirective")
public class WaMarkdown<J extends WaMarkdown<J>> extends DivSimple<J>
{
    /**
     * Tab size for code blocks
     */
    private Integer tabSize;

    /**
     * Creates a new WaMarkdown component.
     */
    public WaMarkdown()
    {
        setTag("wa-markdown");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (tabSize != null)
            {
                addAttribute("tab-size", tabSize.toString());
            }
        }
        super.init();
    }
}
