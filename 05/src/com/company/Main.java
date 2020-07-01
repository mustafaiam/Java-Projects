package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program To Compute Quotient And Remainder
        Scanner scanner = new Scanner(System.in);

        int divident = Integer.parseInt(scanner.nextLine());
        int divider = Integer.parseInt(scanner.nextLine());

        int quotient = divident / divider;
        int remainder = divident % divider;

        System.out.print("The quotient is: " + quotient);
        System.out.print("The remainder is: " + remainder);
    }
}
