package ALL_PATTERN_QUESTION;

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temp Converter");
        System.out.println("Enter your temp in F: ");

        Float fah  = input.nextFloat();
        float cell = (fah-32 ) * 5 / 9;
        System.out.println("Your  Temprature is: "+ cell + "C");

    }
}
