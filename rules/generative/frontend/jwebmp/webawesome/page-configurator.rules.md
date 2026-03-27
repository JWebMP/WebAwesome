# WaPage Rules — Web Awesome 3.4.1

## Component (Pro)
- **Tag:** `wa-page`
- **Java Class:** `com.jwebmp.webawesomepro.components.page.WaPage`

## Attributes

| Attribute                     | Java Field / Setter                              | Type    | Notes                  |
|-------------------------------|---------------------------------------------------|---------|------------------------|
| `nav-open`                    | `setNavOpen(boolean)`                             | Boolean |                        |
| `disable-sticky`              | `setDisableSticky(String)`                        | String  |                        |
| `navigation-placement`        | `setNavigationPlacement(String)`                  | String  | start or end           |
| `disable-navigation-toggle`   | `setDisableNavigationToggle(Boolean)`             | Boolean | **New in 3.4.1** — boolean attribute |

## CSS Custom Properties
- `--menu-width`, `--main-width`, `--aside-width`
- `--banner-height`, `--header-height`, `--subheader-height`

## Breakpoints
Implements `BreakpointCapable` for responsive layout.

