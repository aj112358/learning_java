package com.simple_examples.selections;

public class FloatingPointErrors {
    public static void main(String[] args) {

        final double EPSILON = 10e-14;

        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;

        System.out.println("x = 0.5 is " + (x == 0.5));

        if (Math.abs(x - 0.5) < EPSILON) {
            System.out.println("x = " + x + " is approximately 0.5.");
        }

    }
}
