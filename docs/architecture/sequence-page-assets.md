# Sequence — Page Assets Load

Sequence of how WebAwesome assets are injected into a JWebMP page.

```mermaid
sequenceDiagram
  participant Developer
  participant HostPage
  participant PageConfigurator
  participant Browser
  participant AssetServer

  Developer->>HostPage: Build page with WebAwesome components
  HostPage->>PageConfigurator: Invoke configure()
  PageConfigurator-->>HostPage: Add CSS webawesome.css and theme CSS
  PageConfigurator-->>HostPage: Add JS module webawesome.loader.js
  HostPage->>Browser: Render HTML with asset references
  Browser->>AssetServer: Fetch CSS and JS from basePath/themePath
  AssetServer-->>Browser: Serve assets
  Browser-->>Developer: Components render with theme classes
```

Key trust points:
- Asset paths are provided by `basePath` and `themePath`; misconfiguration breaks styling/JS.
- Theme class names and palette names are added to `<body>` to align with CSS tokens.
