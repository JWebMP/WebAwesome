package com.jwebmp.webawesome.test.carousel;

import com.jwebmp.webawesome.components.carousel.WaCarousel;
import com.jwebmp.webawesome.components.carousel.WaCarouselItem;
import com.jwebmp.core.base.html.Image;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaCarouselTest
{
    @Test
    public void testRenderBasicCarouselHtml()
    {
        var carousel = new WaCarousel();
        var item1 = new WaCarouselItem();
        var image1 = new Image<>();
        image1.addAttribute("src", "https://example.com/image1.jpg");
        image1.addAttribute("alt", "Slide 1");
        item1.addImage(image1);

        var item2 = new WaCarouselItem();
        var image2 = new Image<>();
        image2.addAttribute("src", "https://example.com/image2.jpg");
        image2.addAttribute("alt", "Slide 2");
        item2.addImage(image2);

        carousel.add(item1);
        carousel.add(item2);

        var s = carousel.toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-carousel>"));
        assertTrue(s.contains("<wa-carousel-item>"));
        assertTrue(s.contains("<img alt=\"Slide 1\" src=\"https://example.com/image1.jpg\"/>"));
        assertTrue(s.contains("<img alt=\"Slide 2\" src=\"https://example.com/image2.jpg\"/>"));
    }

    @Test
    public void testRenderCarouselWithNavigationAndPaginationHtml()
    {
        var carousel = new WaCarousel();
        carousel.setNavigation(true);
        carousel.setPagination(true);

        var item = new WaCarouselItem();
        var image = new Image<>();
        image.addAttribute("src", "https://example.com/image.jpg");
        image.addAttribute("alt", "Slide");
        item.addImage(image);

        carousel.add(item);

        var s = carousel.toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-carousel navigation pagination>"));
        assertTrue(s.contains("<wa-carousel-item>"));
        assertTrue(s.contains("<img alt=\"Slide\" src=\"https://example.com/image.jpg\"/>"));
    }

    @Test
    public void testRenderCarouselWithAutoplayHtml()
    {
        var carousel = new WaCarousel();
        carousel.setAutoplay(true);
        carousel.setAutoplayInterval(5000);

        var item = new WaCarouselItem();
        var image = new Image<>();
        image.addAttribute("src", "https://example.com/image.jpg");
        image.addAttribute("alt", "Slide");
        item.addImage(image);

        carousel.add(item);

        var s = carousel.toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-carousel autoplay autoplay-interval=\"5000\">"));
        assertTrue(s.contains("<wa-carousel-item>"));
        assertTrue(s.contains("<img alt=\"Slide\" src=\"https://example.com/image.jpg\"/>"));
    }

    @Test
    public void testRenderCarouselWithLoopAndMouseDraggingHtml()
    {
        var carousel = new WaCarousel();
        carousel.setLoop(true);
        carousel.setMouseDragging(true);

        var item = new WaCarouselItem();
        var image = new Image<>();
        image.addAttribute("src", "https://example.com/image.jpg");
        image.addAttribute("alt", "Slide");
        item.addImage(image);

        carousel.add(item);

        var s = carousel.toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-carousel loop mouse-dragging>"));
        assertTrue(s.contains("<wa-carousel-item>"));
        assertTrue(s.contains("<img alt=\"Slide\" src=\"https://example.com/image.jpg\"/>"));
    }

    @Test
    public void testRenderCarouselWithOrientationHtml()
    {
        var carousel = new WaCarousel();
        carousel.setOrientation("vertical");

        var item = new WaCarouselItem();
        var image = new Image<>();
        image.addAttribute("src", "https://example.com/image.jpg");
        image.addAttribute("alt", "Slide");
        item.addImage(image);

        carousel.add(item);

        var s = carousel.toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-carousel orientation=\"vertical\">"));
        assertTrue(s.contains("<wa-carousel-item>"));
        assertTrue(s.contains("<img alt=\"Slide\" src=\"https://example.com/image.jpg\"/>"));
    }

    @Test
    public void testRenderCarouselWithSlidesPerPageAndMoveHtml()
    {
        var carousel = new WaCarousel();
        carousel.setSlidesPerPage(3);
        carousel.setSlidesPerMove(1);

        for (int i = 1; i <= 5; i++) {
            var item = new WaCarouselItem();
            var image = new Image<>();
            image.addAttribute("src", "https://example.com/image" + i + ".jpg");
            image.addAttribute("alt", "Slide " + i);
            item.addImage(image);
            carousel.add(item);
        }

        var s = carousel.toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-carousel slides-per-move=\"1\" slides-per-page=\"3\">"));
        assertTrue(s.contains("<wa-carousel-item>"));
        assertTrue(s.contains("<img alt=\"Slide 1\" src=\"https://example.com/image1.jpg\"/>"));
        assertTrue(s.contains("<img alt=\"Slide 5\" src=\"https://example.com/image5.jpg\"/>"));
    }

    @Test
    public void testRenderCarouselWithCustomNavigationIconsHtml()
    {
        var carousel = new WaCarousel();
        carousel.setNavigation(true);

        var prevIcon = new WaIcon<>();
        prevIcon.setName("chevron-left");
        carousel.setPreviousIcon(prevIcon);

        var nextIcon = new WaIcon<>();
        nextIcon.setName("chevron-right");
        carousel.setNextIcon(nextIcon);

        var item = new WaCarouselItem();
        var image = new Image<>();
        image.addAttribute("src", "https://example.com/image.jpg");
        image.addAttribute("alt", "Slide");
        item.addImage(image);

        carousel.add(item);

        var s = carousel.toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-carousel navigation>"));
        assertTrue(s.contains("<wa-icon name=\"chevron-left\" slot=\"previous-icon\"></wa-icon>"));
        assertTrue(s.contains("<wa-icon name=\"chevron-right\" slot=\"next-icon\"></wa-icon>"));
        assertTrue(s.contains("<wa-carousel-item>"));
        assertTrue(s.contains("<img alt=\"Slide\" src=\"https://example.com/image.jpg\"/>"));
    }

    @Test
    public void testRenderCarouselWithAllAttributesHtml()
    {
        var carousel = new WaCarousel();
        carousel.setNavigation(true);
        carousel.setPagination(true);
        carousel.setLoop(true);
        carousel.setMouseDragging(true);
        carousel.setAutoplay(true);
        carousel.setAutoplayInterval(4000);
        carousel.setSlidesPerPage(2);
        carousel.setSlidesPerMove(1);
        carousel.setOrientation("horizontal");

        var prevIcon = new WaIcon<>();
        prevIcon.setName("chevron-left");
        carousel.setPreviousIcon(prevIcon);

        var nextIcon = new WaIcon<>();
        nextIcon.setName("chevron-right");
        carousel.setNextIcon(nextIcon);

        for (int i = 1; i <= 3; i++) {
            var item = new WaCarouselItem();
            var image = new Image<>();
            image.addAttribute("src", "https://example.com/image" + i + ".jpg");
            image.addAttribute("alt", "Slide " + i);
            item.addImage(image);
            carousel.add(item);
        }

        var s = carousel.toString(true);

        System.out.println(s);

        assertTrue(s.contains("<wa-carousel autoplay autoplay-interval=\"4000\" loop mouse-dragging navigation orientation=\"horizontal\" pagination slides-per-move=\"1\" slides-per-page=\"2\">"));
        assertTrue(s.contains("<wa-icon name=\"chevron-left\" slot=\"previous-icon\"></wa-icon>"));
        assertTrue(s.contains("<wa-icon name=\"chevron-right\" slot=\"next-icon\"></wa-icon>"));
        assertTrue(s.contains("<wa-carousel-item>"));
        assertTrue(s.contains("<img alt=\"Slide 1\" src=\"https://example.com/image1.jpg\"/>"));
        assertTrue(s.contains("<img alt=\"Slide 3\" src=\"https://example.com/image3.jpg\"/>"));
    }
}
