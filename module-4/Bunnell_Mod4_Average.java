/**
 * Bunnell_Mod4_Average.java
 * Author: Reed Bunnell
 * Course: CSD-402 - Programming with Java
 * Module: 4
 * Date: August 31, 2025
 *
 * Description:
 * This program demonstrates method overloading by providing four 
 * average() methods that calculate the average of arrays of 
 * short, int, long, and double. Each method is tested in the main 
 * program with arrays of different sizes. The results are displayed 
 * in an easy-to-read format.
 */

public class Bunnell_Mod4_Average {

    // Method to calculate average of short array
    public static short average(short[] array) {
        int sum = 0; // promote to int to avoid overflow
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate average of int array
    public static int average(int[] array) {
        long sum = 0; // promote to long for safety
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    // Method to calculate average of long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate average of double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Helper method to display arrays
    public static <T> void displayArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Overloaded display for primitive arrays
    public static void displayArray(short[] array) {
        for (short item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void displayArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void displayArray(long[] array) {
        for (long item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void displayArray(double[] array) {
        for (double item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Main method to test overloaded averages
    public static void main(String[] args) {
        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 10, 15, 20};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        System.out.println("Short Array Elements:");
        displayArray(shortArray);
        System.out.println("Average (short): " + average(shortArray));
        System.out.println("----------------------------------");

        System.out.println("Int Array Elements:");
        displayArray(intArray);
        System.out.println("Average (int): " + average(intArray));
        System.out.println("----------------------------------");

        System.out.println("Long Array Elements:");
        displayArray(longArray);
        System.out.println("Average (long): " + average(longArray));
        System.out.println("----------------------------------");

        System.out.println("Double Array Elements:");
        displayArray(doubleArray);
        System.out.println("Average (double): " + average(doubleArray));
        System.out.println("----------------------------------");
    }
}
