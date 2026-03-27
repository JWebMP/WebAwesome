# WaIcon Rules — Web Awesome 3.4.1

## Component
- **Tag:** `wa-icon`
- **Java Class:** `com.jwebmp.webawesome.components.icon.WaIcon`

## Attributes

| Attribute        | Java Field / Setter              | Type                | Notes                  |
|------------------|-----------------------------------|---------------------|------------------------|
| `name`           | `setName(String)`                 | String              |                        |
| `family`         | `setFamily(String)`               | String              |                        |
| `variant`        | `setVariant(IconVariant)`         | Enum                |                        |
| `library`        | `setLibrary(String)`              | String              |                        |
| `src`            | `setSrc(String)`                  | String              |                        |
| `label`          | `setLabel(String)`                | String              |                        |
| `withFixedWidth` | `setFixedWidth(Boolean)`          | Boolean             | Boolean attribute      |
| `auto-width`     | `setAutoWidth(Boolean)`           | Boolean             | **New in 3.4.1** — boolean attribute |
| `swap-opacity`   | `setSwapOpacity(Boolean)`         | Boolean             | **New in 3.4.1** — boolean attribute |
| `rotate`         | `setRotate(Integer)`              | Integer (degrees)   | **New in 3.4.1**       |
| `flip`           | `setFlip(IconFlip)`               | Enum (x, y, both)   | **New in 3.4.1**       |
| `animation`      | `setAnimation(String)`            | String              | **New in 3.4.1**       |

## Enums
- `IconFlip`: `X`, `Y`, `Both`
- `IconFamily`, `IconVariant` (existing)

