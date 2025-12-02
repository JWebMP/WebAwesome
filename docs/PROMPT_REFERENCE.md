# Prompt Reference — WebAwesome

Use this file as the entry point for future AI prompts. It pins stack selections, topic glossaries, and diagram locations for cross-referencing.

## Selected Stacks and Policies
- Java 25 LTS with Maven build; follow `rules/generative/language/java/java-25.rules.md` and `rules/generative/language/java/build-tooling.md` for toolchain wiring.
- JWebMP Client + TypeScript + Angular plugin usage; rely on `rules/generative/frontend/jwebmp/README.md`, `rules/generative/frontend/jwebmp/client/README.md`, and `rules/generative/frontend/jwebmp/typescript/README.md`.
- Angular Awesome/WebAwesome components with CRTP fluent style; follow `rules/generative/frontend/webawesome/README.md` and `rules/generative/frontend/angular-awesome/README.md` for component specifics.
- Fluent API strategy: CRTP (no Lombok builders); default logging via Log4j2.
- Testing: TDD-first with Java Micro Harness and Jacoco coverage; BrowserStack optional for cross-browser runs.
- JSpecify nullness defaults active; prefer `@SuppressWarnings("unchecked")` for CRTP edge cases only.

## Diagram Index (Mermaid Sources)
- Context: `docs/architecture/c4-context.md`
- Container: `docs/architecture/c4-container.md`
- Component: `docs/architecture/c4-component-webawesome.md`
- Sequences: `docs/architecture/sequence-page-assets.md`, `docs/architecture/sequence-component-render.md`
- ERD: `docs/architecture/erd-webawesome.md`

## MCP Configuration
Mermaid MCP server is required for rendering diagrams. Load this minimal config in your assistant before generating diagrams (keep secrets out of the repo):

```json
{
  "servers": {
    "mermaid": {
      "type": "http",
      "url": "https://mcp.mermaidchart.com/mcp"
    }
  }
}
```

## Traceability Rules
- Close the loop: `PACT.md` ↔ `RULES.md` ↔ `GUIDES.md` ↔ `IMPLEMENTATION.md` must link to each other and to diagrams above.
- Follow Document Modularity and Forward-Only policies from `rules/RULES.md` (sections 4/5 and change policy section 6). Do not place project docs inside the `rules/` submodule.
- Preserve WebAwesome prompt language alignment (WaButton, WaInput, WaCluster, WaStack) when drafting prompts or guides.
