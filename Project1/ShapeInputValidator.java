
/*
 * file name: ShapeInputValidator.java
 * author: Alex Reveles
 * date: 10/31/2023
 * purpose: Error checking values entered
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeInputValidator {
    private static Scanner scanner = new Scanner(System.in);

    public static double getPositiveInput(String prompt) {
        double value;
        while (true) {
            try {
                System.out.print(prompt);
                value = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                if (value > 0) {
                    break;
                } else {
                    System.out.println("Value must be a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }
        return value;
    }
}
