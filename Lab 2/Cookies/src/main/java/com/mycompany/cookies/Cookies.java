package com.mycompany.cookies;
import java.util.Scanner;
import java.math.*;
public class Cookies {
    static final int cookieNo = 12;
    static final int boxNo = 24;
    static final double boxPrice = 1.14;
    static final double leftoverBoxPrice = 0.57;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cookiesProduced;

        while (true) {
            System.out.print("Enter the number of cookies produced (or -1 to exit): ");
            cookiesProduced = scanner.nextInt();

            if (cookiesProduced == -1) {
                break;
            }

            // Calculate number of boxes and cartons
            int totalBoxes = cookiesProduced / cookieNo;
            int leftoverCookies = cookiesProduced % cookieNo;

            int totalCartons = totalBoxes / boxNo;
            int leftoverBoxes = totalBoxes % boxNo;

            // Calculate total money made
            double totalMoney = (totalBoxes * boxPrice) + (leftoverBoxes * leftoverBoxPrice);

            // Output the results
            System.out.println("Total boxes: " + totalBoxes);
            System.out.println("Total cartons: " + totalCartons);
            System.out.println("Leftover boxes: " + leftoverBoxes);
            System.out.println("Remaining cookies (given away): " + leftoverCookies);
            System.out.printf("Total money made: $%.2f%n", totalMoney);
            System.out.println(); 
        }

        scanner.close();
        System.out.println("Program exited.");
        
    }
}
