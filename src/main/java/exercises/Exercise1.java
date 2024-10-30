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
            // TODO: validate numbers is length two

            // Get numerator from numbers[0]
            // Get denominator from numbers[1]
            // Get result from divide()
            // TODO: catch arithmetic exceptions ?
            double result;
            try {
                result = divide(numbers[0], numbers[1]);
            } catch (ArithmeticException e) {
                // if 0 dividend than keep looping
                System.out.println("Can not divide by 0, please try again");
                continue;
            }

            //     if successful, print result to the console
            System.out.println(result);

            // If we have valid numbers and no exception was thrown,
            // we can terminate the loop
            break;
        }
    }

    private static int[] getUserInputs() throws InputMismatchException {
        int[] result = new int[2];
        try (var scanner = new Scanner(System.in)) {
            System.out.print("Enter divisor: ");
            result[0] = scanner.nextInt();
            System.out.print("Enter dividend: ");
            result[1] = scanner.nextInt();
        }
        return result;
    }
}
