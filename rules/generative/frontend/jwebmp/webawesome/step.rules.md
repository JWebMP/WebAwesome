# WaStep Rules — Web Awesome 3.14

`WaStep` renders a named stage within `WaStepper`. Status is authored with `completed`, `loading`,
`disabled`, `active`, a semantic `Variant`, and `StepAttention`. Set `with-description` for SSR when
using the `description` slot. The `icon` slot replaces the generated marker.

```java
new WaStep<>("payment")
        .setVariant(Variant.Warning)
        .setAttention(StepAttention.Pulse)
        .setWithDescription(true)
        .setDescription(new DivSimple<>().setText("Confirm billing details"));
```
