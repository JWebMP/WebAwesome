package com.jwebmp.webawesome.components.button;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.html.inputs.InputButtonType;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.TooltipCapable;
import com.jwebmp.webawesome.components.Variant;
import lombok.Getter;
import lombok.Setter;

/**
 * A customizable button component class designed for web applications.
 * Provides various properties and methods to configure appearance, behavior, and interactivity.
 * <p>
 * Attributes:
 * - `variant`: Specifies the visual style variant of the button.
 * - `appearance`: Option to set the overall appearance (e.g., primary, secondary).
 * - `size`: Determines the size of the button (e.g., small, large).
 * - `asPill`: If true, gives the button a pill-shaped design.
 * - `caret`: Adds a caret indicator on the button for dropdowns.
 * - `disabled`: Marks the button as disabled, preventing user interaction.
 * - `loading`: Indicates a loading state on the button.
 * - `prefix` & `suffix`: Components attached to the button as prefix or suffix, typically icons.
 * - `text`: Text content displayed on the button.
 * - `type`: HTML button type such as submit, reset, or button.
 * - `formId`: Links this button with a specific form by ID.
 * - `formAction`: URL where form data is sent when the button is clicked.
 * - `formEnctype`: Defines how form data should be encoded before sending.
 * - `formMethod`: HTTP method to use for submitting form data (e.g., POST).
 * - `formNoValidate`: If true, skips validation when submitting the form.
 * - `formTarget`: Designates the target for form submission (e.g., `_blank` to open in a new tab).
 * <p>
 * Usage examples:
 * <pre>
 * WaButton button = new WaButton("Click Me", Variant.Primary);
 * button.setSize(Size.Large).setDisabled(false).setLoading(true);
 * </pre>
 */
@Getter
@Setter
public class WaButton extends DivSimple<WaButton> implements TooltipCapable<WaButton>
{
    private Variant variant;
    private Appearance appearance;
    private Size size;
    private Boolean asPill;
    private Boolean caret;
    private Boolean disabled;
    private Boolean loading;
    private IComponentHierarchyBase<?, ?> prefix;
    private IComponentHierarchyBase<?, ?> suffix;

    private String text;
    private InputButtonType<?> type;

    private String formId;
    private String formAction;
    private String formEnctype;
    private String formMethod;
    private Boolean formNoValidate;
    private String formTarget;

    /**
     * Default constructor for the WaButton class.
     * Initializes the component with a default tag of `wa-button`.
     */
    public WaButton()
    {
        setTag("wa-button");
    }

    /**
     * Constructor that initializes the button and sets its text content.
     *
     * @param text The text to display on the button.
     */
    public WaButton(String text)
    {
        this();
        setText(text);
    }

    /**
     * Constructor that initializes the button with text content and a specific variant.
     *
     * @param text    The text to display on the button.
     * @param variant The visual variant of the button (e.g., Primary, Secondary).
     */
    public WaButton(String text, Variant variant)
    {
        this();
        setText(text);
        this.variant = variant;
    }

    /**
     * Initializes the attributes and child components of the button.
     * Ensures attributes such as `variant`, `size`, `appearance`, and others are applied to the button.
     * Adds prefix and suffix components if specified.
     */
    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (variant != null)
            {
                addAttribute("variant", variant.toString().toLowerCase());
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString().toLowerCase());
            }
            if (size != null)
            {
                addAttribute("size", size.toString().toLowerCase());
            }
            if (asPill != null && asPill)
            {
                addAttribute("pill", "");
            }
            if (prefix != null)
            {
                prefix.asAttributeBase().addAttribute("slot", "prefix");
                add(prefix);
            }
            if (!Strings.isNullOrEmpty(text))
            {
                add(new Paragraph<>(text).setTextOnly(true));
            }
            if (suffix != null)
            {
                suffix.asAttributeBase().addAttribute("slot", "suffix");
                add(suffix);
            }
            if (caret != null && caret)
            {
                addAttribute("caret", "");
            }
            if (loading != null && loading)
            {
                addAttribute("loading", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (type != null)
            {
                addAttribute("type", type.toString().toLowerCase());
            }
            if (formId != null)
            {
                addAttribute("form", formId);
            }
            if (formAction != null)
            {
                addAttribute("formAction", formAction);
            }
            if (formEnctype != null)
            {
                addAttribute("formEnctype", formEnctype);
            }
            if (formMethod != null)
            {
                addAttribute("formMethod", formMethod);
            }
            if (formNoValidate != null && formNoValidate)
            {
                addAttribute("formNoValidate", "");
            }
            if (formTarget != null)
            {
                addAttribute("formTarget", formTarget);
            }

        }
        super.init();
    }

    /**
     * Configures the button to function as a link with optional target and download properties.
     *
     * @param href     The URL that the button-link navigates to.
     * @param target   Specifies where to open the linked document (e.g., `_blank`).
     * @param download Specifies a filename for downloading content from the link.
     * @return The current instance of WaButton for method chaining.
     */
    public WaButton setAsLink(String href, String target, String download)
    {
        if (!Strings.isNullOrEmpty(href))
        {
            addAttribute("href", href);
        }
        if (!Strings.isNullOrEmpty(target))
        {
            addAttribute("target", target);
        }
        if (!Strings.isNullOrEmpty(download))
        {
            addAttribute("download", download);
        }
        return this;
    }

}
