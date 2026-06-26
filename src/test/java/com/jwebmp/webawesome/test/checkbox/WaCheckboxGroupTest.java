package com.jwebmp.webawesome.test.checkbox;

import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.checkbox.CheckboxGroupOrientation;
import com.jwebmp.webawesome.components.checkbox.WaCheckbox;
import com.jwebmp.webawesome.components.checkbox.WaCheckboxGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaCheckboxGroupTest
{
    @Test
    public void testRenderBasicCheckboxGroupHtml()
    {
        var group = new WaCheckboxGroup<>()
                .setLabel("Choose your toppings")
                .add(new WaCheckbox<>().setValue("cheese"))
                .add(new WaCheckbox<>().setValue("mushrooms"))
                .add(new WaCheckbox<>().setValue("olives"));

        var html = group.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-checkbox-group"));
        assertTrue(html.contains("label=\"Choose your toppings\""));
        assertTrue(html.contains("<wa-checkbox value=\"cheese\"></wa-checkbox>"));
        assertTrue(html.contains("<wa-checkbox value=\"mushrooms\"></wa-checkbox>"));
        assertTrue(html.contains("<wa-checkbox value=\"olives\"></wa-checkbox>"));
    }

    @Test
    public void testRenderCheckboxGroupWithAttributesHtml()
    {
        var group = new WaCheckboxGroup<>()
                .setLabel("Select options")
                .setHint("Choose one or more")
                .setOrientation(CheckboxGroupOrientation.Horizontal)
                .setSize(Size.Large)
                .add(new WaCheckbox<>().setValue("a"))
                .add(new WaCheckbox<>().setValue("b"));

        var html = group.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-checkbox-group"));
        assertTrue(html.contains("label=\"Select options\""));
        assertTrue(html.contains("hint=\"Choose one or more\""));
        assertTrue(html.contains("orientation=\"horizontal\""));
        assertTrue(html.contains("size=\"large\""));
    }

    @Test
    public void testRenderCheckboxGroupWithStringOrientationHtml()
    {
        var group = new WaCheckboxGroup<>()
                .setLabel("Select options")
                .setOrientation("vertical")
                .add(new WaCheckbox<>().setValue("a"));

        var html = group.toString(true);
        System.out.println(html);

        assertTrue(html.contains("orientation=\"vertical\""));
    }

    @Test
    public void testRenderCheckboxGroupBooleanFlagsPresentWhenTrueHtml()
    {
        var group = new WaCheckboxGroup<>()
                .setLabel("Select options")
                .setRequired(true)
                .setWithLabel(true)
                .setWithHint(true)
                .add(new WaCheckbox<>().setValue("a"));

        var html = group.toString(true);
        System.out.println(html);

        assertTrue(html.contains("required"));
        assertTrue(html.contains("with-label"));
        assertTrue(html.contains("with-hint"));
    }

    @Test
    public void testRenderCheckboxGroupBooleanFlagsAbsentWhenFalseHtml()
    {
        var group = new WaCheckboxGroup<>()
                .setLabel("Select options")
                .setRequired(false)
                .setWithLabel(false)
                .setWithHint(false)
                .add(new WaCheckbox<>().setValue("a"));

        var html = group.toString(true);
        System.out.println(html);

        assertFalse(html.contains("required"));
        assertFalse(html.contains("with-label"));
        assertFalse(html.contains("with-hint"));
    }

    @Test
    public void testRenderCheckboxGroupWithGapStyleHtml()
    {
        var group = new WaCheckboxGroup<>()
                .setLabel("Select options")
                .setStyleGap("1.25em")
                .add(new WaCheckbox<>().setValue("a"));

        var html = group.toString(true);
        System.out.println(html);

        assertTrue(html.contains("--gap:1.25em"));
    }

    @Test
    public void testCheckboxGroupHasNoValueAttributeHtml()
    {
        // The group is a container only - it must not own a value attribute.
        var group = new WaCheckboxGroup<>()
                .setLabel("Select options")
                .add(new WaCheckbox<>().setValue("a"));

        var html = group.toString(true);
        System.out.println(html);

        // <wa-checkbox-group ...> opening tag must not carry a value attribute
        var openingTag = html.substring(html.indexOf("<wa-checkbox-group"), html.indexOf('>'));
        assertFalse(openingTag.contains("value="));
    }
}

