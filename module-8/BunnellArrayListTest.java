import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BunnellArrayListTest {

    /**
     * Returns the largest Integer in the given list.
     * If the list is null or empty, returns 0.
     * Required signature (raw ArrayList per assignment): public static Integer max(ArrayList list)
     */
    @SuppressWarnings("unchecked")
    public static Integer max(ArrayList list) {
        if (list == null || list.isEmpty()) return 0;

        Integer currentMax = null;
        for (Object obj : list) {
            if (!(obj instanceof Integer)) continue; // ignore any non-integers just in case
            Integer val = (Integer) obj;
            if (currentMax == null || val > currentMax) {
                currentMax = val;
            }
        }
        return (currentMax != null) ? currentMax : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to finish; 0 will also be stored):");
        while (true) {
            System.out.print("> ");
            try {
                int n = sc.nextInt();
                numbers.add(n);          // store the value (including the final 0)
                if (n == 0) break;       // stop when 0 is entered
            } catch (InputMismatchException ex) {
                sc.next(); // consume invalid token
                System.out.println("Please enter a whole number (integer).");
            }
        }
        sc.close();

        // Send ArrayList to the method and display the largest value
        Integer largest = max(numbers);
        System.out.println("\nValues entered: " + numbers);
        System.out.println("Largest value: " + largest);

        // --- Additional tests (as requested) ---
        ArrayList<Integer> testEmpty = new ArrayList<>();
        System.out.println("\n[TEST] Empty list -> expected 0, got: " + max(testEmpty));

        ArrayList<Integer> testMixed = new ArrayList<>();
        testMixed.add(-5); testMixed.add(12); testMixed.add(7); testMixed.add(0);
        System.out.println("[TEST] Mixed list " + testMixed + " -> max: " + max(testMixed));
    }
}
