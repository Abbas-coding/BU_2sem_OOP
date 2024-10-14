package com.mycompany.pulley;
import java.util.Scanner;

public class Pulley {
    
    // Method to calculate the RPM of the second pulley
    public static double calculateRPM(double diameter1, double diameter2, double RPM1) {
        return (diameter1 / diameter2) * RPM1;
    }

    // Method to calculate the weight lifted with a multiple pulley system
    public static double calculateWeightLifted(double forceExerted, int numberOfUpRopes) {
        return forceExerted * numberOfUpRopes;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter diameter of pulley 1 (in inches): ");
        double diameter1 = scanner.nextDouble();

        System.out.println("Enter diameter of pulley 2 (in inches): ");
        double diameter2 = scanner.nextDouble();

        System.out.println("Enter RPM of pulley 1: ");
        double RPM1 = scanner.nextDouble();

        // Calculate RPM of pulley 2
        double RPM2 = calculateRPM(diameter1, diameter2, RPM1);
        System.out.println("RPM of pulley 2: " + RPM2);

        // Input for weight lifted calculation
        System.out.println("Enter force exerted (in pounds): ");
        double forceExerted = scanner.nextDouble();

        System.out.println("Enter number of up ropes: ");
        int numberOfUpRopes = scanner.nextInt();

        // Calculate weight lifted
        double weightLifted = calculateWeightLifted(forceExerted, numberOfUpRopes);
        System.out.println("Weight lifted: " + weightLifted + " pounds");

        scanner.close();
    }
}
