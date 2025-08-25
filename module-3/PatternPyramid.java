/**
 * File: PatternPyramid.java
 * Author: Reed Bunnell
 * Course: CSD-402 – Java Programming
 * Module: 3
 * Date: [Insert Today’s Date]
 *
 * Description:
 * This program prints a pyramid of numbers using nested for loops,
 * doubling values outward from the center, then mirroring them back down.
 * Each row ends with the '@' symbol as required by the assignment.
 */

public class PatternPyramid {

    public static void main(String[] args) {
        int rows = 7;  // number of rows in the pattern

        for (int i = 0; i < rows; i++) {

            // Print leading spaces to align the pyramid
            for (int s = rows - i; s > 1; s--) {
                System.out.print("   "); // 3 spaces for consistent spacing
            }

            // Print ascending numbers (powers of 2)
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2;
            }

            // Print descending numbers (mirror back down)
            num /= 2;
            for (int j = i - 1; j >= 0; j--) {
                num /= 2;
                System.out.print(num + " ");
            }

            // End each row with '@'
            System.out.println("   @");
        }
    }
}
