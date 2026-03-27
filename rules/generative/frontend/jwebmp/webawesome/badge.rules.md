# WaBadge Rules — Web Awesome 3.4.1

## Component
- **Tag:** `wa-badge`
- **Java Class:** `com.jwebmp.webawesome.components.badge.WaBadge`

## Attributes

| Attribute    | Java Field / Setter         | Type               | Notes                                   |
|--------------|-----------------------------|--------------------|------------------------------------------|
| `variant`    | `setVariant(Variant)`       | Enum (brand, neutral, success, warning, danger, inherit) | |
| `appearance` | `setAppearance(Appearance)` | Enum (accent, filled, outlined) | |
| `pill`       | `setPill(Boolean)`          | Boolean            | Renders as boolean attribute             |
| `pulse`      | `setPulse(Boolean)`         | Boolean            | Renders as boolean attribute             |
| `attention`  | `setAttention(BadgeAttention)` | Enum (none, pulse, bounce) | **New in 3.4.1** |

## CSS Custom Properties
- `--background-color`, `--border-color`, `--text-color`, `--pulse-color`
- `font-size`

## Enums
- `BadgeAttention`: `None`, `Pulse`, `Bounce`

