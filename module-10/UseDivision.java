// Application to test the classes
public class UseDivision {
    public static void main(String[] args) {
        // Create two InternationalDivision objects
        InternationalDivision intlDiv1 = new InternationalDivision("Europe Sales", 101, "Germany", "German");
        InternationalDivision intlDiv2 = new InternationalDivision("Asia Tech", 102, "Japan", "Japanese");

        // Create two DomesticDivision objects
        DomesticDivision domDiv1 = new DomesticDivision("East Coast Marketing", 201, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast Support", 202, "California");

        // Display each division's details
        intlDiv1.display();
        intlDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
