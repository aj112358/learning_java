package com.simple_examples;
import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get annual interest rate (percentage).
        System.out.print("Enter annual interest rate (%): ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        // Get amortization period.
        System.out.print("Enter number of years (as an integer): ");
        byte numberOfYears = input.nextByte();

        // Get principle loan amount.
        System.out.print("Enter principle loan amount: $");
        double loanAmount = input.nextDouble();

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - 1/Math.pow(1 + monthlyInterestRate, numberOfYears*12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment is: $" + (int)(monthlyPayment * 100 + 0.5) / 100.0);
        System.out.println("The total payment is: $" + (int)(totalPayment * 100 + 0.5) / 100.0);
    }
}
