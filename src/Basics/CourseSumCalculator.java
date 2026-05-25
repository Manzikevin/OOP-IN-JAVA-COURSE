package Basics;

import java.util.Scanner;

public class CourseSumCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double[] marks = new double[5];
        double sum = 0;

        System.out.println("Enter Marks for 5 Scores");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Course " +(i+1)+": ");
            marks[i] = scanner.nextDouble();

            sum +=marks[i];
        }

        System.out.printf("Sum = %f \n",sum);

         double average = sum/ marks.length;

        System.out.printf("Average = %f",average);

        scanner.close();
    }


}
