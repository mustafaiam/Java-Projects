package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Count Number of Digits in an Integer
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.printf("The number %d is containing %d digits", number, String.valueOf(number).length());
    }
}
