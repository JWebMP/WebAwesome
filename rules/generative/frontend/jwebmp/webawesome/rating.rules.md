# WaRating Rules — Web Awesome 3.4.1

## Component
- **Tag:** `wa-rating`
- **Java Class:** `com.jwebmp.webawesome.components.rating.WaRating`

## Attributes

| Attribute    | Java Field / Setter            | Type    | Notes                  |
|--------------|--------------------------------|---------|------------------------|
| `label`      | `setLabel(String)`             | String  |                        |
| `value`      | `setValue(String)`             | String  |                        |
| `max`        | `setMax(Number)`               | Number  |                        |
| `precision`  | `setPrecision(Number)`         | Number  |                        |
| `readonly`   | `setReadonly(Boolean)`         | Boolean | Boolean attribute      |
| `disabled`   | `setDisabled(Boolean)`         | Boolean | Boolean attribute      |
| `size`       | `setSize(Size)`                | Enum    |                        |

## getSymbol Callback — Updated in 3.4.1

The `getSymbol` property on the native element now accepts a function with the signature:

```
(value: number, isSelected: boolean) => string
```

Previously the signature was `(value: number) => string`. The second `isSelected` parameter indicates whether the symbol at that position is currently active/selected.

When using the Java wrapper's `icons` or `symbol` properties, the generated JS callback automatically uses the new two-argument signature.

## CSS Custom Properties
- `--symbol-color`, `--symbol-color-active`, `--symbol-spacing`

