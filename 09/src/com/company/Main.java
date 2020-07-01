package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program To Find The Largest Among Three numbers
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        // Solution No1
        int largestOfTheFirstTwo = Integer.max(num1, num2);
        int largestNumber = Integer.max(largestOfTheFirstTwo, num3);

        System.out.print("The largest number out of these three number is: " + largestNumber);

        // Solution No2
        int largest = Integer.MIN_VALUE;

        if (num1 >= largest)
        {
            largest = num1;
        }

        if (num2 >= largest)
        {
            largest = num2;
        }

        if (num3 >= largest)
        {
            largest = num3;
        }

        System.out.print("The largest number out of these three number is: " + largest);
    }
}
