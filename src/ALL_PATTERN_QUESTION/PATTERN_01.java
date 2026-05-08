package ALL_PATTERN_QUESTION;

import java.util.Scanner;

public class PATTERN_01 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("welcome to swapping number \n");

        System.out.print("Enter the  First Number A :- ");
        int a = inputScanner.nextInt();

        System.out.println("Enter the Second the number B:- ");
        int b = inputScanner.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Swaping Done :- ");
        System.out.println("Value of a is " +a);
        System.out.println("Value of b is " +b );



    }

    public static class License_portal {
        public static void main(String[] args) {
            Scanner input =  new Scanner(System.in);
            System.out.println("WelCome to thr driving License portal ");
            System.out.println("Please enter your age: ");

            int age = input.nextInt();
            if(age>=18){
                System.out.println("you are eligable  to dive  ");
            }else{
                System.out.println("YOU  are not eligale");
            }

        }
    }
}
