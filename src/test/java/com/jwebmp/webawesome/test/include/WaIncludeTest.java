package com.jwebmp.webawesome.test.include;

import com.jwebmp.webawesome.components.include.CorsMode;
import com.jwebmp.webawesome.components.include.WaInclude;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaIncludeTest
{
    @Test
    public void testRenderBasicIncludeHtml()
    {
        var s = new WaInclude()
                .setSrc("templates/content.html")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-include src=\"templates/content.html\"></wa-include>", s);
    }

    @Test
    public void testRenderIncludeWithConstructorHtml()
    {
        var s = new WaInclude("templates/content.html")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-include src=\"templates/content.html\"></wa-include>", s);
    }

    @Test
    public void testRenderIncludeWithCorsModeHtml()
    {
        var s = new WaInclude()
                .setSrc("https://example.com/content.html")
                .setMode(CorsMode.CORS)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-include mode=\"cors\" src=\"https://example.com/content.html\"></wa-include>", s);
    }

    @Test
    public void testRenderIncludeWithNoCorsModeHtml()
    {
        var s = new WaInclude()
                .setSrc("https://example.com/content.html")
                .setMode(CorsMode.NO_CORS)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-include mode=\"no-cors\" src=\"https://example.com/content.html\"></wa-include>", s);
    }

    @Test
    public void testRenderIncludeWithSameOriginModeHtml()
    {
        var s = new WaInclude()
                .setSrc("templates/content.html")
                .setMode(CorsMode.SAME_ORIGIN)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-include mode=\"same-origin\" src=\"templates/content.html\"></wa-include>", s);
    }

    @Test
    public void testRenderIncludeWithAllowScriptsHtml()
    {
        var s = new WaInclude()
                .setSrc("templates/interactive-widget.html")
                .setAllowScripts(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-include allow-scripts src=\"templates/interactive-widget.html\"></wa-include>", s);
    }

    @Test
    public void testRenderIncludeWithAllowScriptsFalseHtml()
    {
        var s = new WaInclude()
                .setSrc("templates/content.html")
                .setAllowScripts(false)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-include src=\"templates/content.html\"></wa-include>", s);
    }

    @Test
    public void testRenderIncludeWithAllAttributesHtml()
    {
        var s = new WaInclude()
                .setSrc("templates/interactive-widget.html")
                .setMode(CorsMode.NO_CORS)
                .setAllowScripts(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-include allow-scripts mode=\"no-cors\" src=\"templates/interactive-widget.html\"></wa-include>", s);
    }
}