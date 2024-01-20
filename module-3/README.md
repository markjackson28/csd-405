# Integer Class Implementation README

## Overview
This lab involves creating a class titled `Integer` (e.g., `AnnaInteger`, `LarryInteger`, `SueInteger`) to demonstrate basic object-oriented programming concepts in Java, particularly focusing on various class methods and their functionalities.

## Class Specifications

### Class Structure
- **Data Field**: An `int` data field named with your first name (e.g., `anna`, `larry`, `sue`).
- **Constructor**: A constructor that takes an initial value and sets it to the data field.
- **Getter and Setter Methods**: Methods to get and set the value of the data field.

### Non-Static Methods
- **isEven()**: Returns `true` if the instance's value is even, `false` otherwise.
- **isOdd()**: Returns `true` if the instance's value is odd, `false` otherwise.
- **isPrime()**: Returns `true` if the instance's value is prime, `false` otherwise.

### Static Methods
- **isEven(int)**: Static method that returns `true` if the provided int value is even.
- **isOdd(int)**: Static method that returns `true` if the provided int value is odd.
- **isPrime(int)**: Static method that returns `true` if the provided int value is prime.
- **isEven(Integer)**, **isOdd(Integer)**, **isPrime(Integer)**: Static methods with the same logic as the previous ones but take an instance of the class as the parameter.

### Equality Methods
- **equals(int)**: Returns `true` if the instance's value is equal to the provided int value.
- **equals(Integer)**: Returns `true` if the instance's value is equal to another instance's value.

## Test Code Specifications
- **Instance Creation**: Create three instances of the class, two with the same value and one with a different value.
- **Method Testing**: Write test code to ensure all methods (both non-static and static) function correctly. This includes checking the correctness of the `isEven()`, `isOdd()`, `isPrime()`, `equals(int)`, and `equals(Integer)` methods.
