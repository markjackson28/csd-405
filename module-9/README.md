# Card Display Lab

## Overview
This project is a simple JavaFX application that displays four randomly selected cards from a deck. It serves as an introduction to JavaFX and how to integrate graphical user interfaces into Java applications.

## Requirements
- JDK 11 or later
- JavaFX SDK 21.0.2
- IntelliJ IDEA or similar IDE

## Setup and Running
1. **Download JavaFX SDK**: Ensure you have the JavaFX SDK 21.0.2 downloaded and extracted.
2. **Configure JavaFX**: In your IDE, set the VM options for your run configuration to include the JavaFX library:
    ```
    --module-path /path/to/javafx-sdk-21.0.2/lib --add-modules javafx.controls,javafx.fxml
    ```
    Replace `/path/to/javafx-sdk-21.0.2/lib` with the actual path to your JavaFX SDK `lib` directory.
3. **Run the Application**: Use your IDE's run functionality to start the application. It should display a window with four randomly selected card images.
