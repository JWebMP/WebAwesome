# WaPopover Rules — Web Awesome 3.4.1

## Component
- **Tag:** `wa-popover`
- **Java Class:** `com.jwebmp.webawesome.components.popover.WaPopover`

## Attributes

| Attribute        | Java Field / Setter                      | Type                 | Notes                  |
|------------------|-------------------------------------------|----------------------|------------------------|
| `for`            | `setForElement(ComponentHierarchyBase)`   | String (element ID)  |                        |
| `open`           | `setOpen(Boolean)`                        | Boolean              | Boolean attribute — already present |
| `placement`      | `setPlacement(WaPopoverPlacements)`       | Enum                 |                        |
| `distance`       | `setDistance(Integer)`                     | Integer              |                        |
| `skidding`       | `setSkidding(Integer)`                     | Integer              |                        |
| `without-arrow`  | `setWithoutArrow(Boolean)`                | Boolean              | Boolean attribute — already present |

## Events
- `wa-show`, `wa-after-show`, `wa-hide`, `wa-after-hide`

## CSS Custom Properties
- `--arrow-size`, `--max-width`, `--show-duration`, `--hide-duration`

## Notes
Both `open` and `without-arrow` were already present in the Java wrapper before 3.4.1.
This rules file confirms their inclusion and alignment with the Angular Awesome directive.

