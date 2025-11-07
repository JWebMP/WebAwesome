package com.jwebmp.webawesome.components.card;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.VariantCapable;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.button.Appearance;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaCard component represents a flexible container to group related content such as text, images, headers, and footers.
 * <p>
 * Attributes:
 * - `appearance`: Visual appearance style (accent, filled, outlined, plain)
 * - `size`: Size of the card (small, medium, large, inherit)
 * - `withHeader`: Indicates if the card has a header section
 * - `withImage`: Indicates if the card has an image section
 * - `withFooter`: Indicates if the card has a footer section
 * <p>
 * Styling Properties:
 * - `color`: Text color
 * - `backgroundColor`: Background color
 * - `fontSize`: Font size
 * - `borderRadius`: Corner radius (--border-radius)
 * - `borderColor`: Border color (--border-color)
 * - `innerBorderColor`: Divider line color (--inner-border-color)
 * - `borderWidth`: Border thickness (--border-width)
 * - `spacing`: Internal layout spacing (--spacing)
 * <p>
 * Slots:
 * - default: The main content of the card
 * - header: Optional content for the header area
 * - footer: Optional content for the footer area
 * - image: Optional image for the card top
 * <p>
 * CSS Parts:
 * - `image`: Wrapper for image slot
 * - `header`: Wrapper for header content
 * - `body`: Wrapper for main content
 * - `footer`: Wrapper for footer content
 * <p>
 * Usage examples:
 * <pre>
 * // Basic card with header and text
 * WaCard card = new WaCard();
 * card.setAppearance(Appearance.Outlined);
 * card.setSize(Size.Medium);
 * card.withHeader("Card Title");
 * card.withText("This is the card content.");
 *
 * // Card with image, header, text, and footer
 * WaCard card = new WaCard();
 * card.setAppearance(Appearance.Filled);
 * card.withImage(new Image("cat.jpg"));
 * card.withHeader("Cute Cat");
 * card.withText("This is a very adorable kitten that likes being inside cards.");
 * DivSimple<?> footer = new DivSimple<>();
 * footer.add(new WaButton("Adopt", Variant.Brand));
 * card.withFooter(footer);
 * </pre>
 */
@Getter
@Setter
@NgImportReference(value = "WaCardDirective", reference = "angular-awesome")
@NgImportModule("WaCardDirective")
public class WaCard<J extends WaCard<J>> extends DivSimple<J> implements VariantCapable<J>
{
    /**
     * The appearance of the card (accent, filled, outlined, plain)
     */
    private Appearance appearance;

    /**
     * The size of the card (small, medium, large)
     */
    private Size size;

    /**
     * Whether the card has a header
     */
    private Boolean withHeader;

    /**
     * Whether the card has an image
     */
    private Boolean withImage;

    /**
     * Whether the card has a footer
     */
    private Boolean withFooter;

    /**
     * The color of the card text
     */
    private String color;

    /**
     * The background color of the card
     */
    private String backgroundColor;

    /**
     * The font size of the card text
     */
    private String fontSize;

    /**
     * The border radius of the card
     */
    private String borderRadius;

    /**
     * The border color of the card
     */
    private String borderColor;

    /**
     * The inner border color of the card
     */
    private String innerBorderColor;

    /**
     * The border width of the card
     */
    private String borderWidth;

    /**
     * The spacing inside the card
     */
    private String spacing;

    /**
     * Creates a new WaCard component
     */
    public WaCard()
    {
        setTag("wa-card");
    }

    /**
     * Sets the width of the card
     *
     * @param width The width of the card
     * @return This object
     */
    public J withWidth(String width)
    {
        addStyle("width", width);
        return (J) this;
    }

    /**
     * Adds an image to the card
     *
     * @param image The image to add
     * @return This object
     */
    public J withImage(Image<?> image)
    {
        image.addAttribute("slot", "image");
        setWithImage(true);
        add(image);
        return (J) this;
    }

    /**
     * Adds a header to the card
     *
     * @param header The header text
     * @return This object
     */
    public J withHeader(String header)
    {
        DivSimple<?> headerDiv = new DivSimple<>();
        headerDiv.setText(header);
        setWithHeader(true);
        return withHeader(headerDiv);
    }

    /**
     * Adds text to the card
     *
     * @param text The text to add
     * @return This object
     */
    public J withText(String text)
    {
        add(new Paragraph<>(text).setTextOnly(true));
        return (J) this;
    }

    /**
     * Adds a component to the card body
     *
     * @param body The component to add
     * @return This object
     */
    public J withBody(IComponentHierarchyBase<?, ?> body)
    {
        add(body);
        return (J) this;
    }

    /**
     * Adds subtext to the card
     *
     * @param text The subtext to add
     * @return This object
     */
    public J withSubText(String text)
    {
        add(new SmallText<>(text));
        return (J) this;
    }

    /**
     * Adds a header component to the card
     *
     * @param header The header component
     * @return This object
     */
    public J withHeader(DivSimple<?> header)
    {
        header.addAttribute("slot", "header");
        setWithHeader(true);
        add(header);
        return (J) this;
    }

    /**
     * Adds a footer component to the card
     *
     * @param footer The footer component
     * @return This object
     */
    public J withFooter(DivSimple<?> footer)
    {
        footer.addAttribute("slot", "footer");
        setWithFooter(true);
        add(footer);
        return (J) this;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString());
            }
            if (size != null)
            {
                addAttribute("size", size.toString()
                                         .toLowerCase());
            }
            if (withHeader != null && withHeader)
            {
                addAttribute("with-header", "");
            }
            if (withImage != null && withImage)
            {
                addAttribute("with-image", "");
            }
            if (withFooter != null && withFooter)
            {
                addAttribute("with-footer", "");
            }
            if (color != null)
            {
                addStyle("color", color);
            }
            if (backgroundColor != null)
            {
                addStyle("background-color", backgroundColor);
            }
            if (fontSize != null)
            {
                addStyle("font-size", fontSize);
            }
            if (borderRadius != null)
            {
                addStyle("--border-radius", borderRadius);
            }
            if (borderColor != null)
            {
                addStyle("--border-color", borderColor);
            }
            if (innerBorderColor != null)
            {
                addStyle("--inner-border-color", innerBorderColor);
            }
            if (borderWidth != null)
            {
                addStyle("--border-width", borderWidth);
            }
            if (spacing != null)
            {
                addStyle("--spacing", spacing);
            }
        }
        super.init();
    }
}
