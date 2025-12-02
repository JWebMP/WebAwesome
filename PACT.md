---
version: 2.0
date: 2025-12-02
title: WebAwesome Human–AI Collaboration Pact
project: JWebMP / Web Awesome
authors: [Maintainers, Contributors, AI Assistants]
---

# 🤝 Pact.md (v2)
### The Human–AI Collaboration Pact — WebAwesome

## 1. Purpose
We codify how humans and AI collaborate on the WebAwesome plugin: documentation-first, forward-only, and rooted in the Rules Repository. Outcomes must align PACT ↔ RULES ↔ GUIDES ↔ IMPLEMENTATION ↔ architecture diagrams (`docs/architecture/`).

## 2. Principles
- **Continuity** — Carry context across prompts using `docs/PROMPT_REFERENCE.md` and the rules submodule; do not reset unless explicitly requested.
- **Finesse** — Favor precise, minimal Markdown with traceable links over verbose prose.
- **Non-Transactional Flow** — Treat work as iterative design: clarify unknowns, avoid speculation, and keep decisions visible in docs.
- **Closing Loops** — Every change references upstream rules and downstream implementation/tests.

## 3. Structure of Work
| Layer | Description | Artifact |
|-------|-------------|----------|
| Pact | Collaboration culture and guardrails | `PACT.md` |
| Rules | Selected stack constraints and links into `rules/` | `RULES.md` |
| Guides | How-to references for applying rules | `GUIDES.md` |
| Implementation | Current code layout, rollout and validation plans | `IMPLEMENTATION.md` |
| Architecture | C4, sequences, ERD (Mermaid) | `docs/architecture/` |
| Glossary | Topic-first terms + precedence policy | `GLOSSARY.md` |

## 4. Behavioral Agreements
- Language is concise, technical English with WebAwesome prompt alignment (WaButton, WaInput, WaCluster, WaStack).
- Document Modularity and Forward-Only policies from `rules/RULES.md` are mandatory; update links instead of keeping deprecated anchors.
- Stage gates: blanket approval for this run, but still deliver Stages 1–4 in order; code generation waits until Stage 4.

## 5. Developer Culture
- **Tooling** — Java 25 + Maven; Log4j2 logging; CRTP fluent setters over builders; JSpecify nullness.
- **Testing** — TDD-first using Java Micro Harness; Jacoco coverage; optional BrowserStack for cross-browser UI validation.
- **Traceability** — Diagrams via Mermaid MCP (`https://mcp.mermaidchart.com/mcp`); CI uses GitHub Actions workflow under `.github/workflows/`.

## 6. Shared Goals
1. Keep WebAwesome wrappers in sync with `angular-awesome` artifacts and asset loading.
2. Ensure glossary-aligned naming and consistent CRTP fluent APIs across components.
3. Maintain runnable tests and CI with environment clarity (`.env.example`).
4. Close documentation loops so future prompts start from `docs/PROMPT_REFERENCE.md`.

## 7. Closing Note
We engineer with intent: minimal, traceable changes that honor the Rules Repository and the existing code. If details are unknown, document questions rather than inventing architecture.
