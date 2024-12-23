package com.jwebmp.webawesome.components.carousel;

import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@code WaCarousel} class represents a customizable carousel component
 * that can be added to a web application. This class provides features such as
 * pagination, navigation, mouse dragging, and looping functionality for creating
 * dynamic and interactive carousels.
 * <p>
 * The carousel is represented by the {@code <wa-carousel>} custom HTML tag. It
 * allows developers to configure various behaviors like paging, navigation,
 * mouse interaction, and infinite looping through attributes.
 * </p>
 *
 * <p><b>Features:</b></p>
 * <ul>
 *   <li>Pagination - Adds visual pagination indicators for navigation.</li>
 *   <li>Navigation - Provides navigation arrows to traverse slides/entries.</li>
 *   <li>Mouse Dragging - Enables navigation using mouse dragging on desktop devices.</li>
 *   <li>Loop - Ensures infinite scrolling by looping carousel items continuously.</li>
 * </ul>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * WaCarousel carousel = new WaCarousel();
 * carousel.setPagination(true); // Enable pagination indicators
 * carousel.setNavigation(true); // Enable navigation arrows
 * carousel.setMouseDragging(true); // Enable mouse slide dragging
 * carousel.setLoop(true); // Make the carousel loop infinitely
 * }</pre>
 * <p>
 * The resulting carousel will display enabled navigation mechanisms and loop through
 * items endlessly, creating a smooth user experience.
 * </p>
 *
 * @see com.jwebmp.webawesome.components.carousel
 */

@Getter
@Setter
public class WaCarousel extends DivSimple<WaCarousel>
{
    private Boolean pagination;
    private Boolean navigation;
    private Boolean mouseDragging;
    private Boolean loop;

    public WaCarousel()
    {
        setTag("wa-carousel");
    }

    /**
     * Initializes the {@code WaCarousel} component by setting its attributes
     * based on the configurations provided. This method ensures that attributes
     * like pagination, navigation, mouse dragging, and looping are applied to
     * the component dynamically if enabled.
     */
    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (pagination != null && pagination)
            {
                addAttribute("pagination", "");
            }
            if (navigation != null && navigation)
            {
                addAttribute("navigation", "");
            }
            if (mouseDragging != null && mouseDragging)
            {
                addAttribute("mouse-dragging", "");
            }
            if (loop != null && loop)
            {
                addAttribute("loop", "");
            }
        }
        super.init();
    }
}
