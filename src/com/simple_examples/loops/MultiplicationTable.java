package com.simple_examples.loops;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What size: ");
        final int SIZE = input.nextInt();
        final int WIDTH = SIZE>9 ? 4:2;
        final String fmt = "  %" + WIDTH + "d";

        // Creating title & header row.
        System.out.println("\n" + "Multiplication Table: " + SIZE + "x" + SIZE);
        System.out.print("     ");
        for (int i=1; i<=SIZE; i++) {
            System.out.printf(fmt, i);
        }

        // Creating horizontal division.
        System.out.print("\n-----");
        for (int i=1; i<=SIZE; i++) {
            System.out.print("-".repeat(WIDTH+2));
        }

        for (int row=1; row<=SIZE; row++) {
            System.out.printf("\n%2d  |", row);  // Column for digits.

            for (int col=1; col<=SIZE; col++) {
                System.out.printf(fmt, (row*col));
            }
        }
        System.out.print("\n");
    }
}
