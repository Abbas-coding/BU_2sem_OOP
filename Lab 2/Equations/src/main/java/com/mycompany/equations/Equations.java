package com.mycompany.equations;
import java.util.Scanner;
public class Equations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter X:");
        int x = s.nextInt();
        System.out.println("Enter Y:");
        int y = s.nextInt();
        System.out.println("Enter Z:");
        int z = s.nextInt();
        
        double res1 = (2 * x * x) + (y * y);
        double res2 = 3 * x + y - 3 * z * z;
        double res3 = 2 * x - 2 * y + 5 * z * z;
        
        System.out.println("2x2 +y2: " + res1);
        System.out.println("3x + y -3z2: " + res2);
        System.out.println("2x -2y + 5z2: " + res3);
    }
}
