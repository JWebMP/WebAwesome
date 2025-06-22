package com.jwebmp.webawesome.test.breadcrumb;

import com.jwebmp.webawesome.components.breadcrumb.WaBreadcrumb;
import com.jwebmp.webawesome.components.breadcrumb.WaBreadcrumbItem;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaBreadcrumbTest
{
    @Test
    public void testRenderBasicBreadcrumbHtml()
    {
        var s = new WaBreadcrumb()
                .add(new WaBreadcrumbItem("Home").setHref("/home"))
                .add(new WaBreadcrumbItem("Products").setHref("/home/products"))
                .add(new WaBreadcrumbItem("Current Page"))
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-breadcrumb>"));
        assertTrue(s.contains("<wa-breadcrumb-item href=\"/home\">"));
        assertTrue(s.contains("Home"));
        assertTrue(s.contains("<wa-breadcrumb-item href=\"/home/products\">"));
        assertTrue(s.contains("Products"));
        assertTrue(s.contains("<wa-breadcrumb-item>"));
        assertTrue(s.contains("Current Page"));
    }

    @Test
    public void testRenderBreadcrumbWithLabelHtml()
    {
        var s = new WaBreadcrumb("Site Navigation")
                .add(new WaBreadcrumbItem("Home").setHref("/home"))
                .add(new WaBreadcrumbItem("Current Page"))
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-breadcrumb label=\"Site Navigation\">"));
        assertTrue(s.contains("<wa-breadcrumb-item href=\"/home\">"));
        assertTrue(s.contains("Home"));
        assertTrue(s.contains("<wa-breadcrumb-item>"));
        assertTrue(s.contains("Current Page"));
    }

    @Test
    public void testRenderBreadcrumbWithSeparatorHtml()
    {
        var separator = new WaIcon<>().setName("angles-right");
        var s = new WaBreadcrumb()
                .setSeparator(separator)
                .add(new WaBreadcrumbItem("Home").setHref("/home"))
                .add(new WaBreadcrumbItem("Products").setHref("/home/products"))
                .add(new WaBreadcrumbItem("Current Page"))
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-icon name=\"angles-right\" slot=\"separator\"></wa-icon>"));
        assertTrue(s.contains("<wa-breadcrumb-item href=\"/home\">"));
        assertTrue(s.contains("Home"));
        assertTrue(s.contains("<wa-breadcrumb-item href=\"/home/products\">"));
        assertTrue(s.contains("Products"));
        assertTrue(s.contains("<wa-breadcrumb-item>"));
        assertTrue(s.contains("Current Page"));
    }

    @Test
    public void testRenderBreadcrumbItemWithPrefixAndSuffixHtml()
    {
        var homeIcon = new WaIcon<>().setName("house");
        var starIcon = new WaIcon<>().setName("star");

        var s = new WaBreadcrumb()
                .add(new WaBreadcrumbItem("Home").setHref("/home").setPrefix(homeIcon))
                .add(new WaBreadcrumbItem("Products").setHref("/home/products"))
                .add(new WaBreadcrumbItem("Widgets").setSuffix(starIcon))
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-icon name=\"house\" slot=\"prefix\"></wa-icon>"));
        assertTrue(s.contains("<wa-icon name=\"star\" slot=\"suffix\"></wa-icon>"));
        assertTrue(s.contains("<wa-breadcrumb-item href=\"/home\">"));
        assertTrue(s.contains("Home"));
        assertTrue(s.contains("<wa-breadcrumb-item href=\"/home/products\">"));
        assertTrue(s.contains("Products"));
        assertTrue(s.contains("<wa-breadcrumb-item>"));
        assertTrue(s.contains("Widgets"));
    }

    @Test
    public void testRenderBreadcrumbItemWithTargetAndRelHtml()
    {
        var s = new WaBreadcrumb()
                .add(new WaBreadcrumbItem("External Link")
                        .setHref("https://example.com")
                        .setTarget("_blank")
                        .setRel("noopener"))
                .add(new WaBreadcrumbItem("Current Page"))
                .toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-breadcrumb-item href=\"https://example.com\" rel=\"noopener\" target=\"_blank\">"));
        assertTrue(s.contains("External Link"));
        assertTrue(s.contains("<wa-breadcrumb-item>"));
        assertTrue(s.contains("Current Page"));
    }
}
