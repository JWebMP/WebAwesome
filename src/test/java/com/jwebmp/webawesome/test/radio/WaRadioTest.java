package com.jwebmp.webawesome.test.radio;

import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.icon.WaIcon;
import com.jwebmp.webawesome.components.radio.WaRadio;
import com.jwebmp.webawesome.components.radio.WaRadioButton;
import com.jwebmp.webawesome.components.radio.WaRadioGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaRadioTest
{
    @Test
    public void testRenderBasicRadioHtml()
    {
        var radio = new WaRadio<>()
                .setValue("option1");

        var html = radio.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio"));
        assertTrue(html.contains("value=\"option1\""));
    }

    @Test
    public void testRenderDisabledRadioHtml()
    {
        var radio = new WaRadio<>()
                .setValue("option1")
                .setDisabled(true);

        var html = radio.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("disabled"));
    }

    @Test
    public void testRenderRadioWithSizeHtml()
    {
        var radio = new WaRadio<>()
                .setValue("option1")
                .setSize(Size.Large);

        var html = radio.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("size=\"large\""));
    }

    @Test
    public void testRenderRadioWithFormIdHtml()
    {
        var radio = new WaRadio<>()
                .setValue("option1")
                .setFormId("myForm");

        var html = radio.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("form=\"myForm\""));
    }

    @Test
    public void testRenderBasicRadioButtonHtml()
    {
        var radioButton = new WaRadioButton<>()
                .setValue("option1");
        radioButton.setText("Option 1");

        var html = radioButton.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio-button"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("Option 1"));
    }

    @Test
    public void testRenderRadioButtonWithPillHtml()
    {
        var radioButton = new WaRadioButton<>()
                .setValue("option1")
                .setText("Option 1")
                .setAsPill(true);

        var html = radioButton.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio-button"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("as-pill"));
        assertTrue(html.contains("Option 1"));
    }

    @Test
    public void testRenderRadioButtonWithPrefixAndSuffixHtml()
    {
        var prefix = new WaIcon<>().setName("check");
        var suffix = new WaIcon<>().setName("arrow-right");

        var radioButton = new WaRadioButton<>()
                .setValue("option1")
                .setText("Option 1")
                .setPrefix(prefix)
                .setSuffix(suffix);

        var html = radioButton.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio-button"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("<wa-icon name=\"check\""));
        assertTrue(html.contains("<wa-icon name=\"arrow-right\""));
        assertTrue(html.contains("Option 1"));
    }

    @Test
    public void testRenderBasicRadioGroupHtml()
    {
        var radioGroup = new WaRadioGroup<>()
                .setInitialValue("option1")
                .setName("options")
                .add(new WaRadio<>().setValue("option1"))
                .add(new WaRadio<>().setValue("option2"))
                .add(new WaRadio<>().setValue("option3"));

        var html = radioGroup.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio-group"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("name=\"options\""));
        assertTrue(html.contains("<wa-radio value=\"option1\"></wa-radio>"));
        assertTrue(html.contains("<wa-radio value=\"option2\"></wa-radio>"));
        assertTrue(html.contains("<wa-radio value=\"option3\"></wa-radio>"));
    }

    @Test
    public void testRenderRadioGroupWithHintHtml()
    {
        var radioGroup = new WaRadioGroup<>()
                .setInitialValue("option1")
                .setName("options")
                .setHint("Select one option")
                .add(new WaRadio<>().setValue("option1"))
                .add(new WaRadio<>().setValue("option2"))
                .add(new WaRadio<>().setValue("option3"));

        var html = radioGroup.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio-group"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("name=\"options\""));
        assertTrue(html.contains("hint=\"Select one option\""));
        assertTrue(html.contains("<wa-radio value=\"option1\"></wa-radio>"));
        assertTrue(html.contains("<wa-radio value=\"option2\"></wa-radio>"));
        assertTrue(html.contains("<wa-radio value=\"option3\"></wa-radio>"));
    }

    @Test
    public void testRenderRadioGroupWithRadioButtonsHtml()
    {
        var radioGroup = new WaRadioGroup<>()
                .setInitialValue("option1")
                .setName("options")
                .add(new WaRadioButton<>().setValue("option1")
                                          .setText("Option 1"))
                .add(new WaRadioButton<>().setValue("option2")
                                          .setText("Option 2"))
                .add(new WaRadioButton<>().setValue("option3")
                                          .setText("Option 3"));

        var html = radioGroup.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio-group"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("name=\"options\""));
        assertTrue(html.contains("<wa-radio-button value=\"option1\">"));
        assertTrue(html.contains("<wa-radio-button value=\"option2\">"));
        assertTrue(html.contains("<wa-radio-button value=\"option3\">"));
        assertTrue(html.contains("Option 1"));
        assertTrue(html.contains("Option 2"));
        assertTrue(html.contains("Option 3"));
    }

    @Test
    public void testRenderRadioWithStylingPropertiesHtml()
    {
        var radio = new WaRadio<>()
                .setValue("option1")
                .setStyleBackgroundColor("#f8f9fa")
                .setStyleBackgroundColorChecked("#4caf50")
                .setStyleBorderColor("#ced4da")
                .setStyleBorderColorChecked("#4caf50")
                .setStyleBorderStyle("solid")
                .setStyleBorderWidth("1px")
                .setStyleBoxShadow("0 0 5px rgba(0,0,0,0.1)")
                .setStyleCheckedIconColor("#ffffff")
                .setStyleCheckedIconScale("1.2")
                .setStyleToggleSize("20px");

        var html = radio.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("--background-color:#f8f9fa"));
        assertTrue(html.contains("--background-color-checked:#4caf50"));
        assertTrue(html.contains("--border-color:#ced4da"));
        assertTrue(html.contains("--border-color-checked:#4caf50"));
        assertTrue(html.contains("--border-style:solid"));
        assertTrue(html.contains("--border-width:1px"));
        assertTrue(html.contains("--box-shadow:0 0 5px rgba(0,0,0,0.1)"));
        assertTrue(html.contains("--checked-icon-color:#ffffff"));
        assertTrue(html.contains("--checked-icon-scale:1.2"));
        assertTrue(html.contains("--toggle-size:20px"));
    }

    @Test
    public void testRenderRadioButtonWithSSRFlagsHtml()
    {
        var prefix = new WaIcon<>().setName("check");
        var suffix = new WaIcon<>().setName("arrow-right");

        var radioButton = new WaRadioButton<>()
                .setValue("option1")
                .setText("Option 1")
                .setPrefix(prefix)
                .setSuffix(suffix)
                .setWithPrefix(true)
                .setWithSuffix(true);

        var html = radioButton.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio-button"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("with-prefix"));
        assertTrue(html.contains("with-suffix"));
        assertTrue(html.contains("<wa-icon name=\"check\" slot=\"prefix\"></wa-icon>"));
        assertTrue(html.contains("<wa-icon name=\"arrow-right\" slot=\"suffix\"></wa-icon>"));
        assertTrue(html.contains("Option 1"));
    }

    @Test
    public void testRenderRadioButtonWithStylingPropertiesHtml()
    {
        var radioButton = new WaRadioButton<>()
                .setValue("option1")
                .setText("Option 1")
                .setStyleIndicatorColor("#4caf50")
                .setStyleIndicatorWidth("3px")
                .setStyleDisplay("inline-block");

        var html = radioButton.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio-button"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("--indicator-color:#4caf50"));
        assertTrue(html.contains("--indicator-width:3px"));
        assertTrue(html.contains("--display:inline-block"));
        assertTrue(html.contains("Option 1"));
    }

    @Test
    public void testRenderRadioGroupWithNewPropertiesHtml()
    {
        var radioGroup = new WaRadioGroup<>()
                .setInitialValue("option1")
                .setName("options")
                .setLabel("Select an option")
                .setHint("Please choose one option")
                .setOrientation("horizontal")
                .setSize(Size.Medium)
                .setRequired(true)
                .setDisabled(false)
                .setWithLabel(true)
                .setWithHint(true)
                .setStyleRadiosGap("20px")
                .add(new WaRadio<>().setValue("option1"))
                .add(new WaRadio<>().setValue("option2"))
                .add(new WaRadio<>().setValue("option3"));

        var html = radioGroup.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio-group"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("name=\"options\""));
        assertTrue(html.contains("label=\"Select an option\""));
        assertTrue(html.contains("hint=\"Please choose one option\""));
        assertTrue(html.contains("orientation=\"horizontal\""));
        assertTrue(html.contains("size=\"medium\""));
        assertTrue(html.contains("required"));
        assertTrue(html.contains("with-label"));
        assertTrue(html.contains("with-hint"));
        assertTrue(html.contains("--gap:20px"));
        assertTrue(html.contains("<wa-radio value=\"option1\"></wa-radio>"));
        assertTrue(html.contains("<wa-radio value=\"option2\"></wa-radio>"));
        assertTrue(html.contains("<wa-radio value=\"option3\"></wa-radio>"));
    }

    @Test
    public void testRenderRadioGroupWithEventHandlersHtml()
    {
        var radioGroup = new WaRadioGroup<>()
                .setInitialValue("option1")
                .setName("options")
                .setBlurEvent("onBlur()")
                .setFocusEvent("onFocus()")
                .setInputEvent("onInput($event)")
                .setChangeEvent("onChange($event)")
                .setInvalidEvent("onInvalid($event)")
                .add(new WaRadio<>().setValue("option1"))
                .add(new WaRadio<>().setValue("option2"))
                .add(new WaRadio<>().setValue("option3"));

        var html = radioGroup.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio-group"));
        assertTrue(html.contains("value=\"option1\""));
        assertTrue(html.contains("name=\"options\""));
        assertTrue(html.contains("blur=\"onBlur()\""));
        assertTrue(html.contains("focus=\"onFocus()\""));
        assertTrue(html.contains("input=\"onInput($event)\""));
        assertTrue(html.contains("change=\"onChange($event)\""));
        assertTrue(html.contains("wa-invalid=\"onInvalid($event)\""));
        assertTrue(html.contains("<wa-radio value=\"option1\"></wa-radio>"));
        assertTrue(html.contains("<wa-radio value=\"option2\"></wa-radio>"));
        assertTrue(html.contains("<wa-radio value=\"option3\"></wa-radio>"));
    }

    @Test
    public void testRenderRadioGroupWithBindingHtml()
    {
        var radioGroup = new WaRadioGroup<>()
                .bind("selectedValue");

        var html = radioGroup.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-radio-group"));
        assertTrue(html.contains("[value]=\"selectedValue\""));
        assertTrue(html.contains("(valueChange)=\"selectedValue = $event\""));
    }
}
