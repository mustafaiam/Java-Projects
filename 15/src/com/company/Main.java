package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Find Factorial of a Number
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int factorial = number;

        for (int i = 1; i < number; i++)
        {
            factorial = factorial * i;
        }

        System.out.print("The factorial is: " + factorial);
    }
}
