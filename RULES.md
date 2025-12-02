# WebAwesome Project Rules

These rules bind the WebAwesome plugin when consuming the Rules Repository submodule at `rules/`. Apply them before writing code; update links instead of duplicating guidance.

## Scope and Policies
- Forward-Only Change Policy: replace legacy/monolithic docs with modular references; do not leave deprecated anchors.
- Document Modularity Policy applies to all new docs; keep project-specific content outside `rules/`.
- Logging: default to Log4j2; if Lombok is used, annotate with `@Log4j2` only.
- Fluent API: CRTP; avoid Lombok builders for component setters.
- Nullness: adopt JSpecify defaults and annotations per `rules/generative/backend/jspecify/README.md`.

## Selected Stacks
- Language/Build: Java 25 LTS + Maven — `rules/generative/language/java/java-25.rules.md`, `rules/generative/language/java/build-tooling.md`.
- Frontend Framework: JWebMP Client + TypeScript + Angular — `rules/generative/frontend/jwebmp/README.md`, `rules/generative/frontend/jwebmp/client/README.md`, `rules/generative/frontend/jwebmp/typescript/README.md`, `rules/generative/language/typescript/README.md`, `rules/generative/language/angular/README.md`, `rules/generative/language/angular/angular-20.rules.md`.
- Component Library: WebAwesome / Angular Awesome — `rules/generative/frontend/webawesome/README.md`, `rules/generative/frontend/angular-awesome/README.md`.
- Fluent API Strategy: CRTP — `rules/generative/backend/fluent-api/crtp.rules.md`.
- Logging: `rules/generative/backend/logging/LOGGING_RULES.md`.
- Testing: TDD-first with Java Micro Harness, Jacoco, BrowserStack — `rules/generative/architecture/tdd/README.md`, `rules/generative/platform/testing/README.md`, `rules/generative/platform/testing/java-micro-harness.rules.md`, `rules/generative/platform/testing/jacoco.rules.md`, `rules/generative/platform/testing/browserstack.rules.md`.
- Security/Secrets: `rules/generative/platform/secrets-config/README.md` and `env-variables.md` for environment handling.

## Application of Rules
- CRTP setters must return `(J) this` and preserve generic types on subclasses to avoid unchecked casts in client code.
- Asset injection must follow `WebAwesomePageConfigurator` patterns: CSS first with `RequirementsPriority.First`, JS modules as `Top_Shelf`.
- Use WebAwesome prompt-aligned names (WaButton, WaInput, WaCluster, WaStack) in docs and APIs.
- Tests should run headlessly by default; keep BrowserStack credentials optional and sourced from environment variables.

## Traceability
- Link all new docs to `docs/architecture/README.md` and `docs/PROMPT_REFERENCE.md`.
- PACT ↔ RULES ↔ GUIDES ↔ IMPLEMENTATION must stay synchronized; update references in all four when stacks change.
