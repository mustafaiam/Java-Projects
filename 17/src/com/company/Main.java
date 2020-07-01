package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Display Fibonacci Series
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        int n1 = 0;
        int n2 = 1;

        for (int i = 1; i <= length; i++)
        {
            System.out.print(n1 + " + ");

            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
