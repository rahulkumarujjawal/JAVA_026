package Arrays;

import java.security.PublicKey;
import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100,110,120,130,140,150};
        System.out.println("welcoome to the serching the Number:-\n ");
        System.out.println("Enter the number you want:-");

        int num = input.nextInt();
        boolean isFound = isFound(arr,num);
        if(isFound){
            System.out.println("your number is found the Array");
        }
        else {
            System.out.println("Your number is Not found the Array");
        }

    }
    public static  boolean isFound(int[]arr,int num){
        int index = 0;
        while (index <arr.length){
            if (arr[index] == num){
                return  true;
            }
             index ++;
        }
        return  false;
    }
}
