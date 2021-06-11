package com.simple_examples.loops;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter word to test: ");
        String test = input.nextLine();

        int low = 0, high = test.length()-1;
        boolean isPalindrome = true;
        while (low < high) {
            if (test.charAt(low) != test.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        System.out.print(isPalindrome ? "Yes!":"No!");

    }
}
