package com.jwebmp.webawesome.components.randomcontent;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;

/**
 * The {@code WaRandomContent} component wraps the Web Awesome {@code <wa-random-content>} custom element.
 * <p>
 * It selects one or more of its direct element children at random and displays them, hiding the rest.
 * Only direct element children are eligible for selection; unselected children receive the {@code hidden}
 * attribute so they remain in the DOM but are not shown.
 * <p>
 * <b>Attributes</b>
 * <ul>
 *     <li>{@code items} – the number of children to show at once (default {@code 1}); the component clamps
 *     this to {@code [1, childCount]} at runtime.</li>
 *     <li>{@code mode} – the selection strategy ({@link RandomContentMode}, default {@code unique}).</li>
 *     <li>{@code autoplay} – when present, the displayed content rotates automatically.</li>
 *     <li>{@code autoplay-interval} – autoplay cadence in milliseconds (default {@code 3000}).</li>
 *     <li>{@code animation} – the entrance animation ({@link RandomContentAnimation}, default {@code none}).</li>
 * </ul>
 * <p>
 * <b>CSS custom properties</b>
 * <ul>
 *     <li>{@code --animation-duration} – entrance animation duration (default {@code 300ms}).</li>
 *     <li>{@code --animation-easing} – entrance animation easing (default {@code ease}).</li>
 *     <li>{@code --animation-translate} – translation distance for the {@code fade-*} animations
 *     (default {@code 0.5em}).</li>
 * </ul>
 * <p>
 * <b>Slots</b>
 * <ul>
 *     <li>{@code (default)} – the pool of children to choose from.</li>
 * </ul>
 * <p>
 * <b>Events</b>
 * <ul>
 *     <li>{@code wa-content-change} ({@link #EVENT_CONTENT_CHANGE}) – emitted whenever the displayed
 *     selection changes (first render, an explicit {@link #randomize()} call, and each autoplay tick).</li>
 * </ul>
 * <p>
 * <b>Methods</b>
 * <ul>
 *     <li>{@link #randomize()} – asks the underlying element to pick a new selection using the current
 *     {@code mode}. Implemented client-side; provided here for fluent chaining and documentation.</li>
 * </ul>
 *
 * <p><b>Usage Example</b></p>
 * <pre>{@code
 * WaRandomContent random = new WaRandomContent()
 *         .setItems(2)
 *         .setMode(RandomContentMode.SEQUENCE)
 *         .setAutoplay(true)
 *         .setAutoplayInterval(5000)
 *         .setAnimation(RandomContentAnimation.FADE_UP);
 * random.add(new Paragraph<>("First tip"));
 * random.add(new Paragraph<>("Second tip"));
 * random.add(new Paragraph<>("Third tip"));
 * }</pre>
 *
 * @param <J> the concrete CRTP type
 */
@Getter
@NgImportReference(value = "WaRandomContentDirective", reference = "angular-awesome")
@NgImportModule("WaRandomContentDirective")
public class WaRandomContent<J extends WaRandomContent<J>> extends DivSimple<J>
{
    /**
     * The name of the event emitted whenever the displayed selection changes.
     */
    public static final String EVENT_CONTENT_CHANGE = "wa-content-change";

    /**
     * The number of children to show at once. Clamped to {@code [1, childCount]} by the component
     * (default {@code 1}).
     */
    private Integer items;

    /**
     * The selection strategy (default {@code unique}).
     */
    private RandomContentMode mode;

    /**
     * Whether the displayed content rotates automatically.
     */
    private Boolean autoplay;

    /**
     * The autoplay cadence in milliseconds (default {@code 3000}).
     */
    private Integer autoplayInterval;

    /**
     * The entrance animation applied to newly displayed children (default {@code none}).
     */
    private RandomContentAnimation animation;

    /**
     * The {@code --animation-duration} CSS custom property (default {@code 300ms}).
     */
    private String animationDuration;

    /**
     * The {@code --animation-easing} CSS custom property (default {@code ease}).
     */
    private String animationEasing;

    /**
     * The {@code --animation-translate} CSS custom property (default {@code 0.5em}).
     */
    private String animationTranslate;

    /**
     * The handler expression bound to the {@code wa-content-change} event.
     */
    private String contentChangeEvent;

    /**
     * Creates a new WaRandomContent component with the tag {@code wa-random-content}.
     */
    public WaRandomContent()
    {
        setTag("wa-random-content");
    }

    /**
     * Sets the number of children to show at once.
     *
     * @param items the number of children (clamped to {@code [1, childCount]} at runtime)
     * @return this object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J setItems(Integer items)
    {
        this.items = items;
        return (J) this;
    }

    /**
     * Sets the selection strategy.
     *
     * @param mode the selection mode
     * @return this object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J setMode(RandomContentMode mode)
    {
        this.mode = mode;
        return (J) this;
    }

    /**
     * Sets whether the displayed content rotates automatically.
     *
     * @param autoplay {@code true} to enable autoplay
     * @return this object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J setAutoplay(Boolean autoplay)
    {
        this.autoplay = autoplay;
        return (J) this;
    }

    /**
     * Sets the autoplay cadence in milliseconds.
     *
     * @param autoplayInterval the interval in milliseconds
     * @return this object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J setAutoplayInterval(Integer autoplayInterval)
    {
        this.autoplayInterval = autoplayInterval;
        return (J) this;
    }

    /**
     * Sets the entrance animation applied to newly displayed children.
     *
     * @param animation the entrance animation
     * @return this object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J setAnimation(RandomContentAnimation animation)
    {
        this.animation = animation;
        return (J) this;
    }

    /**
     * Sets the {@code --animation-duration} CSS custom property.
     *
     * @param animationDuration a CSS time value (e.g. {@code 300ms})
     * @return this object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J setAnimationDuration(String animationDuration)
    {
        this.animationDuration = animationDuration;
        return (J) this;
    }

    /**
     * Sets the {@code --animation-easing} CSS custom property.
     *
     * @param animationEasing a CSS easing value (e.g. {@code ease})
     * @return this object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J setAnimationEasing(String animationEasing)
    {
        this.animationEasing = animationEasing;
        return (J) this;
    }

    /**
     * Sets the {@code --animation-translate} CSS custom property.
     *
     * @param animationTranslate a CSS length value (e.g. {@code 0.5em})
     * @return this object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J setAnimationTranslate(String animationTranslate)
    {
        this.animationTranslate = animationTranslate;
        return (J) this;
    }

    /**
     * Binds a handler expression to the {@code wa-content-change} event.
     *
     * @param contentChangeEvent the handler expression
     * @return this object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J setContentChangeEvent(String contentChangeEvent)
    {
        this.contentChangeEvent = contentChangeEvent;
        return (J) this;
    }

    /**
     * Asks the underlying element to select a new set of children using the current {@code mode}.
     * Implemented client-side; provided here for fluent chaining and documentation. Triggers the
     * {@code wa-content-change} event when the selection changes.
     *
     * @return this object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J randomize()
    {
        // Implemented in JavaScript by the underlying web component.
        return (J) this;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (items != null)
            {
                addAttribute("items", items.toString());
            }
            if (mode != null)
            {
                addAttribute("mode", mode.toString());
            }
            if (autoplay != null && autoplay)
            {
                addAttribute("autoplay", "");
            }
            if (autoplayInterval != null)
            {
                addAttribute("autoplay-interval", autoplayInterval.toString());
            }
            if (animation != null)
            {
                addAttribute("animation", animation.toString());
            }
            if (!Strings.isNullOrEmpty(animationDuration))
            {
                addStyle("--animation-duration", animationDuration);
            }
            if (!Strings.isNullOrEmpty(animationEasing))
            {
                addStyle("--animation-easing", animationEasing);
            }
            if (!Strings.isNullOrEmpty(animationTranslate))
            {
                addStyle("--animation-translate", animationTranslate);
            }
            if (!Strings.isNullOrEmpty(contentChangeEvent))
            {
                addAttribute(EVENT_CONTENT_CHANGE, contentChangeEvent);
            }
        }
        super.init();
    }
}
