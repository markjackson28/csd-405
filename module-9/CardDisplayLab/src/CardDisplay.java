// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.layout.HBox;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.stage.Stage;
// import java.util.Collections;
// import java.util.ArrayList;

// public class CardDisplay extends Application {

//     @Override
//     public void start(Stage primaryStage) {
//         // HBox is a horizontal layout component that will hold our card images
//         HBox hbox = new HBox(10); // 10 is the spacing between elements in the HBox

//         // Generate a list of integers representing card IDs (1-52)
//         ArrayList<Integer> cardNumbers = new ArrayList<>();
//         for (int i = 1; i <= 52; i++) {
//             cardNumbers.add(i);
//         }

//         // Shuffle the list to randomize the order
//         Collections.shuffle(cardNumbers);

//         // Load and display the first four cards from the shuffled list
//         for (int i = 0; i < 4; i++) {
//             // Construct the filename for each card image
//             String cardImageFileName = "AssignmentCards/" + cardNumbers.get(i) + ".png";

//             // Create an Image object for the card
//             Image cardImage = new Image(cardImageFileName);

//             // Create an ImageView object to display the Image
//             ImageView cardImageView = new ImageView(cardImage);

//             // Add the ImageView to our layout
//             hbox.getChildren().add(cardImageView);
//         }

//         // Create a Scene containing our HBox layout
//         Scene scene = new Scene(hbox);

//         // Set up the Stage (window) with the Scene and display it
//         primaryStage.setTitle("Random Cards Display");
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }

//     public static void main(String[] args) {
//         // Launch the JavaFX application
//         launch(args);
//     }
// }
