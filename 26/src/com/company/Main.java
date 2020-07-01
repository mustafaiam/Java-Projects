package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Display Prime Numbers Between Two Intervals
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++)
        {
            boolean isPrime = false;

            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = true;
                    break;
                }
            }

            if (isPrime == false)
            {
                System.out.printf("The number %d is prime \n", i);
            }
        }
    }
}
