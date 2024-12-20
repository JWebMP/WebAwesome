package com.jwebmp.webawesome.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WebAwesomePageConfiguratorTest {

    @Test
    void configure() {
        var p = new com.jwebmp.core.Page<>();
        p.getHead().toString();
        p.getBody().add("Hello World!");
        var o = p.toString(true);
        System.out.println(o);

        Assertions.assertEquals("""
                <!DOCTYPE html>
                <html>
                	<head>
                		<link href="https://early.webawesome.com/webawesome@3.0.0-alpha.5/dist/themes/default.css?" rel="stylesheet" type="text/css">
                		<!-- Priority [Top_Shelf] Values -->
                		<script src="https://early.webawesome.com/webawesome@3.0.0-alpha.5/dist/webawesome.loader.js?" type="module"></script>
                	</head>
                	<body id="body">
                		<p>Hello World!</p>
                	</body>
                </html>""", o, "Scripts didn't render right");
    }


}