package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Display Characters from A to Z using loop

        // Using For Loop
        for (char c = 'A'; c <= 'Z'; c++)
        {
            System.out.print(c + " ");
        }

        // Using While Loop
        System.out.print("\n");

        char ch = 'A';

        while (ch != '[')
        {
            System.out.print(ch + " ");

            ch++;
        }

    }
}
