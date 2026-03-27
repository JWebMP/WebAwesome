# WaRelativeTime Rules — Web Awesome 3.4.1

## Component
- **Tag:** `wa-relative-time`
- **Java Class:** `com.jwebmp.webawesome.components.relativetime.WaRelativeTime`

## Attributes

| Attribute | Java Field / Setter         | Type    | Notes                  |
|-----------|-----------------------------|---------|------------------------|
| `date`    | `setDate(String)` or `setDate(LocalDateTime)` | String (ISO 8601) | Renders ISO date. `LocalDateTime` overload formats via `DateTimeFormatter.ISO_LOCAL_DATE_TIME` |
| `sync`    | `setSync(Boolean)`          | Boolean | Boolean attribute — auto-updates |
| `format`  | `setFormat(String)`         | String  | long, short, narrow    |
| `numeric` | `setNumeric(String)`        | String  | auto, always           |
| `lang`    | `setLang(String)`           | String  | Locale code            |

## CSS Custom Properties
- `--display`

## Notes
The `date` field was already present in the Java wrapper. The `setDate(LocalDateTime)` convenience overload was added in the 3.4.1 sync.

