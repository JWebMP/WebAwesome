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
| `canvas`         | `setCanvas(IconCanvas)`           | Enum                | `fixed`, `auto`, `square`, or `roomy`; replaces legacy fixed-width sizing |
| `auto-width`     | `setAutoWidth(Boolean)`           | Boolean             | **New in 3.4.1** — boolean attribute |
| `swap-opacity`   | `setSwapOpacity(Boolean)`         | Boolean             | **New in 3.4.1** — boolean attribute |
| `rotate`         | `setRotate(Integer)`              | Integer (degrees)   | **New in 3.4.1**       |
| `flip`           | `setFlip(IconFlip)`               | Enum (x, y, both)   | **New in 3.4.1**       |
| `animation`      | `setAnimation(String)`            | String              | **New in 3.4.1**       |

## Enums
- `IconFlip`: `X`, `Y`, `Both`
- `IconCanvas`: `FIXED`, `AUTO`, `SQUARE`, `ROOMY`
- `IconVariant` is typed. `IconFamily` is available in constructor overloads, but
  `setFamily(String)` remains intentional so new Font Awesome families such as
  `vellum`, and kit-defined families, can be used without waiting for an enum update.

## Styling and theming

Use the dedicated styling setters for normal and duotone icons:

```java
new WaIcon<>("house")
        .setFamily("vellum")
        .setVariant(IconVariant.Solid)
        .setFlip(IconFlip.Y)
        .setCanvas(IconCanvas.ROOMY)
        .setFontSize("1.25em")
        .setPrimaryColor("var(--wa-color-brand-fill-loud)")
        .setSecondaryColor("var(--wa-color-brand-fill-quiet)");
```

`setColor`, `setBackgroundColor`, `setPrimaryColor`, and `setSecondaryColor` accept
CSS values. Keep them as strings: valid values include hex, `rgb()`, `hsl()`,
`currentColor`, and `var(--wa-...)` theme references. Do not enumerate icon names,
families, libraries, or colours: Font Awesome assets, custom kits, and application
theme tokens evolve independently of the Java wrapper. Use `addStyle(name, value)`
for the remaining documented icon CSS custom properties, including duotone opacity
and animation properties.

