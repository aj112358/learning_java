package com.simple_examples;
import java.util.Scanner;

public class ConstructChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount: $");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        // Find number of dollars.
        int dollars = remainingAmount / 100;
        remainingAmount %= 100;

        // Find number of quarters.
        int quarters = remainingAmount / 25;
        remainingAmount %= 25;

         // Find number of dimes.
        int dimes = remainingAmount / 10;
        remainingAmount %= 10;

        // Find number of nickels.
        int nickels = remainingAmount / 5;
        remainingAmount %= 5;

        // Find number of pennies.
        int pennies = remainingAmount;

        // Display results.
        System.out.println("Your amount of $" + amount + " consists of:");
        System.out.println("    " + dollars + " dollars,");
        System.out.println("    " + quarters + " quarters,");
        System.out.println("    " + dimes + " dimes,");
        System.out.println("    " + nickels + " nickels,");
        System.out.println("    " + pennies + " pennies.");


    }
}
