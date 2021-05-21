package com.another.math;
import java.util.Scanner;

public class ComputeCircleArea {
    public static void main(String[] args) {

        Scanner input_obj = new Scanner(System.in);

        // Prompting user to input a radius value.
        System.out.print("Enter a value for the radius: ");
        double radius = input_obj.nextDouble();
        double area = 3.14159 * radius * radius;

        System.out.println("The area for a circle of radius " + radius + " is: " + area);
    }
}
