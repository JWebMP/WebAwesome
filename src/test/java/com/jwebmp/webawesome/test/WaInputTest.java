package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.input.WaInput;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaInputTest {

    @Test
    void rendersWaInputWithPlaceholderValueAndBooleans() {
        Page<?> p = new Page<>();
        WaInput<?> input = new WaInput<>()
                .setPlaceholder("Your name")
                .setType("text")
                .setValue("John")
                .setDisabled(true)
                .setReadonly(false)
                .setRequired(true);
        p.getBody().add(input);
        String html = p.toString(true);
        System.out.println(html);

        Assertions.assertTrue(html.contains("<wa-input"), "Should render wa-input tag");
        Assertions.assertTrue(html.contains("placeholder=\"Your name\""), "Placeholder expected");
        Assertions.assertTrue(html.contains("type=\"text\""), "Type expected");
        Assertions.assertTrue(html.contains("value=\"John\""), "Value expected");
        Assertions.assertTrue(html.contains(" disabled=\"\""), "Disabled boolean should render");
        Assertions.assertFalse(html.contains(" readonly=\"\""), "Readonly false should not render");
        Assertions.assertTrue(html.contains(" required=\"\""), "Required boolean should render");
    }

    @Test
    void acceptsNumbersAsStringsForAttributes() {
        Page<?> p = new Page<>();
        WaInput<?> input = new WaInput<>()
                .setMinlength("3")
                .setMaxlength("10");
        p.getBody().add(input);
        String html = p.toString(true);
        Assertions.assertTrue(html.contains(" minlength=\"3\""), "minlength should accept string");
        Assertions.assertTrue(html.contains(" maxlength=\"10\""), "maxlength should accept string");
    }
}
