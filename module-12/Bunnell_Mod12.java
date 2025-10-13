/**
 * ------------------------------------------------------------
 * File Name: Bunnell_Mod12.java
 * Author: Reed Bunnell
 * Course: CSD-402 – Java Programming
 * Module: 12
 * Date: October 12, 2025
 * Description:
 *   This program demonstrates method overloading in Java.
 *   It contains four versions of the yearlyService() method,
 *   each calculating the cost of an annual auto service visit
 *   with varying parameters such as oil change, tire rotation,
 *   and coupon discounts.
 * ------------------------------------------------------------
 */

public class Bunnell_Mod12 {

    // Base cost for a standard service
    public static double yearlyService() {
        double standardCharge = 79.99;
        return standardCharge;
    }

    // Adds oil change fee
    public static double yearlyService(double oilChangeFee) {
        double standardCharge = 79.99;
        return standardCharge + oilChangeFee;
    }

    // Adds oil change and tire rotation
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        double standardCharge = 79.99;
        return standardCharge + oilChangeFee + tireRotationFee;
    }

    // Adds oil change, tire rotation, and applies coupon discount
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponDiscount) {
        double standardCharge = 79.99;
        return (standardCharge + oilChangeFee + tireRotationFee) - couponDiscount;
    }

    public static void main(String[] args) {
        // Test each method twice
        System.out.println("===== Auto Service Cost Calculator =====\n");

        // No parameters
        System.out.printf("Standard Service: $%.2f%n", yearlyService());
        System.out.printf("Standard Service (second test): $%.2f%n%n", yearlyService());

        // One parameter (oil change)
        System.out.printf("Service + Oil Change: $%.2f%n", yearlyService(39.99));
        System.out.printf("Service + Oil Change (second test): $%.2f%n%n", yearlyService(42.50));

        // Two parameters (oil + tire rotation)
        System.out.printf("Service + Oil + Tire Rotation: $%.2f%n", yearlyService(39.99, 25.00));
        System.out.printf("Service + Oil + Tire Rotation (second test): $%.2f%n%n", yearlyService(35.50, 30.00));

        // Three parameters (oil + tire rotation + coupon)
        System.out.printf("Full Service with Coupon: $%.2f%n", yearlyService(39.99, 25.00, 15.00));
        System.out.printf("Full Service with Coupon (second test): $%.2f%n", yearlyService(42.50, 30.00, 10.00));

        System.out.println("\n========================================");
    }
}
