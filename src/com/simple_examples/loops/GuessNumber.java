package com.simple_examples.loops;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int target = (int)(Math.random() * 1001);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial guess: ");

        int guess = input.nextInt();
        while (guess != target) {

            if (guess > target) {
                System.out.print("Wrong! Guess smaller: ");
            } else {
                System.out.print("Wrong! Guess larger: ");
            }

            guess = input.nextInt();
        }

        System.out.println("Correct! The number was: " + target);

    }
}
