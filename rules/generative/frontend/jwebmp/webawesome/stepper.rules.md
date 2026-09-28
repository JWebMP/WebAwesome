# WaStepper Rules — Web Awesome 3.14

`WaStepper` renders `<wa-stepper>` and accepts `WaStep` children. Use `StepperOrientation.Auto` for
responsive layouts, `linear` to require ordered completion, and `clickable` to expose steps as
controls. `wa-before-step-change` is cancelable; `wa-step-change` runs after navigation.

```java
new WaStepper<>()
        .setActive("account")
        .setOrientation(StepperOrientation.Auto)
        .setLinear(true)
        .setClickable(true)
        .setBeforeStepChangeEvent("saveOrCancel($event)")
        .add(new WaStep<>("account"))
        .add(new WaStep<>("security"));
```
