package Basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RobustCalculator {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Select: 1:Add, 2:Sub, 3:Mul, 4:Div, 5:Power");
            int choice = scanner.nextInt();

            System.out.print("Enter integer a: ");
            int a = scanner.nextInt();
            System.out.print("Enter integer b: ");
            int b = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Result: " + (a + b));
                case 2 -> System.out.println("Result: " + (a - b));
                case 3 -> System.out.println("Result: " + (a * b));
                case 4 -> {
                    if (b == 0) throw new ArithmeticException("Cannot divide by zero.");
                    System.out.println("Result: " + ((double) a / b));
                }
                case 5 -> System.out.println("Result: " + Math.pow(a, b));
                default -> System.out.println("Invalid operation choice.");
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid input! Please enter numeric values only.");
        } catch (ArithmeticException e) {
            System.err.println("Math error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
