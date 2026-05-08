package ControlStatement;

import java.util.Scanner;

public class IF_ELSE_DEMO_02 {
    public static void main(String[] args) {
        int rs = 100;
        Scanner scanner = new Scanner(System.in);


        int  bank_balance  = 100;
        if (bank_balance>=500) {
            System.out.println("Bahut pesa hai.... ");

            System.out.println("kya khana hai ? \n" +
                    "01. 250 wali Biryani \n"  +
                    "02.  250 wali cold_coffe \n" +
                    "03. 100 wali ice_cream");

            int  choose_item = scanner.nextInt();
//            if condition har time check karta hai
            if(choose_item ==1){
                System.out.println(" chalo phir Biryani khate hai..." );
            }
             else if(choose_item==2){
                System.out.println("Chlo Phir Cold_coffe pite hai...");

            } else if (choose_item==3) {
                System.out.println("chlo phir ice_cream khate hai ");

            } else {
                 System.out.println("chutiya ho  kya...");
            }

        } else {
            System.out.println("Bhago pesaa nahi hai ");
            if(bank_balance >10){

                System.out.println("kya khana hai ?\n" +
                        "01. 5 wali laze... \n"  +
                        "02. 7 wali ice_cream.. \n" +
                        "03. 8 wali Ginger_Tea...");
                int  bank = scanner.nextInt();
                if(bank ==1){
                    System.out.println("let's go Toffe");
                }
                if(bank==2){
                    System.out.println("lets go for walk");
                }
                if(bank==3){
                    System.out.println("kurkure");

                }
                else {
                    System.out.println(" invalid Input");
                }


            }
        }
    }
}
