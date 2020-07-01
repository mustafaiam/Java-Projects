package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program To Check Leap Year
        Scanner scanner = new Scanner(System.in);

        int LeapYear = Integer.parseInt(scanner.nextLine());

        boolean isLeapYear = false;

        if (LeapYear % 4 == 0)
        {
            isLeapYear = true;
        }

        if (isLeapYear == true)
        {
            System.out.print("The year " + LeapYear + " is a leap year");
        }
        else
        {
            System.out.print("The year " + LeapYear + " isn't a leap year");
        }
    }
}
