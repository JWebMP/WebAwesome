package com.jwebmp.webawesome.test.otpinput;

import com.jwebmp.core.base.html.Span;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.otpinput.OtpAppearance;
import com.jwebmp.webawesome.components.otpinput.OtpCase;
import com.jwebmp.webawesome.components.otpinput.OtpType;
import com.jwebmp.webawesome.components.otpinput.WaOtpInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaOtpInputTest
{
    @Test
    void rendersBasicOtpInputTag()
    {
        var s = new WaOtpInput<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-otp-input"), "Should render wa-otp-input tag");
        assertTrue(s.contains("</wa-otp-input>"), "Should have a closing tag");
    }

    @Test
    void rendersLengthAndFormat()
    {
        var s = new WaOtpInput<>()
                .setLength(6)
                .setFormat("###-###")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("length=\"6\""), "Length expected");
        assertTrue(s.contains("format=\"###-###\""), "Format expected");
    }

    @Test
    void rendersEnumAttributes()
    {
        var s = new WaOtpInput<>()
                .setAppearance(OtpAppearance.Filled_Outlined)
                .setType(OtpType.Alphanumeric)
                .setOtpCase(OtpCase.Upper)
                .setSize(Size.Large)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("appearance=\"filled outlined\""), "Appearance expected");
        assertTrue(s.contains("type=\"alphanumeric\""), "Type expected");
        assertTrue(s.contains("case=\"upper\""), "Case expected");
        assertTrue(s.contains("size=\"large\""), "Size expected");
    }

    @Test
    void rendersBooleanAttributes()
    {
        var s = new WaOtpInput<>()
                .setMask(true)
                .setWithMask(true)
                .setRequired(true)
                .setReadonly(true)
                .setAutosubmit(true)
                .setAutofocus(true)
                .setDisabled(true)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("mask"), "mask expected");
        assertTrue(s.contains("with-mask"), "with-mask expected");
        assertTrue(s.contains("required"), "required expected");
        assertTrue(s.contains("readonly"), "readonly expected");
        assertTrue(s.contains("autosubmit"), "autosubmit expected");
        assertTrue(s.contains("autofocus"), "autofocus expected");
        assertTrue(s.contains("disabled"), "disabled expected");
    }

    @Test
    void omitsFalseBooleansAndDefaultAutocomplete()
    {
        var s = new WaOtpInput<>()
                .setRequired(false)
                .setDisabled(false)
                .toString(true);
        System.out.println(s);

        assertFalse(s.contains("required"), "required should not render when false");
        assertFalse(s.contains("disabled"), "disabled should not render when false");
        assertFalse(s.contains("autocomplete"), "autocomplete should only render when overridden");
    }

    @Test
    void rendersLabelHintNameAndForm()
    {
        var s = new WaOtpInput<>("Verification code")
                .setHint("Check your email")
                .setName("otp")
                .setForm("loginForm")
                .setAutocomplete("off")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Verification code\""), "Label expected");
        assertTrue(s.contains("hint=\"Check your email\""), "Hint expected");
        assertTrue(s.contains("name=\"otp\""), "Name expected");
        assertTrue(s.contains("form=\"loginForm\""), "Form expected");
        assertTrue(s.contains("autocomplete=\"off\""), "Autocomplete expected");
    }

    @Test
    void rendersCssCustomProperties()
    {
        var s = new WaOtpInput<>()
                .setSegmentSize("3rem")
                .setSegmentGap("0.5rem")
                .setSegmentBorderRadius("8px")
                .setMaskChar("*")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("--segment-size:3rem") || s.contains("--segment-size: 3rem"), "Segment size custom property expected");
        assertTrue(s.contains("--segment-gap"), "Segment gap custom property expected");
        assertTrue(s.contains("--segment-border-radius"), "Segment border radius custom property expected");
        assertTrue(s.contains("--mask-char"), "Mask char custom property expected");
    }

    @Test
    void rendersEvents()
    {
        var s = new WaOtpInput<>()
                .setInputEvent("onInput($event)")
                .setChangeEvent("onChange($event)")
                .setCompleteEvent("onComplete($event)")
                .setClearEvent("onClear($event)")
                .setInvalidEvent("onInvalid($event)")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("(input)=\"onInput($event)\""), "Input event expected");
        assertTrue(s.contains("(change)=\"onChange($event)\""), "Change event expected");
        assertTrue(s.contains("(wa-complete)=\"onComplete($event)\""), "Complete event expected");
        assertTrue(s.contains("(wa-clear)=\"onClear($event)\""), "Clear event expected");
        assertTrue(s.contains("(wa-invalid)=\"onInvalid($event)\""), "Invalid event expected");
    }

    @Test
    void rendersFormBindings()
    {
        var s = new WaOtpInput<>()
                .setFormControlName("otp")
                .bindValue("otpValue")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("formControlName=\"otp\""), "Form control name expected");
        assertTrue(s.contains("[value]=\"otpValue\""), "Value binding expected");
    }

    @Test
    void rendersSlots()
    {
        var s = new WaOtpInput<>()
                .setLabelSlot(new Span<>().setText("Code"))
                .setHintSlot(new Span<>().setText("6 digits"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("slot=\"label\""), "Label slot expected");
        assertTrue(s.contains("slot=\"hint\""), "Hint slot expected");
    }
}

