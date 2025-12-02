# ERD — WebAwesome Component Model

Conceptual data relationships inferred from the Java component model (no runtime database is present).

```mermaid
erDiagram
  Component ||--o{ Attribute : renders
  Component ||--o{ Slot : exposes
  Component }o--|| Variant : selects
  Component }o--|| Size : selects
  Component }o--|| Appearance : selects
  AssetConfig ||--|| Component : provides
  AssetConfig ||--|| Theme : selects

  Component {
    string name
    string tag
  }
  Attribute {
    string key
    string value
  }
  Slot {
    string name
    string content
  }
  Variant {
    string value
  }
  Size {
    string value
  }
  Appearance {
    string value
  }
  AssetConfig {
    string basePath
    string themePath
    string themeClass
    string themePalette
    string themeBrand
  }
  Theme {
    string css
  }
```

Mapping to code:
- `Component` corresponds to `Wa*` classes that render custom element tags.
- `AssetConfig` is provided by `WebAwesomePageConfigurator` static fields.
- Enumerations such as `Variant`, `Size`, and `Appearance` drive attribute selection.
- Slots map to optional prefix/suffix or child elements injected before render.
