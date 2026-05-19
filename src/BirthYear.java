import java.util.Scanner;

public class BirthYear {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int age,CurrYear,YearOfBirth;

        IO.println("Enter Your Age");
        age = scanner.nextInt();

        IO.println("Enter The Current Year");
        CurrYear = scanner.nextInt();

        YearOfBirth = CurrYear - age;

        IO.println("You were Probably Born In: "+YearOfBirth);

        scanner.close();
    }
}
