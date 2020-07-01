package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program To Check Whether A Number Is Even Or Odd
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0)
        {
            System.out.print("The number " + number + " is even");
        }
        else
        {
            System.out.print("The number " + number + " is odd");
        }
    }
}
