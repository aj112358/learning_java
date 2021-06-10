package com.simple_examples.loops;
import java.util.Scanner;

public class CumulativeSum {
    public static void main(String[] args) {

        int total = 0;
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        while (num != 0) {
            total += num;
            num = input.nextInt();
        }

        System.out.println("The total sum is: " + total);
    }
}
