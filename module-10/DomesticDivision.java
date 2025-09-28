// Subclass for domestic divisions
public class DomesticDivision extends Division {
    private String state;

    // Constructor
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);  // Call superclass constructor
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
        System.out.println();
    }
}
