package com.jwebmp.webawesome.components.formatdate;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import java.util.Date;

/**
 * The WaFormatDate component formats a date/time value according to various formatting options.
 * It supports localization, time zones, and different formats for date/time components.
 */
@Getter
@NgImportReference(value = "WaFormatDateDirective", reference = "angular-awesome")
@NgImportModule("WaFormatDateDirective")
public class WaFormatDate<J extends WaFormatDate<J>> extends DivSimple<J>
{
    /**
     * Date/time to format. Accepts ISO 8601 or a JS Date object.
     */
    private Object date;

    /**
     * Format of the weekday. Valid values: 'narrow', 'short', 'long'
     */
    private String weekday;

    /**
     * Format of the era. Valid values: 'narrow', 'short', 'long'
     */
    private String era;

    /**
     * Format of the year. Valid values: 'numeric', '2-digit'
     */
    private String year;

    /**
     * Format of the month. Valid values: 'numeric', '2-digit', 'narrow', 'short', 'long'
     */
    private String month;

    /**
     * Format of the day. Valid values: 'numeric', '2-digit'
     */
    private String day;

    /**
     * Format of the hour. Valid values: 'numeric', '2-digit'
     */
    private String hour;

    /**
     * Format of the minute. Valid values: 'numeric', '2-digit'
     */
    private String minute;

    /**
     * Format of the second. Valid values: 'numeric', '2-digit'
     */
    private String second;

    /**
     * Format for the time zone name. Valid values: 'short', 'long'
     */
    private String timeZoneName;

    /**
     * IANA time zone name (e.g. "America/New_York").
     */
    private String timeZone;

    /**
     * Enforces 12- or 24-hour format or lets the browser decide. Default: 'auto'.
     * Valid values: 'auto', '12', '24'
     */
    private String hourFormat;

    /**
     * Sets the locale for formatting (e.g. "en", "fr").
     */
    private String lang;

    /**
     * Text color of the formatted date.
     */
    private String color;

    /**
     * Font size of the formatted date.
     */
    private String fontSize;

    /**
     * Font weight of the formatted date.
     */
    private String fontWeight;

    /**
     * Background color of the formatted date.
     */
    private String backgroundColor;

    /**
     * Padding around the formatted date.
     */
    private String padding;

    /**
     * Margin around the formatted date.
     */
    private String margin;

    /**
     * Display property of the formatted date.
     */
    private String display;
    @SuppressWarnings("unchecked")
    public J setDate(Object date)
    {
        this.date = date;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWeekday(String weekday)
    {
        this.weekday = weekday;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setEra(String era)
    {
        this.era = era;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setYear(String year)
    {
        this.year = year;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setMonth(String month)
    {
        this.month = month;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDay(String day)
    {
        this.day = day;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setHour(String hour)
    {
        this.hour = hour;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setMinute(String minute)
    {
        this.minute = minute;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSecond(String second)
    {
        this.second = second;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setTimeZoneName(String timeZoneName)
    {
        this.timeZoneName = timeZoneName;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setTimeZone(String timeZone)
    {
        this.timeZone = timeZone;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setHourFormat(String hourFormat)
    {
        this.hourFormat = hourFormat;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setLang(String lang)
    {
        this.lang = lang;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setColor(String color)
    {
        this.color = color;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFontSize(String fontSize)
    {
        this.fontSize = fontSize;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFontWeight(String fontWeight)
    {
        this.fontWeight = fontWeight;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBackgroundColor(String backgroundColor)
    {
        this.backgroundColor = backgroundColor;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setPadding(String padding)
    {
        this.padding = padding;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setMargin(String margin)
    {
        this.margin = margin;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDisplay(String display)
    {
        this.display = display;
        return (J) this;
    }
    public WaFormatDate()
    {
        setTag("wa-format-date");
    }

    /**
     * Creates a new WaFormatDate component with the specified date.
     *
     * @param date The date to format
     */
    public WaFormatDate(Date date)
    {
        this();
        this.date = date;
    }

    /**
     * Creates a new WaFormatDate component with the specified date string.
     *
     * @param dateString The date string to format (ISO 8601 format recommended)
     */
    public WaFormatDate(String dateString)
    {
        this();
        this.date = dateString;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (date != null)
            {
                if (date instanceof Date)
                {
                    addAttribute("date", ((Date) date).toInstant()
                                                      .toString());
                }
                else
                {
                    addAttribute("date", date.toString());
                }
            }
            if (!Strings.isNullOrEmpty(weekday))
            {
                addAttribute("weekday", weekday);
            }
            if (!Strings.isNullOrEmpty(era))
            {
                addAttribute("era", era);
            }
            if (!Strings.isNullOrEmpty(year))
            {
                addAttribute("year", year);
            }
            if (!Strings.isNullOrEmpty(month))
            {
                addAttribute("month", month);
            }
            if (!Strings.isNullOrEmpty(day))
            {
                addAttribute("day", day);
            }
            if (!Strings.isNullOrEmpty(hour))
            {
                addAttribute("hour", hour);
            }
            if (!Strings.isNullOrEmpty(minute))
            {
                addAttribute("minute", minute);
            }
            if (!Strings.isNullOrEmpty(second))
            {
                addAttribute("second", second);
            }
            if (!Strings.isNullOrEmpty(timeZoneName))
            {
                addAttribute("time-zone-name", timeZoneName);
            }
            if (!Strings.isNullOrEmpty(timeZone))
            {
                addAttribute("time-zone", timeZone);
            }
            if (!Strings.isNullOrEmpty(hourFormat))
            {
                addAttribute("hour-format", hourFormat);
            }
            if (!Strings.isNullOrEmpty(lang))
            {
                addAttribute("lang", lang);
            }

            // Apply styling
            if (!Strings.isNullOrEmpty(color))
            {
                addStyle("color", color);
            }
            if (!Strings.isNullOrEmpty(fontSize))
            {
                addStyle("font-size", fontSize);
            }
            if (!Strings.isNullOrEmpty(fontWeight))
            {
                addStyle("font-weight", fontWeight);
            }
            if (!Strings.isNullOrEmpty(backgroundColor))
            {
                addStyle("background-color", backgroundColor);
            }
            if (!Strings.isNullOrEmpty(padding))
            {
                addStyle("padding", padding);
            }
            if (!Strings.isNullOrEmpty(margin))
            {
                addStyle("margin", margin);
            }
            if (!Strings.isNullOrEmpty(display))
            {
                addStyle("display", display);
            }
        }
        super.init();
    }
}