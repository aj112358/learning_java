package com.simple_examples.selections;
import java.util.Scanner;

public class BreakStatementPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte day = input.nextByte();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 0, 6 -> System.out.println("Weekend");
        }

    }


}
