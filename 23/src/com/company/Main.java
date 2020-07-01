package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Calculate the Power of a Number
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int exponent = Integer.parseInt(scanner.nextLine());
        double result = Math.pow(number, exponent);

        System.out.print((int)result);
    }
}
