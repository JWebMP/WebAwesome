# WaDropdown Rules — Web Awesome 3.4.1

## Component
- **Tag:** `wa-dropdown`
- **Java Class:** `com.jwebmp.webawesome.components.button.WaDropDown`

## Attributes

| Attribute             | Java Field / Setter                      | Type               | Notes                  |
|-----------------------|-------------------------------------------|--------------------|------------------------|
| `placement`           | `setPlacement(PlacementExtended)`         | Enum               |                        |
| `distance`            | `setDistance(Integer)`                     | Integer            |                        |
| `skidding`            | `setSkidding(Integer)`                     | Integer            |                        |
| `hoist`               | `setHoist(Boolean)`                        | Boolean            | Boolean attribute      |
| `disabled`            | `setDisabled(Boolean)`                     | Boolean            | Boolean attribute      |
| `stay-open-on-select` | `setStayOpenOnSelect(Boolean)`             | Boolean            | Boolean attribute      |
| `sync`                | `setSync(String)`                          | String             |                        |
| `value`               | `setValue(String)`                          | String             |                        |
| `open`                | `setOpen(Boolean)`                          | Boolean            | **New in 3.4.1** — boolean attribute |
| `size`                | `setSize(Size)`                             | Enum (small, medium, large) | **New in 3.4.1** |

## Events
- `wa-show`, `wa-after-show`, `wa-hide`, `wa-after-hide`, `wa-select`

