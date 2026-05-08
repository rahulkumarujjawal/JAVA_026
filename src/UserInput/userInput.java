package UserInput;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int numbers = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter the name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter the address: ");
        String address = scanner.nextLine();

        System.out.println("Enter your salary:");
        float salary = scanner.nextFloat();



        System.out.println("Enter the number: " +numbers);
        System.out.println("Enter the name: "+name);
        System.out.println("Enter the age:" +age);
        System.out.println("Enter the address: "+address);
        System.out.println("Enter the salary:"+salary);




    }
}
