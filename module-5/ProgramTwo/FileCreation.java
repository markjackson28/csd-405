import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileCreation {
  public static void main(String[] args) throws IOException {
    // Step 1: Create or open a file named "data.file".
    File file = new File("data.file");

    // Step 2: Use FileWriter to write to the file. Append mode is set to true.
    FileWriter writer = new FileWriter(file, true);

    // Step 3: Generate and write 10 random numbers to the file.
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      // Generate a random number between 0 and 99
      int randomNumber = random.nextInt(100); 
      // Write the number followed by a space to the file
      writer.write(randomNumber + " "); 
    }

    // Step 4: Close the FileWriter.
    writer.close();

    // Step 5: Reopen the file and read the data.
    Scanner scanner = new Scanner(file);
    System.out.println("Contents of the file:");
    while (scanner.hasNext()) {
      System.out.print(scanner.next() + " ");
    }
    scanner.close();
  }
}
