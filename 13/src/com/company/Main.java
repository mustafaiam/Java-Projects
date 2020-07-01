package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Check Whether A Character Is Alphabet Or Not
        Scanner scanner = new Scanner(System.in);

        String strChar = scanner.nextLine();
        char character = strChar.charAt(0);
        int ascii = character;

        if (ascii >= 65 && ascii <= 90)
        {
            System.out.print("The character you submitted is a letter");
        }
        else if (ascii >= 97 && ascii <= 122)
        {
            System.out.print("The character you submitted is a letter");
        }
        else
        {
            System.out.print("The character you submitted isn't a letter");
        }
    }
}
