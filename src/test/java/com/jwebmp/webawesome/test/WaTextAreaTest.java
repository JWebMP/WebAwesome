package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.textarea.WaTextArea;
import com.jwebmp.webawesome.components.textarea.TextAreaAppearance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaTextAreaTest {

    @Test
    void rendersWaTextAreaWithRowsPlaceholderAndBooleans() {
        Page<?> p = new Page<>();
        WaTextArea<?> ta = new WaTextArea<>()
                .setPlaceholder("Type here...")
                .setLabel("Message")
                .setRows(5)
                .setAppearance(TextAreaAppearance.Filled)
                .setDisabled(true)
                .setReadonly(false)
                .setRequired(true);

        p.getBody().add(ta);
        String html = p.toString(true);
        System.out.println(html);

        Assertions.assertTrue(html.contains("<wa-textarea"), "Should render wa-textarea tag");
        Assertions.assertTrue(html.contains("placeholder=\"Type here...\""), "Placeholder expected");
        Assertions.assertTrue(html.contains("label=\"Message\""), "Label expected");
        Assertions.assertTrue(html.contains("rows=\"5\""), "Rows should render as number converted to string");
        Assertions.assertTrue(html.toLowerCase().contains("appearance=\"filled\""), "Appearance filled expected");
        Assertions.assertTrue(html.contains(" disabled=\"\"") || html.contains(" disabled "), "Disabled boolean should render");
        Assertions.assertFalse(html.contains(" readonly=\"\""), "Readonly false should not render");
        Assertions.assertTrue(html.contains(" required=\"\"") || html.contains(" required "), "Required boolean should render");
    }
}
