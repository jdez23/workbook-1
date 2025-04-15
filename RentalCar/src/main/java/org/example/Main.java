package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rentalPrice = 29.99;
        double surcharge = 0.30;

        System.out.print("When would you like to pick it up? (Sunday-Saturday): ");
        String pickupDate = scanner.nextLine();

        System.out.print("How many days will you need the rental? ");
        int rentalDays = scanner.nextInt();
        scanner.nextLine(); // Clear newline
        rentalPrice *= rentalDays;

        System.out.print("Would you like the electronic toll tag for an additional $3.95/day? (yes/no): ");
        String electronicTag = scanner.nextLine();
        if (electronicTag.equalsIgnoreCase("yes")) {
            rentalPrice += 3.95 * rentalDays;
        }

        System.out.print("Would you like GPS for an additional $2.95/day? (yes/no): ");
        String gps = scanner.nextLine();
        if (gps.equalsIgnoreCase("yes")) {
            rentalPrice += 2.95 * rentalDays;
        }

        System.out.print("Would you like roadside assistance for an additional $3.95/day? (yes/no): ");
        String roadside = scanner.nextLine();
        if (roadside.equalsIgnoreCase("yes")) {
            rentalPrice += 3.95 * rentalDays;
        }

        System.out.print("What is your age? ");
        int age = scanner.nextInt();

        if (age < 25) {
            rentalPrice += rentalPrice * surcharge; // add 30% surcharge
        }

        System.out.printf("Your total will be: $%.2f\n", rentalPrice);
    }
}
