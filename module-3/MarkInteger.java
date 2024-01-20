// Define the class MarkInteger
public class MarkInteger {
  // An int data field titled 'mark' (using the first name)
  private int mark;

  // Constructor that takes and sets the initial value
  public MarkInteger(int initialValue) {
      this.mark = initialValue;
  }

  // Getter method for mark
  public int getMark() {
      return mark;
  }

  // Setter method for mark
  public void setMark(int mark) {
      this.mark = mark;
  }

  // Non-static method to check if mark is even
  public boolean isEven() {
      return this.mark % 2 == 0;
  }

  // Non-static method to check if mark is odd
  public boolean isOdd() {
      return this.mark % 2 != 0;
  }

  // Non-static method to check if mark is prime
  public boolean isPrime() {
      if (this.mark <= 1) {
          return false;
      }
      for (int i = 2; i <= Math.sqrt(this.mark); i++) {
          if (this.mark % i == 0) {
              return false;
          }
      }
      return true;
  }

  // Static method to check if a number is even
  public static boolean isEven(int number) {
      return number % 2 == 0;
  }

  // Static method to check if a number is odd
  public static boolean isOdd(int number) {
      return number % 2 != 0;
  }

  // Static method to check if a number is prime
  public static boolean isPrime(int number) {
      if (number <= 1) {
          return false;
      }
      for (int i = 2; i <= Math.sqrt(number); i++) {
          if (number % i == 0) {
              return false;
          }
      }
      return true;
  }

  // Static method to check if a MarkInteger is even
  public static boolean isEven(MarkInteger obj) {
      return isEven(obj.mark);
  }

  // Static method to check if a MarkInteger is odd
  public static boolean isOdd(MarkInteger obj) {
      return isOdd(obj.mark);
  }

  // Static method to check if a MarkInteger is prime
  public static boolean isPrime(MarkInteger obj) {
      return isPrime(obj.mark);
  }

  // Method to compare an int value with mark
  public boolean equals(int number) {
      return this.mark == number;
  }

  // Method to compare another MarkInteger object with this one
  public boolean equals(MarkInteger obj) {
      return obj != null && this.mark == obj.mark;
  }

  // Test code
  public static void main(String[] args) {
      // Creating three instances of MarkInteger
      MarkInteger number1 = new MarkInteger(5);
      MarkInteger number2 = new MarkInteger(5);
      MarkInteger number3 = new MarkInteger(7);

      // Test the methods
      System.out.println("number1 is even? " + number1.isEven());
      System.out.println("number2 is odd? " + number2.isOdd());
      System.out.println("number3 is prime? " + number3.isPrime());
      System.out.println("number1 equals number2? " + number1.equals(number2));
      System.out.println("number1 equals number3? " + number1.equals(number3));
      System.out.println("Static isEven with number1: " + MarkInteger.isEven(number1));
      System.out.println("Static isOdd with number2: " + MarkInteger.isOdd(number2));
      System.out.println("Static isPrime with number3: " + MarkInteger.isPrime(number3));
  }
}
