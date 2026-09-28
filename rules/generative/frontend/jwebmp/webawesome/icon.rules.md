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

## Font Awesome catalog selection

Use the 7.3.1 Java enums for shipped Font Awesome icons. Free catalogs:
`FontAwesomeFreeSolidIcons`, `FontAwesomeFreeRegularIcons`, and
`FontAwesomeFreeBrandsIcons`. Pro and Pro+ catalogs are family-specific, such
as `FontAwesomeDuotoneIcons`, `FontAwesomeSharpIcons`, and
`FontAwesomeVellumIcons`. Choose a constant present in the desired enum; do not
assume a Classic icon is in a Pro+ pack. `FontAwesome5ProIcons` is a legacy
union and cannot validate pack/style availability.

Even when using plain `WaIcon`, derive the canonical name, family, and
variant from one enum value:

```java
var icon = FontAwesomeVellumIcons.house;
new WaIcon<>(icon.toAngularIconAttributeName(), icon.getFamily(),
             icon.getVariant());
```

With `web-awesome-pro`, `new WaIconFA<>(icon)` carries the metadata; its
`IconVariant` overload checks that the style exists. Never use a raw `<i>` or
`<i/>` tag, `Italic`, or `fa-*` CSS classes on `<i>` to render an icon.
This does not apply to ordinary italic text. Use literal name/library/source
strings only for a verified custom Kit upload or application icon library that
has no catalog enum. A catalog constant does not guarantee that the selected
licensed assets are installed or enabled.

`IconFlip`, `IconCanvas`, and `IconVariant` remain typed. `IconFamily` has
Vellum and other current families; `setFamily(String)` supports custom
families when needed.

## Styling and theming

Use the dedicated styling setters for normal and duotone icons:

```java
var icon = FontAwesomeVellumIcons.house;
new WaIcon<>(icon.toAngularIconAttributeName(), icon.getFamily(),
             icon.getVariant())
        .setFlip(IconFlip.Y)
        .setCanvas(IconCanvas.ROOMY)
        .setFontSize("1.25em")
        .setPrimaryColor("var(--wa-color-brand-fill-loud)")
        .setSecondaryColor("var(--wa-color-brand-fill-quiet)");
```

`setColor`, `setBackgroundColor`, `setPrimaryColor`, and `setSecondaryColor` accept
CSS values. Keep them as strings: valid values include hex, `rgb()`, `hsl()`,
`currentColor`, and `var(--wa-...)` theme references. Use catalog enums for
shipped icon names and families. Custom libraries and CSS colour values remain
strings: their assets and application theme tokens evolve
independently of the Font Awesome catalogs. Use `addStyle(name, value)`
for the remaining documented icon CSS custom properties, including duotone opacity
and animation properties.

