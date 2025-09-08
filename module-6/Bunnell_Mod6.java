/**
 * CSD-402: Software Development with Java
 * Module 6 Assignment
 * Test class for Fan
 */
public class Bunnell_Mod6 {
    public static void main(String[] args) {
        // Fan using default constructor
        Fan defaultFan = new Fan();

        // Fan using argument constructor
        Fan customFan = new Fan(Fan.FAST, true, 10, "blue");

        // Display initial states
        System.out.println("Default Fan: " + defaultFan.toString());
        System.out.println("Custom Fan: " + customFan.toString());

        // Demonstrate setters
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setRadius(8);
        defaultFan.setColor("green");

        System.out.println("\nAfter modifications:");
        System.out.println("Default Fan (modified): " + defaultFan.toString());
        System.out.println("Custom Fan: " + customFan.toString());
    }
}
