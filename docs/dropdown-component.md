# Dropdown Component (`WaDropDown`)

The WaDropDown component provides a dropdown menu triggered by a button. It allows users to select from a list of options presented in a popup panel.

## Basic Usage

```java
// Basic dropdown with items
WaDropDown dropdown = new WaDropDown();
dropdown.setButton(new WaButton("Options"));
dropdown.addItem("Option 1", "option1");
dropdown.addItem("Option 2", "option2");
dropdown.addItem("Option 3", "option3");
```

## Features

- **Customizable Trigger**: Use any button as the dropdown trigger
- **Flexible Placement**: Position the dropdown in various locations relative to the trigger
- **Event Handling**: Respond to dropdown open, close, and selection events
- **Styling Options**: Customize appearance with various styling properties
- **Nested Dropdowns**: Create hierarchical menus with submenu support

## Attributes

| Attribute | Type | Description |
|-----------|------|-------------|
| `placement` | String | Preferred placement of the dropdown (top, top-start, top-end, bottom, etc.) |
| `disabled` | Boolean | Disables the dropdown trigger |
| `stayOpenOnSelect` | Boolean | Prevents dropdown from closing on item selection |
| `containingElement` | Element | Custom element that controls close-on-outside-click behavior |
| `distance` | Number | Pixel distance offset between trigger and panel |
| `skidding` | Number | Pixel offset along the trigger |
| `sync` | String | Syncs dropdown panel dimensions with the trigger (width, height, both) |
| `value` | String | The selected value from the dropdown's menu |

## Events

| Event | Description |
|-------|-------------|
| `showEvent` | Fires when the dropdown opens |
| `afterShowEvent` | Fires after dropdown animations finish |
| `hideEvent` | Fires when the dropdown begins closing |
| `afterHideEvent` | Fires after dropdown is fully closed |
| `selectEvent` | Fires when a dropdown item is selected |

## Methods

| Method | Description |
|--------|-------------|
| `show()` | Programmatically open the dropdown |
| `hide()` | Programmatically close the dropdown |
| `reposition()` | Force realignment of the dropdown |

## Dropdown Items

The `WaDropdownItem` component represents an item within a dropdown menu:

```java
// Create dropdown items
WaDropdownItem item1 = new WaDropdownItem("Option 1").setValue("option1");
WaDropdownItem item2 = new WaDropdownItem("Option 2").setValue("option2");

// Add items to dropdown
dropdown.addItem(item1);
dropdown.addItem(item2);

// Or use the convenience methods
dropdown.addItem("Option 3", "option3");
```

### Dropdown Item Attributes

| Attribute | Type | Description |
|-----------|------|-------------|
| `value` | String | The value associated with this dropdown item |
| `disabled` | Boolean | Whether the item is disabled |
| `checked` | Boolean | Whether the item is checked (for checkbox-like behavior) |

### Dropdown Item Slots

| Slot | Description |
|------|-------------|
| `start` | Content to place at the start/left of the item |
| `end` | Content to place at the end/right of the item |
| `submenu` | A nested dropdown for hierarchical menus |

## Examples

### Basic Dropdown

```java
WaButton button = new WaButton("Dropdown");
WaDropDown dropdown = new WaDropDown();
dropdown.setButton(button);
dropdown.addItem("Item 1", "item1");
dropdown.addItem("Item 2", "item2");
dropdown.addItem("Item 3", "item3");
```

### Dropdown with Custom Placement

```java
WaDropDown dropdown = new WaDropDown();
dropdown.setButton(new WaButton("Placement Options"));
dropdown.setPlacement(PlacementExtended.Bottom_Start);
dropdown.addItem("Item 1");
dropdown.addItem("Item 2");
```

### Disabled Dropdown

```java
WaDropDown dropdown = new WaDropDown();
dropdown.setButton(new WaButton("Disabled Dropdown"));
dropdown.setDisabled(true);
dropdown.addItem("Item 1");
dropdown.addItem("Item 2");
```

### Stay Open On Select

```java
WaDropDown dropdown = new WaDropDown();
dropdown.setButton(new WaButton("Stay Open"));
dropdown.setStayOpenOnSelect(true);
dropdown.addItem("Item 1");
dropdown.addItem("Item 2");
dropdown.addItem("Item 3");
```

### With Distance and Skidding

```java
WaDropDown dropdown = new WaDropDown();
dropdown.setButton(new WaButton("Custom Offset"));
dropdown.setDistance(10);
dropdown.setSkidding(5);
dropdown.addItem("Item 1");
dropdown.addItem("Item 2");
```

### Sync Width with Trigger

```java
WaDropDown dropdown = new WaDropDown();
dropdown.setButton(new WaButton("Sync Width"));
dropdown.setSync("width");
dropdown.addItem("Item 1");
dropdown.addItem("Item 2");
```

### With Event Handling

```java
WaDropDown dropdown = new WaDropDown();
dropdown.setButton(new WaButton("Events"));
dropdown.setShowEvent("onShow()");
dropdown.setAfterShowEvent("onAfterShow()");
dropdown.setHideEvent("onHide()");
dropdown.setAfterHideEvent("onAfterHide()");
dropdown.setSelectEvent("onSelect($event)");
dropdown.addItem("Item 1", "item1");
dropdown.addItem("Item 2", "item2");
dropdown.addItem("Item 3", "item3");
```

### With Icons

```java
WaDropDown dropdown = new WaDropDown();
dropdown.setButton(new WaButton("With Icons"));

WaIcon cutIcon = new WaIcon().setName("cut");
WaDropdownItem cutItem = new WaDropdownItem("Cut");
cutItem.setStartContent(cutIcon);
dropdown.addItem(cutItem);

WaIcon copyIcon = new WaIcon().setName("copy");
WaDropdownItem copyItem = new WaDropdownItem("Copy");
copyItem.setStartContent(copyIcon);
dropdown.addItem(copyItem);

WaIcon pasteIcon = new WaIcon().setName("paste");
WaDropdownItem pasteItem = new WaDropdownItem("Paste");
pasteItem.setStartContent(pasteIcon);
dropdown.addItem(pasteItem);
```

### With Submenu

```java
WaDropDown dropdown = new WaDropDown();
dropdown.setButton(new WaButton("With Submenu"));
dropdown.addItem("Item 1");

WaDropDown submenu = new WaDropDown();
submenu.addItem("Submenu Item 1");
submenu.addItem("Submenu Item 2");

WaDropdownItem itemWithSubmenu = new WaDropdownItem("More Options");
itemWithSubmenu.setSubmenu(submenu);
dropdown.addItem(itemWithSubmenu);

dropdown.addItem("Item 3");
```

### In a Form

```java
// Create a form with dropdown selectors
Div form = new Div();

// Add a heading
H2 heading = new H2("Form with Dropdowns");
form.add(heading);

// Country dropdown
Div countryGroup = new Div();
countryGroup.add(new Label("Select Country"));
WaDropDown countryDropdown = new WaDropDown();
countryDropdown.setButton(new WaButton("Select a country"));
countryDropdown.addItem("United States", "us");
countryDropdown.addItem("Canada", "ca");
countryDropdown.addItem("Mexico", "mx");
countryDropdown.addItem("United Kingdom", "uk");
countryDropdown.bind("selectedCountry");
countryGroup.add(countryDropdown);
form.add(countryGroup);

// Language dropdown
Div languageGroup = new Div();
languageGroup.add(new Label("Select Language"));
WaDropDown languageDropdown = new WaDropDown();
languageDropdown.setButton(new WaButton("Select a language"));
languageDropdown.addItem("English", "en");
languageDropdown.addItem("French", "fr");
languageDropdown.addItem("Spanish", "es");
languageDropdown.addItem("German", "de");
languageDropdown.bind("selectedLanguage");
languageGroup.add(languageDropdown);
form.add(languageGroup);

// Submit button
WaButton submitButton = new WaButton("Submit");
submitButton.setVariant("primary");
form.add(submitButton);
```