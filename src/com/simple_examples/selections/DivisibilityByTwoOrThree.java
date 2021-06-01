package com.simple_examples.selections;
import java.util.Scanner;

public class DivisibilityByTwoOrThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num%2 == 0 && num%3 == 0) {
            System.out.println(num + " is divisible by both 2 and 3.");
        }

        if (num%2 == 0 || num%3 == 0) {
            System.out.println(num + " is divisible by one or both of 2 or 3.");
        }

        if (num%2 == 0 ^ num%3 == 0) {
            System.out.println(num + " is divisible by exactly one of 2 or 3.");
        }

        if (num%2 != 0 && num%3 != 0) {
            System.out.println(num + " is not divisible by either 2 nor 3.");
        }
    }
}
