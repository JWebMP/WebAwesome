# WebAwesome – Change Log

**Format:** [Keep a Changelog](https://keepachangelog.com/en/1.0.0/)
**Versioning:** Tracks the upstream [Web Awesome](https://webawesome.com) component library.
**License:** Apache 2.0

---

## [3.9.0]

### Added
- `wa-checkbox-group` (`WaCheckboxGroup`) – labelling/grouping container for related `wa-checkbox` /
  `wa-switch` elements. Provides `label`, `hint`, `orientation` (`horizontal`/`vertical`, default
  `vertical`), `size`, `required`, `with-label`, `with-hint`, plus the `--gap` custom property
  (`setStyleGap`). Slots: `(default)`, `label`, `hint`. CSS parts: `form-control`,
  `form-control-label`, `form-control-input`, `hint`. The group is a **container only** – it owns no
  value, no two-way binding, and no events; values live on the child checkboxes/switches.

### Changed
- `wa-tree` (`WaTree`/`TreeSelectionMode`) – the `selection` attribute now accepts a fourth value,
  `leaf-multiple`, alongside `single | multiple | leaf`. `leaf-multiple` allows multiple leaf nodes to
  be selected while parent nodes only expand/collapse, and is treated like `multiple` for multi-select
  cardinality.
- Bumped the underlying `angular-awesome` / Web Awesome dependency pin to `^3.9.0`.
- Updated the `WebAwesome` plugin version reference to `3.9.0`.

### Documentation
- `wa-accordion-item`: `--show-duration` / `--hide-duration` defaults documented as
  `var(--wa-transition-normal)`; `--easing` default documented as `var(--wa-transition-easing)`.
- `wa-accordion`: `--wa-accordion-divider-color` is no longer advertised as an official property
  (upstream removed it from the docs). The `setDividerColor` setter is retained for backward
  compatibility.
- `wa-popover` / `wa-popup`: `--show-duration` / `--hide-duration` defaults documented as
  `var(--wa-transition-fast)`.

### Notes
- Additive release. No breaking changes to the Java API.

---

## [3.8.0]

### Added
- `wa-accordion` (`WaAccordion`) – grouping container with `mode`, `icon-placement`, `heading-level`,
  `appearance`, the `expandAll()`/`collapseAll()` methods, and the `wa-expand`, `wa-after-expand`,
  `wa-collapse`, `wa-after-collapse` events.
- `wa-accordion-item` (`WaAccordionItem`) – item with `label`, `expanded`, `disabled`, the
  `expand()`/`collapse()`/`toggle()`/`focus()` methods, `label`/`icon` slots, and the `--spacing`,
  `--show-duration`, `--hide-duration`, `--easing`, `--wa-accordion-divider-color` custom properties.
- `wa-known-date` (`WaKnownDate`) – separate day/month/year form control with `autocomplete="bday"`
  support, `min`/`max`, `locale`, and `label`/`hint` slots.
- `wa-time-input` (`WaTimeInput`) – time form control (24h wire format) with `step`, `hour-format`,
  `with-now`, picker slots, and the `--column-item-height`/`--column-width` custom properties.

> **Note:** `wa-date-picker` and `wa-date-input` are **Pro** components and ship in the
> `web-awesome-pro` module (`com.jwebmp.webawesomepro.components.datepicker` /
> `com.jwebmp.webawesomepro.components.dateinput`), not here.

### Moved
- `wa-toast` / `wa-toast-item` (`WaToastContainer`, `WaToastItem`, `WaToastDataService`) relocated to
  the **Pro** module (`com.jwebmp.webawesomepro.components.toast`) — Toast is a Pro component.
- `wa-date-input` relocated to the **Pro** module (see note above).

### Changed
- Bumped the underlying `angular-awesome` / Web Awesome dependency pin to `^3.8.0`.
- Updated the `WebAwesome` plugin version reference to `3.8.0`.

### Notes
- Additive release. No breaking changes.
- Size tokens remain `xs | s | m | l | xl | small | medium | large` (default `m`) for every sized
  component; the long-form values are **not** deprecated.

