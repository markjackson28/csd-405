import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLab {
  public static void main(String[] args) {
    // Step 1: Create an ArrayList to hold Strings.
    ArrayList<String> list = new ArrayList<>();

    // Step 2: Add elements to the ArrayList.
    for (int i = 1; i <= 10; i++) {
      // Adding "String 1", "String 2", ..., "String 10"
      list.add("String " + i);
    }

    // Step 3: Use a 'for-each' loop to print all elements in the ArrayList.
    for (String s : list) {
      System.out.println(s);
    }

    // Step 4: Ask the user which element they want to see again.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the element number you want to see again (1-10):");
    // Subtract 1 because ArrayList index starts at 0
    int elementIndex = scanner.nextInt() - 1; 

    // Step 5: Try to print the element, catch any exception if the index is out of
    // bounds.
    try {
      System.out.println("Your element: " + list.get(elementIndex));
    } catch (IndexOutOfBoundsException e) {
      // Print error message if index is invalid.
      System.out.println("Out of Bounds"); 
    }
  }
}
