package Basics;

import java.util.Scanner;

public class JavaObject {
    public int expo(int x, int n){
        int results = 1;

        for (int i = 1; i <= n; i++) {
            results = results * x;
        }

        return results;
    }

    public static void main(String[] args){
        int base, exp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("This Program Calculates Exponential");
        System.out.println("====================================");

        System.out.println("Enter The Base");
        base = scanner.nextInt();

        System.out.println("Enter The Exponent");
        exp = scanner.nextInt();

        JavaObject object = new JavaObject();
        int res = object.expo(base, exp);

        System.out.printf("The Value of %d to power %d is %d", base, exp, res);

        scanner.close();
    }
}