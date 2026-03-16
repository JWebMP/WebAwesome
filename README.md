# WebAwesome
WebAwesome brings the polished `angular-awesome` web component collection into the JWebMP universe. This plugin wraps every component in CRTP-style Java builders, wires theme assets through a configurable page configurator, and straps the WebAwesome runtime to a Java+Guice application so you can treat rich client widgets as first-class JWebMP components.

## Why WebAwesome + JWebMP?
- **Component parity** – `Wa*` wrappers mirror the structure of the WebAwesome web components (buttons, inputs, overlays, layout primitives, etc.) while exposing fluent setters for attributes such as `Variant`, `Appearance`, `Placement`, and `Size`.
- **Java-native hydration** – `WebAwesomePageConfigurator` injects the CSS/JS bundles, body theme classes, and `angular-awesome` loader module so components hydrate automatically when pages render.
- **Modular extensibility** – A single Maven module (`com.jwebmp.webawesome`) exports the component packages, registers `IPageConfigurator` services, and exposes `TypescriptIndexPageConfigurator` so other plugins can reuse the assets.
- **Testable markup** – Java Micro Harness tests rely on `jwebmp-testlib` to assert rendered HTML and attributes, keeping the wrappers aligned with the WebAwesome semantics.

## Getting started
Add the plugin dependency inherited from the main JWebMP BOM and ship the assets via the `WebAwesomePageConfigurator`. Include the dependency in your build:

```xml
<dependency>
  <groupId>com.jwebmp.plugins</groupId>
  <artifactId>web-awesome</artifactId>
</dependency>
```

Configure the base and theme paths in your environment (see `.env.example`) to point at the WebAwesome static assets, then bind `WebAwesomePageConfigurator` to your page lifecycle. The configurator will add the necessary `<link>`/`<script>` tags and body classes so the wrapped components simply work.

## Documentation
- Architecture diagrams: `docs/architecture/README.md`

## Building & testing
- Requires JDK 25+ and Maven.
- Run `mvn test` to execute the test suite with JUnit 5.
- BrowserStack is excluded from the default test classpath—provide credentials via environment variables if you need cross-browser validation.
- Flatten plugin keeps the published POM tidy; dependency versions come from the shared GuicedEE BOMs.

## Contribution notes
- Use the shared GitHub Actions workflow (`.github/workflows/maven-package.yml`) for CI builds.
- Add tests for new components and features.
- Respect the `.env.example` entry points when adjusting asset paths or theme metadata.

## Legacy materials
Static API snapshots remain under `docs/` and are preserved for reference only. Treat the Markdown-led guides above as the living documentation for the project.
