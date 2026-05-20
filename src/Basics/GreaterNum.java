package Basics;

import java.util.Scanner;

public class GreaterNum {
static void main(String[] args){
    Scanner in = new Scanner(System.in);

    IO.println("Enter The First Number");
    int A = in.nextInt();

    IO.println("Enter The Second Number");
    int B = in.nextInt();

    if(A>B){
        System.out.printf("%d is the largest",A);
    }else{
        System.out.printf("%d is the Largest",B);
    }
    }
}
