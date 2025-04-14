package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for sandwich size
        System.out.print("Enter sandwich size (1 for Regular, 2 for Large): ");
        int size = scanner.nextInt();
        scanner.nextLine();

        double basePrice;

        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Please enter 1 or 2.");
            return;
        }

        // Ask if they want the sandwich loaded
        System.out.print("Would you like your sandwich loaded? Enter true or false: ");
        boolean isLoaded = scanner.nextBoolean();

        if (isLoaded && size == 1) {
            basePrice += 1.00;
        } else if (isLoaded && size == 2) {
            basePrice += 1.75;
        }

        // Prompt for age
        System.out.print("What is your age: ");
        int age = scanner.nextInt();

        double discount = 0;

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        // Apply discount
        double finalPrice = basePrice - (basePrice * discount);

        // Display the result
        System.out.printf("Your sandwich will cost: $%.2f\n", finalPrice);

    }
}