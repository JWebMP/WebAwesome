package com.jwebmp.webawesome.components.button;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.html.inputs.InputButtonType;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
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
 * - `variant`: Specifies the visual style variant of the button (neutral, brand, success, warning, danger).
 * - `appearance`: Option to set the overall appearance (accent, outlined, filled, plain).
 * - `size`: Determines the size of the button (small, medium, large).
 * - `pill`: If true, gives the button a pill-shaped design with rounded edges.
 * - `caret`: Adds a caret indicator on the button for dropdowns.
 * - `disabled`: Marks the button as disabled, preventing user interaction.
 * - `loading`: Indicates a loading state on the button with a spinner.
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
 * Events:
 * - `waBlur`: Fires when the button loses focus.
 * - `waFocus`: Fires when the button receives focus.
 * - `waInvalid`: Emitted when form validation fails.
 * <p>
 * Slots:
 * - default: The button label.
 * - prefix: Left-aligned icon/element.
 * - suffix: Right-aligned icon/element.
 * <p>
 * Usage examples:
 * <pre>
 * WaButton button = new WaButton("Click Me", Variant.Brand);
 * button.setSize(Size.Large).setDisabled(false).setLoading(true);
 *
 * // With event handlers
 * button.setBlurEvent("handleBlur()");
 * button.setFocusEvent("handleFocus()");
 *
 * // With icons
 * WaIcon icon = new WaIcon("gear");
 * button.setPrefix(icon);
 * </pre>
 */
@Getter
@Setter
@NgImportReference(value = "WaButtonDirective", reference = "angular-awesome")
@NgImportModule("WaButtonDirective")
public class WaButton<J extends WaButton<J>> extends DivSimple<J> implements TooltipCapable<J>
{
    private Variant variant;
    private Appearance appearance;
    private Size size;
    private Boolean pill;
    private Boolean caret;
    private Boolean disabled;
    private Boolean loading;
    private IComponentHierarchyBase<GlobalChildren, ?> prefix;
    private IComponentHierarchyBase<GlobalChildren, ?> suffix;

    // Event handlers
    private String blurEvent;
    private String focusEvent;
    private String invalidEvent;

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
                addAttribute("variant", variant.toString()
                                               .toLowerCase());
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString()
                                                     .toLowerCase());
            }
            if (size != null)
            {
                addAttribute("size", size.toString()
                                         .toLowerCase());
            }
            if (pill != null && pill)
            {
                addAttribute("pill", "");
            }
            if (prefix != null)
            {
                prefix.asAttributeBase()
                      .addAttribute("slot", "start");
                add(prefix);
            }
            if (suffix != null)
            {
                suffix.asAttributeBase()
                      .addAttribute("slot", "end");
                add(suffix);
            }
            if (caret != null && caret)
            {
                addAttribute("withCaret", "");
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
                addAttribute("type", type.toString()
                                         .toLowerCase());
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

            // Add event handlers if specified
            if (!Strings.isNullOrEmpty(blurEvent))
            {
                addAttribute("wa-blur", blurEvent);
            }
            if (!Strings.isNullOrEmpty(focusEvent))
            {
                addAttribute("wa-focus", focusEvent);
            }
            if (!Strings.isNullOrEmpty(invalidEvent))
            {
                addAttribute("wa-invalid", invalidEvent);
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
