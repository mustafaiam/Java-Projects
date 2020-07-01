package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program To Find ASCII Value Of A Character
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char character = str.charAt(0);
        int value = character;

        System.out.println("The ASCII value of the character " + character + " is: " + value);
    }
}
