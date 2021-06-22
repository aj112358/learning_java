package com.simple_examples.methods;

public class FindMax {

    /** Main method. */
    public static void main(String[] args) {
        int i=5, j=8;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is: " + k);
    }

    /** Returns the maximum of two integers. */
    private static int max(int num1, int num2) {
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }


}
