# WaTagInput Rules — Web Awesome 3.14

`WaTagInput` renders `<wa-tag-input>` and imports `WaTagInputDirective` from `angular-awesome`.
Use `setValue(String)` for the delimiter-separated initial/reset HTML value and `bindValue(String)`
for Angular's live `string[]` value. Programmatic array updates are owned by Angular Awesome and do
not synthesize user input/change events.

Slots are exposed through `setLabelSlot`, `setStart`, `setEnd`, `setClearIcon`, and `setHintSlot`.
The wrapper covers `wa-input`, `wa-change`, `wa-focus`, `wa-blur`, cancelable `wa-create`,
`wa-clear`, and `wa-invalid`.

```java
new WaTagInput<>()
        .setLabel("Skills")
        .setDelimiter(",;")
        .setMaxTags(8)
        .setWithClear(true)
        .bindValue("profile.skills")
        .setCreateEvent("validateSkill($event)");
```
