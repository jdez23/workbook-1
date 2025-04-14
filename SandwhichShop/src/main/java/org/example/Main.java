package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for sandwich size
        System.out.print("Enter sandwich size (1 for half, 2 for whole): ");
        int size = scanner.nextInt();

        double basePrice;

        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid size. Please enter 1 or 2.");
            return;
        }

        // Prompt for age
        System.out.print("What is your age: ");
        int age = scanner.nextInt();

        double discount = 0;

        if (age <= 17) {
            discount = 0.10; // 10% for students
        } else if (age >= 65) {
            discount = 0.20; // 20% for seniors
        }

        // 💸 Apply discount if any
        double finalPrice = basePrice - (basePrice * discount);

        // 🧾 Display the result
        System.out.printf("Your sandwich will cost: $%.2f\n", finalPrice);


    }
}