package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Reverse a Number
        Scanner scanner = new Scanner(System.in);

        StringBuilder result = new StringBuilder();

        String number = scanner.nextLine();

        result.append(number);

        result = result.reverse();

        System.out.println("The number " + number + " reversed looks like this: " + result);
    }
}
