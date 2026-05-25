package Basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExcHandl1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a positive integer n: ");
            int n = scanner.nextInt();

            if (n < 0) throw new IllegalArgumentException("n must be non-negative.");

            int sum = 0;
            for (int i = 1; i <= n; i++) sum += i;
            System.out.println("The sum of 1 to " + n + " is: " + sum);

        } catch (InputMismatchException e) {
            System.err.println("Error: Please enter a valid integer.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
