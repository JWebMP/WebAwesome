## Popover Component Rules

📌 This directive assumes compliance with general [Web Awesome Angular Rules](../../../RULES.md).

### Component: `<wa-popover>`

Popovers display contextual content and interactive elements in a floating panel. Unlike tooltips, popovers can contain links, buttons, and form controls. They appear without an overlay and will close when you click outside or press Escape. Only one popover can be open at a time.

Popovers show when you click their anchor element. You can also control them programmatically by setting the open property to true or false.

---

### Angular Directive Selector

`waPopover`

---

### Inputs

| Input                    | Type      | Description                                                                                                       |
| ------------------------ | --------- | ----------------------------------------------------------------------------------------------------------------- |
| `for`                    | `string`  | The ID of the popover's anchor element. This must be an interactive/focusable element such as a button.           |
| `open`                   | `boolean` | Shows or hides the popover. Default is false.                                                                     |
| `placement`              | \`'top'   | 'top-start' | 'top-end' | 'right' | 'right-start' | 'right-end' | 'bottom' | 'bottom-start' | 'bottom-end' | 'left' | 'left-start' | 'left-end'\` | The preferred placement of the popover. Note that the actual placement may vary as needed to keep the popover inside of the viewport. Default is 'top'. |
| `distance`               | `number`  | The distance in pixels from which to offset the popover away from its target. Default is 8.                       |
| `skidding`               | `number`  | The distance in pixels from which to offset the popover along its target. Default is 0.                           |

---

### Events

| Event           | Description                                                                                                                |
| --------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `wa-show`       | Emitted when the popover begins to show. Canceling this event will stop the popover from showing.                          |
| `wa-after-show` | Emitted after the popover has shown and all animations are complete.                                                       |
| `wa-hide`       | Emitted when the popover begins to hide. Canceling this event will stop the popover from hiding.                           |
| `wa-after-hide` | Emitted after the popover has hidden and all animations are complete.                                                      |

---

### CSS Custom Properties

| Property                        | Description                                                                                                       |
| ------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `--arrow-size`                  | The size of the tiny arrow that points to the popover (set to zero to remove). Default is 0.375rem.               |
| `--max-width`                   | The maximum width of the popover's body content. Default is 25rem.                                                |
| `--show-duration`               | The speed of the show animation. Default is 100ms.                                                                |
| `--hide-duration`               | The speed of the hide animation. Default is 100ms.                                                                |

---

### CSS Parts

| Part            | Description                                                                                                                |
| --------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `dialog`        | The native dialog element that contains the popover content.                                                               |
| `body`          | The popover's body where its content is rendered.                                                                          |
| `popup`         | The internal <wa-popup> element that positions the popover.                                                                |
| `popup__popup`  | The popup's exported popup part. Use this to target the popover's popup container.                                         |
| `popup__arrow`  | The popup's exported arrow part. Use this to target the popover's arrow.                                                   |

---

### Methods

| Method          | Description                                                                                                                |
| --------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `show()`        | Shows the popover.                                                                                                         |
| `hide()`        | Hides the popover.                                                                                                         |

---

### Custom States

| Name            | Description                                                                                                                | CSS selector |
| --------------- | -------------------------------------------------------------------------------------------------------------------------- | ------------ |
| `open`          | Applied when the popover is open.                                                                                          | `:state(open)` |

---

### Slots

| Name            | Description                                                                                                                |
| --------------- | -------------------------------------------------------------------------------------------------------------------------- |
| (default)       | The popover's content. Interactive elements such as buttons and links are supported.                                       |

---

### Dependencies

This component automatically imports the following elements. Sub-dependencies, if any exist, will also be included in this list.

`<wa-popup>`

---

### Notes

* Make sure the anchor element exists in the DOM before the popover connects. If it doesn't exist, the popover won't attach and you'll see a console warning.
* Use `data-popover="close"` on any button inside a popover to close it automatically.

---

### Spec + Index + Example files

Ensure the Angular generator also creates:

* `wa-popover.directive.ts`
* `wa-popover.directive.spec.ts`
* `index.ts` export barrel
* `README.md` referencing this `rules.md`
* `examples.md` with placement, distance, opening/closing, and other samples.