package source;
import java.util.Scanner;

public class Main {

    public static int calculatePrimeCalories(int input) {
        int sum = 0;
        for (int i = 2; i < input; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int calculateOddCalories(int input) {
        int sum = 0;
        for (int i = 1; i < input; i += 2) { // Only odd numbers
            sum += i;
        }
        return sum;
    }

    public static int calculateEvenCalories(int input) {
        int sum = 0;
        for (int i = 2; i < input; i += 2) { // Only even numbers
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your workout duration (negative number to exit): ");
            int duration = scanner.nextInt();

            if (duration < 0) {
                System.out.println("Exiting the app. Thank you for using the Fitness App!");
                break;
            }

            int primeCalories = calculatePrimeCalories(duration);
            int oddCalories = calculateOddCalories(duration);
            int evenCalories = calculateEvenCalories(duration);

            System.out.println("Calories burned for prime numbers less than " + duration + ": " + primeCalories);
            System.out.println("Calories burned for odd numbers less than " + duration + ": " + oddCalories);
            System.out.println("Calories burned for even numbers less than " + duration + ": " + evenCalories);
        }

        scanner.close();
    }


}