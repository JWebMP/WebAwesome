# WebAwesome Guides

How to apply the selected rules in this repository.

## Frontend / Components
- WebAwesome component usage and variants — `rules/generative/frontend/webawesome/README.md`.
- Angular Awesome directives and module imports — `rules/generative/frontend/angular-awesome/README.md`.
- JWebMP client integration patterns — `rules/generative/frontend/jwebmp/client/README.md`.
- JWebMP TypeScript bindings and rendering guidance — `rules/generative/frontend/jwebmp/typescript/README.md`.
- Angular base + version override — `rules/generative/language/angular/angular.md`, `rules/generative/language/angular/angular-20.rules.md`.

### API Surface Sketch
- Page bootstrap: `WebAwesomePageConfigurator.configure(page)` injects CSS/JS, theme classes, and `angular-awesome` dependency.
- Module registration: `WebAwesomeInclusionModule` contributes `com.jwebmp.webawesome` package for Guice scanning.
- Components: `Wa*` classes map to custom elements (`wa-button`, `wa-input`, `wa-popover`, etc.) with CRTP setters for attributes (variant, appearance, placement, size, loading/disabled, slots).
- Layout helpers: `WaCluster` (row) and `WaStack` (column) manage grouping; `WaSplit`/`WaSplitPanel` handle resizable areas.
- Overlay/feedback: `WaDialog`, `WaPopover`, `WaPopup`, `WaToastContainer`, `WaSkeleton`, `WaSpinner` rely on placement enums to configure behavior.

## Language / Fluent API / Logging
- CRTP fluent setters and examples — `rules/generative/backend/fluent-api/crtp.rules.md` (use Wa* patterns, avoid builders).
- Logging conventions (Log4j2) — `rules/generative/backend/logging/LOGGING_RULES.md`.
- Nullness defaults — `rules/generative/backend/jspecify/jspecify.rules.md`.

## Testing and Quality
- TDD flow and acceptance criteria — `rules/generative/architecture/tdd/README.md`.
- Java Micro Harness setup — `rules/generative/platform/testing/java-micro-harness.rules.md`.
- Coverage targets with Jacoco — `rules/generative/platform/testing/jacoco.rules.md`.
- Cross-browser validation via BrowserStack — `rules/generative/platform/testing/browserstack.rules.md`.

## Platform / Delivery
- Secrets and environment variables — `rules/generative/platform/secrets-config/env-variables.md`.
- CI/CD (GitHub Actions shared workflow) — `rules/generative/platform/ci-cd/README.md` and provider doc `rules/generative/platform/ci-cd/providers/github-actions.md`.

## Traceability
- Align terminology with `GLOSSARY.md` and diagrams in `docs/architecture/README.md` before altering APIs.
- Implementation references live in `IMPLEMENTATION.md`; update both directions when adding or modifying modules.

## Test Strategy and Acceptance Criteria
- Default to TDD: write failing unit tests per component before adding attributes or setters; assert rendered custom element tags and attributes.
- Validate CSS/JS injection via tests around `WebAwesomePageConfigurator` to ensure `basePath`, theme classes, and priorities are respected.
- Acceptance for new components: CRTP chaining preserved, attributes match WebAwesome rule files, and events map to `wa-*` names.
- Optional BrowserStack runs should target representative Wa components (WaButton, WaInput, WaCluster/WaStack layout) for regression smoke tests.

## Migration Notes
- Apply forward-only changes: replace obsolete docs with links to the modular rules instead of keeping legacy HTML snapshots.
- When adding/removing components, update `module-info.java` exports/opens and refresh glossary references; record risky removals in `MIGRATION.md` if they occur.
