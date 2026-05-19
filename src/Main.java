import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        double width,length,area;

        System.out.println("Enter Length");
        length = scanner.nextDouble();

        System.out.println("Enter Width");
        width = scanner.nextDouble();

        area = length * width;

        System.out.println("The Area of Rectangle =" +area);

        scanner.close();
    }
}