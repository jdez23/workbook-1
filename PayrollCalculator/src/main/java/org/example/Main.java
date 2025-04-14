package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what's your name? ");
        String name = scanner.nextLine();

        System.out.println("How many hours have you worked");
        float hours = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("What is your payrate?");
        float payrate = scanner.nextFloat();
        scanner.nextLine();

        float pay = payrate * hours;

        System.out.println(name + ", Your gross pay is: " + pay);

    }
}