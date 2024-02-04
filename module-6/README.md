# Module 6 Lab

## Overview
This Java project demonstrates the use of abstract classes, inheritance, and polymorphism through a division management system for a company. It includes an abstract `Division` class with two concrete subclasses, `InternationalDivision` and `DomesticDivision`, to represent different types of company divisions. The project showcases object-oriented programming principles by creating instances of these classes and displaying their details.

## Files Description
- **Division.java**: An abstract class that defines the basic structure of a division, including its name and account number, and an abstract `display()` method.
- **InternationalDivision.java**: A concrete class that extends `Division`, representing an international division with additional properties for country and language.
- **DomesticDivision.java**: A concrete class that extends `Division`, representing a domestic division with an additional property for the state.
- **UseDivision.java**: The main application class that creates instances of `InternationalDivision` and `DomesticDivision` and displays their information.

## How to Compile and Run
### Prerequisites
Ensure you have Java Development Kit (JDK) installed on your system to compile and run Java applications.

### Compiling the Application
1. Open a terminal or command prompt.
2. Navigate to the project directory where the source files are located.
3. Compile the Java files using the following command:
   ```sh
   javac src/*.java
   ```
   This command compiles all `.java` files in the `src/` directory and places the `.class` files in the same `src/` directory.

### Running the Application
1. Ensure you are in the project directory or the `src/` directory where your compiled `.class` files are located.
2. Run the `UseDivision` class using Java:
   ```sh
   java -cp src UseDivision
   ```
   The `-cp src` option sets the classpath to the `src/` directory, where the Java runtime can find the compiled `.class` files.

## Purpose of This Lab
- To understand and apply object-oriented programming principles such as inheritance, abstraction, and polymorphism.
- To gain experience with designing a system using abstract and concrete classes in Java.
- To practice compiling and running Java applications from the command line.
