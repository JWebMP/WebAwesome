package com.jwebmp.webawesome.test.textarea;

import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.textarea.TextAreaAppearance;
import com.jwebmp.webawesome.components.textarea.TextAreaResize;
import com.jwebmp.webawesome.components.textarea.WaTextArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaTextAreaTest
{
    @Test
    public void testRenderBasicTextAreaHtml()
    {
        var s = new WaTextArea<>()
                .setValue("Sample text")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-textarea value=\"Sample text\"></wa-textarea>", s);
    }

    @Test
    public void testRenderTextAreaWithLabelAndHintHtml()
    {
        var s = new WaTextArea<>()
                .setLabel("Feedback")
                .setHint("Please tell us what you think.")
                .setRows(6)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-textarea hint=\"Please tell us what you think.\" label=\"Feedback\" rows=\"6\"></wa-textarea>", s);
    }

    @Test
    public void testRenderTextAreaWithResizeAndSizeHtml()
    {
        var s = new WaTextArea<>()
                .setResize(TextAreaResize.Vertical)
                .setSize(Size.Medium)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-textarea resize=\"vertical\" size=\"medium\"></wa-textarea>", s);
    }

    @Test
    public void testRenderTextAreaWithAppearanceHtml()
    {
        var s = new WaTextArea<>()
                .setAppearance(TextAreaAppearance.Outlined)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-textarea appearance=\"outlined\"></wa-textarea>", s);
    }

    @Test
    public void testRenderDisabledTextAreaHtml()
    {
        var s = new WaTextArea<>()
                .setDisabled(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-textarea disabled></wa-textarea>", s);
    }

    @Test
    public void testRenderReadonlyTextAreaHtml()
    {
        var s = new WaTextArea<>()
                .setReadonly(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-textarea readonly></wa-textarea>", s);
    }

    @Test
    public void testRenderRequiredTextAreaHtml()
    {
        var s = new WaTextArea<>()
                .setRequired(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-textarea required></wa-textarea>", s);
    }

    @Test
    public void testRenderTextAreaWithCustomStylesHtml()
    {
        var s = new WaTextArea<>()
                .setBackgroundColor("#f5f5f5")
                .setBorderColor("#cccccc")
                .setBorderWidth("2px")
                .setBoxShadow("0 2px 4px rgba(0,0,0,0.1)")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-textarea style=\"--background-color:#f5f5f5;--border-color:#cccccc;--border-width:2px;--box-shadow:0 2px 4px rgba(0,0,0,0.1);\"></wa-textarea>", s);
    }

    @Test
    public void testRenderTextAreaWithBindingsHtml()
    {
        var s = new WaTextArea<>()
                .bindValue("textValue")
                .bindLabel("textLabel")
                .bindHint("textHint")
                .bindRows("numRows")
                .bindResize("resizeOption")
                .bindSize("textSize")
                .bindAppearance("textAppearance")
                .bindDisabled("isDisabled")
                .bindReadonly("isReadonly")
                .bindRequired("isRequired")
                .onFocus("handleFocus($event)")
                .onBlur("handleBlur($event)")
                .onInput("handleInput($event)")
                .onChange("handleChange($event)")
                .onInvalid("handleInvalid($event)")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-textarea (blurEvent)=\"handleBlur($event)\" (changeEvent)=\"handleChange($event)\" (focusEvent)=\"handleFocus($event)\" (inputEvent)=\"handleInput($event)\" (invalid)=\"handleInvalid($event)\" [appearance]=\"textAppearance\" [disabled]=\"isDisabled\" [hint]=\"textHint\" [label]=\"textLabel\" [readonly]=\"isReadonly\" [required]=\"isRequired\" [resize]=\"resizeOption\" [rows]=\"numRows\" [size]=\"textSize\" [value]=\"textValue\"></wa-textarea>", s);
    }
}
