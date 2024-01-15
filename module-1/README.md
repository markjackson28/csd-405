# Fan Class Program

## Overview
This program features a class titled `Fan`, designed to model a typical household fan with various attributes and behaviors. The class includes constants, private fields, constructors, and a `toString()` method to represent the fan's state.

## Class Specifications

### Constants
- **STOPPED, SLOW, MEDIUM, FAST**: These constants represent the fan's speed states, holding values `0`, `1`, `2`, and `3` respectively.

### Fields
- **speed**: A private field that holds the speed of the fan. Default value is `STOPPED`.
- **on**: A private Boolean field indicating if the fan is on (`true`) or off (`false`).
- **radius**: A private field that holds the radius of the fan. Default value is `6`.
- **color**: A String field that holds the color of the fan, with the default being `white`.

### Constructors
- **No-argument constructor**: Sets all fields to their default values.
- **Argument constructor**: Takes arguments to set the values of the fields.

### Methods
- **Setters and Getters**: For all mutable fields (`speed`, `on`, `radius`, `color`).
- **toString()**: Returns a string describing the current state of the fan (speed, on/off status, radius, and color).

## Test Code
The test code should demonstrate the following:
1. **Creation of Fan Instances**:
   - One instance using the default constructor.
   - Another instance using the argument constructor with custom values.

2. **Displaying Functionality**:
   - Show the usage of setter methods to change fan attributes.
   - Use the `toString()` method to display the state of each fan instance.

### Example Output
- Output showing the default state of the fan.
- Output showing the state of the fan after using the argument constructor.
- Output demonstrating changes made using the setter methods and the resulting state from `toString()`.
