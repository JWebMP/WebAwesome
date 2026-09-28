package com.jwebmp.webawesome.components.taginput;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;

/** Java-authored wrapper for Web Awesome's {@code <wa-tag-input>} form control. */
@Getter
@NgImportReference(value = "WaTagInputDirective", reference = "angular-awesome")
@NgImportModule("WaTagInputDirective")
public class WaTagInput<J extends WaTagInput<J>> extends DivSimple<J>
{
    private String defaultValue;
    private String inputValue;
    private String delimiter;
    private Integer maxTags;
    private Integer minTags;
    private Boolean allowDuplicates;
    private Boolean withClear;
    private String placeholder;
    private String label;
    private String hint;
    private Boolean withLabel;
    private Boolean withHint;
    private Size size;
    private TagInputAppearance appearance;
    private Boolean pill;
    private Boolean readOnly;
    private Boolean required;
    private String autocapitalize;
    private String autocorrect;
    private String autocomplete;
    private String enterkeyhint;
    private Boolean spellcheck;
    private String inputmode;
    private String name;
    private Boolean disabled;
    private String form;

    private IComponentHierarchyBase<?, ?> labelSlot;
    private IComponentHierarchyBase<?, ?> start;
    private IComponentHierarchyBase<?, ?> end;
    private IComponentHierarchyBase<?, ?> clearIcon;
    private IComponentHierarchyBase<?, ?> hintSlot;

    private String inputEvent;
    private String changeEvent;
    private String blurEvent;
    private String focusEvent;
    private String createEvent;
    private String clearEvent;
    private String invalidEvent;

    public WaTagInput()
    {
        setTag("wa-tag-input");
    }

    @SuppressWarnings("unchecked") public J setValue(String value) { this.defaultValue = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setDefaultValue(String value) { this.defaultValue = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setInputValue(String value) { this.inputValue = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setDelimiter(String value) { this.delimiter = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setMaxTags(Integer value) { this.maxTags = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setMinTags(Integer value) { this.minTags = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setAllowDuplicates(Boolean value) { this.allowDuplicates = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setWithClear(Boolean value) { this.withClear = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setPlaceholder(String value) { this.placeholder = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setLabel(String value) { this.label = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setHint(String value) { this.hint = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setWithLabel(Boolean value) { this.withLabel = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setWithHint(Boolean value) { this.withHint = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setSize(Size value) { this.size = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setAppearance(TagInputAppearance value) { this.appearance = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setPill(Boolean value) { this.pill = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setReadOnly(Boolean value) { this.readOnly = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setRequired(Boolean value) { this.required = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setAutocapitalize(String value) { this.autocapitalize = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setAutocorrect(String value) { this.autocorrect = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setAutocomplete(String value) { this.autocomplete = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setEnterkeyhint(String value) { this.enterkeyhint = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setSpellcheck(Boolean value) { this.spellcheck = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setInputmode(String value) { this.inputmode = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setName(String value) { this.name = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setDisabled(Boolean value) { this.disabled = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setForm(String value) { this.form = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setLabelSlot(IComponentHierarchyBase<?, ?> value) { this.labelSlot = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setStart(IComponentHierarchyBase<?, ?> value) { this.start = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setEnd(IComponentHierarchyBase<?, ?> value) { this.end = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setClearIcon(IComponentHierarchyBase<?, ?> value) { this.clearIcon = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setHintSlot(IComponentHierarchyBase<?, ?> value) { this.hintSlot = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setInputEvent(String value) { this.inputEvent = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setChangeEvent(String value) { this.changeEvent = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setBlurEvent(String value) { this.blurEvent = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setFocusEvent(String value) { this.focusEvent = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setCreateEvent(String value) { this.createEvent = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setClearEvent(String value) { this.clearEvent = value; return (J) this; }
    @SuppressWarnings("unchecked") public J setInvalidEvent(String value) { this.invalidEvent = value; return (J) this; }

    /** Binds the live array-valued Angular input. */
    @SuppressWarnings("unchecked") public J bindValue(String expression) { addAttribute("[value]", expression); return (J) this; }
    @SuppressWarnings("unchecked") public J bindInputValue(String expression) { addAttribute("[inputValue]", expression); return (J) this; }
    @SuppressWarnings("unchecked") public J bindValidators(String expression) { addAttribute("[validators]", expression); return (J) this; }
    @SuppressWarnings("unchecked") public J bindValidationTarget(String expression) { addAttribute("[validationTarget]", expression); return (J) this; }

    @SuppressWarnings("unchecked") public J focus() { return (J) this; }
    @SuppressWarnings("unchecked") public J blur() { return (J) this; }
    @SuppressWarnings("unchecked") public J setCustomValidity(String message) { return (J) this; }
    @SuppressWarnings("unchecked") public J resetValidity() { return (J) this; }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            attribute("value", defaultValue);
            attribute("input-value", inputValue);
            if (delimiter != null && delimiter.isEmpty())
            {
                addAttribute("[delimiter]", "''");
            }
            else
            {
                attribute("delimiter", delimiter);
            }
            attribute("max-tags", maxTags);
            attribute("min-tags", minTags);
            booleanAttribute("allow-duplicates", allowDuplicates);
            booleanAttribute("with-clear", withClear);
            attribute("placeholder", placeholder);
            attribute("label", label);
            attribute("hint", hint);
            booleanAttribute("with-label", withLabel);
            booleanAttribute("with-hint", withHint);
            attribute("size", size);
            attribute("appearance", appearance);
            booleanAttribute("pill", pill);
            booleanAttribute("readonly", readOnly);
            booleanAttribute("required", required);
            attribute("autocapitalize", autocapitalize);
            attribute("autocorrect", autocorrect);
            attribute("autocomplete", autocomplete);
            attribute("enterkeyhint", enterkeyhint);
            if (spellcheck != null) addAttribute("spellcheck", spellcheck.toString());
            attribute("inputmode", inputmode);
            attribute("name", name);
            booleanAttribute("disabled", disabled);
            attribute("form", form);

            slot(labelSlot, "label");
            slot(start, "start");
            slot(end, "end");
            slot(clearIcon, "clear-icon");
            slot(hintSlot, "hint");

            event("(wa-input)", inputEvent);
            event("(wa-change)", changeEvent);
            event("(wa-blur)", blurEvent);
            event("(wa-focus)", focusEvent);
            event("(wa-create)", createEvent);
            event("(wa-clear)", clearEvent);
            event("(wa-invalid)", invalidEvent);
        }
        super.init();
    }

    private void attribute(String name, Object value)
    {
        if (value != null)
        {
            addAttribute(name, value.toString());
        }
    }

    private void booleanAttribute(String name, Boolean value)
    {
        if (Boolean.TRUE.equals(value)) addAttribute(name, "");
    }

    private void event(String name, String handler)
    {
        if (!Strings.isNullOrEmpty(handler)) addAttribute(name, handler);
    }

    private void slot(IComponentHierarchyBase<?, ?> component, String name)
    {
        if (component != null)
        {
            component.asAttributeBase().addAttribute("slot", name);
            add(component);
        }
    }
}
