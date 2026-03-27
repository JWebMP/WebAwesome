# WaCombobox Rules — Web Awesome 3.4.1

## Component (Pro)
- **Tag:** `wa-combobox`
- **Java Class:** `com.jwebmp.webawesomepro.components.combobox.WaCombobox`

## Attributes

| Attribute        | Java Field / Setter                      | Type                  | Notes                  |
|------------------|-------------------------------------------|-----------------------|------------------------|
| `value`          | `setValue(String)`                        | String                |                        |
| `placeholder`    | `setPlaceholder(String)`                  | String                |                        |
| `disabled`       | `setDisabled(Boolean)`                    | Boolean               | Boolean attribute      |
| `clearable`      | `setClearable(Boolean)`                   | Boolean               | Boolean attribute      |
| `multiple`       | `setMultiple(Boolean)`                    | Boolean               | Boolean attribute      |
| `size`           | `setSize(Size)`                           | Enum                  |                        |
| `label`          | `setLabel(String)`                        | String                |                        |
| `hint`           | `setHint(String)`                         | String                |                        |
| `required`       | `setRequired(Boolean)`                    | Boolean               | Boolean attribute      |
| `form`           | `setForm(String)`                         | String                |                        |
| `input-value`    | `setInputValue(String)`                   | String                | **New in 3.4.1**       |
| `open`           | `setOpen(Boolean)`                        | Boolean               | **New in 3.4.1** — boolean attribute |
| `allow-create`   | `setAllowCreate(Boolean)`                 | Boolean               | **New in 3.4.1** — boolean attribute |
| `autocapitalize` | `setAutocapitalize(AutoCapitalize)`       | Enum                  | **New in 3.4.1**       |
| `autocorrect`    | `setAutocorrect(String)`                  | String (on, off)      | **New in 3.4.1**       |
| `inputmode`      | `setInputmode(InputMode)`                 | Enum                  | **New in 3.4.1**       |
| `enterkeyhint`   | `setEnterkeyhint(EnterKeyHint)`           | Enum                  | **New in 3.4.1**       |
| `spellcheck`     | `setSpellcheck(Boolean)`                  | Boolean               | **New in 3.4.1** — boolean attribute |

## Events

| Event        | Java Field / Setter           | Notes                         |
|--------------|-------------------------------|-------------------------------|
| `wa-input`   | `setInputEvent(String)`       |                               |
| `wa-change`  | `setChangeEvent(String)`      |                               |
| `wa-focus`   | `setFocusEvent(String)`       |                               |
| `wa-blur`    | `setBlurEvent(String)`        |                               |
| `wa-clear`   | `setClearEvent(String)`       |                               |
| `wa-show`    | `setShowEvent(String)`        |                               |
| `wa-hide`    | `setHideEvent(String)`        |                               |
| `wa-create`  | `setCreateEvent(String)`      | **New in 3.4.1** — fires when user creates a new option via `allowCreate` |

## Enums
- `AutoCapitalize`: Off, None, On, Sentences, Words, Characters
- `InputMode`: None, Text, Decimal, Numeric, Tel, Search, Email, Url
- `EnterKeyHint`: Enter, Done, Go, Next, Previous, Search, Send

