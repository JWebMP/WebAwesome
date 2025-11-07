package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.WaFlank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaFlankTest {

    @Test
    void rendersWaFlankAndCanBeLink() {
        Page<?> p = new Page<>();

        WaFlank flank = new WaFlank()
                .setDisplayAsLink();

        p.getBody().add(flank);

        String html = p.toString(true);
        System.out.println(html);

        // has base class
        Assertions.assertTrue(html.contains("wa-flank"), "Flank should have wa-flank class");
        // changed to anchor tag with href
        Assertions.assertTrue(html.contains("<a ") || html.contains("<a>"), "Flank should render as an anchor when setDisplayAsLink is used");
        Assertions.assertTrue(html.contains("href=\"#\""), "Flank anchor should have default href set");
    }

    @Test
    void rendersDirectionalFlankStartOrEnd() {
        Page<?> p = new Page<>();

        WaFlank start = new WaFlank(true);
        WaFlank end = new WaFlank(false);
        p.getBody().add(start);
        p.getBody().add(end);

        String html = p.toString(true);
        System.out.println(html);

        Assertions.assertTrue(html.contains("wa-flank:start"), "Start directional class should be present");
        Assertions.assertTrue(html.contains("wa-flank:end"), "End directional class should be present");
    }
}
