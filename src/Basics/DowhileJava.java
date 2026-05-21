package Basics;

public class DowhileJava {
    static void main(String[] args){
        int Count =1 ;
        int Sum =0;

        do {
            Sum = Sum + Count;
            Count++;
        }
        while(Count <=10);
        System.out.println("Sum =" +Sum);
    }
}
