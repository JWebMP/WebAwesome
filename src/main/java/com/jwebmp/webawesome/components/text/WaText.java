package com.jwebmp.webawesome.components.text;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * Wrapper for the WebAwesome text directive (waText) and related attributes.
 * This is a lightweight helper that renders the waText attribute and exposes
 * convenience setters for the directive's options, allowing it to be applied
 * to any tag by changing this component's tag (e.g., p, h1..h6, a, div, ul).
 *
 * Examples:
 * - new WaText().setTag("p").setWaBody("s").setText("Five boxing wizards");
 * - new WaText().setTag("h3").setWaHeading("m").setText("Heading");
 * - new WaText().setTag("a").setWaLink(true).addAttribute("href","#").setText("Link");
 */
@Getter
@Setter
@NgImportReference(value = "WaTextDirective", reference = "angular-awesome")
@NgImportModule("WaTextDirective")
public class WaText<J extends WaText<J>> extends DivSimple<J>
{
    // Presence of the directive
    private boolean waText = true;

    // Size presets (string variant or boolean flag)
    private String waBody;          // e.g., "s", "m", "l", "xl", etc.
    private Boolean waBodyFlag;     // when true, renders waBody as a boolean attribute

    private String waHeading;       // e.g., "m", "2xl"
    private Boolean waHeadingFlag;

    private String waCaption;       // e.g., "xs", "l"
    private Boolean waCaptionFlag;

    private String waLongform;      // e.g., "m"
    private Boolean waLongformFlag;

    // Link style: can be boolean or a string like "plain"
    private String waLink;
    private Boolean waLinkFlag;

    // List and form control helpers
    private Boolean waListPlain;            // boolean flag
    private String waFormControlText;       // "label" | "value" | "placeholder" | "hint"

    // Typographic utilities
    private String waFontSize;              // e.g., "xs", "wa-font-size-2xl"
    private String waFontWeight;            // e.g., "light", "semibold"
    private String waColorText;             // e.g., "quiet", "link"

    // Truncation helper (boolean)
    private Boolean waTextTruncate;

    public WaText()
    {
        // Default tag is <div>. Tests can change the tag with setTag("p"), etc.
        // No extra initialization required.
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (waText)
            {
                addAttribute("waText", "");
            }

            // Body
            if (!Strings.isNullOrEmpty(waBody))
            {
                addAttribute("waBody", waBody);
            }
            else if (Boolean.TRUE.equals(waBodyFlag))
            {
                addAttribute("waBody", "");
            }

            // Heading
            if (!Strings.isNullOrEmpty(waHeading))
            {
                addAttribute("waHeading", waHeading);
            }
            else if (Boolean.TRUE.equals(waHeadingFlag))
            {
                addAttribute("waHeading", "");
            }

            // Caption
            if (!Strings.isNullOrEmpty(waCaption))
            {
                addAttribute("waCaption", waCaption);
            }
            else if (Boolean.TRUE.equals(waCaptionFlag))
            {
                addAttribute("waCaption", "");
            }

            // Longform
            if (!Strings.isNullOrEmpty(waLongform))
            {
                addAttribute("waLongform", waLongform);
            }
            else if (Boolean.TRUE.equals(waLongformFlag))
            {
                addAttribute("waLongform", "");
            }

            // Link
            if (!Strings.isNullOrEmpty(waLink))
            {
                addAttribute("waLink", waLink);
            }
            else if (Boolean.TRUE.equals(waLinkFlag))
            {
                addAttribute("waLink", "");
            }

            // List plain
            if (Boolean.TRUE.equals(waListPlain))
            {
                addAttribute("waListPlain", "");
            }

            // Form control text
            if (!Strings.isNullOrEmpty(waFormControlText))
            {
                addAttribute("waFormControlText", waFormControlText);
            }

            // Font helpers
            if (!Strings.isNullOrEmpty(waFontSize))
            {
                addAttribute("waFontSize", waFontSize);
            }
            if (!Strings.isNullOrEmpty(waFontWeight))
            {
                addAttribute("waFontWeight", waFontWeight);
            }
            if (!Strings.isNullOrEmpty(waColorText))
            {
                addAttribute("waColorText", waColorText);
            }

            // Truncate
            if (Boolean.TRUE.equals(waTextTruncate))
            {
                addAttribute("waTextTruncate", "");
            }
        }
        super.init();
    }

    // Convenience boolean setters for fluent API
    public @org.jspecify.annotations.NonNull J setWaBodyFlag(boolean flag) { this.waBodyFlag = flag; return (J) this; }
    public @org.jspecify.annotations.NonNull J setWaHeadingFlag(boolean flag) { this.waHeadingFlag = flag; return (J) this; }
    public @org.jspecify.annotations.NonNull J setWaCaptionFlag(boolean flag) { this.waCaptionFlag = flag; return (J) this; }
    public @org.jspecify.annotations.NonNull J setWaLongformFlag(boolean flag) { this.waLongformFlag = flag; return (J) this; }
    public @org.jspecify.annotations.NonNull J setWaLinkFlag(boolean flag) { this.waLinkFlag = flag; return (J) this; }
}