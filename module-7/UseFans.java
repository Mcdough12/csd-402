import java.util.ArrayList;

public class UseFans {

    // Method to display all fans in a collection (without toString)
    public static void displayFans(ArrayList<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
            System.out.println("----------------------");
        }
    }

    // Method to display a single fan (without toString)
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    // Test code
    public static void main(String[] args) {
        // Create collection of fans
        ArrayList<Fan> fans = new ArrayList<>();

        // Add some fans
        fans.add(new Fan(Fan.SLOW, true, 8, "blue"));
        fans.add(new Fan(Fan.MEDIUM, false, 10, "red"));
        fans.add(new Fan(Fan.FAST, true, 12, "green"));
        fans.add(new Fan()); // default fan

        // Display all fans
        displayFans(fans);
    }
}
