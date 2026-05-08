package Arrays;
import java.util.Scanner;

import static java.lang.Long.sum;

public class ArraySumAverage {

    public static void main(String[] args) {
        System.out.println("Welcome to Array and some Average value:- ");
    int[] numArray = ArraysUtility.inputArrays();
    long sum = sum(numArray);
    int avg = avg(numArray);

    System.out.println("sum of the numbers is: "+sum);
    System.out.println("Average of the numbers is " +sum);
       }

       private static long sum(int[] numArray) {
        return 0 ;
    }
    private static int avg(int[] numArrays){
        return 0;
    }
}