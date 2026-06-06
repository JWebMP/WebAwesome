# WebAwesome – Change Log

**Format:** [Keep a Changelog](https://keepachangelog.com/en/1.0.0/)
**Versioning:** Tracks the upstream [Web Awesome](https://webawesome.com) component library.
**License:** Apache 2.0

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

