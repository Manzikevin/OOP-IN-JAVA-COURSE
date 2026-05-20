package Basics;


import java.util.Scanner;

public class Circle {
     static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.142;

        IO.println("Enter The Radius");
        double radius = scanner.nextDouble();

        IO.println("Area ="+PI * radius * radius+ ",Perimeter= "+ 2 * PI * radius);
        scanner.close();

    }
}
