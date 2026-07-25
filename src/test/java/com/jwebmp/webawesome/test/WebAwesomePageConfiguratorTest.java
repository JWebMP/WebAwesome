package com.jwebmp.webawesome.test;

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.webawesome.components.WebAwesomePageConfigurator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WebAwesomePageConfiguratorTest {

    @Test
    void configure() {
        // Configure the local asset injection the way an application would (see WebAwesomePageConfigurator)
        WebAwesomePageConfigurator.setBasePath("/webawesome/");
        WebAwesomePageConfigurator.setThemePath("styles/themes/default.css");
        WebAwesomePageConfigurator.setPaletesPath("styles/palettes/default.css");
        WebAwesomePageConfigurator.setThemeClassName("wa-theme-default");
        WebAwesomePageConfigurator.setThemePalletName("wa-pallet-default");
        WebAwesomePageConfigurator.setThemeBrandName("wa-brand-blue");
        try {
            var p = new com.jwebmp.core.Page<>();
            // Pre-add a custom CSS reference to ensure extra CSS is preserved
            p.addCssReference(new CSSReference("CustomStyles", 0.1, "/css/custom-extra.css"));
            p.getHead().toString();
            p.getBody().add("Hello World!");
            var o = p.toString(true);
            System.out.println(o);

            // Align expectations with Web Awesome 3.0.0 local asset injection
            // Verify body contains default theme classes
            Assertions.assertTrue(o.contains("wa-theme-default"), "Missing wa-theme-default class");
            Assertions.assertTrue(o.contains("wa-pallet-default"), "Missing wa-pallet-default class");
            Assertions.assertTrue(o.contains("wa-brand-blue"), "Missing wa-brand-blue class");

            // Verify core stylesheet is injected with the correct href, and the palettes theme marker is present
            Assertions.assertTrue(o.contains("data-wa-pallets-theme=\"true\""), "Missing palettes theme marker attribute");
            Assertions.assertTrue(o.contains("/webawesome/styles/webawesome.css"), "Missing core webawesome.css link");

            // Verify theme stylesheet
            Assertions.assertTrue(o.contains("/webawesome/styles/themes/default.css"), "Missing default theme stylesheet link");

            // Verify module loader script
            Assertions.assertTrue(o.contains("<script src=\"/webawesome/webawesome.loader.js?\""), "Missing webawesome.loader.js module script");

            // Verify that custom/extra CSS remains and is not removed by the configurator
            Assertions.assertTrue(o.contains("/css/custom-extra.css"), "Custom extra CSS should be preserved alongside WebAwesome assets");
        } finally {
            // Reset static configuration so other tests are not affected
            WebAwesomePageConfigurator.setBasePath("");
            WebAwesomePageConfigurator.setThemePath("");
            WebAwesomePageConfigurator.setPaletesPath("");
            WebAwesomePageConfigurator.setThemeClassName("");
            WebAwesomePageConfigurator.setThemePalletName("");
            WebAwesomePageConfigurator.setThemeBrandName("");
        }
    }


}