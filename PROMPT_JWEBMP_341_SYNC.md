# 🔄 JWebMP WebAwesome Wrapper — Sync to Angular Awesome 3.4.1

Apply the following changes to the JWebMP WebAwesome Java wrapper project to align with the Angular Awesome 3.4.1 update. All changes below mirror additions, renames, and updates already applied to the Angular directive layer in `angular-awesome`. The source of truth is `llms.txt` (Web Awesome 3.4.1) and the current `.directive.ts` / `.component.ts` files in `src/directives/`.

**Conventions reminder (JWebMP):**
- CRTP fluent setters only (`return (J) this;`); no builders.
- All classes non-final; use `Component<J extends Component<J>>` pattern.
- Enums for constrained values (Variant, Appearance, Size, etc.); lowercase `.toString()` for attribute values.
- HTML attribute names are kebab-case (`with-hint`, `icon-placement`, `auto-width`, etc.).
- Use JSpecify `@NonNull` / `@Nullable` defaults; Log4j2 logging.
- Do not generate inline HTML; build markup from JWebMP components.
- After each component update, update the corresponding `.rules.md` under `rules/generative/frontend/jwebmp/webawesome/`.

---

## 1) WaBadge — Add `attention` property

**Angular source:** `src/directives/badge/badge.component.ts`

**Change:** New `@Input() attention` added with type `'none' | 'pulse' | 'bounce'`.

**Java action:**
- Add an enum `BadgeAttention` with values: `None`, `Pulse`, `Bounce` (kebab/lowercase attribute output).
- Add CRTP setter `setAttention(BadgeAttention attention)` → sets HTML attribute `attention`.
- Update `badge.rules.md` in the JWebMP rules to document the new property.

```java
// Example
public enum BadgeAttention {
    None, Pulse, Bounce;
    @Override public String toString() { return name().toLowerCase(); }
}

public J setAttention(BadgeAttention attention) {
    addAttribute("attention", attention.toString());
    return (J) this;
}
```

---

## 2) WaCard — Add `withMedia` and `orientation` properties

**Angular source:** `src/directives/card/card.directive.ts`

**Changes:**
- New `@Input() withMedia?: boolean | string` → boolean attribute `with-media`
- New `@Input() orientation?: 'horizontal' | 'vertical'` → attribute `orientation`

**Java action:**
- Add `setWithMedia(boolean)` → boolean attribute `with-media`.
- Add enum `CardOrientation { Horizontal, Vertical }` and setter `setOrientation(CardOrientation)` → attribute `orientation`.
- Update `card.rules.md`.

```java
public J setWithMedia(boolean withMedia) {
    if (withMedia) addAttribute("with-media", "");
    else removeAttribute("with-media");
    return (J) this;
}

public enum CardOrientation {
    Horizontal, Vertical;
    @Override public String toString() { return name().toLowerCase(); }
}

public J setOrientation(CardOrientation orientation) {
    addAttribute("orientation", orientation.toString());
    return (J) this;
}
```

---

## 3) WaCombobox — Add 8 new inputs + `wa-create` event

**Angular source:** `src/directives/combobox/combobox.directive.ts`

**New inputs:**
| Angular Input     | HTML Attribute      | Type / Enum                                              |
|-------------------|---------------------|----------------------------------------------------------|
| `inputValue`      | `input-value`       | `String`                                                 |
| `open`            | `open`              | `boolean`                                                |
| `allowCreate`     | `allow-create`      | `boolean`                                                |
| `autocapitalize`  | `autocapitalize`    | `String` (off, none, on, sentences, words, characters)   |
| `autocorrect`     | `autocorrect`       | `String` (on, off)                                       |
| `inputmode`       | `inputmode`         | `String` (none, text, decimal, numeric, tel, search, email, url) |
| `enterkeyhint`    | `enterkeyhint`      | `String` (enter, done, go, next, previous, search, send) |
| `spellcheck`      | `spellcheck`        | `boolean`                                                |

**New event:** `wa-create` — fires when the user creates a new option via `allowCreate`.

**Java action:**
- Add CRTP setters for each new property with appropriate enums where practical (`InputMode`, `EnterKeyHint`, `AutoCapitalize`).
- Add `setOpen(boolean)` → boolean attribute `open`.
- Add `setAllowCreate(boolean)` → boolean attribute `allow-create`.
- Add `setInputValue(String)` → attribute `input-value`.
- Add `setSpellcheck(boolean)` → boolean attribute `spellcheck`.
- Register `wa-create` event handler support.
- Update `combobox.rules.md` (JWebMP rules) — add all new attributes and the event.

---

## 4) WaDetails — Rename `iconPosition` → `iconPlacement`

**Angular source:** `src/directives/details/details.directive.ts`

**Change:** The property `iconPosition` has been renamed to `iconPlacement`. The Angular directive keeps a deprecated backwards-compatible alias (`@Input() set iconPosition(...)`). The HTML attribute is now `icon-placement` (was `icon-position`).

**Java action:**
- Rename `setIconPosition(...)` to `setIconPlacement(...)`.
- Change the HTML attribute from `icon-position` to `icon-placement`.
- Add `@Deprecated` `setIconPosition(...)` that delegates to `setIconPlacement(...)`.
- Update `details.rules.md`.

```java
public J setIconPlacement(IconPlacement placement) {
    addAttribute("icon-placement", placement.toString());
    return (J) this;
}

/** @deprecated Use {@link #setIconPlacement} instead. */
@Deprecated
public J setIconPosition(IconPlacement placement) {
    return setIconPlacement(placement);
}
```

---

## 5) WaDropdown — Add `open` and `size` properties

**Angular source:** `src/directives/dropdown/dropdown.directive.ts`

**Changes:**
- New `@Input() open?: boolean | string` → boolean attribute `open`
- New `@Input() size?: 'small' | 'medium' | 'large'` → attribute `size`

**Java action:**
- Add `setOpen(boolean)` → boolean attribute `open`.
- Add `setSize(DropdownSize)` or reuse existing `Size` enum → attribute `size`.
- Update `dropdown.rules.md` (JWebMP rules if exists, or create).

---

## 6) WaDropdownItem — Add `submenuOpen`, update `variant` type

**Angular source:** `src/directives/dropdown/dropdown-item.directive.ts`

**Changes:**
- New `@Input() submenuOpen?: boolean | string` → boolean attribute `submenu-open`
- `variant` type now includes `'default'` in addition to `'danger'`

**Java action:**
- Add `setSubmenuOpen(boolean)` → boolean attribute `submenu-open`.
- Update `DropdownItemVariant` enum to include `Default` alongside `Danger`.
- Update rules docs.

---

## 7) WaIcon — Add 5 new properties

**Angular source:** `src/directives/icon/icon.directive.ts`

**New inputs:**
| Angular Input   | HTML Attribute   | Type                         |
|-----------------|------------------|------------------------------|
| `autoWidth`     | `auto-width`     | `boolean`                    |
| `swapOpacity`   | `swap-opacity`   | `boolean`                    |
| `rotate`        | `rotate`         | `number` (degrees)           |
| `flip`          | `flip`           | `'x' | 'y' | 'both'`        |
| `animation`     | `animation`      | `String`                     |

**Java action:**
- Add `setAutoWidth(boolean)` → boolean attribute `auto-width`.
- Add `setSwapOpacity(boolean)` → boolean attribute `swap-opacity`.
- Add `setRotate(int degrees)` → attribute `rotate`.
- Add enum `IconFlip { X, Y, Both }` and `setFlip(IconFlip)` → attribute `flip`.
- Add `setAnimation(String)` → attribute `animation`.
- Update `icon.rules.md`.

---

## 8) WaIntersectionObserver — Add `root`, `intersectClass`, `once`

**Angular source:** `src/directives/intersection-observer/intersection-observer.directive.ts`

**New inputs:**
| Angular Input     | HTML Attribute    | Type      |
|-------------------|-------------------|-----------|
| `root`            | `root`            | `String`  |
| `intersectClass`  | `intersect-class` | `String`  |
| `once`            | `once`            | `boolean` |

**Java action:**
- Add `setRoot(String)` → attribute `root`.
- Add `setIntersectClass(String)` → attribute `intersect-class`.
- Add `setOnce(boolean)` → boolean attribute `once`.
- Update `intersection-observer.rules.md` (JWebMP rules) or create if absent.

---

## 9) WaMutationObserver — Add `attr`, `attrOldValue`, `charData`, `charDataOldValue`, `childList`

**Angular source:** `src/directives/mutation-observer/mutation-observer.directive.ts`

**New inputs:**
| Angular Input       | HTML Attribute          | Type      |
|---------------------|-------------------------|-----------|
| `attr`              | `attr`                  | `String`  |
| `attrOldValue`      | `attr-old-value`        | `boolean` |
| `charData`          | `char-data`             | `boolean` |
| `charDataOldValue`  | `char-data-old-value`   | `boolean` |
| `childList`         | `child-list`            | `boolean` |

**Java action:**
- Add `setAttr(String)` → attribute `attr` (e.g., `"*"` or space-separated list).
- Add `setAttrOldValue(boolean)` → boolean attribute `attr-old-value`.
- Add `setCharData(boolean)` → boolean attribute `char-data`.
- Add `setCharDataOldValue(boolean)` → boolean attribute `char-data-old-value`.
- Add `setChildList(boolean)` → boolean attribute `child-list`.
- Update `mutation-observer.rules.md` (JWebMP rules) or create if absent.

---

## 10) WaPopover — Add `open` and `withoutArrow`

**Angular source:** `src/directives/popover/popover.directive.ts`

**New inputs:**
| Angular Input   | HTML Attribute    | Type      |
|-----------------|-------------------|-----------|
| `open`          | `open`            | `boolean` |
| `withoutArrow`  | `without-arrow`   | `boolean` |

**Java action:**
- Add `setOpen(boolean)` → boolean attribute `open`.
- Add `setWithoutArrow(boolean)` → boolean attribute `without-arrow`.
- Update `popover.rules.md`.

---

## 11) WaPage — Add `disableNavigationToggle`

**Angular source:** `src/directives/page/page.component.ts`

**Change:** New `@Input() disableNavigationToggle?: boolean | string` → boolean attribute `disable-navigation-toggle`.

**Java action:**
- Add `setDisableNavigationToggle(boolean)` → boolean attribute `disable-navigation-toggle`.
- Update `page.rules.md` (JWebMP rules) or the page-configurator rules as appropriate.

---

## 12) WaSelect — Add `name`, `open`, `withLabel`, `withHint`

**Angular source:** `src/directives/select/select.directive.ts`

**New inputs:**
| Angular Input | HTML Attribute | Type      |
|---------------|----------------|-----------|
| `name`        | `name`         | `String`  |
| `open`        | `open`         | `boolean` |
| `withLabel`   | `with-label`   | `boolean` |
| `withHint`    | `with-hint`    | `boolean` |

**Java action:**
- Add `setName(String)` → attribute `name`.
- Add `setOpen(boolean)` → boolean attribute `open`.
- Add `setWithLabel(boolean)` → boolean attribute `with-label`.
- Add `setWithHint(boolean)` → boolean attribute `with-hint`.
- Update `select.rules.md`.

---

## 13) WaSwitch — Add `name`, `value`, `checked`, `required`, `withHint`

**Angular source:** `src/directives/switch/switch.directive.ts`

**New inputs:**
| Angular Input | HTML Attribute | Type      |
|---------------|----------------|-----------|
| `name`        | `name`         | `String`  |
| `value`       | `value`        | `String`  |
| `checked`     | `checked`      | `boolean` |
| `required`    | `required`     | `boolean` |
| `withHint`    | `with-hint`    | `boolean` |

**Java action:**
- Add `setName(String)` → attribute `name`.
- Add `setValue(String)` → attribute `value`.
- Add `setChecked(boolean)` → boolean attribute `checked`.
- Add `setRequired(boolean)` → boolean attribute `required`.
- Add `setWithHint(boolean)` → boolean attribute `with-hint`.
- Update `switch.rules.md`.

---

## 14) WaRating — Update `getSymbol` signature

**Angular source:** `src/directives/rating/rating.directive.ts`

**Change:** The `getSymbol` property now accepts a function with signature `(value: number, isSelected: boolean) => String` (previously `(value: number) => String`). The function is set as a JS property on the native element, not an HTML attribute.

**Java action:**
- If the Java wrapper exposes a `getSymbol` callback mechanism (e.g., via JS interop), update the contract/documentation to include the second `isSelected` boolean parameter.
- If it's attribute-only today, document that consumers using `getSymbol` from JS need to provide a two-argument function.
- Update `rating.rules.md`.

---

## 15) WaRelativeTime — Add `date` input

**Angular source:** `src/directives/relative-time/relative-time.directive.ts`

**Change:** New `@Input() date?: Date | string` → attribute `date` (ISO 8601 string).

**Java action:**
- Add `setDate(LocalDateTime date)` or `setDate(String isoDate)` → attribute `date` rendered as ISO 8601.
- Optionally add `setDate(ZonedDateTime date)` overload.
- Update `relative-time.rules.md`.

```java
public J setDate(LocalDateTime date) {
    addAttribute("date", date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    return (J) this;
}

public J setDate(String isoDate) {
    addAttribute("date", isoDate);
    return (J) this;
}
```

---

## 16) WaZoomableFrame — Add `withThemeSync`

**Angular source:** `src/directives/zoomable-frame/zoomable-frame.directive.ts`

**Change:** New `@Input() withThemeSync?: boolean | string` → boolean attribute `with-theme-sync`.

**Java action:**
- Add `setWithThemeSync(boolean)` → boolean attribute `with-theme-sync`.
- Update `zoomable-frame.rules.md`.

---

## Summary Checklist

| #  | Component              | Properties Added/Changed                                                    | Events       |
|----|------------------------|-----------------------------------------------------------------------------|--------------|
| 1  | WaBadge                | `attention`                                                                 | —            |
| 2  | WaCard                 | `withMedia`, `orientation`                                                  | —            |
| 3  | WaCombobox             | `inputValue`, `open`, `allowCreate`, `autocapitalize`, `autocorrect`, `inputmode`, `enterkeyhint`, `spellcheck` | `wa-create`  |
| 4  | WaDetails              | `iconPosition` → `iconPlacement` (rename + deprecate old)                   | —            |
| 5  | WaDropdown             | `open`, `size`                                                              | —            |
| 6  | WaDropdownItem         | `submenuOpen`, `variant` type updated                                       | —            |
| 7  | WaIcon                 | `autoWidth`, `swapOpacity`, `rotate`, `flip`, `animation`                   | —            |
| 8  | WaIntersectionObserver | `root`, `intersectClass`, `once`                                            | —            |
| 9  | WaMutationObserver     | `attr`, `attrOldValue`, `charData`, `charDataOldValue`, `childList`         | —            |
| 10 | WaPopover              | `open`, `withoutArrow`                                                      | —            |
| 11 | WaPage                 | `disableNavigationToggle`                                                   | —            |
| 12 | WaSelect               | `name`, `open`, `withLabel`, `withHint`                                     | —            |
| 13 | WaSwitch               | `name`, `value`, `checked`, `required`, `withHint`                          | —            |
| 14 | WaRating               | `getSymbol` signature updated (added `isSelected` param)                    | —            |
| 15 | WaRelativeTime         | `date`                                                                      | —            |
| 16 | WaZoomableFrame        | `withThemeSync`                                                             | —            |

**Total: 16 components, ~40 new/updated properties, 1 new event, 1 rename.**

---

## Rules Files to Update

After applying the Java changes, update these JWebMP rules files under `rules/generative/frontend/jwebmp/webawesome/`:

1. `badge.rules.md` — add `attention` attribute
2. `card.rules.md` — add `withMedia`, `orientation` attributes
3. `combobox.rules.md` — add all 8 new inputs + `wa-create` event (create file if absent)
4. `details.rules.md` — rename `iconPosition` → `iconPlacement`, add deprecation note
5. `dropdown.rules.md` — add `open`, `size`
6. `icon.rules.md` — add `autoWidth`, `swapOpacity`, `rotate`, `flip`, `animation`
7. `intersection-observer.rules.md` — add `root`, `intersectClass`, `once` (create if absent)
8. `mutation-observer.rules.md` — add `attr`, `attrOldValue`, `charData`, `charDataOldValue`, `childList` (create if absent)
9. `popover.rules.md` — add `open`, `withoutArrow`
10. `page-configurator.rules.md` — add `disableNavigationToggle`
11. `select.rules.md` — add `name`, `open`, `withLabel`, `withHint`
12. `switch.rules.md` — add `name`, `value`, `checked`, `required`, `withHint`
13. `rating.rules.md` — update `getSymbol` signature documentation
14. `relative-time.rules.md` — add `date`
15. `zoomable-frame.rules.md` — add `withThemeSync`

---

## Version Alignment

- Web Awesome specification: **3.4.1** (`llms.txt` line 3)
- Angular Awesome: **3.4.1** (npm package)
- JWebMP `@TsDependency` version for `angular-awesome`: update to `"3.4.1"` or `"^3.4.0"`

---

## Verification

After applying all changes:
1. Compile the JWebMP project (`mvn compile`) — zero errors expected.
2. Run existing tests (`mvn test`) — no regressions.
3. For each new setter, verify the rendered HTML attribute name matches the kebab-case column above.
4. Confirm `WebAwesomePageConfigurator` still loads assets correctly with no version conflicts.

