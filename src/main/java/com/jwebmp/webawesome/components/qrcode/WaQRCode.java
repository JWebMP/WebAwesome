package com.jwebmp.webawesome.components.qrcode;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
/**
 * Represents a Web Awesome QR code component.
 * This class provides methods to configure the QR code's attributes.
 */
@Getter
@NgImportReference(value = "WaQRCodeDirective", reference = "angular-awesome")
@NgImportModule("WaQRCodeDirective")
public class WaQRCode<J extends WaQRCode<J>> extends DivSimple<J>
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
     * The error correction level of the QR code.
     * Valid values: 'L', 'M', 'Q', 'H'
     * This can be null if not set.
     */
    private String errorCorrection;

    /**
     * The accessible label for the QR code.
     * If not set, the value will be used as the label.
     * This can be null if not set.
     */
    private String label;

    /**
     * Event handler for when the QR code gains focus.
     */
    private String focusEvent;

    /**
     * Event handler for when the QR code loses focus.
     */
    private String blurEvent;

    /**
     * Optional component to display inside the QR code.
     */
    private IComponentHierarchyBase<?, ?> prefix;

    /**
     * Default constructor for the WaQRCode class.
     * Initializes the component with a default tag of `wa-qr-code`.
     */
    public WaQRCode()
    {
        setTag("wa-qr-code");
    }

    @SuppressWarnings("unchecked")
    public J setValue(String value)
    {
        this.value = value;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setFill(String fill)
    {
        this.fill = fill;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setBackground(String background)
    {
        this.background = background;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSize(String size)
    {
        this.size = size;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setRadius(Double radius)
    {
        this.radius = radius;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setErrorCorrection(String errorCorrection)
    {
        this.errorCorrection = errorCorrection;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setFocusEvent(String focusEvent)
    {
        this.focusEvent = focusEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setBlurEvent(String blurEvent)
    {
        this.blurEvent = blurEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPrefix(IComponentHierarchyBase<?, ?> prefix)
    {
        this.prefix = prefix;
        return (J) this;
    }

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
            if (!Strings.isNullOrEmpty(errorCorrection))
            {
                addAttribute("error-correction", errorCorrection);
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (!Strings.isNullOrEmpty(focusEvent))
            {
                addAttribute("focus", focusEvent);
            }
            if (!Strings.isNullOrEmpty(blurEvent))
            {
                addAttribute("blur", blurEvent);
            }
            if (prefix != null)
            {
                prefix.asAttributeBase()
                      .addAttribute("slot", "prefix");
                add(prefix);
            }
        }
        super.init();
    }

    @Override
    @SuppressWarnings("unchecked")
    public J bind(String variableName)
    {
        addAttribute("[value]", variableName);
        addAttribute("(valueChange)", variableName + " = $event");
        return (J) this;
    }
}