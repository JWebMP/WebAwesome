# WaDetails Rules — Web Awesome 3.4.1

## Component
- **Tag:** `wa-details`
- **Java Class:** `com.jwebmp.webawesome.components.details.WaDetails`

## Attributes

| Attribute        | Java Field / Setter                      | Type               | Notes                           |
|------------------|-------------------------------------------|--------------------|---------------------------------|
| `summary`        | `setSummary(String)`                      | String             |                                 |
| `disabled`       | `setDisabled(Boolean)`                    | Boolean            | Boolean attribute               |
| `open`           | `setOpen(Boolean)`                        | Boolean            | Boolean attribute               |
| `appearance`     | `setAppearance(DetailsAppearance)`        | Enum               |                                 |
| `icon-placement` | `setIconPlacement(IconPlacement)`         | Enum (start, end)  | **Renamed in 3.4.1** from `icon-position` |
| `name`           | `setName(String)`                         | String             | Groups related details          |

## Deprecations
- `setIconPosition(...)` → deprecated, delegates to `setIconPlacement(...)`
- HTML attribute `icon-position` → now `icon-placement`

## Enums
- `IconPlacement`: `Start`, `End` (replaces `IconPosition`)
- `IconPosition`: deprecated, kept for backwards compatibility

## Events
- `wa-show`, `wa-after-show`, `wa-hide`, `wa-after-hide`

## Slots
- default, summary, expand-icon, collapse-icon

