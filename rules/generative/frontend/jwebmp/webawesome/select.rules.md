# WaSelect Rules — Web Awesome 3.4.1

## Component
- **Tag:** `wa-select`
- **Java Class:** `com.jwebmp.webawesome.components.select.WaSelect`

## Attributes

| Attribute            | Java Field / Setter                 | Type               | Notes                  |
|----------------------|--------------------------------------|--------------------|------------------------|
| `label`              | `setLabel(String)`                   | String             |                        |
| `hint`               | `setHint(String)`                    | String             |                        |
| `placeholder`        | `setPlaceholder(String)`             | String             |                        |
| `appearance`         | `setAppearance(SelectAppearance)`    | Enum               |                        |
| `pill`               | `setPill(Boolean)`                   | Boolean            | Boolean attribute      |
| `with-clear`         | `setWithClear(Boolean)`              | Boolean            | Boolean attribute      |
| `disabled`           | `setDisabled(Boolean)`               | Boolean            | Boolean attribute      |
| `multiple`           | `setMultiple(Boolean)`               | Boolean            | Boolean attribute      |
| `required`           | `setRequired(Boolean)`               | Boolean            | Boolean attribute      |
| `size`               | `setSize(Size)`                      | Enum               |                        |
| `placement`          | `setPlacement(SelectPlacement)`      | Enum               |                        |
| `form`               | `setForm(String)`                    | String             |                        |
| `max-options-visible`| `setMaxOptionsVisible(Integer)`      | Integer            |                        |
| `value`              | `setValue(String)`                    | String             |                        |
| `name`               | `setName(String)`                    | String             | **New in 3.4.1**       |
| `open`               | `setOpen(Boolean)`                   | Boolean            | **New in 3.4.1** — boolean attribute |
| `with-label`         | `setWithLabel(Boolean)`              | Boolean            | **New in 3.4.1** — boolean attribute |
| `with-hint`          | `setWithHint(Boolean)`               | Boolean            | **New in 3.4.1** — boolean attribute |

## Events
- `input`, `change`, `focus`, `blur`, `wa-clear`, `wa-show`, `wa-after-show`, `wa-hide`, `wa-after-hide`, `wa-invalid`

