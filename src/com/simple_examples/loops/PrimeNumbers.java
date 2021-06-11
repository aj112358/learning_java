package com.simple_examples.loops;

public class PrimeNumbers {
    public static void main(String[] args) {

        final int NUM_OF_PRIMES = 57;
        final int NUM_PER_LINE = 10;

        int count = 0;
        boolean isPrime = true;
        int test = 2;

        while (count < NUM_OF_PRIMES) {

            for (int i=2; i<=Math.floor(Math.sqrt(test)); i++) {
                if (test % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (count % NUM_PER_LINE == 0)
                    System.out.print("\n");
                System.out.printf("%4d", test);
                count++;
            }
            isPrime = true;
            test++;

        }
    }
}
