package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program To Calculate The Sum Of Natural Numbers
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
        }

        System.out.print("The sum of the numbers is: " + sum);
    }
}
