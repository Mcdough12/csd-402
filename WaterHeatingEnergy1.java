package com.mycompany.waterheatingenergy;

import java.util.Locale;
import java.util.Scanner;

/**
 * Calculates the energy (in Joules) to heat water:
 *   Q = waterMass * (finalTemp - initialTemp) * 4184
 */
public class WaterHeatingEnergy1 {
    public static void main(String[] args) {
        Double waterMass, initialTemperature, finalTemperature;

        try {
            if (args != null && args.length >= 3) {
                // Non-interactive: mvn exec:java -Dexec.args="2 25 100"
                waterMass = Double.parseDouble(args[0]);
                initialTemperature = Double.parseDouble(args[1]);
                finalTemperature = Double.parseDouble(args[2]);
            } else {
                // Interactive (works in NetBeans Output window)
                Scanner input = new Scanner(System.in).useLocale(Locale.US);
                try {
                    System.out.print("Enter the amount of water in kilograms: ");
                    waterMass = input.nextDouble();

                    System.out.print("Enter the initial temperature in Celsius: ");
                    initialTemperature = input.nextDouble();

                    System.out.print("Enter the final temperature in Celsius: ");
                    finalTemperature = input.nextDouble();
                } finally {
                    input.close();
                }
            }

            double energy = waterMass * (finalTemperature - initialTemperature) * 4184.0;
            System.out.printf(Locale.US,
                "The energy needed to heat the water is %.3f Joules.%n", energy);

        } catch (Exception e) {
            System.err.println("Error: please enter numeric values (use a dot for decimals, e.g., 2.5).");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
2