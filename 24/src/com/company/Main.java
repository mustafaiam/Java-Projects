package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Check Whether a Number is Palindrome or Not
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        String reverse = "";

        for (int i = number.length() - 1; i >= 0; i--)
        {
            reverse += number.charAt(i);
        }

        if (number.equals(reverse))
        {
            System.out.print("The number " + number + " is palindrome");
        }
        else
        {
            System.out.print("The number " + number + " isn't palindrome");
        }
    }
}
