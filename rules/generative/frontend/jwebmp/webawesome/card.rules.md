# WaCard Rules — Web Awesome 3.4.1

## Component
- **Tag:** `wa-card`
- **Java Class:** `com.jwebmp.webawesome.components.card.WaCard`

## Attributes

| Attribute      | Java Field / Setter               | Type               | Notes                  |
|----------------|------------------------------------|--------------------|------------------------|
| `appearance`   | `setAppearance(Appearance)`        | Enum               |                        |
| `size`         | `setSize(Size)`                    | Enum               |                        |
| `with-header`  | `setWithHeader(Boolean)`           | Boolean            | Boolean attribute      |
| `with-image`   | `setWithImage(Boolean)`            | Boolean            | Boolean attribute      |
| `with-footer`  | `setWithFooter(Boolean)`           | Boolean            | Boolean attribute      |
| `with-media`   | `setWithMedia(Boolean)`            | Boolean            | **New in 3.4.1** — boolean attribute |
| `orientation`  | `setOrientation(CardOrientation)`  | Enum (horizontal, vertical) | **New in 3.4.1** |

## Enums
- `CardOrientation`: `Horizontal`, `Vertical`

## Slots
- default, header, footer, image

