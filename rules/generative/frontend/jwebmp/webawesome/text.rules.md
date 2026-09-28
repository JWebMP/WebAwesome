# WaText rules

- **Java class:** `com.jwebmp.webawesome.components.text.WaText`
- **Directive:** `waText` on the chosen semantic HTML tag; this is not a
  `<wa-text>` custom element.

Use `WaText` by default for visible page copy in WebAwesome-authored pages:
headings, body paragraphs, captions, and styled links. Do not default to
JWebMP `Paragraph`, `Span`, `DivSimple`, or bare text nodes for this copy.
Set a semantic tag and matching WebAwesome type preset; a bare `new WaText<>()`
is a `<div>` without a body/heading preset.

```java
var heading = new WaText<>().setTag("h2")
        .setWaHeading("m").setText("Recent activity");
var paragraph = new WaText<>().setTag("p")
        .setWaBody("m").setText("Updates from your team.");
var caption = new WaText<>().setTag("span")
        .setWaCaption("s").setWaColorText("quiet").setText("Updated today");
```

`setWaLongform(...)` suits long-form prose; `setWaLink(...)` styles an `a`
tag. `setWaFontSize`, `setWaFontWeight`, `setWaColorText`, and
`setWaTextTruncate` cover additional typography choices. Use `WaMarkdown`
for Markdown or rich inline markup. Keep button labels, select options,
input hints, and similar control-owned text in their components. Retain
specialized semantic components when they supply behavior or accessibility
that `WaText` alone does not provide.
