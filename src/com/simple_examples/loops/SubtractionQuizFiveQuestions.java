package com.simple_examples.loops;

import java.util.Scanner;

public class SubtractionQuizFiveQuestions {
    public static void main(String[] args) {

        final int NUM_OF_QUESTIONS = 5;
        long startTime = System.currentTimeMillis();
        int count = 0, correct = 0;
        while (count < NUM_OF_QUESTIONS) {

            int number1 = (int) (Math.random() * 101);
            int number2 = (int) (Math.random() * 101);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            Scanner input = new Scanner(System.in);
            System.out.print("Compute: " + number1 + " - " + number2 + " = ");

            int answer = input.nextInt();
            if (number1 - number2 == answer)
               ++correct;

            ++count;
        }

        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;


        System.out.println("Here are your results:");
        System.out.println("\tCorrect: " + correct);
        System.out.printf("\tScore: %.2f %%", (correct / (double)NUM_OF_QUESTIONS * 100));
        System.out.printf("\n\tTime Taken: %d seconds", timeTaken/1000);
    }
}
