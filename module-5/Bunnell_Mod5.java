/**
 * CSD-402: Software Development with Java
 * Module 5 Assignment
 * Author: Reed Bunnell
 * Date: 09/07/2025
 *
 * This program provides overloaded methods to locate the
 * largest and smallest elements in both int[][] and double[][] arrays.
 * Each method returns a one-dimensional int array containing
 * two values: {rowIndex, colIndex}.
 */

public class Bunnell_Mod5 {

    // -------- Locate Largest (double) --------
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // -------- Locate Largest (int) --------
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // -------- Locate Smallest (double) --------
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // -------- Locate Smallest (int) --------
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // -------- Main Method for Testing --------
    public static void main(String[] args) {
        int[][] intArray = {
            {3, 5, 7},
            {2, 8, 1},
            {9, 4, 6}
        };

        double[][] doubleArray = {
            {1.1, 3.5, 2.8},
            {9.9, 0.5, 4.4},
            {7.3, 6.6, 8.8}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest int at: [" + largestInt[0] + "][" + largestInt[1] + "]");
        System.out.println("Smallest int at: [" + smallestInt[0] + "][" + smallestInt[1] + "]");

        System.out.println("Largest double at: [" + largestDouble[0] + "][" + largestDouble[1] + "]");
        System.out.println("Smallest double at: [" + smallestDouble[0] + "][" + smallestDouble[1] + "]");
    }
}
