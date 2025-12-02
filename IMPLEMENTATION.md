# IMPLEMENTATION — WebAwesome

## Current Layout
- Maven module `com.jwebmp.webawesome` (`pom.xml`, `src/main/java/module-info.java`) exports Wa component packages and registers services via `META-INF/services/` for `IGuiceScanModuleInclusions`, `IPageConfigurator`, and `TypescriptIndexPageConfigurator`.
- Entry points:
  - `WebAwesomeInclusionModule` — exposes package for Guice scanning.
  - `WebAwesomePageConfigurator` — injects CSS/JS, theme classes, and `angular-awesome` TypeScript dependency.
- Components: `Wa*` wrappers (buttons, inputs, overlays, layout primitives) extend JWebMP HTML classes with CRTP setters; enums such as `Variant`, `Appearance`, `Placement`, and `Size` shape attributes.
- Tests: `src/test/java` uses `jwebmp-testlib` and Java Micro Harness to assert rendered markup for components and configurators.

## Build and Test
- Build with Maven and Java 25 LTS. Flatten plugin is present; BOMs are inherited from the parent POM.
- Tests run via `mvn test`; coverage via Jacoco per `rules/generative/platform/testing/jacoco.rules.md`.
- BrowserStack drivers are excluded in `jwebmp-testlib` dependency; enable cross-browser runs by supplying credentials as env vars (see `.env.example`).

## Asset and Theme Handling
- Static configuration fields in `WebAwesomePageConfigurator` control `basePath`, `themePath`, `themeClassName`, `themePalletName`, and `themeBrandName`; these propagate to CSS/JS references and body classes.
- Web components hydrate from `webawesome.loader.js` (module) and CSS bundles referenced by `basePath`.

## Stage 3 — Implementation Plan (Forward-Only)
- **Scaffolding**: Keep single-module structure; no new Java packages unless wrapping new components. Maintain `module-info.java` exports/opens alignment when adding components.
- **Docs**: Maintain `docs/architecture/` diagrams and `docs/PROMPT_REFERENCE.md` as the authoritative prompt seed. Link new guides from `GUIDES.md` and update `GLOSSARY.md` when adding terminology.
- **Build/CI**: Use GitHub Actions shared workflow for Maven packaging; no custom scripts unless required by new assets. Keep `.env.example` in sync with configurator fields.
- **Validation**: For new components, add CRTP-friendly setters plus tests that assert rendered attributes and slot behavior. Use BrowserStack matrix only when UI regressions are suspected.
- **Rollout**: Ship changes under forward-only policy; replace obsolete docs instead of keeping legacy HTML copies. Note risky removals in `MIGRATION.md` if they occur.

## Traceability
- Architecture diagrams live in `docs/architecture/README.md` (context, container, component, sequences, ERD).
- Rules and guides are indexed in `RULES.md` and `GUIDES.md`; align naming via `GLOSSARY.md` and WebAwesome prompt mappings.
