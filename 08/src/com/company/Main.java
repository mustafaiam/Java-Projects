package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program To Check Whether An Alphabet Is Vowel Or Consonant
        // I know it won't work with upper case letters!!! It is not a mistake or something I missed!!!
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        char character = letter.charAt(0);

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
        {
            System.out.print("The letter you entered is a vowel");
        }
        else
        {
            System.out.print("The letter you entered is a consonant");
        }
    }
}
