package com.simple_examples;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in degF: ");

        double fahrenheit = input.nextDouble();
        double celsius = (5.0/9) * (fahrenheit - 32);

        System.out.println(fahrenheit + " degF is " + celsius + " degC.");
    }
}
