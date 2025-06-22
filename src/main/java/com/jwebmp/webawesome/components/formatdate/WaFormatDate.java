package com.jwebmp.webawesome.components.formatdate;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * The WaFormatDate component formats a date/time value according to various formatting options.
 * It supports localization, time zones, and different formats for date/time components.
 */
@Getter
@Setter
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