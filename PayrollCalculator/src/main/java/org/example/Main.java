package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = getEmployeeName(scanner);
        float hoursWorked = getHoursWorked(scanner);
        float payRate = getPayRate(scanner);

        float grossPay = calculateGrossPay(hoursWorked, payRate);
        double overtimePay = calculateOvertimePay(hoursWorked, payRate);
        double totalPay = grossPay + overtimePay;

        displayPayInfo(name, grossPay, overtimePay, totalPay);
    }

    // Get employee name
    public static String getEmployeeName(Scanner scanner) {
        System.out.print("Hello, what's your name? ");
        return scanner.nextLine();
    }

    // Get hours worked
    public static float getHoursWorked(Scanner scanner) {
        System.out.print("How many hours have you worked? ");
        return scanner.nextFloat();
    }

    // Get pay rate
    public static float getPayRate(Scanner scanner) {
        System.out.print("What is your payrate? ");
        return scanner.nextFloat();
    }

    // Calculate gross pay (before overtime)
    public static float calculateGrossPay(float hours, float rate) {
        return rate * hours;
    }

    // Calculate overtime pay
    public static double calculateOvertimePay(float hours, float rate) {
        if (hours > 40) {
            float overtimeHours = hours - 40;
            return overtimeHours * (rate * 1.5);
        }
        return 0;
    }

    // Display pay information
    public static void displayPayInfo(String name, float grossPay, double overtimePay, double totalPay) {
        System.out.println("\n----------------------");
        System.out.println("Name: " + name);
        System.out.print("Gross Pay: ");
        System.out.printf("%.2f\n", grossPay);

        if (overtimePay > 0) {
            System.out.println("Congratulations! You earned overtime pay.");
            System.out.print("Overtime Pay: ");
            System.out.printf("%.2f\n", overtimePay);
            System.out.print("Total Pay: ");
            System.out.printf("%.2f\n", totalPay);
        }
    }
}
