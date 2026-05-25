package Basics;

import java.util.Scanner;

public class LargestNumber {
    public int Largest(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        return max;
//        return  Math.max(num1,Math.max(num2,num3));
    }

    public static void main(String[] args){
        int a,b,c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The First Number");
        a= scanner.nextInt();

        System.out.println("Enter The Second Number");
        b= scanner.nextInt();

        System.out.println("Enter The Third Number");
        c= scanner.nextInt();

        LargestNumber largercalc = new LargestNumber();

        int resl = largercalc.Largest(a,b,c);

        System.out.printf("The Largest number is %d",resl);

        scanner.close();
    }
}
