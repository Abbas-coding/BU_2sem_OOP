package source;

import java.util.Scanner;

public class Main {

    public static int fibonacci(int n) {
        // Base cases
        if (n <= 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its Fibonacci: ");
        int number = scanner.nextInt();

        int result = fibonacci(number);
        System.out.println("Fibonacci of " + number + " is: " + result);

        scanner.close();
    }
}
