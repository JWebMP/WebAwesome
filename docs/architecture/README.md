# WebAwesome Architecture Index

This index captures the current WebAwesome plugin architecture reconstructed from the codebase. Diagrams use Mermaid sources only; rendered images should be regenerated from these files when needed.

## Diagram Links
- C4 Context — `docs/architecture/c4-context.md`
- C4 Container — `docs/architecture/c4-container.md`
- C4 Component (WebAwesome module) — `docs/architecture/c4-component-webawesome.md`
- Sequence: Page assets load — `docs/architecture/sequence-page-assets.md`
- Sequence: Component render lifecycle — `docs/architecture/sequence-component-render.md`
- ERD: WebAwesome component model — `docs/architecture/erd-webawesome.md`

## Notes
- Diagrams were authored with Mermaid; the Mermaid MCP server (`https://mcp.mermaidchart.com/mcp`) is the default render target.
- Follow the forward-only policy: update these sources directly instead of keeping legacy copies.
- Each diagram reflects current modules discovered in the repository (single Maven module `com.jwebmp.webawesome` with Guice + JWebMP integration).
