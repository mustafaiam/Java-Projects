package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Display Armstrong Number Between Two Intervals
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++)
        {
            String numStr = String.valueOf(i);

            int result = 0;

            for (int j = 0; j < numStr.length(); j++)
            {
                int digit = Integer.parseInt(String.valueOf(numStr.charAt(j)));
                int power = (int) Math.pow(digit, numStr.length());

                result += power;
            }

            if (i == result)
            {
                System.out.printf("The number %d is an Armstrong Number \n", i);
            }
        }
    }
}
