package Basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        int num1, num2;
        char opera;

        System.out.println("Enter The First number:");
        num1 = scanner.nextInt();

        System.out.println("Enter The Second Number:");
        num2 = scanner.nextInt();

        System.out.println("Enter an operator (+, -, *, /):");
        opera = scanner.next().charAt(0);

        boolean validOperation = true;

        switch (opera) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Invalid: Cannot divide by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operator entered!");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}