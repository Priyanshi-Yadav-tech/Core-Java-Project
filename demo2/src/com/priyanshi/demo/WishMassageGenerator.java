package com.priyanshi.demo;

import java.time.LocalTime;

public class WishMassageGenerator {

    public LocalTime ld;

    // Constructor to initialize LocalTime
    public WishMassageGenerator(LocalTime ld) {
        this.ld = ld;
    }

    // Method to generate the wish message
    public String GenerateMassage() {
        int hour = ld.getHour();

        if (hour < 12) {
            return "Good Morning!";
        } else if (hour >= 12 && hour < 16) {
            return "Good Afternoon!";
        } else if (hour >= 16 && hour < 20) {
            return "Good Evening!";
        } else {
            return "Good Night!";
        }
    }

    public static void main(String[] args) {
        // Get the current local time
        LocalTime currentTime = LocalTime.now();

        // Create an instance of WishMassageGenerator
        WishMassageGenerator generator = new WishMassageGenerator(currentTime);

        // Generate and print the wish message
        String message = generator.GenerateMassage();
        System.out.println(message);
    }
}
