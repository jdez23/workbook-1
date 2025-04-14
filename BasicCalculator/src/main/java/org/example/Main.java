package org.example;

public class Main {
    public static void main(String[] args) {

        Calculator  myCalculator = new Calculator();
        myCalculator.brand = "TI-84";

        Calculator  myFriendsCalculator = new Calculator();
        myCalculator.brand = "TI-82";

        myCalculator.Add();
        myCalculator.Subtract();

        // I don't have to create a certain type of calculator
        double addition_result = Calculator.add(23, 24);
        System.out.println("The two numbers added equals: " + addition_result);

        double subtraction_result = Calculator.subtract(23, 24);
        System.out.println("The two numbers subtracted equals: " + subtraction_result);

    }
}