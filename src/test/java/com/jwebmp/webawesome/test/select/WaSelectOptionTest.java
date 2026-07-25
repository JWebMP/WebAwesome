package com.jwebmp.webawesome.test.select;

import com.jwebmp.webawesome.components.select.WaSelectOption;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaSelectOptionTest
{
    @Test
    public void testRenderBasicOptionHtml()
    {
        var s = new WaSelectOption<>()
                .setValue("option1")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-option value=\"option1\"></wa-option>", s);
    }

    @Test
    public void testRenderOptionWithCurrentTextColorHtml()
    {
        var s = new WaSelectOption<>()
                .setValue("option1")
                .setCurrentTextColor("#0066cc")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-option style=\"--current-text-color:#0066cc;\" value=\"option1\"></wa-option>", s);
        assertTrue(s.contains("--current-text-color:#0066cc;"));
    }

    @Test
    public void testCurrentTextColorOmittedWhenUnset()
    {
        var s = new WaSelectOption<>()
                .setValue("option1")
                .toString(true);
        System.out.println(s);

        assertFalse(s.contains("--current-text-color"));
    }

    @Test
    public void testCurrentTextColorWithOtherCssVariablesHtml()
    {
        var s = new WaSelectOption<>()
                .setValue("option1")
                .setTextColorCurrent("#111111")
                .setCurrentTextColor("#0066cc")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("--text-color-current:#111111;"));
        assertTrue(s.contains("--current-text-color:#0066cc;"));
    }
}
