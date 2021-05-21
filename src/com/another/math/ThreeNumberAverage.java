package com.another.math;
import java.util.Scanner;

public class ThreeNumberAverage {
    public static void main(String[] args) {

        Scanner input_obj = new Scanner(System.in);
        System.out.print("Enter three numbers: ");

        double num1 = input_obj.nextDouble();
        double num2 = input_obj.nextDouble();
        double num3 = input_obj.nextDouble();

        double average = (num1 + num2 + num3) / 3;
        System.out.println("Their average is: " + average);
    }
}
