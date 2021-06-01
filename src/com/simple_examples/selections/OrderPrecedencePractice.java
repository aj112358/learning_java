package com.simple_examples.selections;

public class OrderPrecedencePractice {
    public static void main(String[] args) {
        boolean x = 3 + 4 * 4 > 5 * (4 + 3) - 1 && (4 - 3 > 5);
        System.out.println("Expression x evaluates to: " + x);
    }
}
