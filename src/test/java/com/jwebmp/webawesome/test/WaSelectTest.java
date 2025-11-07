package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.select.WaSelect;
import com.jwebmp.webawesome.components.select.WaSelectOption;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaSelectTest {

    @Test
    void rendersWaSelectWithOptionsAndBooleans() {
        Page<?> p = new Page<>();
        WaSelect<?> select = new WaSelect<>()
                .setLabel("Pick one")
                .setPlaceholder("Choose...")
                .setWithClear(true)
                .setMultiple(true)
                .setDisabled(false)
                .setRequired(true)
                .setValue("option2");

        select.add(new WaSelectOption<>()
                .setValue("option1")
                .setText("Option 1"));
        select.add(new WaSelectOption<>()
                .setValue("option2")
                .setText("Option 2"));

        p.getBody().add(select);
        String html = p.toString(true);
        System.out.println(html);

        Assertions.assertTrue(html.contains("<wa-select"), "Should render wa-select tag");
        Assertions.assertTrue(html.contains("placeholder=\"Choose...\""), "Placeholder expected");
        Assertions.assertTrue(html.contains("label=\"Pick one\""), "Label expected");
        // Boolean attributes may render as bare attributes or with empty value
        Assertions.assertTrue(html.contains(" with-clear=\"\"") || html.contains(" with-clear "), "with-clear boolean should render");
        Assertions.assertTrue(html.contains(" multiple=\"\"") || html.contains(" multiple "), "multiple boolean should render");
        Assertions.assertTrue(html.contains(" required=\"\"") || html.contains(" required "), "required boolean should render");
        Assertions.assertTrue(html.contains(" value=\"option2\""), "Selected value should be set");
        Assertions.assertTrue(html.contains("<wa-option") && html.contains("value=\"option1\"") && html.contains("value=\"option2\""), "Options should render with values");
    }
}
