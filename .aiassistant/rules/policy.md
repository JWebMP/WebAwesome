# AI Assistant Rules — WebAwesome

- Obey `rules/RULES.md` sections 4 (Behavioral) and 5 (Technical), Document Modularity Policy, and Forward-Only Change Policy.
- Keep project docs outside the `rules/` submodule; update `PACT.md`, `RULES.md`, `GUIDES.md`, `IMPLEMENTATION.md`, and `GLOSSARY.md` together.
- Fluent API strategy: CRTP; avoid Lombok builders. Use Log4j2 for logging. Apply JSpecify annotations.
- Stage gating: Stages 1–3 are documentation-first; code/scaffolding happens at Stage 4 (blanket approval for this run noted in `PACT.md`).
- Use WebAwesome prompt terms (WaButton, WaInput, WaCluster, WaStack) and prefer Java 25 + Maven build flow.
