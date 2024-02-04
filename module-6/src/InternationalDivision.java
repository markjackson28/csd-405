public class InternationalDivision extends Division {
  private String country; // Field for the country
  private String language; // Field for the language spoken

  // Constructor that requires all fields
  public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
    super(divisionName, accountNumber); // Calls the superclass constructor
    this.country = country;
    this.language = language;
  }

  // Implement the display method to show all fields
  @Override
  public void display() {
    System.out.println("International Division: " + divisionName +
        ", Account Number: " + accountNumber +
        ", Country: " + country +
        ", Language: " + language);
  }
}
