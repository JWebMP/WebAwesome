package com.jwebmp.webawesome.test.input;

import com.jwebmp.webawesome.components.input.InputAppearance;
import com.jwebmp.webawesome.components.input.InputSize;
import com.jwebmp.webawesome.components.input.WaInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaInputTest
{
    @Test
    public void testBasicInput()
    {
        var input = new WaInput<>("Username");
        var html = input.toString(true);
        System.out.println(html);

        assertEquals("<wa-input label=\"Username\"></wa-input>", html);
    }

    @Test
    public void testInputWithType()
    {
        var input = new WaInput<>("Password", "password");
        var html = input.toString(true);
        System.out.println(html);

        assertEquals("<wa-input label=\"Password\" type=\"password\"></wa-input>", html);
    }

    @Test
    public void testInputWithAttributes()
    {
        var input = new WaInput<>("Email", "email");
        input.setRequired(true);
        input.setPlaceholder("Enter your email");
        input.setHint("We'll never share your email");
        var html = input.toString(true);
        System.out.println(html);

        assertTrue(html.contains("label=\"Email\""), "Should contain label attribute");
        assertTrue(html.contains("type=\"email\""), "Should contain type attribute");
        assertTrue(html.contains("hint=\"We'll never share your email\""), "Should contain hint attribute");
        assertTrue(html.contains("placeholder=\"Enter your email\""), "Should contain placeholder attribute");
        assertTrue(html.contains("required"), "Should contain required attribute");
    }

    @Test
    public void testInputWithSizeAndAppearance()
    {
        var input = new WaInput<>("Username");
        input.setSize(InputSize.LARGE);
        input.setAppearance(InputAppearance.OUTLINED);
        var html = input.toString(true);
        System.out.println(html);

        assertTrue(html.contains("label=\"Username\""), "Should contain label attribute");
        assertTrue(html.contains("size=\"large\""), "Should contain size attribute");
        assertTrue(html.contains("appearance=\"outlined\""), "Should contain appearance attribute");
    }

    @Test
    public void testPasswordInput()
    {
        var input = new WaInput<>("Password", "password");
        input.setPasswordToggle(true);
        var html = input.toString(true);
        System.out.println(html);

        assertTrue(html.contains("label=\"Password\""), "Should contain label attribute");
        assertTrue(html.contains("type=\"password\""), "Should contain type attribute");
        assertTrue(html.contains("password-toggle"), "Should contain password-toggle attribute");
    }
}
