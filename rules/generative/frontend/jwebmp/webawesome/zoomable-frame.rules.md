# WaZoomableFrame Rules — Web Awesome 3.14

`WaZoomableFrame` renders `<wa-zoomable-frame>` and imports the public Angular Awesome
`WaZoomableFrameDirective` export.

The 3.14 iframe and accessibility inputs are `allow` (`setAllow`), `name` (`setName`), and `label`
(`setLabel`). Existing zoom, pan, disabled, theme-sync, width, and height setters and binding helpers
remain available.

```java
new WaZoomableFrame<>()
        .setAllow("clipboard-write; fullscreen")
        .setName("preview")
        .setLabel("Document preview")
        .setWithThemeSync(true);
```
