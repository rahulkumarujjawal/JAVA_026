package ControlStatement;

import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        greet();
        System.out.println("Welcome to  the Calcualtor\n");

        System.out.println("Enter the Number:-");
        int First = input.nextInt();

        System.out.println("Enter the Second The Number");
        int Second = input.nextInt();

        int sum  = First +Second;
        System.out.println("sum of  the number  is:" + sum );
    }

    public  static  int readNumber(){
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to  the Calcualtor\n");
        int first = input.nextInt();
        return first;
    }

    public static  void  greet(){
        System.out.println("Welcome_to_the_calculator ");

    }

}