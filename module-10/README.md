# Card Display Application

## Description

This JavaFX application displays a random selection of four playing cards from a standard deck. Users can refresh the displayed cards by clicking a "Refresh Cards" button. This project demonstrates the use of JavaFX for creating a simple GUI application.

## Features

- Display four random cards from a standard 52-card deck.
- Refresh functionality to display a new set of random cards.
- Images are stored in a dedicated "cards" subdirectory for easy management.

## Prerequisites

- Java Development Kit (JDK) 8 or later.
- JavaFX SDK (corresponding to your JDK version).

## Setup and Running

1. Ensure Java and JavaFX are properly installed on your system.
2. Clone this repository to your local machine.
3. Navigate to the project directory and compile the application:
   ```shell
   javac -cp path/to/javafx-sdk/lib/* CardDisplay.java
   ```
4. Run the application:
   ```shell
   java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls CardDisplay
   ```
