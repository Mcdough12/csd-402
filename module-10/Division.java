// Abstract superclass
public abstract class Division {
    private String divisionName;
    private int accountNumber;

    // Constructor
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Getters (optional, if you want to use them in subclasses)
    public String getDivisionName() {
        return divisionName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}
