package com.company;

import java.util.Scanner;

public class VendingMachineMain {
    public static void main(String[] args) {
        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");

         Item[][] items = new Item[][] {
             { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
                 { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
             { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
         };

        Machine Mh = new Machine(items);
        Scanner sc = new Scanner(System.in);
        System.out.println(Mh);
        while(true){

            System.out.print("Pick a row: ");
            int row = sc.nextInt();
            System.out.print("Pick a spot in the row: ");
            int spot = sc.nextInt();
            boolean Dp = Mh.dispense(row,spot);
            if (Dp==true){
                System.out.println(Mh);
                System.out.println(("\nEnjoy your drink! Press 1 to purchase another: "));
            }
            else{
                System.out.println(Mh);
                System.out.println("\nSorry, we're out of this item. Press 1 to purchase another: \n");
            }

            int input = sc.nextInt();
            if(input!=1){
                break;
            }


            }



        }
    }
