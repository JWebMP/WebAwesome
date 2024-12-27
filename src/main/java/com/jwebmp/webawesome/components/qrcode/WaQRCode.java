package com.jwebmp.webawesome.components.qrcode;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;

/**
 * Represents a Web Awesome QR code component.
 * This class provides methods to configure the QR code's attributes.
 */
public class WaQRCode extends DivSimple<WaQRCode>
{
    /**
     * The value to encode in the QR code.
     * This can be null if not set.
     */
    private String value;

    /**
     * The fill color of the QR code.
     * This can be null if not set.
     */
    private String fill;

    /**
     * The background color of the QR code.
     * This can be null if not set.
     */
    private String background;

    /**
     * The size of the QR code.
     * This can be null if not set.
     */
    private String size;

    /**
     * The radius of the QR code's corners.
     * This can be null if not set.
     */
    private Double radius;

    /**
     * Default constructor for the WaQRCode class.
     * Initializes the component with a default tag of `wa-qr-code`.
     */
    public WaQRCode()
    {
        setTag("wa-qr-code");
    }

    /**
     * Sets the value to encode in the QR code.
     *
     * @param value The value to set.
     * @return The current instance of WaQRCode for method chaining.
     */
    public WaQRCode setValue(String value)
    {
        this.value = value;
        return this;
    }

    /**
     * Sets the fill color of the QR code.
     *
     * @param fill The fill color to set.
     * @return The current instance of WaQRCode for method chaining.
     */
    public WaQRCode setFill(String fill)
    {
        this.fill = fill;
        return this;
    }

    /**
     * Sets the background color of the QR code.
     *
     * @param background The background color to set.
     * @return The current instance of WaQRCode for method chaining.
     */
    public WaQRCode setBackground(String background)
    {
        this.background = background;
        return this;
    }

    /**
     * Sets the size of the QR code.
     *
     * @param size The size to set.
     * @return The current instance of WaQRCode for method chaining.
     */
    public WaQRCode setSize(String size)
    {
        this.size = size;
        return this;
    }

    /**
     * Sets the radius of the QR code's corners.
     *
     * @param radius The radius to set.
     * @return The current instance of WaQRCode for method chaining.
     */
    public WaQRCode setRadius(Double radius)
    {
        this.radius = radius;
        return this;
    }

    /**
     * Initializes the component.
     * Adds the attributes and styles to the component.
     */
    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(value))
            {
                addAttribute("value", value);
            }
            if (!Strings.isNullOrEmpty(fill))
            {
                addAttribute("fill", fill);
            }
            if (!Strings.isNullOrEmpty(background))
            {
                addAttribute("background", background);
            }
            if (!Strings.isNullOrEmpty(size))
            {
                addAttribute("size", size);
            }
            if (radius != null)
            {
                addAttribute("radius", radius.toString());
            }
        }
        super.init();
    }
}