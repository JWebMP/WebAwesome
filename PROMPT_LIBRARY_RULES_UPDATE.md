# 🧰 Starter Prompt — Library Rules Update (Framework/Component Libraries)

Configuration filled for WebAwesome (JWebMP wrapper). Use this file to rerun the library rules update with the Rules Repository at `rules/generative/frontend/jwebmp/webawesome`.

---

## 0) Provide Inputs (pre-filled)
- Library name: WebAwesome (JWebMP wrapper)
- Current/new version: 2.0.0-SNAPSHOT
- Repository URL / path: https://github.com/JWebMP/WebAwesome.git
- Rules Repository Location: rules/generative/frontend/jwebmp/webawesome
- Short description: JWebMP wrapper for the WebAwesome (angular-awesome) component set.
- Type:
  - [X] UI component library
  - [ ] Data/ORM
  - [ ] Service/Framework
  - [ ] Other: <OTHER>

- Stage approvals preference for this run (controls STOP gates)
  - [ ] Require explicit approval at each stage (default)
  - [ ] Approvals are optional; proceed with documented defaults if no reply
  - [X] Blanket approval granted for this run (no STOPs)

- AI engine used:
  - [X] Junie
  - [X] GitHub Copilot
  - [ ] Cursor
  - [ ] ChatGPT
  - [ ] Claude
  - [ ] Roo
  - [X] Codex
  - [X] AI Assistant
  - Load `.mcp.json` (Mermaid MCP) and workspace rules for each selected engine before generating diagrams or docs.
- MCP servers to register: Mermaid MCP `https://mcp.mermaidchart.com/mcp` (`type`: `http`). Add others as needed; keep secrets out of the repo.

- Architecture:
  - [x] Specification-Driven Design (SDD) (mandatory)
  - [x] Documentation-as-Code (mandatory)
  - [ ] Monolith
  - [ ] Microservices
  - [ ] Micro Frontends
  - [ ] DDD
  - [X] TDD (docs-first, test-first)
  - [ ] BDD (docs-first, executable specs)
- Language selection (configure here)
  - Languages
    - Java (choose exactly one LTS)
      - [ ] Java 17 LTS
      - [ ] Java 21 LTS
      - [X] Java 25 LTS
    - Web
      - [X] TypeScript
        - [X] Angular (TypeScript)
        - [ ] React (TypeScript)
          - [ ] Next.js (TypeScript)
        - [ ] Vue (TypeScript)
          - [ ] Nuxt (TypeScript)
      - [ ] JavaScript
    - Kotlin
      - [ ] Kotlin
      - [ ] Ktor (requires Kotlin)
    - Other: <OTHER_LANGUAGES>
  - Build engines
    - Java/Kotlin builds
      - [X] Maven
      - [ ] Gradle (Groovy DSL)
      - [ ] Gradle (Kotlin DSL)
      - [ ] Apache Ivy
    - Web builds
      - [ ] npm / package.json scripts
      - [ ] pnpm
      - [ ] yarn
      - [ ] Babel (transpile configuration lives in package.json/babel.config.*)
    - Other build tooling: <OTHER_BUILDS>
  - Dependency declarations
    - JVM: document artifact coordinates only (groupId:artifactId:version); detailed build configuration belongs in build-tooling topics.
    - JavaScript/Web: document package names + versions (npm/pnpm/yarn/Babel) and leave script wiring to language/build guides.

- Component/topic areas (list): WebAwesome components (buttons, inputs, overlays, layout: WaCluster/WaStack), JWebMP client wrappers, Angular Awesome integration, asset/theme configurators.
- Fluent API Strategy (choose exactly one):
  - [X] CRTP
  - [ ] Builder pattern (Lombok @Builder/manual)
- Backend Reactive: none.
- Backend: none.
- Structural:
  - [ ] MapStruct
  - [ ] Lombok
  - [X] Logging
  - [X] JSpecify
- Testing & Coverage:
  - [X] Jacoco
  - [ ] SonarQube
  - [X] Java Micro Harness
  - [ ] Cypress
  - [X] BrowserStack
- Frontend (Standard):
  - [ ] Web Components
- Frontend (Reactive):
  - Angular
    - [ ] Angular 17
    - [ ] Angular 19
    - [X] Angular 20
- Frontend (Angular Plugins):
  - [X] Angular Awesome
  - Frameworks (JWebMP):
    - [ ] Core
    - [X] Client
    - [X] TypeScript
    - [X] Angular
    - [X] WebAwesome
    - [ ] AgCharts
    - [ ] AgCharts Enterprise
- Security/Auth Providers: none selected.
- CI/CD Providers:
  - [X] GitHub Actions
  - [ ] GitLab CI
  - [ ] Jenkins
  - [ ] TeamCity
  - [ ] Google Cloud Build
  - [ ] Azure Pipelines
  - [ ] AWS CodeBuild/CodePipeline
- Observability/Diagnostics:
  - [ ] Wireshark
- Release impact:
  - [x] Forward-only (breaking changes allowed)
  - [ ] Backcompat required (only if explicitly demanded)

Policies (must honor):
- Reset AI context before running; treat existing docs as outdated until revalidated.
- Follow RULES.md sections 4/5, Document Modularity Policy, and Forward-Only Change Policy.
- Logging: Log4j2; if Lombok is used, only `@Log4j2`.
- Generated artifacts are read-only; do not propose edits to compiled outputs. In JWebMP, avoid inline string HTML—use components.
- Fluency: CRTP enforced for JWebMP/WebAwesome; avoid builders.
- Glossary policy (topic-first): maintain topic GLOSSARY.md with minimal canonical terms and prompt language alignment; host projects link to it and copy only enforced names (WaButton, WaInput, WaCluster, WaStack).
- Sandbox/Pact note: keep host artifacts at repo root or `docs/`; rules live under `rules/generative/frontend/jwebmp/webawesome`.

(Sections 1–6 from the template apply unchanged for staged documentation-first workflow, diagrams-as-code, and output/guardrail checklists.)
