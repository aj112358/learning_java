package com.simple_examples.math_and_sting;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String my_str = input.next();
        System.out.println(my_str);
//        System.out.println("Hello world");

        System.out.print("Enter three words separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);

        String rest = input.nextLine();
        System.out.println("rest of line is: " + rest);

        System.out.print("Enter an entire line: ");
        String line = input.nextLine();
        System.out.println("line is: " + line);


    }
}
