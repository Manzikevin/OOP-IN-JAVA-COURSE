package Basics;

import java.util.Scanner;

public class SimpleCalc {
    static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            IO.println("Enter The Temperature");
            float temp = scanner.nextFloat();

            if (temp <0){
                IO.println("It's Cold");
            }
            else if (temp >=0 && temp <= 10) {
                IO.println("Very Cold Weather");
            }
            else if (temp >=11 && temp <= 20) {
                IO.println("Cold Weather");
            }
            else if (temp >=21 && temp <= 30) {
                IO.println("Normal Temp");
            }else if (temp >=31 && temp <= 40) {
                IO.println("Its Hot");
            }
            else {
                IO.println("It's Very Hot");
            }

            scanner.close();
    }
}
