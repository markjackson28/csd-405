import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.util.Collections;
import java.util.ArrayList;

public class CardDisplay extends Application {

    private static final String IMAGES_PATH = "AssignmentCards/";

    @Override
    public void start(Stage primaryStage) {
        // VBox is a vertical layout component
        VBox vbox = new VBox(10);

        // HBox is a horizontal layout component that will hold our card images
        HBox hbox = new HBox(10);
        // Add HBox to VBox
        vbox.getChildren().add(hbox);

        // Display the initial set of random cards
        displayRandomCards(hbox);

        // Create a refresh button
        Button refreshButton = new Button("Refresh Cards");
        refreshButton.setOnAction(e -> {
            // Clear the current cards
            hbox.getChildren().clear();
            // Display a new set of random cards
            displayRandomCards(hbox);
        });

        // Add the refresh button to the VBox layout
        vbox.getChildren().add(refreshButton);

        // Create a Scene containing our VBox layout
        Scene scene = new Scene(vbox);

        // Set up the Stage (window) with the Scene and display it
        primaryStage.setTitle("Random Cards Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void displayRandomCards(HBox hbox) {
        // Generate a list of integers representing card IDs (1-52)
        ArrayList<Integer> cardNumbers = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            cardNumbers.add(i);
        }

        // Shuffle the list to randomize the order
        Collections.shuffle(cardNumbers);

        // Load and display the first four cards from the shuffled list
        for (int i = 0; i < 4; i++) {
            // Construct the filename for each card image
            String cardImageFileName = IMAGES_PATH + cardNumbers.get(i) + ".png";

            // Create an Image object for the card
            Image cardImage = new Image(cardImageFileName);

            // Create an ImageView object to display the Image
            ImageView cardImageView = new ImageView(cardImage);

            // Add the ImageView to our HBox layout
            hbox.getChildren().add(cardImageView);
        }
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}
