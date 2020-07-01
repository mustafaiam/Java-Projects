package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java Program to Find LCM of two Numbers
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int LCM = 0;

        if (num1 > num2)
        {
            LCM = num1;
        }
        else
        {
            LCM = num2;
        }

        while (true)
        {
            if (LCM % num1 == 0 && LCM % num2 == 0)
            {
                System.out.printf("The LCM of the numbers %d and %d is %d", num1, num2, LCM);
                break;
            }

            LCM++;
        }
    }
}
