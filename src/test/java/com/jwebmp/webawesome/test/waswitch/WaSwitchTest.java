package com.jwebmp.webawesome.test.waswitch;

import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.waswitch.WaSwitch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaSwitchTest
{
    @Test
    public void testRenderBasicSwitchHtml()
    {
        var s = new WaSwitch<>()
                .setText("Basic Switch")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-switch>Basic Switch</wa-switch>", s);
    }

    @Test
    public void testRenderCheckedSwitchHtml()
    {
        var s = new WaSwitch<>()
                .setText("Checked Switch")
                .setChecked(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-switch checked>Checked Switch</wa-switch>", s);
    }

    @Test
    public void testRenderDisabledSwitchHtml()
    {
        var s = new WaSwitch<>()
                .setText("Disabled Switch")
                .setDisabled(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-switch disabled>Disabled Switch</wa-switch>", s);
    }

    @Test
    public void testRenderSwitchWithHintHtml()
    {
        var s = new WaSwitch<>()
                .setText("Switch with Hint")
                .setHint("This is a hint")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-switch hint=\"This is a hint\">Switch with Hint</wa-switch>", s);
    }

    @Test
    public void testRenderSwitchWithSizeHtml()
    {
        var s = new WaSwitch<>()
                .setText("Large Switch")
                .setSize(Size.Large)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-switch size=\"large\">Large Switch</wa-switch>", s);
    }

    @Test
    public void testRenderSwitchWithCustomStylingHtml()
    {
        var s = new WaSwitch<>()
                .setText("Custom Styled Switch")
                .setBackgroundColor("#f0f0f0")
                .setBackgroundColorChecked("#4CAF50")
                .setThumbColor("#ffffff")
                .setThumbColorChecked("#ffffff")
                .setThumbSize("16px")
                .setWidth("60px")
                .setHeight("30px")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-switch style=\"--background-color:#f0f0f0;--background-color-checked:#4CAF50;--height:30px;--thumb-color:#ffffff;--thumb-color-checked:#ffffff;--thumb-size:16px;--width:60px;\">Custom Styled Switch</wa-switch>", s);
    }

    @Test
    public void testRenderSwitchWithAllPropertiesHtml()
    {
        var s = new WaSwitch<>()
                .setText("Complete Switch")
                .setChecked(true)
                .setDisabled(true)
                .setSize(Size.Medium)
                .setHint("Complete hint")
                .setBackgroundColor("#f0f0f0")
                .setBackgroundColorChecked("#4CAF50")
                .setBorderColor("#cccccc")
                .setBorderColorChecked("#2196F3")
                .setBorderStyle("solid")
                .setBorderWidth("1px")
                .setBoxShadow("0 2px 4px rgba(0,0,0,0.1)")
                .setThumbColor("#ffffff")
                .setThumbColorChecked("#ffffff")
                .setThumbShadow("0 0 3px rgba(0,0,0,0.2)")
                .setThumbSize("18px")
                .setWidth("50px")
                .setHeight("26px")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("checked"));
        assertTrue(s.contains("disabled"));
        assertTrue(s.contains("size=\"medium\""));
        assertTrue(s.contains("hint=\"Complete hint\""));
        assertTrue(s.contains("--background-color:#f0f0f0"));
        assertTrue(s.contains("--background-color-checked:#4CAF50"));
        assertTrue(s.contains("--border-color:#cccccc"));
        assertTrue(s.contains("--border-color-checked:#2196F3"));
        assertTrue(s.contains("--border-style:solid"));
        assertTrue(s.contains("--border-width:1px"));
        assertTrue(s.contains("--box-shadow:0 2px 4px rgba(0,0,0,0.1)"));
        assertTrue(s.contains("--thumb-color:#ffffff"));
        assertTrue(s.contains("--thumb-color-checked:#ffffff"));
        assertTrue(s.contains("--thumb-shadow:0 0 3px rgba(0,0,0,0.2)"));
        assertTrue(s.contains("--thumb-size:18px"));
        assertTrue(s.contains("--width:50px"));
        assertTrue(s.contains("--height:26px"));
    }

    @Test
    public void testRenderSwitchWithBindingsHtml()
    {
        var s = new WaSwitch<>()
                .setText("Binding Switch")
                .bindChecked("isChecked")
                .bindDisabled("isDisabled")
                .bindHint("switchHint")
                .bindSize("switchSize")
                .bindBackgroundColor("bgColor")
                .bindBackgroundColorChecked("bgColorChecked")
                .bindBorderColor("borderColor")
                .bindBorderColorChecked("borderColorChecked")
                .bindBorderStyle("borderStyle")
                .bindBorderWidth("borderWidth")
                .bindBoxShadow("boxShadow")
                .bindHeight("switchHeight")
                .bindThumbColor("thumbColor")
                .bindThumbColorChecked("thumbColorChecked")
                .bindThumbShadow("thumbShadow")
                .bindThumbSize("thumbSize")
                .bindWidth("switchWidth")
                .onChange("handleChange($event)")
                .onInput("handleInput($event)")
                .onFocus("handleFocus($event)")
                .onBlur("handleBlur($event)")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("[checked]=\"isChecked\""));
        assertTrue(s.contains("[disabled]=\"isDisabled\""));
        assertTrue(s.contains("[hint]=\"switchHint\""));
        assertTrue(s.contains("[size]=\"switchSize\""));
        assertTrue(s.contains("[style.--background-color]=\"bgColor\""));
        assertTrue(s.contains("[style.--background-color-checked]=\"bgColorChecked\""));
        assertTrue(s.contains("[style.--border-color]=\"borderColor\""));
        assertTrue(s.contains("[style.--border-color-checked]=\"borderColorChecked\""));
        assertTrue(s.contains("[style.--border-style]=\"borderStyle\""));
        assertTrue(s.contains("[style.--border-width]=\"borderWidth\""));
        assertTrue(s.contains("[style.--box-shadow]=\"boxShadow\""));
        assertTrue(s.contains("[style.--height]=\"switchHeight\""));
        assertTrue(s.contains("[style.--thumb-color]=\"thumbColor\""));
        assertTrue(s.contains("[style.--thumb-color-checked]=\"thumbColorChecked\""));
        assertTrue(s.contains("[style.--thumb-shadow]=\"thumbShadow\""));
        assertTrue(s.contains("[style.--thumb-size]=\"thumbSize\""));
        assertTrue(s.contains("[style.--width]=\"switchWidth\""));
        assertTrue(s.contains("(changeEvent)=\"handleChange($event)\""));
        assertTrue(s.contains("(inputEvent)=\"handleInput($event)\""));
        assertTrue(s.contains("(focusEvent)=\"handleFocus($event)\""));
        assertTrue(s.contains("(blurEvent)=\"handleBlur($event)\""));
    }
}