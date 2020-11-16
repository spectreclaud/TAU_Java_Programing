package chapter4;

/*
*FOR LOOP:
* write a cashier program that will scan a given number of times and tally the cost.
 */

import java.util.Scanner;

public class Cashier {
    public static void main(String args[]){
        //Get numbers of items to scan
        System.out.println("Enter the number of items you would you like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double total = 0;

        //Create loop to iterate through all of the items and accumulate the cost
        for (int i = 0; i < quantity; i++){
            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();
        System.out.println("Your total is $" + total);
    }
}
