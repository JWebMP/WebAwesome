package com.jwebmp.webawesome.test.select;

import com.jwebmp.webawesome.components.select.SelectAppearance;
import com.jwebmp.webawesome.components.select.SelectPlacement;
import com.jwebmp.webawesome.components.select.WaSelect;
import com.jwebmp.webawesome.components.select.WaSelectOption;
import com.jwebmp.webawesome.components.Size;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaSelectTest
{
    @Test
    public void testRenderBasicSelectHtml()
    {
        var s = new WaSelect<>()
                .setLabel("Choose an option")
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .add(new WaSelectOption<>().setValue("option2").setText("Option 2"))
                .add(new WaSelectOption<>().setValue("option3").setText("Option 3"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Choose an option\""));
        assertTrue(s.contains("<wa-option value=\"option1\">"));
        assertTrue(s.contains("<wa-option value=\"option2\">"));
        assertTrue(s.contains("<wa-option value=\"option3\">"));
    }

    @Test
    public void testRenderSelectWithAppearanceHtml()
    {
        // Outlined appearance (default)
        var s1 = new WaSelect<>()
                .setLabel("Outlined Select")
                .setAppearance(SelectAppearance.Outlined)
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("appearance=\"outlined\""));

        // Filled appearance
        var s2 = new WaSelect<>()
                .setLabel("Filled Select")
                .setAppearance(SelectAppearance.Filled)
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("appearance=\"filled\""));

        // Pill appearance
        var s3 = new WaSelect<>()
                .setLabel("Pill Select")
                .setPill(true)
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .toString(true);
        System.out.println(s3);

        assertTrue(s3.contains("pill"));
    }

    @Test
    public void testRenderSelectWithSizeHtml()
    {
        // Small size
        var s1 = new WaSelect<>()
                .setLabel("Small Select")
                .setSize(Size.Small)
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("size=\"small\""));

        // Medium size
        var s2 = new WaSelect<>()
                .setLabel("Medium Select")
                .setSize(Size.Medium)
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("size=\"medium\""));

        // Large size
        var s3 = new WaSelect<>()
                .setLabel("Large Select")
                .setSize(Size.Large)
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .toString(true);
        System.out.println(s3);

        assertTrue(s3.contains("size=\"large\""));
    }

    @Test
    public void testRenderSelectWithPlaceholderAndHintHtml()
    {
        var s = new WaSelect<>()
                .setLabel("Choose an option")
                .setPlaceholder("Select an option")
                .setHint("This is a helpful hint")
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Choose an option\""));
        assertTrue(s.contains("placeholder=\"Select an option\""));
        assertTrue(s.contains("hint=\"This is a helpful hint\""));
    }

    @Test
    public void testRenderClearableSelectHtml()
    {
        var s = new WaSelect<>()
                .setLabel("Clearable Select")
                .setClearable(true)
                .setPlaceholder("Select an option")
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("clearable"));
    }

    @Test
    public void testRenderMultipleSelectHtml()
    {
        var s = new WaSelect<>()
                .setLabel("Multiple Select")
                .setMultiple(true)
                .setPlaceholder("Select multiple options")
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .add(new WaSelectOption<>().setValue("option2").setText("Option 2"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("multiple"));

        // With max visible options
        var s2 = new WaSelect<>()
                .setLabel("Multiple Select with Max Visible")
                .setMultiple(true)
                .setMaxOptionsVisible(2)
                .setPlaceholder("Select multiple options")
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .add(new WaSelectOption<>().setValue("option2").setText("Option 2"))
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("max-options-visible=\"2\""));
    }

    @Test
    public void testRenderSelectWithPlacementHtml()
    {
        // Top placement
        var s1 = new WaSelect<>()
                .setLabel("Dropdown on Top")
                .setPlacement(SelectPlacement.Top)
                .setPlaceholder("Select an option")
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("placement=\"top\""));

        // Bottom placement
        var s2 = new WaSelect<>()
                .setLabel("Dropdown on Bottom")
                .setPlacement(SelectPlacement.Bottom)
                .setPlaceholder("Select an option")
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("placement=\"bottom\""));
    }

    @Test
    public void testRenderDisabledSelectHtml()
    {
        // Disabled select
        var s1 = new WaSelect<>()
                .setLabel("Disabled Select")
                .setDisabled(true)
                .setValue("option1")
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .toString(true);
        System.out.println(s1);

        assertTrue(s1.contains("disabled"));

        // Individual disabled options
        var s2 = new WaSelect<>()
                .setLabel("Select with Disabled Options")
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .add(new WaSelectOption<>().setValue("option2").setText("Option 2").setDisabled(true))
                .add(new WaSelectOption<>().setValue("option3").setText("Option 3"))
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("value=\"option2\""));
        assertTrue(s2.contains("disabled"));
    }

    @Test
    public void testRenderRequiredSelectHtml()
    {
        var s = new WaSelect<>()
                .setLabel("Required Select")
                .setRequired(true)
                .setPlaceholder("Select an option")
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("required"));
    }

    @Test
    public void testRenderSelectWithCustomStylingHtml()
    {
        var s = new WaSelect<>()
                .setLabel("Custom Styled Select")
                .setBackgroundColor("#f8f9fa")
                .setBorderColor("#6c757d")
                .setBorderWidth("2px")
                .setBoxShadow("0 2px 4px rgba(0,0,0,0.1)")
                .add(new WaSelectOption<>().setValue("option1").setText("Option 1"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("style="));
        assertTrue(s.contains("--background-color:#f8f9fa"));
        assertTrue(s.contains("--border-color:#6c757d"));
        assertTrue(s.contains("--border-width:2px"));
        assertTrue(s.contains("--box-shadow:0 2px 4px rgba(0,0,0,0.1)"));

        // Option styling
        var s2 = new WaSelect<>()
                .setLabel("Custom Styled Options")
                .add(new WaSelectOption<>()
                        .setValue("option1")
                        .setText("Option with Custom Hover")
                        .setBackgroundColourHover("#e9ecef")
                        .setTextColourHover("#007bff"))
                .add(new WaSelectOption<>()
                        .setValue("option2")
                        .setText("Option with Custom Selection")
                        .setBackgroundColourCurrent("#cfe2ff")
                        .setTextColourCurrent("#0d6efd"))
                .toString(true);
        System.out.println(s2);

        assertTrue(s2.contains("--background-color-hover:#e9ecef"));
        assertTrue(s2.contains("--text-color-hover:#007bff"));
        assertTrue(s2.contains("--background-color-current:#cfe2ff"));
        assertTrue(s2.contains("--text-color-current:#0d6efd"));
    }
}
