package com.simple_examples.math_and_sting;
import java.util.Scanner;

public class ComputeTriangleAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user to input vertex coordinates.
        System.out.print("Enter vertex coordinates: ");
        double xa = input.nextDouble();
        double ya = input.nextDouble();
        double xb = input.nextDouble();
        double yb = input.nextDouble();
        double xc = input.nextDouble();
        double yc = input.nextDouble();

        // Compute triangle side lengths.
        double a = Math.sqrt(Math.pow(xb-xc, 2) + Math.pow(yb-yc, 2));
        double b = Math.sqrt(Math.pow(xa-xc, 2) + Math.pow(ya-yc, 2));
        double c = Math.sqrt(Math.pow(xb-xa, 2) + Math.pow(yb-ya, 2));

        // Compute interior angles.
        double angleA = Math.toDegrees(Math.acos((a*a - b*b - c*c) / (-2*b*c)));
        double angleB = Math.toDegrees(Math.acos((b*b - a*a - c*c) / (-2*a*c)));
        double angleC = Math.toDegrees(Math.acos((c*c - a*a - b*b) / (-2*b*a)));

        // Print results.
        System.out.println("The interior angles are:");
        System.out.println("    Angle A = " + Math.round(angleA * 100) / 100.0);
        System.out.println("    Angle B = " + Math.round(angleB * 100) / 100.0);
        System.out.println("    Angle C = " + Math.round(angleC * 100) / 100.0);
    }
}
