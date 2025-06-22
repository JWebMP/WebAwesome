package com.jwebmp.webawesome.test.comparison;

import com.jwebmp.core.base.html.Image;
import com.jwebmp.webawesome.components.comparison.WaComparison;
import com.jwebmp.webawesome.components.icon.WaIcon;
import com.jwebmp.webawesome.components.icon.IconVariant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaComparisonTest
{
    @Test
    public void testBasicRender()
    {
        var image1 = new Image<>("/assets/image-before.jpg");
        var image2 = new Image<>("/assets/image-after.jpg");

        var comparison = new WaComparison();
        comparison.setImage1(image1);
        comparison.setImage2(image2);

        var html = comparison.toString(true);
        System.out.println(html);

        assertTrue(html.contains("wa-comparison"));
        assertTrue(html.contains("slot=\"before\""));
        assertTrue(html.contains("slot=\"after\""));
        assertTrue(html.contains("/assets/image-before.jpg"));
        assertTrue(html.contains("/assets/image-after.jpg"));
    }

    @Test
    public void testWithPosition()
    {
        var image1 = new Image<>("/assets/image-before.jpg");
        var image2 = new Image<>("/assets/image-after.jpg");

        var comparison = new WaComparison();
        comparison.setImage1(image1);
        comparison.setImage2(image2);
        comparison.setPosition(25);

        var html = comparison.toString(true);
        System.out.println(html);

        assertTrue(html.contains("position=\"25\""));
    }

    @Test
    public void testWithCustomHandle()
    {
        var image1 = new Image<>("/assets/image-before.jpg");
        var image2 = new Image<>("/assets/image-after.jpg");
        var icon = new WaIcon<>();
        icon.setName("arrows-left-right");
        icon.setVariant(IconVariant.Solid);

        var comparison = new WaComparison();
        comparison.setImage1(image1);
        comparison.setImage2(image2);
        comparison.setIcon(icon);

        var html = comparison.toString(true);
        System.out.println(html);

        assertTrue(html.contains("slot=\"handle\""));
        assertTrue(html.contains("arrows-left-right"));
    }

    @Test
    public void testWithCustomStyles()
    {
        var image1 = new Image<>("/assets/image-before.jpg");
        var image2 = new Image<>("/assets/image-after.jpg");

        var comparison = new WaComparison();
        comparison.setImage1(image1);
        comparison.setImage2(image2);
        comparison.setDividerColor("#ff5722");
        comparison.setDividerWidth("3px");
        comparison.setHandleColor("#ff5722");
        comparison.setHandleSize("32px");

        var html = comparison.toString(true);
        System.out.println(html);

        assertTrue(html.contains("--divider-color:#ff5722"));
        assertTrue(html.contains("--divider-width:3px"));
        assertTrue(html.contains("--handle-color:#ff5722"));
        assertTrue(html.contains("--handle-size:32px"));
    }
}