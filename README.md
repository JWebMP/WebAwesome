# WebAwesome
JWebMP plugin that wraps WebAwesome (angular-awesome) web components with Java CRTP-style APIs and page configurators.

## Documentation and Rules
- Rules Repository submodule: `rules/` (do not place project docs inside it).
- Pact and policies: `PACT.md`
- Project rules: `RULES.md`
- Guides: `GUIDES.md`
- Implementation and plan: `IMPLEMENTATION.md`
- Glossary: `GLOSSARY.md`
- Architecture diagrams: `docs/architecture/README.md`
- Prompt seed for future AI work: `docs/PROMPT_REFERENCE.md`

## Build and Test
- Java 25 + Maven. Run `mvn test` for the Java Micro Harness suite; coverage via Jacoco per `rules/generative/platform/testing/jacoco.rules.md`.
- WebAwesome assets are injected by `WebAwesomePageConfigurator` using `basePath` and `themePath`; configure env values in `.env.example`.

## CI
GitHub Actions workflow is provided in `.github/workflows/maven-package.yml` (shared GuicedEE workflow).

## Legacy Materials
Static API docs remain under `docs/` (`index.html`, `index-with-sidebar.html`, `rules.html`). Treat them as legacy references; the modular Markdown files above are authoritative going forward.
