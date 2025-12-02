# Sequence — Component Render Lifecycle

Flow from Java instantiation to browser execution for a Wa component (example: WaButton).

```mermaid
sequenceDiagram
  participant Developer
  participant WaButton
  participant Renderer
  participant Browser
  participant WebComponent

  Developer->>WaButton: Configure variant/appearance/slots
  WaButton->>Renderer: init() builds attributes and slots
  Renderer-->>Browser: Emit <wa-button> with attributes and slotted children
  Browser->>WebComponent: Hydrate custom element from angular-awesome bundle
  WebComponent-->>Developer: Fire events wa-blur/wa-focus/wa-invalid callbacks
```

Notes:
- `init()` guards against duplicate initialization and only adds attributes when set.
- Event handler attributes map directly to WebAwesome custom event names.
