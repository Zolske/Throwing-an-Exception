package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static double divide(int numerator, int dominator) {
        return numerator / dominator;
    }

    public static void divideUserInputs(){
        int[] numbers;
        while (true) {
            // Try and get numbers array from getUserInput()
            try {
                numbers = getUserInputs();
            } catch (InputMismatchException e) {
                // Keep trying until we have valid input
                System.out.println("Invalid input, please try again.");
                continue;
            }
            // If we have valid numbers and no exception was thrown,
            // we can terminate the loop
            break;
        }

        // Get numerator from numbers[0]
        // Get denominator from numbers[1]
        // Try and get result from divide()
        //     if successful, print result to the console
    }

    private static int[] getUserInputs() throws InputMismatchException {
        var scanner = new Scanner(System.in);
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();
        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();
        return new int[]{divisor, dividend};
    }
}
