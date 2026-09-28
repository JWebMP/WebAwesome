package com.jwebmp.webawesome.test.image;

import com.jwebmp.webawesome.components.image.WaImage;
import com.jwebmp.webawesome.tokens.WaSpaceToken;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WaImageTest
{
    @Test
    void rendersNativeImageWithAlternativeTextAndTokens()
    {
        String html = new WaImage<>("/images/field.jpg", "A field at sunrise")
                .setMargin(WaSpaceToken.SpaceM)
                .toString(true);
        assertTrue(html.startsWith("<img"), html);
        assertTrue(html.contains("src=\"/images/field.jpg\""), html);
        assertTrue(html.contains("alt=\"A field at sunrise\""), html);
        assertTrue(html.contains("margin:"), html);
    }
}
