import java.util.ArrayList;
import java.util.Scanner;

public class MarkArrayListTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    System.out.println("Enter integers (0 to stop):");

    while (true) {
      System.out.print("Enter number: "); // Clear prompt for input
      int input = scanner.nextInt();
      numbers.add(input);

      if (input == 0) {
        break;
      }
    }

    scanner.close();

    Integer maxNumber = max(numbers);
    System.out.println("The largest number is: " + maxNumber);
  }

  public static Integer max(ArrayList<Integer> list) {
    if (list.isEmpty()) {
      return 0;
    }

    Integer max = list.get(0);
    for (Integer number : list) {
      if (number > max) {
        max = number;
      }
    }
    return max;
  }
}
