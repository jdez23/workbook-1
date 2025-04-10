package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 11;
        float unitPrice = 7.12f; //this is an error without the f
        float taxRate = 0.825f;
        float totalCost;
        totalCost = (count * unitPrice) * (1 + taxRate);
        System.out.println(totalCost);

        // User inputs
        System.out.print("What's your name? ");
        String name = sc.nextLine();
        System.out.print("How old are you? ");
        int age = sc.nextInt();

        int retirementAge = 65;

        if (age < retirementAge) {
            sayHi("Sorry bud, you still need " + (retirementAge - age) + " years to retire.");
        }
        else {
            sayHi("Congrats " + name + ", you are old enough to retire!");
        }
    }

    public static void sayHi(String var)
    {
        System.out.println(var);
    }


}