/*
*  Question: Write a Jave Program That accept the 10 numbers into
* an array and output them in reverse order
*
* */

package Basics;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[10];

        System.out.println("Enter 10 Numbers");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Number " +(i+1)+": ");
            marks[i] = scanner.nextInt();
        }

        System.out.println("Numbers in reverse order:");

        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.print(marks[i] + " ");
        }

        scanner.close();
    }
}