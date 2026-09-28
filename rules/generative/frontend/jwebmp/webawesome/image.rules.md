# WaImage rules

- **Java class:** `com.jwebmp.webawesome.components.image.WaImage`
- **Rendered tag:** native `<img>`; Web Awesome has no `<wa-image>` component.

Use `WaImage` by default for ordinary still images in WebAwesome-authored
pages. It extends the JWebMP `Image` component and adds Web Awesome spacing
and border token helpers. Give informative images meaningful alternative
text; use an empty `alt` for purely decorative images.

```java
var image = new WaImage<>("/images/field.jpg", "A field at sunrise");
card.withImage(image); // The card accepts Image and therefore WaImage.
```

Use `WaAnimatedImage` when GIF/WEBP playback controls are needed, `WaAvatar`
for an avatar, and `WaComparison` or legacy `WaImageCompare` for before/after
imagery. The core `Image` remains appropriate outside WebAwesome pages.
