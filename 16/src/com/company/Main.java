package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Generate Multiplication Table
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }
    }
}
