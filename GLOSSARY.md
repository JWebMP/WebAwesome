# WebAwesome Glossary (Topic-First)

This glossary indexes terms for the WebAwesome plugin by deferring to topic glossaries in the Rules Repository. Use these links before inventing new terminology.

## Glossary Precedence Policy
- Topic glossaries override root definitions for their scope (e.g., fluent API terms come from `rules/generative/backend/fluent-api/GLOSSARY.md`).
- The root glossary acts as an index and prompt-alignment anchor; avoid duplicating topic content.
- When multiple topics apply, prefer the most specific scope: component → framework → language → platform.

## Topic Glossaries
- CRTP Fluent API — `rules/generative/backend/fluent-api/GLOSSARY.md`
- JSpecify — `rules/generative/backend/jspecify/GLOSSARY.md`
- TypeScript — `rules/generative/language/typescript/GLOSSARY.md`
- Angular — `rules/generative/language/angular/GLOSSARY.md` (override with version rules in `rules/generative/language/angular/angular-20.rules.md`)
- Angular Awesome — `rules/generative/frontend/angular-awesome/GLOSSARY.md`
- JWebMP Client — `rules/generative/frontend/jwebmp/client/GLOSSARY.md`
- JWebMP TypeScript — `rules/generative/frontend/jwebmp/typescript/GLOSSARY.md`
- Testing (Jacoco, Java Micro Harness, BrowserStack) — `rules/generative/platform/testing/GLOSSARY.md`

## Prompt Language Alignment (WebAwesome)
- Use `WaButton` instead of “button”.
- Use `WaInput` instead of “input”.
- Use `WaCluster` for rows and `WaStack` for column/stack layouts.

## Host Terms
- **Base Path** — URL prefix for WebAwesome assets injected by `WebAwesomePageConfigurator` (default `/webawesome/`).
- **Theme Path** — CSS theme file path injected with `id="webawesome-theme"` (default `/webawesome/styles/themes/default.css`).
- **CRTP Fluent Setter** — Generic setter returning `(J) this` to enable chaining on subclasses (preferred over builders for this project).
- **Typescript Index Registration** — Implemented by `WebAwesomePageConfigurator` to expose `angular-awesome` dependency to the client build chain.

Always align new terms to the topic glossary before adding to this index; reference the diagram sources in `docs/architecture/` for structural naming.
