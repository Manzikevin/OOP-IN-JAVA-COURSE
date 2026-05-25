package Basics;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {

                System.out.print(i + " X " + j + " = " + (i * j) + "\t");
            }

            System.out.println();
        }
    }
}