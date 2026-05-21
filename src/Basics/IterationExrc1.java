package Basics;

import java.util.Scanner;

public class IterationExrc1 {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float sum=0,marks =0;
        double avg;

        for (int i = 1; i <=3; i++) {
            System.out.println("Enter Score For Course "+i+";");
            System.out.println("==============================");


            for (int j = 1; j <=5; j++) {
                System.out.println("Enter Score For Course "+i+";");
                marks = scanner.nextFloat();
                sum = sum + marks;
            }
        }

        avg = sum /5;

        System.out.println("Total Marks =" +sum);
        System.out.printf("Average = %.2f",avg);

        scanner.close();

    }
}
