package Arrays;

import java.util.Scanner;

public class ArraysUtility {
    public static int[] inputArrays() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Element:-");

        int size = input.nextInt();
        int[] num = new int[size];

        int i = 0;
        while (i < size) {
            System.out.println("Enter the Element no: " + (i + 1) + " : ");
            i++;
        }
        return num;
     }
}