package com.simple_examples;

public class ShowCurrentTime {
    public static void main(String[] args) {

        long totalMillis = System.currentTimeMillis();

        long totalSeconds = totalMillis / 1000;
        long seconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long hours = totalHours % 24;

        // Display current time.
        System.out.println("The current time is: " + hours + ":" + minutes + ":" + seconds + " GMT");
    }
}
