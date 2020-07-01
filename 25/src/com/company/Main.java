package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Check Whether a Number is Prime or Not
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isPrime = false;

        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                isPrime = true;
                break;
            }
        }

        if (isPrime == false)
        {
            System.out.printf("The number %d is prime", number);
        }
        else
        {
            System.out.printf("The number %d isn't prime", number);
        }
    }
}
