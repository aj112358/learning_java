package com.simple_examples.loops;
import java.util.Scanner;

public class CumulativeSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0, num;
        do {
            System.out.print("Enter a digit (0 to quit): ");
            num = input.nextInt();
            total += num;
        } while (num != 0);

        System.out.println("The total sum is: " + total);
    }
}
