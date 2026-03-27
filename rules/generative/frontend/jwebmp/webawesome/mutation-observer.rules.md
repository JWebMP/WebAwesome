# WaMutationObserver Rules — Web Awesome 3.4.1

## Component
- **Tag:** `wa-mutation-observer`
- **Java Class:** `com.jwebmp.webawesome.components.observer.WaMutationObserver`

## Attributes

| Attribute              | Java Field / Setter                    | Type    | Notes                  |
|------------------------|----------------------------------------|---------|------------------------|
| `attr`                 | `setAttr(String)`                      | String  | Space-separated list or `*` for all |
| `child-list`           | `setChildList(Boolean)`                | Boolean | Boolean attribute      |
| `char-data`            | `setCharData(Boolean)`                 | Boolean | Boolean attribute      |
| `disabled`             | `setDisabled(Boolean)`                 | Boolean | Boolean attribute      |
| `attr-old-value`       | `setAttrOldValue(Boolean)`             | Boolean | **New in 3.4.1** — boolean attribute |
| `char-data-old-value`  | `setCharDataOldValue(Boolean)`         | Boolean | **New in 3.4.1** — boolean attribute |

## Events
- `wa-mutation`: Fires when a watched mutation occurs

