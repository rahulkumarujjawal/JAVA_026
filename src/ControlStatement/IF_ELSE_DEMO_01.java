package ControlStatement;
import java.util.Scanner;

public class IF_ELSE_DEMO_01 {
    public static void main(String[] args) {
        int rs = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("kya khana hai:-");
        String choose_item = scanner.next();

        if (choose_item.equalsIgnoreCase("Biryani")) {
            System.out.println("thik hai kha lo ");
        } else {
            System.out.println("Bhago pesaa nahi hai ");
        }


    }
}
