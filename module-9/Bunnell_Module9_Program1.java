import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bunnell_Module9_Program1 {

    // Required: use a method that receives an ArrayList and returns the largest value if needed;
    // For this assignment, we're demonstrating the ArrayList and try/catch with user selection.

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>(
            Arrays.asList("Alpha","Bravo","Charlie","Delta","Echo","Foxtrot","Golf","Hotel","India","Juliet")
        );

        // Print collection using a for-each loop
        System.out.println("List contents (index: value):");
        int i = 0;
        for (String s : items) {
            System.out.println((i++) + ": " + s);
        }

        // Ask which element to show again
        System.out.println();
        System.out.print("Enter the index (0-" + (items.size()-1) + ") to view again: ");

        Scanner sc = new Scanner(System.in);
        String raw = sc.nextLine();                   // user provides a String
        sc.close();

        try {
            // Autoboxing/Unboxing demonstration:
            // String -> Integer (autobox) -> int (auto-unbox)
            Integer boxedIndex = Integer.valueOf(raw.trim()); // boxed
            int index = boxedIndex;                           // auto-unbox to primitive int

            // Try to print the requested element
            String value = items.get(index);
            System.out.println("Element at index " + index + ": " + value);
        } catch (NumberFormatException nfe) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Exception thrown: Out of Bounds");
        }
    }
}
