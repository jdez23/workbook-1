package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 80000;
        int garySalary = 85000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        int carPrice = 30000;
        int truckPrice = 43000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is: " + lowestPrice);

        double circleRadius = 7.25;
        double area = 3.14 * circleRadius;
        System.out.println("The area is: " + area);

        double random = Math.random();
        System.out.println("The random number is: " + random);
    }
}