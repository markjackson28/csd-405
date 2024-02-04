public class UseDivision {
  public static void main(String[] args) {
    // Create two instances of InternationalDivision
    InternationalDivision international1 = new InternationalDivision("Global Tech", 12345, "France", "French");
    InternationalDivision international2 = new InternationalDivision("Worldwide Solutions", 67890, "Japan", "Japanese");

    // Create two instances of DomesticDivision
    DomesticDivision domestic1 = new DomesticDivision("Local Operations", 11223, "California");
    DomesticDivision domestic2 = new DomesticDivision("National Services", 44556, "Texas");

    // Display information about each division
    international1.display();
    international2.display();
    domestic1.display();
    domestic2.display();
  }
}
