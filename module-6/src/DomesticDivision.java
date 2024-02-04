public class DomesticDivision extends Division {
  private String state; // Field for the state

  // Constructor that requires all fields
  public DomesticDivision(String divisionName, int accountNumber, String state) {
    // Calls the superclass constructor
    super(divisionName, accountNumber); 
    this.state = state;
  }

  // Implement the display method to show all fields
  @Override
  public void display() {
    System.out.println("Domestic Division: " + divisionName +
        ", Account Number: " + accountNumber +
        ", State: " + state);
  }
}
