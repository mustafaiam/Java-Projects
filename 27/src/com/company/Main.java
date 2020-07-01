package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Check Armstrong Number
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String numStr = String.valueOf(number);

        int result = 0;

        for (int i = 0; i < numStr.length(); i++)
        {
            int digit = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            int power = (int) Math.pow(digit, numStr.length());

            result += power;
        }

        if (number == result)
        {
            System.out.printf("The number %d is an Armstrong Number", number);
        }
        else
        {
            System.out.printf("The number %d isn't an Armstrong Number", number);
        }
    }
}
