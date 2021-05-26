package com.simple_examples;
import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: $");
        double purchaseAmount = input.nextDouble();

        System.out.print("Enter tax rate (%): ");
        double taxRate = input.nextDouble();

        double salesTax = purchaseAmount * taxRate / 100;

        System.out.println("The sales tax will be: $" + (int)(salesTax * 100) / 100.0);
    }
}
