package Basics;

import java.util.Scanner;

public class accept_two {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter The First Number");
        int num1 = scanner.nextInt();
        IO.println("Enter the Second Number");
        int num2 = scanner.nextInt();

        if(num1 == num2){
            IO.println("Numbers are Equals");
        }else{
            return;
        }

        scanner.close();
    }
}
