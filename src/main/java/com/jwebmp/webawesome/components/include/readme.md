# WaInclude Component

## Overview
The `WaInclude` class is a custom component derived from the `DivSimple<WaInclude>` class (a div-based component). It represents an HTML element with the `<wa-include>` tag, used to dynamically include external resources using a specified source URL. The component supports various configurations, such as Cross-Origin Resource Sharing (CORS) modes and scripts inclusion, making it an adaptable component for injecting external content into web pages.

---

## Features
- **Custom HTML Tag**: Uses the `<wa-include>` tag instead of a standard `<div>` to represent this custom component.
- **Dynamic Resource Loading**: Allows specifying a source URL for loading external resources.
- **CORS Support**: Configurable Cross-Origin Resource Sharing (CORS) behavior with various modes.
- **Script Permissions**: Optional allowance for executing scripts within the included content.

---

## Configuration

### Fields
The class includes the following configurable fields:

1. **`source`** (`String`)
   - **Description**: The URL or path of the external resource to be included in the component.
   - **Purpose**: Acts as the primary source of the content to be embedded into the component.
   - **Usage**: Maps to the `src` attribute of the `<wa-include>` tag.

2. **`corsMode`** (`CorsMode`)
   - **Description**: Specifies the CORS mode for processing the content.
   - **Purpose**: Indicates how Cross-Origin Resource Sharing is handled for external content loading.
   - **Usage**: Maps to the `mode` attribute of the `<wa-include>` tag and converts the given `CorsMode` to a lowercase string.

3. **`allowScripts`** (`Boolean`)
   - **Description**: Determines whether scripts from the included content are allowed to execute.
   - **Purpose**: Controls whether the `allow-scripts` attribute is added to the `<wa-include>` tag.
   - **Usage**: When set to `true`, enables the execution of scripts in the embedded content.

---

### Constructors

#### `WaInclude()`
- **Description**: Default constructor that initializes the component with the tag name `"wa-include"`.
- **Usage**: Called to create an instance of the `WaInclude` component.

---

### Methods

#### `init()`
- **Overrides**: `DivSimple<WaInclude>.init()`
- **Purpose**: Initializes the `WaInclude` component by setting its attributes, such as `src`, `mode`, and `allow-scripts`, based on the current field values.
- **Details**:
   - If the component is not already initialized, the following attributes are set dynamically:
      - `src`: The value of the `source` field.
      - `mode`: The string value of the `corsMode` converted to lowercase (if not `null`).
      - `allow-scripts`: Indicates whether scripts are allowed for execution (`true` or `false`).
   - Calls the superclass's `init()` method after processing attributes.

---

## Usage Example

This example illustrates how to use the `WaInclude` component in a Java application:

```java
WaInclude waInclude = new WaInclude();
waInclude.setSource("https://example.com/resource.html"); // Specify the resource URL
waInclude.setCorsMode(CorsMode.CORS); // Set the CORS mode
waInclude.setAllowScripts(true); // Allow scripts to execute

// Add the initialized component to the parent container
parentContainer.add(waInclude);
```

### Expected Output

When rendered in the DOM, the component would produce the following HTML:
```html
<wa-include src="https://example.com/resource.html" mode="cors" allow-scripts="true"></wa-include>
```

---

## Configuration Attributes

1. **Tag Name**: The component is represented by the `<wa-include>` HTML tag.

2. **Attributes**:
   - **`src`**: Specifies the source URL to include.
   - **`mode`** _(optional)_: Defines the CORS behavior (values depend on the `CorsMode` enumeration).
   - **`allow-scripts`** _(optional)_: Added if `allowScripts` is `true`, allowing embedded scripts to execute.

3. **Default Behavior**:
   - The component initializes its attributes only once using the `init()` method, ensuring that all required attributes are set before rendering.

---

## Notes
1. **Dependencies**:
   - The `WaInclude` class depends on:
      - `DivSimple` from `com.jwebmp.core.base.html` for base div-style component behavior.
      - `lombok.Getter` and `lombok.Setter` for reducing boilerplate getter and setter methods.
   - A `CorsMode` enumeration or class is expected to be defined elsewhere in the library, representing possible CORS behaviors.

2. **Attributes Handling**:
   - The `init()` method ensures that attributes are only processed once for performance and consistency.

3. **For Advanced Use**:
   - Application developers can subclass or extend the behavior of this component by overriding the `init()` method or setting up additional attributes.

---

## License
This component is a part of the Web Awesome library. Refer to the library's license for use and distribution terms.