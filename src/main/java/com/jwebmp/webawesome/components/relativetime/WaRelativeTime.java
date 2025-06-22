package com.jwebmp.webawesome.components.relativetime;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaRelativeTime component displays a localized phrase indicating the relative time from a given date to now.
 * It supports automatic updates, multiple formatting styles, and localization.
 * <p>
 * This component renders as a wa-relative-time HTML element and supports various customization options
 * through properties and attributes.
 */
@Getter
@Setter
@NgImportReference(value = "WaRelativeTimeDirective", reference = "angular-awesome")
@NgImportModule("WaRelativeTimeDirective")
public class WaRelativeTime<J extends WaRelativeTime<J>> extends DivSimple<J>
{
    /**
     * When true, updates the output automatically as time passes
     */
    private Boolean sync;

    /**
     * The date to display relative to now (ISO 8601 string or Date object)
     */
    private String date;

    /**
     * Format of the relative time display ('long', 'short', 'narrow')
     */
    private String format;

    /**
     * Controls how precise the phrase is ('auto' for words like "yesterday", 'always' for "1 day ago")
     */
    private String numeric;

    /**
     * Locale used for formatting (e.g., 'en-US', 'de', 'zh-CN')
     */
    private String lang;

    /**
     * Display style for layout control
     */
    private String display;

    public WaRelativeTime()
    {
        setTag("wa-relative-time");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (sync != null && sync)
            {
                addAttribute("sync", "");
            }
            if (!Strings.isNullOrEmpty(date))
            {
                addAttribute("date", date);
            }
            if (!Strings.isNullOrEmpty(format))
            {
                addAttribute("format", format);
            }
            if (!Strings.isNullOrEmpty(numeric))
            {
                addAttribute("numeric", numeric);
            }
            if (!Strings.isNullOrEmpty(lang))
            {
                addAttribute("lang", lang);
            }
            if (!Strings.isNullOrEmpty(display))
            {
                addStyle("--display", display);
            }
        }
        super.init();
    }

    @Override
    public J bind(String variableName)
    {
        addAttribute("[attrs.date]", variableName);
        return (J) this;
    }

    /**
     * Binds the format attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindFormat(String variableName)
    {
        addAttribute("[attrs.format]", variableName);
        return (J) this;
    }

    /**
     * Binds the numeric attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindNumeric(String variableName)
    {
        addAttribute("[attrs.numeric]", variableName);
        return (J) this;
    }

    /**
     * Binds the lang attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindLang(String variableName)
    {
        addAttribute("[attrs.lang]", variableName);
        return (J) this;
    }

    /**
     * Binds the sync attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindSync(String variableName)
    {
        addAttribute("[attrs.sync]", variableName);
        return (J) this;
    }

    /**
     * Binds the display style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindDisplay(String variableName)
    {
        addAttribute("[display]", variableName);
        return (J) this;
    }

}
