package com.simple_examples.selections;
import java.util.Scanner;

public class DetermineLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year to check: ");

        int year = input.nextInt();
        boolean isLeapYear = (year%4 == 0 && year%100!=0) || (year%400 == 0);

        if (isLeapYear)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
