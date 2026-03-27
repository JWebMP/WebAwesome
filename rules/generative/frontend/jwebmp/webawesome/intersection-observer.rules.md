# WaIntersectionObserver Rules — Web Awesome 3.4.1

## Component
- **Tag:** `wa-intersection-observer`
- **Java Class:** `com.jwebmp.webawesome.components.observer.WaIntersectionObserver`

## Attributes

| Attribute         | Java Field / Setter                 | Type    | Notes                  |
|-------------------|--------------------------------------|---------|------------------------|
| `root`            | `setRoot(String)`                    | String  | **New in 3.4.1** — CSS selector for root |
| `intersect-class` | `setIntersectClass(String)`          | String  | **New in 3.4.1** — CSS class to apply on intersect |
| `once`            | `setOnce(Boolean)`                   | Boolean | **New in 3.4.1** — boolean attribute |

## Events
- `wa-intersection`: Fires when observed elements cross the visibility threshold

