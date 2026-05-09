package com.jwebmp.webawesome.components.button;


import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.ShadowTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.FocusTokenCapable;
import com.jwebmp.webawesome.components.TransitionTokenCapable;
import com.jwebmp.webawesome.components.TypographyTokenCapable;
import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.inputs.InputButtonType;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.*;
import lombok.Getter;
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
@NgImportReference(value = "WaButtonDirective", reference = "angular-awesome")
@NgImportModule("WaButtonDirective")
public class WaButton<J extends WaButton<J>> extends DivSimple<J> implements TooltipCapable<J>, VariantCapable<J>, GapCapable<J>, BorderTokenCapable<J>, ShadowTokenCapable<J>, SpaceTokenCapable<J>, FocusTokenCapable<J>, TransitionTokenCapable<J>, TypographyTokenCapable<J>
{
    private Variant variant;
    private Appearance appearance;
    private Size size;
    private Boolean pill;
    private Boolean caret;
    private Boolean disabled;
    private Boolean loading;

    /**
     * SSR boolean — renders with-start attribute when truthy
     */
    private Boolean withStart;

    /**
     * SSR boolean — renders with-end attribute when truthy
     */
    private Boolean withEnd;

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
    @SuppressWarnings("unchecked")
    public J setVariant(Variant variant)
    {
        this.variant = variant;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setAppearance(Appearance appearance)
    {
        this.appearance = appearance;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSize(Size size)
    {
        this.size = size;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setPill(Boolean pill)
    {
        this.pill = pill;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setCaret(Boolean caret)
    {
        this.caret = caret;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setLoading(Boolean loading)
    {
        this.loading = loading;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWithStart(Boolean withStart)
    {
        this.withStart = withStart;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setWithEnd(Boolean withEnd)
    {
        this.withEnd = withEnd;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setPrefix(IComponentHierarchyBase<GlobalChildren, ?> prefix)
    {
        this.prefix = prefix;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setSuffix(IComponentHierarchyBase<GlobalChildren, ?> suffix)
    {
        this.suffix = suffix;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setBlurEvent(String blurEvent)
    {
        this.blurEvent = blurEvent;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFocusEvent(String focusEvent)
    {
        this.focusEvent = focusEvent;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setInvalidEvent(String invalidEvent)
    {
        this.invalidEvent = invalidEvent;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setType(InputButtonType<?> type)
    {
        this.type = type;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFormId(String formId)
    {
        this.formId = formId;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFormAction(String formAction)
    {
        this.formAction = formAction;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFormEnctype(String formEnctype)
    {
        this.formEnctype = formEnctype;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFormMethod(String formMethod)
    {
        this.formMethod = formMethod;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFormNoValidate(Boolean formNoValidate)
    {
        this.formNoValidate = formNoValidate;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setFormTarget(String formTarget)
    {
        this.formTarget = formTarget;
        return (J) this;
    }    public WaButton()
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
            if (withStart != null && withStart)
            {
                addAttribute("with-start", "");
            }
            if (withEnd != null && withEnd)
            {
                addAttribute("with-end", "");
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
    @SuppressWarnings("unchecked")
    public J setAsLink(String href, String target, String download)
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
        return (J) this;
    }

}