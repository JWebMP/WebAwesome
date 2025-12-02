# C4 Container — WebAwesome Plugin

The plugin lives inside a single Maven module `com.jwebmp.webawesome` and plugs into the host JWebMP runtime through Guice and page configurators.

```mermaid
flowchart LR
  subgraph HostApp[Host JWebMP App]
    Pages[JWebMP Pages]
    GuiceRuntime[Guice Runtime]
  end

  subgraph WebAwesome[WebAwesome Module]
    Configurator[WebAwesomePageConfigurator]
    GuiceModule[WebAwesomeInclusionModule]
    Components[Wa Components]
    TsRegistration[TypescriptIndexPageConfigurator]
  end

  Assets[WebAwesome CSS JS Assets]
  Tests[Java Micro Harness Suite]

  GuiceRuntime --> GuiceModule
  GuiceModule --> Components
  Pages --> Configurator
  Configurator --> Assets
  Configurator --> TsRegistration
  Components --> Pages
  Tests --> Components
```

## Responsibilities
- `Configurator`: pushes CSS/JS references and theme classes into each page; injects module scripts as ES modules.
- `GuiceModule`: ensures the module is discoverable via `IGuiceScanModuleInclusions`.
- `Components`: Java wrappers (e.g., `WaButton`, `WaInput`) that render custom elements and attributes.
- `TsRegistration`: advertises the `angular-awesome` TypeScript dependency.

## External Interfaces
- CSS/JS assets served under `basePath` and `themePath` (configurable statics).
- Optional Font Awesome kit code passed via `faKitCode` attribute.
