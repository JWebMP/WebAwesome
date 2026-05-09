package com.jwebmp.webawesome.components.carousel;


import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.TransitionTokenCapable;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
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
 *   <li>Autoplay - Enables automatic sliding with configurable interval.</li>
 *   <li>Slides Per Page - Controls how many slides to show at once.</li>
 *   <li>Slides Per Move - Controls how many slides to move on next/prev.</li>
 *   <li>Orientation - Supports horizontal or vertical layout.</li>
 *   <li>Custom Navigation Icons - Allows customization of navigation icons via slots.</li>
 * </ul>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * WaCarousel carousel = new WaCarousel();
 * carousel.setPagination(true); // Enable pagination indicators
 * carousel.setNavigation(true); // Enable navigation arrows
 * carousel.setMouseDragging(true); // Enable mouse slide dragging
 * carousel.setLoop(true); // Make the carousel loop infinitely
 * carousel.setAutoplay(true); // Enable autoplay
 * carousel.setAutoplayInterval(5000); // Set autoplay interval to 5 seconds
 * carousel.setSlidesPerPage(3); // Show 3 slides at once
 * carousel.setSlidesPerMove(1); // Move 1 slide at a time
 * carousel.setOrientation("vertical"); // Set vertical orientation
 * }</pre>
 * <p>
 * The resulting carousel will display enabled navigation mechanisms and loop through
 * items endlessly, creating a smooth user experience.
 * </p>
 *
 * @see com.jwebmp.webawesome.components.carousel
 */

@Getter
@NgImportReference(value = "WaCarouselDirective", reference = "angular-awesome")
@NgImportModule("WaCarouselDirective")
public class WaCarousel<J extends WaCarousel<J>> extends DivSimple<J> implements SpaceTokenCapable<J>, TransitionTokenCapable<J>
{
    /**
     * Displays slide indicator dots
     */
    private Boolean pagination;

    /**
     * Displays prev/next buttons
     */
    private Boolean navigation;

    /**
     * Enables click-and-drag mouse scrolling
     */
    private Boolean mouseDragging;

    /**
     * Enables infinite looping
     */
    private Boolean loop;

    /**
     * Enables automatic sliding
     */
    private Boolean autoplay;

    /**
     * Time in ms between auto slides (default 3000)
     */
    private Integer autoplayInterval;

    /**
     * How many slides to show at once
     */
    private Integer slidesPerPage;

    /**
     * How many slides to move on next/prev (default 1)
     */
    private Integer slidesPerMove;

    /**
     * Layout orientation (horizontal or vertical)
     */
    private String orientation;

    /**
     * Optional replacement icon for "next" arrow
     */
    private IComponentHierarchyBase<?, ?> nextIcon;

    /**
     * Optional replacement icon for "prev" arrow
     */
    private IComponentHierarchyBase<?, ?> previousIcon;

    /**
     * Creates a new WaCarousel component
     */
    @SuppressWarnings("unchecked")
    public J setPagination(Boolean pagination)
    {
        this.pagination = pagination;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setNavigation(Boolean navigation)
    {
        this.navigation = navigation;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setMouseDragging(Boolean mouseDragging)
    {
        this.mouseDragging = mouseDragging;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setLoop(Boolean loop)
    {
        this.loop = loop;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAutoplay(Boolean autoplay)
    {
        this.autoplay = autoplay;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAutoplayInterval(Integer autoplayInterval)
    {
        this.autoplayInterval = autoplayInterval;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSlidesPerPage(Integer slidesPerPage)
    {
        this.slidesPerPage = slidesPerPage;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSlidesPerMove(Integer slidesPerMove)
    {
        this.slidesPerMove = slidesPerMove;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setOrientation(String orientation)
    {
        this.orientation = orientation;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setNextIcon(IComponentHierarchyBase<?, ?> nextIcon)
    {
        this.nextIcon = nextIcon;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setPreviousIcon(IComponentHierarchyBase<?, ?> previousIcon)
    {
        this.previousIcon = previousIcon;
        return (J) this;
    }    public WaCarousel()
    {
        setTag("wa-carousel");
    }

    /**
     * Scrolls forward by slidesPerMove
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J next()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return (J) this;
    }

    /**
     * Scrolls backward by slidesPerMove
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J previous()
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return (J) this;
    }

    /**
     * Jumps to slide at index i
     *
     * @param index The index of the slide to jump to
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J goToSlide(int index)
    {
        // This would be implemented in JavaScript in the actual component
        // Here we just provide the method signature for documentation
        return (J) this;
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
            if (autoplay != null && autoplay)
            {
                addAttribute("autoplay", "");
            }
            if (autoplayInterval != null)
            {
                addAttribute("autoplay-interval", autoplayInterval.toString());
            }
            if (slidesPerPage != null)
            {
                addAttribute("slides-per-page", slidesPerPage.toString());
            }
            if (slidesPerMove != null)
            {
                addAttribute("slides-per-move", slidesPerMove.toString());
            }
            if (orientation != null)
            {
                addAttribute("orientation", orientation);
            }
            if (nextIcon != null)
            {
                nextIcon.asAttributeBase()
                        .addAttribute("slot", "next-icon");
                add(nextIcon);
            }
            if (previousIcon != null)
            {
                previousIcon.asAttributeBase()
                            .addAttribute("slot", "previous-icon");
                add(previousIcon);
            }
        }
        super.init();
    }
}