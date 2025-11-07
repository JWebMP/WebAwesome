package com.jwebmp.webawesome.test.breadcrumb;

import com.jwebmp.webawesome.components.breadcrumb.WaBreadcrumbItem;
import com.jwebmp.webawesome.components.breadcrumb.WaBreadcrumbs;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaBreadcrumbsTest
{
    @Test
    public void rendersBasicBreadcrumbs()
    {
        var breadcrumbs = new WaBreadcrumbs<>()
                .setLabel("Site Navigation")
                .add(new WaBreadcrumbItem<>("Home", "/home"))
                .add(new WaBreadcrumbItem<>("Products", "/products"))
                .add(new WaBreadcrumbItem<>("Current"));
        var html = breadcrumbs.toString(true);
        System.out.println(html);

        assertTrue(html.startsWith("<wa-breadcrumbs"));
        assertTrue(html.contains("label=\"Site Navigation\""));
        assertTrue(html.contains("<wa-breadcrumb-item href=\"/home\">Home</wa-breadcrumb-item>"));
        assertTrue(html.contains("<wa-breadcrumb-item href=\"/products\">Products</wa-breadcrumb-item>"));
        assertTrue(html.contains("<wa-breadcrumb-item>Current</wa-breadcrumb-item>"));
    }

    @Test
    public void supportsSeparatorSlot()
    {
        //TODO add a field in breadcrumbs for separator
        WaIcon<?> sep = new WaIcon<>("angle-right");
        var breadcrumbs = new WaBreadcrumbs<>()
                .setSeparator(sep) //todo create this field and type as DivSimple with the slot attribute added
                .add(new WaBreadcrumbItem<>().setText("One"))
                .add(new WaBreadcrumbItem<>().setText("Two"));

        var html = breadcrumbs.toString(true);
        System.out.println(html);

        // separator should be injected with slot="separator" before items
        assertTrue(html.contains("slot=\"separator\""));
        assertTrue(html.indexOf("slot=\"separator\"") < html.indexOf("<wa-breadcrumb-item>One</wa-breadcrumb-item>"));
    }
}
