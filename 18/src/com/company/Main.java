package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Find GCD of two Numbers
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int GCD = 1;

        for (int i = 1; i <= num1 && i <= num2; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
            {
                GCD = i;
            }
        }

        System.out.printf("The GCD of the numbers %d and %d is %d", num1, num2, GCD);
    }
}
