package com.simple_examples.loops;
import java.util.Scanner;

public class AdditionQuizRevised {
    public static void main(String[] args) {

        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.print("Compute: " + num1 + " + " + num2 + " = ");
        int answer  = input.nextInt();

        while (num1 + num2 != answer) {
            System.out.print("Try again: ");
            answer  = input.nextInt();
        }

        System.out.println("Correct!!!");

    }
}
