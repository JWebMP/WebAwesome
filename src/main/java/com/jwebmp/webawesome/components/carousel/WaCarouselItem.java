package com.jwebmp.webawesome.components.carousel;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Image;

/**
 * The {@code WaCarouselItem} class represents a single slide within a carousel component.
 * It can contain any content, but is commonly used with images.
 * <p>
 * This component is designed to be used as a child of the {@link WaCarousel} component.
 * It inherits the --aspect-ratio from the parent carousel.
 * </p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * WaCarousel carousel = new WaCarousel();
 * WaCarouselItem item1 = new WaCarouselItem();
 * item1.addImage(new Image<>().addAttribute("src", "image1.jpg").addAttribute("alt", "Slide 1"));
 * carousel.add(item1);
 * }</pre>
 *
 * @see WaCarousel
 */
@NgImportReference(value = "WaCarouselItemDirective", reference = "angular-awesome")
@NgImportModule("WaCarouselItemDirective")
public class WaCarouselItem<J extends WaCarouselItem<J>> extends DivSimple<J>
{
    /**
     * Creates a new WaCarouselItem component
     */
    public WaCarouselItem()
    {
        setTag("wa-carousel-item");
    }

    /**
     * Adds an image to this carousel item
     *
     * @param image The image to add
     * @return This object for method chaining
     */
    public WaCarouselItem addImage(Image<?> image)
    {
        add(image);
        return this;
    }
}
