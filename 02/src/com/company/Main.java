package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	// Java Program To Add Two Integers
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int sum = num1 + num2;

        System.out.print(sum);
    }
}
