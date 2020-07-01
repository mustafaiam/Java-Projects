package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program To Check Whether A Number Is Positive Or Negative
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());

        if (num > 0)
        {
            System.out.print("The number is positive");
        }
        else if (num < 0)
        {
            System.out.print("The number is negative");
        }
        else
        {
            System.out.print("The number isn't positive nor negative");
        }
    }
}
