// Subclass for international divisions
public class InternationalDivision extends Division {
    private String country;
    private String language;

    // Constructor
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);  // Call superclass constructor
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
