package Basics;

public class WhileJava {
    static void main(String[] args){
        int Count =1 ;
        int Sum =0;

        while(Count <=10){
            Sum = Sum + Count;
            Count++;
        }
         System.out.println("Sum =" +Sum);
    }
}
