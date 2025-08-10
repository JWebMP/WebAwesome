package com.jwebmp.webawesome.test.divider;

import com.jwebmp.webawesome.components.divider.WaDivider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaDividerTest
{
    @Test
    public void testRenderBasicDividerHtml()
    {
        var s = new WaDivider().toString(true);
        System.out.println(s);

        assertEquals("<wa-divider></wa-divider>", s);
    }

    @Test
    public void testRenderVerticalDividerHtml()
    {
        var s = new WaDivider()
                .setVertical(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-divider vertical></wa-divider>", s);
    }

    @Test
    public void testRenderDividerWithCustomColorHtml()
    {
        var s = new WaDivider()
                .setColor("#3f51b5")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-divider style=\"--color:#3f51b5;\"></wa-divider>", s);
    }

    @Test
    public void testRenderDividerWithCustomWidthHtml()
    {
        var s = new WaDivider()
                .setWidth("4px")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-divider style=\"--width:4px;\"></wa-divider>", s);
    }

    @Test
    public void testRenderDividerWithCustomSpacingHtml()
    {
        var s = new WaDivider()
                .setSpacing("2rem")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-divider style=\"--spacing:2rem;\"></wa-divider>", s);
    }

    @Test
    public void testRenderDividerWithAllCustomPropertiesHtml()
    {
        var s = new WaDivider()
                .setColor("#e91e63")
                .setWidth("3px")
                .setSpacing("1.5rem")
                .setVertical(true)
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-divider style=\"--color:#e91e63;--spacing:1.5rem;--width:3px;\" vertical></wa-divider>", s);
    }
    
    @Test
    public void testRenderDividerWithOrientationVerticalHtml()
    {
        var s = new WaDivider()
                .setOrientation("vertical")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-divider orientation=\"vertical\"></wa-divider>", s);
    }
    
    @Test
    public void testRenderDividerWithOrientationHorizontalHtml()
    {
        var s = new WaDivider()
                .setOrientation("horizontal")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-divider orientation=\"horizontal\"></wa-divider>", s);
    }
    
    @Test
    public void testRenderDividerWithOrientationAndCustomPropertiesHtml()
    {
        var s = new WaDivider()
                .setOrientation("vertical")
                .setColor("#2196f3")
                .setWidth("2px")
                .setSpacing("1rem")
                .toString(true);
        System.out.println(s);

        assertEquals("<wa-divider orientation=\"vertical\" style=\"--color:#2196f3;--spacing:1rem;--width:2px;\"></wa-divider>", s);
    }
    
    @Test
    public void testOrientationPrecedenceOverVerticalHtml()
    {
        var s = new WaDivider()
                .setOrientation("horizontal")
                .setVertical(true) // This should be ignored since orientation is specified
                .toString(true);
        System.out.println(s);

        // Orientation should take precedence over vertical
        assertEquals("<wa-divider orientation=\"horizontal\"></wa-divider>", s);
    }
}
