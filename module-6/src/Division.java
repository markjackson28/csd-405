public abstract class Division {
  // Field for division's name
  protected String divisionName; 
  // Field for account number
  protected int accountNumber; 

  // Constructor that requires division name and account number
  public Division(String divisionName, int accountNumber) {
      this.divisionName = divisionName;
      this.accountNumber = accountNumber;
  }

  // Abstract method to be implemented by subclasses
  public abstract void display();
}
